package io.vertx.test.codegen.testdataobject;

import io.vertx.codegen.annotations.DataObject;

/**
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
@DataObject
public interface SetterNormalizationRules {

  SetterNormalizationRules setGroup(boolean group);
  SetterNormalizationRules setHA(boolean ha);
  SetterNormalizationRules setHAGroup(boolean haGroup);

}