/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import service.HelloService;
import org.springframework.web.servlet.ModelAndView;
import pojo.Name;
import org.springframework.web.servlet.mvc.SimpleFormController;

/**
 *
 * @author Nammain
 */

public class HelloController extends SimpleFormController {
    
    public HelloController() {
         setCommandClass(Name.class);
        setCommandName("name");
        setSuccessView("helloView");
        setFormView("nameView");
    }
        
    private HelloService helloService;
    
    public void setHelloService(HelloService helloService){
        this.helloService = helloService;
    }
    
    /**
     *
     * @param command
     * @return
     * @throws Exception
     */
    @Override
    protected ModelAndView onSubmit(Object command) throws Exception
    {
        Name name = (Name)command;
        ModelAndView mv = new ModelAndView(getSuccessView());
        mv.addObject("helloMessage",helloService.sayHello(name.getValue()));
        return mv;
    }
     

}
