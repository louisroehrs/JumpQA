/*******************************************************************************
 * Copyright 2015 IBM Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package com.ibm.watson.catalyst.corpus.tfidf.conjugate;

import static org.junit.Assert.*;

import org.junit.Test;

public class VerbTest {

  @Test
  public void testNormal() {
    Verb v1 = new Verb("accept");
    assertEquals(v1.getConjugations(), "accept\naccepts\naccepting\naccepted");
    Verb v2 = new Verb("add");
    assertEquals(v2.getConjugations(), "add\nadds\nadding\nadded");
  }
  
  public void testY() {
    Verb v1 = new Verb("annoy");
    assertEquals(v1.getConjugations(), "annoy\nannoys\nannoying\nannoyed");
    Verb v2 = new Verb("try");
    assertEquals(v2.getConjugations(), "try\ntries\ntrying\ntried");
    
  }
  
}
