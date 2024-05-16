/*
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *  under the License.
 */
package org.apache.karaf.jaas.modules;

import java.util.Map;

public final class JAASUtils {

    private JAASUtils() {
        // complete
    }

    public static String getString(Map<String, ?> options, String key) {
        Object val = options.get(key);
        if (val instanceof String) {
            val = ((String)val).trim();
        }
        return (String)val;
    }

}
