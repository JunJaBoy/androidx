/*
 * Copyright (C) 2024 The Android Open Source Project
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
// @exportToFramework:skipFile()
package androidx.appsearch.annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.SOURCE;

import androidx.annotation.RestrictTo;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * @memberDoc Value is a non-negative timestamp measured as the number of
 *            milliseconds since 1970-01-01T00:00:00Z.
 * @paramDoc Value is a non-negative timestamp measured as the number of
 *            milliseconds since 1970-01-01T00:00:00Z.
 * @returnDoc Value is a non-negative timestamp measured as the number of
 *            milliseconds since 1970-01-01T00:00:00Z.
 */
@Retention(SOURCE)
@Target({METHOD, PARAMETER, FIELD})
@RestrictTo(RestrictTo.Scope.LIBRARY)
public @interface CurrentTimeMillisLong {
}
