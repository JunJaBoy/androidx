/*
 * Copyright 2024 The Android Open Source Project
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

package androidx.savedstate

import kotlin.jvm.JvmInline

/**
 * An inline class that encapsulates an opaque [SavedState], and provides an API for reading the
 * platform specific state.
 *
 * @see SavedState.read
 */
@JvmInline
public expect value class SavedStateReader
@PublishedApi
internal constructor(
    @PublishedApi internal val source: SavedState,
) {

    /**
     * Retrieves a [Boolean] value associated with the specified [key]. Throws an
     * [IllegalStateException] if the [key] doesn't exist.
     *
     * @param key The [key] to retrieve the value for.
     * @return The [Boolean] value associated with the [key].
     * @throws IllegalStateException If the [key] is not found.
     */
    public inline fun getBoolean(key: String): Boolean

    /**
     * Retrieves a [Boolean] value associated with the specified [key], or a default value if the
     * [key] doesn't exist.
     *
     * @param key The [key] to retrieve the value for.
     * @param defaultValue A function providing the default value if the [key] is not found.
     * @return The [Boolean] value associated with the [key], or the default value if the [key] is
     *   not found.
     */
    public inline fun getBooleanOrElse(key: String, defaultValue: () -> Boolean): Boolean

    /**
     * Retrieves a [Char] value associated with the specified [key]. Throws an
     * [IllegalStateException] if the [key] doesn't exist.
     *
     * @param key The [key] to retrieve the value for.
     * @return The [Char] value associated with the [key].
     * @throws IllegalStateException If the [key] is not found.
     */
    public inline fun getChar(key: String): Char

    /**
     * Retrieves a [Char] value associated with the specified [key], or a default value if the [key]
     * doesn't exist.
     *
     * @param key The [key] to retrieve the value for.
     * @param defaultValue A function providing the default value if the [key] is not found.
     * @return The [Char] value associated with the [key], or the default value if the [key] is not
     *   found.
     */
    public inline fun getCharOrElse(key: String, defaultValue: () -> Char): Char

    /**
     * Retrieves a [Double] value associated with the specified [key]. Throws an
     * [IllegalStateException] if the [key] doesn't exist.
     *
     * @param key The [key] to retrieve the value for.
     * @return The [Double] value associated with the [key].
     * @throws IllegalStateException If the [key] is not found.
     */
    public inline fun getDouble(key: String): Double

    /**
     * Retrieves a [Double] value associated with the specified [key], or a default value if the
     * [key] doesn't exist.
     *
     * @param key The [key] to retrieve the value for.
     * @param defaultValue A function providing the default value if the [key] is not found.
     * @return The [Double] value associated with the [key], or the default value if the [key] is
     *   not found.
     */
    public inline fun getDoubleOrElse(key: String, defaultValue: () -> Double): Double

    /**
     * Retrieves a [Float] value associated with the specified [key]. Throws an
     * [IllegalStateException] if the [key] doesn't exist.
     *
     * @param key The [key] to retrieve the value for.
     * @return The [Float] value associated with the [key].
     * @throws IllegalStateException If the [key] is not found.
     */
    public inline fun getFloat(key: String): Float

    /**
     * Retrieves a [Float] value associated with the specified [key], or a default value if the
     * [key] doesn't exist.
     *
     * @param key The [key] to retrieve the value for.
     * @param defaultValue A function providing the default value if the [key] is not found.
     * @return The [Float] value associated with the [key], or the default value if the [key] is not
     *   found.
     */
    public inline fun getFloatOrElse(key: String, defaultValue: () -> Float): Float

    /**
     * Retrieves an [Int] value associated with the specified [key]. Throws an
     * [IllegalStateException] if the [key] doesn't exist.
     *
     * @param key The [key] to retrieve the value for.
     * @return The [Int] value associated with the [key].
     * @throws IllegalStateException If the [key] is not found.
     */
    public inline fun getInt(key: String): Int

    /**
     * Retrieves an [Int] value associated with the specified [key], or a default value if the [key]
     * doesn't exist.
     *
     * @param key The [key] to retrieve the value for.
     * @param defaultValue A function providing the default value if the [key] is not found.
     * @return The [Int] value associated with the [key], or the default value if the [key] is not
     *   found.
     */
    public inline fun getIntOrElse(key: String, defaultValue: () -> Int): Int

    /**
     * Retrieves an [Long] value associated with the specified [key]. Throws an
     * [IllegalStateException] if the [key] doesn't exist.
     *
     * @param key The [key] to retrieve the value for.
     * @return The [Long] value associated with the [key].
     * @throws IllegalStateException If the [key] is not found.
     */
    public inline fun getLong(key: String): Long

    /**
     * Retrieves an [Int] value associated with the specified [key], or a default value if the [key]
     * doesn't exist.
     *
     * @param key The [key] to retrieve the value for.
     * @param defaultValue A function providing the default value if the [key] is not found.
     * @return The [Int] value associated with the [key], or the default value if the [key] is not
     *   found.
     */
    public inline fun getLongOrElse(key: String, defaultValue: () -> Long): Long

    /**
     * Retrieves a [String] value associated with the specified [key]. Throws an
     * [IllegalStateException] if the [key] doesn't exist.
     *
     * @param key The [key] to retrieve the value for.
     * @return The [String] value associated with the [key].
     * @throws IllegalStateException If the [key] is not found.
     */
    public inline fun getString(key: String): String

    /**
     * Retrieves a [String] value associated with the specified [key], or a default value if the
     * [key] doesn't exist.
     *
     * @param key The [key] to retrieve the value for.
     * @param defaultValue A function providing the default value if the [key] is not found.
     * @return The [String] value associated with the [key], or the default value if the [key] is
     *   not found.
     */
    public inline fun getStringOrElse(key: String, defaultValue: () -> String): String

    /**
     * Retrieves a [List] of elements of [Int] associated with the specified [key]. Throws an
     * [IllegalStateException] if the [key] doesn't exist.
     *
     * @param key The [key] to retrieve the value for.
     * @return The [List] of elements of [Int] associated with the [key].
     * @throws IllegalStateException If the [key] is not found.
     */
    public inline fun getIntList(key: String): List<Int>

    /**
     * Retrieves a [List] of elements of [Int] associated with the specified [key], or a default
     * value if the [key] doesn't exist.
     *
     * @param key The [key] to retrieve the value for.
     * @param defaultValue A function providing the default value if the [key] is not found or the
     *   retrieved value is not a list of [Int].
     * @return The list of elements of [Int] associated with the [key], or the default value if the
     *   [key] is not found.
     */
    public inline fun getIntListOrElse(key: String, defaultValue: () -> List<Int>): List<Int>

    /**
     * Retrieves a [List] of elements of [String] associated with the specified [key]. Throws an
     * [IllegalStateException] if the [key] doesn't exist.
     *
     * @param key The [key] to retrieve the value for.
     * @return The [List] of elements of [String] associated with the [key].
     * @throws IllegalStateException If the [key] is not found.
     */
    public inline fun getStringList(key: String): List<String>

    /**
     * Retrieves a [List] of elements of [String] associated with the specified [key], or a default
     * value if the [key] doesn't exist.
     *
     * @param key The [key] to retrieve the value for.
     * @param defaultValue A function providing the default value if the [key] is not found or the
     *   retrieved value is not a list of [String].
     * @return The list of elements of [String] associated with the [key], or the default value if
     *   the [key] is not found.
     */
    public inline fun getStringListOrElse(
        key: String,
        defaultValue: () -> List<String>
    ): List<String>

    /**
     * Retrieves a [BooleanArray] value associated with the specified [key]. Throws an
     * [IllegalStateException] if the [key] doesn't exist.
     *
     * @param key The [key] to retrieve the value for.
     * @return The [BooleanArray] value associated with the [key].
     * @throws IllegalStateException If the [key] is not found.
     */
    public inline fun getBooleanArray(key: String): BooleanArray

    /**
     * Retrieves a [BooleanArray] value associated with the specified [key], or a default value if
     * the [key] doesn't exist.
     *
     * @param key The [key] to retrieve the value for.
     * @param defaultValue A function providing the default value if the [key] is not found.
     * @return The [BooleanArray] value associated with the [key], or the default value if the [key]
     *   is not found.
     */
    public inline fun getBooleanArrayOrElse(
        key: String,
        defaultValue: () -> BooleanArray
    ): BooleanArray

    /**
     * Retrieves a [CharArray] value associated with the specified [key]. Throws an
     * [IllegalStateException] if the [key] doesn't exist.
     *
     * @param key The [key] to retrieve the value for.
     * @return The [CharArray] value associated with the [key].
     * @throws IllegalStateException If the [key] is not found.
     */
    public inline fun getCharArray(key: String): CharArray

    /**
     * Retrieves a [CharArray] value associated with the specified [key], or a default value if the
     * [key] doesn't exist.
     *
     * @param key The [key] to retrieve the value for.
     * @param defaultValue A function providing the default value if the [key] is not found.
     * @return The [CharArray] value associated with the [key], or the default value if the [key] is
     *   not found.
     */
    public inline fun getCharArrayOrElse(key: String, defaultValue: () -> CharArray): CharArray

    /**
     * Retrieves a [DoubleArray] value associated with the specified [key]. Throws an
     * [IllegalStateException] if the [key] doesn't exist.
     *
     * @param key The [key] to retrieve the value for.
     * @return The [DoubleArray] value associated with the [key].
     * @throws IllegalStateException If the [key] is not found.
     */
    public inline fun getDoubleArray(key: String): DoubleArray

    /**
     * Retrieves a [DoubleArray] value associated with the specified [key], or a default value if
     * the [key] doesn't exist.
     *
     * @param key The [key] to retrieve the value for.
     * @param defaultValue A function providing the default value if the [key] is not found.
     * @return The [DoubleArray] value associated with the [key], or the default value if the [key]
     *   is not found.
     */
    public inline fun getDoubleArrayOrElse(
        key: String,
        defaultValue: () -> DoubleArray
    ): DoubleArray

    /**
     * Retrieves a [FloatArray] value associated with the specified [key]. Throws an
     * [IllegalStateException] if the [key] doesn't exist.
     *
     * @param key The [key] to retrieve the value for.
     * @return The [FloatArray] value associated with the [key].
     * @throws IllegalStateException If the [key] is not found.
     */
    public inline fun getFloatArray(key: String): FloatArray

    /**
     * Retrieves a [FloatArray] value associated with the specified [key], or a default value if the
     * [key] doesn't exist.
     *
     * @param key The [key] to retrieve the value for.
     * @param defaultValue A function providing the default value if the [key] is not found.
     * @return The [FloatArray] value associated with the [key], or the default value if the [key]
     *   is not found.
     */
    public inline fun getFloatArrayOrElse(key: String, defaultValue: () -> FloatArray): FloatArray

    /**
     * Retrieves a [IntArray] value associated with the specified [key]. Throws an
     * [IllegalStateException] if the [key] doesn't exist.
     *
     * @param key The [key] to retrieve the value for.
     * @return The [IntArray] value associated with the [key].
     * @throws IllegalStateException If the [key] is not found.
     */
    public inline fun getIntArray(key: String): IntArray

    /**
     * Retrieves a [IntArray] value associated with the specified [key], or a default value if the
     * [key] doesn't exist.
     *
     * @param key The [key] to retrieve the value for.
     * @param defaultValue A function providing the default value if the [key] is not found.
     * @return The [IntArray] value associated with the [key], or the default value if the [key] is
     *   not found.
     */
    public inline fun getIntArrayOrElse(key: String, defaultValue: () -> IntArray): IntArray

    /**
     * Retrieves a [LongArray] value associated with the specified [key]. Throws an
     * [IllegalStateException] if the [key] doesn't exist.
     *
     * @param key The [key] to retrieve the value for.
     * @return The [LongArray] value associated with the [key].
     * @throws IllegalStateException If the [key] is not found.
     */
    public inline fun getLongArray(key: String): LongArray

    /**
     * Retrieves a [LongArray] value associated with the specified [key], or a default value if the
     * [key] doesn't exist.
     *
     * @param key The [key] to retrieve the value for.
     * @param defaultValue A function providing the default value if the [key] is not found.
     * @return The [LongArray] value associated with the [key], or the default value if the [key] is
     *   not found.
     */
    public inline fun getLongArrayOrElse(key: String, defaultValue: () -> LongArray): LongArray

    /**
     * Retrieves a [Array] of [String] value associated with the specified [key]. Throws an
     * [IllegalStateException] if the [key] doesn't exist.
     *
     * @param key The [key] to retrieve the value for.
     * @return The [Array] of [String] value associated with the [key].
     * @throws IllegalStateException If the [key] is not found.
     */
    public inline fun getStringArray(key: String): Array<String>

    /**
     * Retrieves a [Array] of [String] value associated with the specified [key], or a default value
     * if the [key] doesn't exist.
     *
     * @param key The [key] to retrieve the value for.
     * @param defaultValue A function providing the default value if the [key] is not found.
     * @return The [Array] of [String] value associated with the [key], or the default value if the
     *   [key] is not found.
     */
    public inline fun getStringArrayOrElse(
        key: String,
        defaultValue: () -> Array<String>
    ): Array<String>

    /**
     * Retrieves a [SavedState] object associated with the specified [key]. Throws an
     * [IllegalStateException] if the [key] doesn't exist.
     *
     * @param key The [key] to retrieve the value for.
     * @return The [SavedState] object associated with the [key].
     * @throws IllegalStateException If the [key] is not found.
     */
    public inline fun getSavedState(key: String): SavedState

    /**
     * Retrieves a [SavedState] object associated with the specified [key], or a default value if
     * the [key] doesn't exist.
     *
     * @param key The [key] to retrieve the value for.
     * @param defaultValue A function providing the default [SavedState] if the [key] is not found.
     * @return The [SavedState] object associated with the [key], or the default value if the [key]
     *   is not found.
     */
    public inline fun getSavedStateOrElse(key: String, defaultValue: () -> SavedState): SavedState

    /**
     * Returns the number of key-value pairs in the [SavedState].
     *
     * @return The size of the [SavedState].
     */
    public inline fun size(): Int

    /**
     * Checks if the [SavedState] is empty (contains no key-value pairs).
     *
     * @return `true` if the [SavedState] is empty, `false` otherwise.
     */
    public inline fun isEmpty(): Boolean

    /**
     * Checks if the [SavedState] contains a null reference for the specified [key].
     *
     * @param key The [key] to check for.
     * @return `true` if the [SavedState] contains a null reference for the [key], `false`
     *   otherwise.
     */
    public inline fun isNull(key: String): Boolean

    /**
     * Checks if the [SavedState] contains the specified [key].
     *
     * @param key The [key] to check for.
     * @return `true` if the [SavedState] contains the [key], `false` otherwise.
     */
    public inline operator fun contains(key: String): Boolean

    /**
     * Checks if the two specified [SavedState] are *deeply* equal to one another.
     *
     * Two [SavedState] are considered deeply equal if they have the same size, and elements at
     * corresponding keys are deeply equal. That is, if two corresponding elements are nested
     * [SavedState], they are also compared deeply.
     *
     * @param other the object to compare deeply with this.
     * @return `true` if the two are deeply equal, `false` otherwise.
     */
    public fun contentDeepEquals(other: SavedState): Boolean

    /**
     * Returns a new [Map] containing all key-value pairs from the [SavedState].
     *
     * The returned [Map] does not preserve the entry iteration order of the [SavedState].
     *
     * **IMPORTANT:** All values will be copied by reference, and values within the [SavedState]
     * that are also a [SavedState] will **NOT** be converted to a [Map].
     *
     * @return A [Map] containing all key-value pairs from the [SavedState].
     */
    public fun toMap(): Map<String, Any?>
}
