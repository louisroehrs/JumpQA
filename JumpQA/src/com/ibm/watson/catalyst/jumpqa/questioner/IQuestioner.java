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
package com.ibm.watson.catalyst.jumpqa.questioner;

import java.util.List;

/**
 * An interface for generating questions from an array of strings
 * 
 * @author Will Beason
 * @version 0.1.1
 * @since 0.1.0
 *
 */
public interface IQuestioner {
  
  /**
   * Creates a question from an array of strings.
   * 
   * @param aString the string array to use to generate a question
   * @return the question text
   */
  public String makeQuestion(List<String> aString);
  
}
