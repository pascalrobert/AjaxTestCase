package your.app.components;

import com.webobjects.appserver.WOContext;
import com.webobjects.foundation.NSLog;

import er.extensions.components.ERXStatelessComponent;

public class SubComponent extends ERXStatelessComponent {

  private String _aString;

  public SubComponent(WOContext context) {
    super(context);
  }
  
  @Override
  public void awake() {
    NSLog.out.appendln("i'm awake");
    super.awake();
  }
  
  public String aString() {
    if (_aString == null) {
      _aString = stringValueForBinding("aString");
    }
    return _aString;
  }
  
}