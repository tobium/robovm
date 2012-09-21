/*
 * Copyright (C) 2012 RoboVM
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
package org.robovm.rt.bro.ref;

import org.robovm.rt.bro.Struct;
import org.robovm.rt.bro.annotation.StructMember;

/**
 * Used to map a <code>double *</code>.
 */
public final class DoubleRef extends Struct<DoubleRef> {
    /**
     * Creates a new {@link DoubleRef} with a value of 0.0.
     */
    public DoubleRef() {
    }
    
    /**
     * Creates a new {@link DoubleRef} and initializes it with the specified value.
     * 
     * @param value the value.
     */
    public DoubleRef(double value) {
        set(value);
    }

    /**
     * Returns the current value.
     * 
     * @return the value.
     */
    @StructMember(0)
    public native double get();
    
    /**
     * Sets the value.
     * 
     * @param value the new value.
     */
    @StructMember(0)
    public native void set(double value);
}