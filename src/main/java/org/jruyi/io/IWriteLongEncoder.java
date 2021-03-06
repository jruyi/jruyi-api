/*
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

package org.jruyi.io;

/**
 * Encodes a {@code long} to a chain of buffer units.
 *
 * @since 2.5
 */
public interface IWriteLongEncoder {

	/**
	 * Encodes the specified {@code long} value {@code l} and writes the
	 * resultant bytes to the end of the specified {@code unitChain}.
	 *
	 * @param l
	 *            the {@code long} value to be encoded
	 * @param unitChain
	 *            the unit chain where the encoded bytes to be written to
	 */
	void write(long l, IUnitChain unitChain);
}
