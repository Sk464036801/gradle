/*
 * Copyright 2012 the original author or authors.
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

package org.gradle.plugins.binaries.model.internal;

import org.gradle.plugins.binaries.model.NativeComponent;
import org.gradle.plugins.binaries.model.Compiler;

public interface CompilerAdapter<T extends BinaryCompileSpec> extends Compiler {
    /**
     * Creates a compiler which can compile the given binary. Should only be called if {@link #isAvailable()} has returned true.
     */
    org.gradle.api.internal.tasks.compile.Compiler<T> createCompiler(NativeComponent binary);

    /**
     * Returns true if this compiler is available.
     */
    boolean isAvailable();
}
