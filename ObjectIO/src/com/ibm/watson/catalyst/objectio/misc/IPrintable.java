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
/**
 * 
 */
package com.ibm.watson.catalyst.objectio.misc;

/**
 * TODO: Class description
 * 
 * @author Will Beason
 * @version 0.1.0
 * @since 0.1.0
 *
 */
public interface IPrintable {
  
  /**
   * Converts the object to a StringBuffer representation.
   * 
   * @return the StringBuffer representation of the object
   */
  public StringBuilder toStringBuilder();
  
}
