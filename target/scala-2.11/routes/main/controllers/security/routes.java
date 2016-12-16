
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/lab12/conf/routes
// @DATE:Fri Dec 16 12:29:29 GMT 2016

package controllers.security;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.security.ReverseLoginController LoginController = new controllers.security.ReverseLoginController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.security.javascript.ReverseLoginController LoginController = new controllers.security.javascript.ReverseLoginController(RoutesPrefix.byNamePrefix());
  }

}
