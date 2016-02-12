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
 * A chain of buffer units. It has a position pointer used to iterate the buffer
 * units in this chain. It provides a low level interface to operate the data in
 * a buffer consisting of a chain of buffer units.
 * 
 * @see IBuffer
 * @see IBufferFactory
 */
public interface IUnitChain {

	/**
	 * Returns a new buffer unit.
	 * 
	 * @return a new buffer unit
	 */
	IUnit create();

	/**
	 * Returns a new buffer unit with capacity ensured to be at least equal to
	 * the specified minimum.
	 *
	 * @param minimumCapacity
	 *            the minimum desired capacity
	 * @return a new buffer unit as described
	 * @since 2.1
	 */
	IUnit create(int minimumCapacity);

	/**
	 * Returns the buffer unit the position pointer is pointing to.
	 * 
	 * @return the buffer unit as described
	 */
	IUnit currentUnit();

	/**
	 * The buffer unit following the current one becomes the current by
	 * forwarding the position pointer, and is returned.
	 * 
	 * @return the buffer unit as described
	 */
	IUnit nextUnit();

	/**
	 * Returns the first buffer unit in this chain
	 * 
	 * @return the first buffer unit
	 */
	IUnit firstUnit();

	/**
	 * Returns the last buffer unit in this chain.
	 * 
	 * @return the last buffer unit
	 */
	IUnit lastUnit();

	/**
	 * Appends the specified {@code unit} to the end of this chain.
	 * 
	 * @param unit
	 *            the buffer unit to be appended.
	 */
	void append(IUnit unit);

	/**
	 * Prepends the specified {@code unit} to the head of this chain.
	 * 
	 * @param unit
	 *            the buffer unit to be prepended.
	 */
	void prepend(IUnit unit);

	/**
	 * Returns the number of bytes remaining in the chained buffer units.
	 * 
	 * @return the number of bytes remaining in the chained buffer units.
	 * @since 1.2
	 */
	int remaining();

	/**
	 * Returns the number of units that this chain has.
	 *
	 * @return the number of units
	 * @since 2.5
	 */
	int size();

	/**
	 * Returns the unit at the specified position in this chain.
	 *
	 * @param index
	 *            the index of the unit to return
	 * @return the unit at the specified position in this chain
	 * @throws IndexOutOfBoundsException
	 *             if the index is out of range (index < 0 || index >= size())
	 * @since 2.5
	 */
	IUnit unitAt(int index);
}
