/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda.service.api;

import com.tienda.model.ReporteVentasDTO;
import java.util.Map;

/**
 *
 * @author Dylan
 */
public interface ReporteVentasServiceAPI {
    ReporteVentasDTO obtenerReporteVentas(Map<String, Object> params);
}
