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
 * Encodes an {@code int} to a chain of buffer units.
 *
 * @since 2.5
 */
public interface ISetIntEncoder {

	/**
	 * Encodes the specified {@code int} value {@code i} and sets the resultant
	 * bytes to the specified {@code unitChain} starting at the specified
	 * {@code index} in the current unit.
	 *
	 * @param i
	 *            the {@code int} value to be encoded
	 * @param unitChain
	 *            the unit chain where the encoded bytes to be set to
	 * @param index
	 *            the offset of the first byte in the current unit to be set
	 * @throws IndexOutOfBoundsException
	 *             if {@code index} is out of bounds
	 */
	void set(int i, IUnitChain unitChain, int index);
}
