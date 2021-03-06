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
package com.ibm.watson.catalyst.corpus2json;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;

public class Corpus2JsonTest {
  
  @Test
  public void testMain() {
    Corpus2Json.main(new String[] { "sample/test.properties"} );
    File file1 = new File("sample/test-check.json");
    File file2 = new File("sample/test-output.json");
    try {
      assertTrue(FileUtils.contentEquals(file1, file2));
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
  
}
