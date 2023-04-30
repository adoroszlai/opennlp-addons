/*
 * Copyright 2013 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package opennlp.addons.modelbuilder;

import java.util.Set;

import opennlp.addons.modelbuilder.impls.BaseModelBuilderParams;
import opennlp.tools.namefind.TokenNameFinderModel;

/**
 *
 */
public interface Modelable extends ModelParameter<BaseModelBuilderParams> {


  String annotate(String sentence, String namedEntity, String entityType);

  void writeAnnotatedSentences();

  Set<String> getAnnotatedSentences();

  void setAnnotatedSentences(Set<String> annotatedSentences);

  void addAnnotatedSentence(String annotatedSentence);

  void buildModel( String entityType);

  TokenNameFinderModel getModel();

  String[] tokenizeSentenceToWords(String sentence);

}
