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
package jumpqa.nnet;

import java.util.List;

public final class NLayer {
  
  public NLayer(NNode... aNodes) {
    _nodes = aNodes;
  }
  
  public NLayer(List<NNode> aNodes) {
    this(aNodes.toArray(new NNode[aNodes.size()]));
  }
  
  public double[] compute(double... features) {
    double[] result = new double[_nodes.length];
    for (int i = 0; i < _nodes.length; i++) {
      result[i] = _nodes[i].compute(features);
    }
    return result;
  }
  
  public double compute(int nodeNum, double... features) {
    return _nodes[nodeNum].compute(features);
  }
  
  private final NNode[] _nodes;
  
}
