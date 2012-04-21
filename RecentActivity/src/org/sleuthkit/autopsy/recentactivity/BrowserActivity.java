 /*
 *
 * Autopsy Forensic Browser
 * 
 * Copyright 2012 42six Solutions.
 * Contact: aebadirad <at> 42six <dot> com
 * Project Contact/Architect: carrier <at> autopsy <dot> org
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
 */
package org.sleuthkit.autopsy.recentactivity;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author arivera
 */
public enum BrowserActivity {
   IE(0),
   FF(1),
   CH(2);
    private static final Map<Integer,BrowserActivity> lookup
            = new HashMap<Integer,BrowserActivity>();

    static {
        for(BrowserActivity bat : values())
            lookup.put(bat.type, bat);
    }


   private int type;

   private BrowserActivity(int type)
   {
      this.type = type;
   }

    public int getType() { return type; }

    public static BrowserActivity get(int type) {
        switch(type) {
            case 0: return IE;
            case 1: return FF;
            case 2: return CH;
        }
        return null;
    }

}