package kata.pkg3;

import java.awt.Dimension;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guise
 */
public class HistogramDisplay extends ApplicationFrame{

    private final Histogram<String> histograma;
    
    public HistogramDisplay(Histogram<String> histograma){
        super("Histograma");
        this.histograma=histograma;
        setContentPane(createpanel());
        pack();
        
    }
    
    private ChartPanel createpanel() {
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        //Dimensionamos la ventana que vamos a crear
        chartPanel.setPreferredSize(new Dimension(500,400));
        return chartPanel;
    }
    
    private JFreeChart createChart (DefaultCategoryDataset dataset){
        JFreeChart chart = ChartFactory.createBarChart(null,
                "DOMINIO",
                "Nº email",
                dataset,
                PlotOrientation.VERTICAL,
                true, //Muestra la leyenda en caso de tener mas datos
                true, //Pasas el raton por encima y te muestra los datos
                false); //Algo del Entorno Web
        return chart;
                
   
    }
    
    private DefaultCategoryDataset createDataset(){
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        for (String key: histograma.keySet()){
        dataset.addValue(histograma.get(key),"",key);
        }
        
        return dataset;
    }
    public void execute(){
        setVisible(true);
    }
}
