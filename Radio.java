/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.lang.String;
/**
 *
 * @author OscarIvan
 */
public class Radio implements iRadio 
{

    boolean isOn; 
    String frecuency;
    String station; 
    MemoryBoton[] Memorias;
    
    
    public Radio()
    {
        isOn = false;
        frecuency ="AM";
        station = "530"; 
        Memorias = new MemoryBoton[12];
        
    }
    
    @Override
    public void OnOff() {
        isOn = !isOn;
    }

    @Override
    public boolean isOn() {
        return isOn;
    }

    @Override
    public String getFrecuency() {
        return frecuency;
    }

    @Override
    public void changeFrecuency() {        
        if (frecuency == "AM")
            frecuency = "FM";
        else
            frecuency = "AM";
    }

    @Override
    public String getStation() {
        return station;
    }

    @Override
    public void Forward() {
        if (frecuency == "AM")
        {
        	// Cambio de código
        	//if (Integer.parseInt(station) < 1610)
            if (Float.parseFloat(station) < 1610 && Float.parseFloat(station) >= 530)               
                station = Integer.toString(Integer.parseInt(station) + 10);
            else
                station = "530";
        }            
        else
        {
            if (Float.parseFloat(station) < 107.9)               
                station = Double.toString(Double.parseDouble(station) + 0.2);
            else
                station = "87.9";        
        }
            
    }

    @Override
    public void Backward() 
    {
        if (frecuency == "AM")
        {
        	// Cambio de código
        	//if (Integer.parseInt(station) > 530)
            if (Float.parseFloat(station) > 530 && Float.parseFloat(station) <= 1610)               
                station = Integer.toString(Integer.parseInt(station) - 10);
            else
                station = "1610";
        }            
        else
        {
            if (Float.parseFloat(station) > 87.9 && Float.parseFloat(station) <= 108)               
                station = Double.toString(Double.parseDouble(station) - 0.2);
            else
                station = "107.9";        
        }
    }

    @Override
    public void setMemory(int Position) 
    {
        if (Position >= 0 && Position <12)            
            Memorias[Position] = new MemoryBoton(frecuency, station);
    }

    @Override
    public String ToString() {
        StringBuilder sb = new StringBuilder();
        sb.append("isON:");
        sb.append(isOn);
        sb.append(" Frecuency:");
        sb.append(frecuency);
        sb.append(" Station:");
        sb.append(station);
        
        return sb.toString();

    }
    
}
