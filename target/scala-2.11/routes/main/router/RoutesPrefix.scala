
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/lab12/conf/routes
// @DATE:Fri Dec 16 12:29:29 GMT 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
