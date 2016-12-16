
package views.html

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
"""),_display_(/*4.2*/main("Products", user)/*4.24*/ {_display_(Seq[Any](format.raw/*4.26*/("""
  """),format.raw/*5.3*/("""<!-- HTML content for the index view -->
  <div class="row">
      <div class="col-sm-2">
          <h4>Categories</h4>
            <div class="list-group">
                <!-- A link to display all products -->
                <a href=""""),_display_(/*11.27*/routes/*11.33*/.HomeController.products(0)),format.raw/*11.60*/("""" class="list-group-item">All categories</a>

                <!-- Start of For loop - For each c in categories add a list item -->
                <!-- Also show the number of products in each category -->
                """),_display_(/*15.18*/for(c <- categories) yield /*15.38*/ {_display_(Seq[Any](format.raw/*15.40*/("""
                    """),format.raw/*16.21*/("""<a href=""""),_display_(/*16.31*/routes/*16.37*/.HomeController.products(c.getId)),format.raw/*16.70*/("""" class="list-group-item">"""),_display_(/*16.97*/c/*16.98*/.getName),format.raw/*16.106*/("""
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
              """),format.raw/*45.15*/("""<tr>
                  <!-- Display each product field value in a column -->
                  """),_display_(/*47.20*/if(env.resource("public/images/productImages/thumbnails/" + p.getId + ".jpg").isDefined)/*47.108*/ {_display_(Seq[Any](format.raw/*47.110*/("""
                      """),format.raw/*48.23*/("""<td><img src="/assets/images/productImages/thumbnails/"""),_display_(/*48.78*/(p.getId + ".jpg")),format.raw/*48.96*/(""""/></td>
                  """)))}/*49.21*/else/*49.26*/{_display_(Seq[Any](format.raw/*49.27*/("""
                      """),format.raw/*50.23*/("""<td><img src="/assets/images/productImages/thumbnails/noImage.png"/></td>
                  """)))}),format.raw/*51.20*/("""
                  """),format.raw/*52.19*/("""<td>"""),_display_(/*52.24*/p/*52.25*/.getName),format.raw/*52.33*/("""</td>
                  <td>"""),_display_(/*53.24*/p/*53.25*/.getCategory.getName),format.raw/*53.45*/("""</td>
                  <td>"""),_display_(/*54.24*/p/*54.25*/.getDescription),format.raw/*54.40*/("""</td>
                  <td>"""),_display_(/*55.24*/p/*55.25*/.getStock),format.raw/*55.34*/("""</td>
                  <td>&euro; """),_display_(/*56.31*/("%.2f".format(p.getPrice))),format.raw/*56.58*/("""</td>
              </tr>
					""")))}),format.raw/*58.7*/(""" """),format.raw/*58.8*/("""<!-- End of For loop -->
          </tbody>
        </table>
      </div>
  </div>
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
                  SOURCE: /home/wdd/webapps/lab12/app/views/products.scala.html
                  HASH: e154a74833b5e6d64688066c9e82670896027c92
                  MATRIX: 826->1|1041->120|1069->122|1129->155|1157->156|1203->175|1231->176|1259->177|1306->199|1336->221|1375->223|1404->226|1670->465|1685->471|1733->498|1984->722|2020->742|2060->744|2109->765|2146->775|2161->781|2215->814|2269->841|2279->842|2309->850|2360->873|2408->894|2418->895|2458->914|2539->964|2580->977|2669->1039|2710->1071|2750->1073|2793->1088|2869->1137|2883->1142|2919->1157|2962->1172|3011->1190|3050->1201|3545->1669|3579->1687|3619->1689|3662->1704|3785->1800|3883->1888|3924->1890|3975->1913|4057->1968|4096->1986|4143->2015|4156->2020|4195->2021|4246->2044|4370->2137|4417->2156|4449->2161|4459->2162|4488->2170|4544->2199|4554->2200|4595->2220|4651->2249|4661->2250|4697->2265|4753->2294|4763->2295|4793->2304|4856->2340|4904->2367|4966->2399|4994->2400
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|34->3|35->4|35->4|35->4|36->5|42->11|42->11|42->11|46->15|46->15|46->15|47->16|47->16|47->16|47->16|47->16|47->16|47->16|48->17|48->17|48->17|48->17|50->19|51->20|55->24|55->24|55->24|56->25|57->26|57->26|57->26|58->27|59->28|60->29|75->44|75->44|75->44|76->45|78->47|78->47|78->47|79->48|79->48|79->48|80->49|80->49|80->49|81->50|82->51|83->52|83->52|83->52|83->52|84->53|84->53|84->53|85->54|85->54|85->54|86->55|86->55|86->55|87->56|87->56|89->58|89->58
                  -- GENERATED --
              */
          