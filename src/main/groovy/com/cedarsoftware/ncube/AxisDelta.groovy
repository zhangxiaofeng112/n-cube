package com.cedarsoftware.ncube

import groovy.transform.CompileStatic

/**
 * Class used to hold axis difference (delta) information.
 *
 * @author John DeRegnaucourt (jdereg@gmail.com)
 *         <br/>
 *         Copyright (c) Cedar Software LLC
 *         <br/><br/>
 *         Licensed under the Apache License, Version 2.0 (the "License")
 *         you may not use this file except in compliance with the License.
 *         You may obtain a copy of the License at
 *         <br/><br/>
 *         http://www.apache.org/licenses/LICENSE-2.0
 *         <br/><br/>
 *         Unless required by applicable law or agreed to in writing, software
 *         distributed under the License is distributed on an "AS IS" BASIS,
 *         WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *         See the License for the specific language governing permissions and
 *         limitations under the License.
 */
@CompileStatic
class AxisDelta
{
    Axis axis
    String locatorKey
    String changeType

    AxisDelta(Axis axis, String locatorKey, String changeType)
    {
        this.axis = axis
        this.locatorKey = locatorKey
        this.changeType = changeType
    }

    String toString()
    {
        return "${changeType}/${axis.toString()}/${locatorKey}"
    }
}