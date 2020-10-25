/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Service.HelloService;
import org.springframework.stereotype.Controller;
import org.springframework.web.portlet.ModelAndView;
import pojo.Name;

/**
 *
 * @author Nammain
 */
@Controller
public class HelloController  {
    
    public HelloController() {
        //Initialize controller properties here or 
        //in the Web Application Context

        setCommandClass(Name.class);
        setCommandName("name");
        setSuccessView("helloView");
        setFormView("nameView");
    }
    

//    @Override
    protected ModelAndView onSubmit(Object command) throws Exception 
    {
        Name name = (Name)command;
        ModelAndView mv = new ModelAndView(getSuccesView());
        mv.addObject("helloMessage",helloService.sayHello(name.getValue()));
        return mv;
    }
     
    private HelloService helloService;
    
    public void setHelloService(HelloService helloService){
        this.helloService = helloService;
    }

    private void setCommandClass(Class<Name> aClass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setCommandName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setSuccessView(String helloView) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setFormView(String nameView) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getSuccesView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
