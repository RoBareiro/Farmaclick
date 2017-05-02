package ar.edu.unlam.tallerweb1.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControladorProductos {

	@RequestMapping(path = "/alta", method = RequestMethod.GET)
	public ModelAndView altaProducto(){
		return new ModelAndView("altaProducto");
	}
}
