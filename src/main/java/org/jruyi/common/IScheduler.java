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

package org.jruyi.common;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/**
 * A scheduler that can schedule commands to run after a given delay, or to
 * execute periodically.
 * <p>
 * The schedule methods create tasks with various delays and return a task
 * object that can be used to cancel or check execution. The scheduleAtFixedRate
 * and scheduleWithFixedDelay methods create and execute tasks that run
 * periodically until cancelled.
 *
 * @since 1.3
 */
public interface IScheduler {

	/**
	 * Creates and executes a one-shot action that becomes enabled after the
	 * given delay.
	 * 
	 * @param command
	 *            the task to execute
	 * @param delay
	 *            the time from now to delay execution
	 * @param unit
	 *            the time unit of the delay parameter
	 * @return a ScheduledFuture representing pending completion of the task and
	 *         whose {@code get()} method will return {@code null} upon
	 *         completion
	 * @throws java.util.concurrent.RejectedExecutionException
	 *             if the task cannot be scheduled for execution
	 * @throws NullPointerException
	 *             if command is null
	 */
	ScheduledFuture<?> schedule(Runnable command, long delay, TimeUnit unit);

	/**
	 * Creates and executes a ScheduledFuture that becomes enabled after the
	 * given delay.
	 * 
	 * @param callable
	 *            the function to execute
	 * @param delay
	 *            the time from now to delay execution
	 * @param unit
	 *            the time unit of the delay parameter
	 * @param <V>
	 *            the type of the callable's result
	 * @return a ScheduledFuture that can be used to extract result or cancel
	 * @throws java.util.concurrent.RejectedExecutionException
	 *             if the task cannot be scheduled for execution
	 * @throws NullPointerException
	 *             if callable is null
	 */
	<V> ScheduledFuture<V> schedule(Callable<V> callable, long delay, TimeUnit unit);

	/**
	 * Creates and executes a periodic action that becomes enabled first after
	 * the given initial delay, and subsequently with the given period; that is
	 * executions will commence after {@code initialDelay} then
	 * {@code initialDelay+period}, then {@code initialDelay + 2 * period}, and
	 * so on. If any execution of the task encounters an exception, subsequent
	 * executions are suppressed. Otherwise, the task will only terminate via
	 * cancellation or termination of the executor. If any execution of this
	 * task takes longer than its period, then subsequent executions may start
	 * late, but will not concurrently execute.
	 * 
	 * @param command
	 *            the task to execute
	 * @param initialDelay
	 *            the time to delay first execution
	 * @param period
	 *            the period between successive executions
	 * @param unit
	 *            the time unit of the initialDelay and period parameters
	 * @return a ScheduledFuture representing pending completion of the task,
	 *         and whose {@code get()} method will throw an exception upon
	 *         cancellation
	 * @throws java.util.concurrent.RejectedExecutionException
	 *             if the task cannot be scheduled for execution
	 * @throws NullPointerException
	 *             if command is null
	 * @throws IllegalArgumentException
	 *             if period less than or equal to zero
	 */
	ScheduledFuture<?> scheduleAtFixedRate(Runnable command, long initialDelay, long period, TimeUnit unit);

	/**
	 * Creates and executes a periodic action that becomes enabled first after
	 * the given initial delay, and subsequently with the given delay between
	 * the termination of one execution and the commencement of the next. If any
	 * execution of the task encounters an exception, subsequent executions are
	 * suppressed. Otherwise, the task will only terminate via cancellation or
	 * termination of the executor.
	 * 
	 * @param command
	 *            the task to execute
	 * @param initialDelay
	 *            the time to delay first execution
	 * @param delay
	 *            the delay between the termination of one execution and the
	 *            commencement of the next
	 * @param unit
	 *            the time unit of the initialDelay and delay parameters
	 * @return a ScheduledFuture representing pending completion of the task,
	 *         and whose {@code get()} method will throw an exception upon
	 *         cancellation
	 * @throws java.util.concurrent.RejectedExecutionException
	 *             if the task cannot be scheduled for execution
	 * @throws NullPointerException
	 *             if command is null
	 * @throws IllegalArgumentException
	 *             if delay less than or equal to zero
	 */
	ScheduledFuture<?> scheduleWithFixedDelay(Runnable command, long initialDelay, long delay, TimeUnit unit);
}
