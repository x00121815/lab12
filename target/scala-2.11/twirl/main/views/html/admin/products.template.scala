
package views.html.admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object products_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class products extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[List[models.Product],List[models.Category],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product], categories: List[models.Category], user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.121*/("""

"""),format.raw/*3.1*/("""<!-- Pass page title and content """),format.raw/*3.34*/("""{"""),format.raw/*3.35*/("""html between braces"""),format.raw/*3.54*/("""}"""),format.raw/*3.55*/(""" """),format.raw/*3.56*/("""to the main view -->
"""),_display_(/*4.2*/admin/*4.7*/.adminMain("Products", user)/*4.35*/ {_display_(Seq[Any](format.raw/*4.37*/("""
  """),format.raw/*5.3*/("""<!-- HTML content for the index view -->
  <div class="row">
      <div class="col-sm-2">
          <h4>Categories</h4>
            <div class="list-group">
                <!-- A link to display all products -->
                <a href=""""),_display_(/*11.27*/routes/*11.33*/.AdminController.products(0)),format.raw/*11.61*/("""" class="list-group-item">All categories</a>

                <!-- Start of For loop - For each c in categories add a list item -->
                <!-- Also show the number of products in each category -->
                """),_display_(/*15.18*/for(c <- categories) yield /*15.38*/ {_display_(Seq[Any](format.raw/*15.40*/("""
                    """),format.raw/*16.21*/("""<a href=""""),_display_(/*16.31*/routes/*16.37*/.AdminController.products(c.getId)),format.raw/*16.71*/("""" class="list-group-item">"""),_display_(/*16.98*/c/*16.99*/.getName),format.raw/*16.107*/("""
                      """),format.raw/*17.23*/("""<span class="badge">"""),_display_(/*17.44*/c/*17.45*/.getProducts.size()),format.raw/*17.64*/("""</span>
                    </a>
                """)))}),format.raw/*19.18*/("""
            """),format.raw/*20.13*/("""</div>
      </div>
      <div class="col-sm-10">

          """),_display_(/*24.12*/if(flash.containsKey("success"))/*24.44*/ {_display_(Seq[Any](format.raw/*24.46*/("""
              """),format.raw/*25.15*/("""<div class="alert alert-success">
              """),_display_(/*26.16*/flash/*26.21*/.get("success")),format.raw/*26.36*/("""
              """),format.raw/*27.15*/("""</div>
          """)))}),format.raw/*28.12*/("""
          """),format.raw/*29.11*/("""<table class="table table-bordered table-hover table-condensed">
          <thead>
          <!-- The header row-->
          <tr>
            <th>Image</th>
            <th>Name</th>
            <th>Category</th>
            <th>Description</th>
            <th>Stock</th>
            <th>Price</th>
          </tr>
          </thead>
          <tbody>
            <!-- Product row(s) -->
					<!-- Start of For loop - For each p in products add a row -->
          """),_display_(/*44.12*/for(p <- products) yield /*44.30*/ {_display_(Seq[Any](format.raw/*44.32*/("""
			    """),format.raw/*45.8*/("""<tr>
                    <!-- Display each product field value in a column -->
                    """),_display_(/*47.22*/if(env.resource("public/images/productImages/thumbnails/" + p.getId + ".jpg").isDefined)/*47.110*/ {_display_(Seq[Any](format.raw/*47.112*/("""
                        """),format.raw/*48.25*/("""<td><img src="/assets/images/productImages/thumbnails/"""),_display_(/*48.80*/(p.getId)),format.raw/*48.89*/(""".jpg"/></td>
                    """)))}/*49.23*/else/*49.28*/{_display_(Seq[Any](format.raw/*49.29*/("""
                        """),format.raw/*50.25*/("""<td><img src="/assets/images/productImages/thumbnails/noImage.png"/></td>
                    """)))}),format.raw/*51.22*/("""
                  """),format.raw/*52.19*/("""<td>"""),_display_(/*52.24*/p/*52.25*/.getName),format.raw/*52.33*/("""</td>
                  <td>"""),_display_(/*53.24*/p/*53.25*/.getCategory.getName),format.raw/*53.45*/("""</td>
                  <td>"""),_display_(/*54.24*/p/*54.25*/.getDescription),format.raw/*54.40*/("""</td>
                  <td>"""),_display_(/*55.24*/p/*55.25*/.getStock),format.raw/*55.34*/("""</td>
                  <td>&euro; """),_display_(/*56.31*/("%.2f".format(p.getPrice))),format.raw/*56.58*/("""</td>

                  <!-- Edit product button -->
                  <td>
                      <a href=""""),_display_(/*60.33*/routes/*60.39*/.AdminController.updateProduct(p.getId)),format.raw/*60.78*/("""" class="btn-xs btn-danger">
                      <span class="glyphicon glyphicon-pencil"></span></a>
                  </td>
                  <!-- Delete product button -->
                  <td>
                      <a href=""""),_display_(/*65.33*/routes/*65.39*/.AdminController.deleteProduct(p.getId)),format.raw/*65.78*/("""" class="btn-xs btn-danger"
                        onclick="return confirmDel();">
                        <span class="glyphicon glyphicon-trash"></span>
                      </a>
                  </td>
				</tr>
					""")))}),format.raw/*71.7*/(""" """),format.raw/*71.8*/("""<!-- End of For loop -->
          </tbody>
        </table>
        <p>
          <a href=""""),_display_(/*75.21*/routes/*75.27*/.AdminController.addProduct()),format.raw/*75.56*/("""">
            <button class="btn btn-primary">Add a Product</button>
          </a>
        </p>
      </div>
  </div>

  <script>
    // JavaScript function returns true if user clicks yes, otherwise, false
    function confirmDel() """),format.raw/*84.27*/("""{"""),format.raw/*84.28*/("""
        """),format.raw/*85.9*/("""return confirm('Are you sure?');
    """),format.raw/*86.5*/("""}"""),format.raw/*86.6*/("""
  """),format.raw/*87.3*/("""</script>

  <!-- End of content for main -->
""")))}))
      }
    }
  }

  def render(products:List[models.Product],categories:List[models.Category],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(products,categories,user,env)

  def f:((List[models.Product],List[models.Category],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (products,categories,user,env) => apply(products,categories,user,env)

  def ref: this.type = this

}


}

/**/
object products extends products_Scope0.products
              /*
                  -- GENERATED --
                  DATE: Fri Dec 16 12:29:29 GMT 2016
                  SOURCE: /home/wdd/webapps/lab12/app/views/admin/products.scala.html
                  HASH: c8123153a42beea9d472985bd9fb82210ae0a60e
                  MATRIX: 832->1|1047->120|1075->122|1135->155|1163->156|1209->175|1237->176|1265->177|1312->199|1324->204|1360->232|1399->234|1428->237|1694->476|1709->482|1758->510|2009->734|2045->754|2085->756|2134->777|2171->787|2186->793|2241->827|2295->854|2305->855|2335->863|2386->886|2434->907|2444->908|2484->927|2565->977|2606->990|2695->1052|2736->1084|2776->1086|2819->1101|2895->1150|2909->1155|2945->1170|2988->1185|3037->1203|3076->1214|3571->1682|3605->1700|3645->1702|3680->1710|3807->1810|3905->1898|3946->1900|3999->1925|4081->1980|4111->1989|4164->2024|4177->2029|4216->2030|4269->2055|4395->2150|4442->2169|4474->2174|4484->2175|4513->2183|4569->2212|4579->2213|4620->2233|4676->2262|4686->2263|4722->2278|4778->2307|4788->2308|4818->2317|4881->2353|4929->2380|5065->2489|5080->2495|5140->2534|5399->2766|5414->2772|5474->2811|5727->3034|5755->3035|5875->3128|5890->3134|5940->3163|6203->3398|6232->3399|6268->3408|6332->3445|6360->3446|6390->3449
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|34->3|35->4|35->4|35->4|35->4|36->5|42->11|42->11|42->11|46->15|46->15|46->15|47->16|47->16|47->16|47->16|47->16|47->16|47->16|48->17|48->17|48->17|48->17|50->19|51->20|55->24|55->24|55->24|56->25|57->26|57->26|57->26|58->27|59->28|60->29|75->44|75->44|75->44|76->45|78->47|78->47|78->47|79->48|79->48|79->48|80->49|80->49|80->49|81->50|82->51|83->52|83->52|83->52|83->52|84->53|84->53|84->53|85->54|85->54|85->54|86->55|86->55|86->55|87->56|87->56|91->60|91->60|91->60|96->65|96->65|96->65|102->71|102->71|106->75|106->75|106->75|115->84|115->84|116->85|117->86|117->86|118->87
                  -- GENERATED --
              */
          