package your.app.components;

import com.webobjects.appserver.WOActionResults;
import com.webobjects.appserver.WOContext;
import com.webobjects.foundation.NSArray;

import er.extensions.components.ERXComponent;

public class Main extends ERXComponent {
  
  private String _aString;
  private Integer _index;
  
	public Main(WOContext context) {
		super(context);
	}
	
	public NSArray<String> arrayOfStrings() {
	  return new NSArray<String>(new String[] { "String One", "String Two", "String Three" });
	}
	
	public void setAString(String aString) {
	  this._aString = aString;
	}
	
	public String aString() {
	  return _aString;
	}
	
	public void setIndex(int index) {
	  this._index = index;
	}
	
	public int index() {
	  return _index;
	}
	
	public WOActionResults refresh() {
	  return null;
	}
	
	public String indexAsString() {
	  return _index.toString();
	}
}
