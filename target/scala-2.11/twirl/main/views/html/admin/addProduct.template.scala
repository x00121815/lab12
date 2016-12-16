
package views.html.admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object addProduct_Scope0 {
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

     object addProduct_Scope1 {
import helper._

class addProduct extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[play.data.Form[models.Product],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(addProductForm: play.data.Form[models.Product], user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.102*/("""

"""),format.raw/*6.102*/("""

"""),_display_(/*8.2*/admin/*8.7*/.adminMain("Add Product", user)/*8.38*/ {_display_(Seq[Any](format.raw/*8.40*/("""
	"""),format.raw/*9.2*/("""<h3>Add a new Product</h3>
	<!-- Use the views.html.helpers package to create the form -->
	"""),_display_(/*11.3*/form(action = routes.AdminController.addProductSubmit(), 'class -> "form-horizontal",
		'role->"form", 'enctype -> "multipart/form-data")/*12.52*/ {_display_(Seq[Any](format.raw/*12.54*/("""
		
		"""),format.raw/*14.3*/("""<!-- Build the form, adding an input for each field -->
		<!-- Note the label parameter -->
		"""),_display_(/*16.4*/inputText(addProductForm("name"), '_label -> "Name",'class -> "form-control")),format.raw/*16.81*/("""
		"""),_display_(/*17.4*/inputText(addProductForm("description"), '_label -> "Description",'class -> "form-control")),format.raw/*17.95*/("""

		"""),_display_(/*19.4*/select(
			addProductForm("category.id"),
			
			options(Category.options),
			'_label -> "Category", '_default -> "-- Choose a category --",
			'_showConstraints -> false, 'class -> "form-control"
		)),format.raw/*25.4*/("""
		"""),_display_(/*26.4*/inputText(addProductForm("stock"), '_label -> "Stock",'class -> "form-control")),format.raw/*26.83*/("""
		"""),_display_(/*27.4*/inputText(addProductForm("price"), '_label -> "Price",'class -> "form-control")),format.raw/*27.83*/("""

		"""),format.raw/*29.3*/("""<!-- Image upload input -->
		<div class="container-fluid">
			<div class="row">
				<label>Image</label>
			</div>
			<div class="row">
				"""),_display_(/*35.6*/if(env.resource("public/images/productImages/thumbnails/" + addProductForm("id").value() + ".jpg").isDefined)/*35.115*/ {_display_(Seq[Any](format.raw/*35.117*/("""
					"""),format.raw/*36.6*/("""<p><img src="/assets/images/productImages/thumbnails/"""),_display_(/*36.60*/(addProductForm("id").value() + ".jpg")),format.raw/*36.99*/(""""/></p>
				""")))}/*37.7*/else/*37.12*/{_display_(Seq[Any](format.raw/*37.13*/("""
					"""),format.raw/*38.6*/("""<p><img src="/assets/images/productImages/thumbnails/noImage.png"/></p>
				""")))}),format.raw/*39.6*/("""
			"""),format.raw/*40.4*/("""</div>
			<div class="row">
				<input class="btn-sm btn-default" type="file" name="upload">
			</div>
		</div>

		<!-- Hidden ID field - required for product updates -->
		"""),_display_(/*47.4*/inputText(addProductForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*47.71*/("""

	"""),format.raw/*49.2*/("""<!-- Add a submit button -->
  <div class="actions">
      <input type="submit" value="Save" class="btn btn-primary">
			<a href=""""),_display_(/*52.14*/routes/*52.20*/.AdminController.products()),format.raw/*52.47*/(""""><button class="btn btn-warning">Cancel</button>
	  		</a>
  </div>
	""")))}),format.raw/*55.3*/(""" """),format.raw/*55.4*/("""<!-- End Form definition -->

""")))}),format.raw/*57.2*/(""" """),format.raw/*57.3*/("""<!-- End of page content -->

"""))
      }
    }
  }

  def render(addProductForm:play.data.Form[models.Product],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(addProductForm,user,env)

  def f:((play.data.Form[models.Product],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (addProductForm,user,env) => apply(addProductForm,user,env)

  def ref: this.type = this

}


}
}

/**/
object addProduct extends addProduct_Scope0.addProduct_Scope1.addProduct
              /*
                  -- GENERATED --
                  DATE: Fri Dec 16 12:29:30 GMT 2016
                  SOURCE: /home/wdd/webapps/lab12/app/views/admin/addProduct.scala.html
                  HASH: f4a11539f71064e7c6bad62b9f444ff519a28622
                  MATRIX: 873->109|1069->209|1099->312|1127->315|1139->320|1178->351|1217->353|1245->355|1364->448|1510->585|1550->587|1583->593|1704->688|1802->765|1832->769|1944->860|1975->865|2196->1066|2226->1070|2326->1149|2356->1153|2456->1232|2487->1236|2655->1378|2774->1487|2815->1489|2848->1495|2929->1549|2989->1588|3020->1602|3033->1607|3072->1608|3105->1614|3212->1691|3243->1695|3443->1869|3531->1936|3561->1939|3719->2070|3734->2076|3782->2103|3883->2174|3911->2175|3972->2206|4000->2207
                  LINES: 30->4|35->4|37->6|39->8|39->8|39->8|39->8|40->9|42->11|43->12|43->12|45->14|47->16|47->16|48->17|48->17|50->19|56->25|57->26|57->26|58->27|58->27|60->29|66->35|66->35|66->35|67->36|67->36|67->36|68->37|68->37|68->37|69->38|70->39|71->40|78->47|78->47|80->49|83->52|83->52|83->52|86->55|86->55|88->57|88->57
                  -- GENERATED --
              */
          