/*
 * Copyright 2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.cloud.cluster.lock;

/**
 * {@code LockRegistry} implementations provide high
 * level access to obtain {@link DistributedLock}s
 * from a system using a locking key.
 *
 * <p>Purpose of this interface is to decouple lock
 * access from their implementing system. Registry may
 * return locks from different systems while {@link LockService}
 * is always bound to a one system. Also implementation may
 * choose to use {@link LockServiceLocator} to find the backing
 * {@link LockService} implementation.
 *
 * @author Janne Valkealahti
 *
 * @deprecated in favour of equivalent functionality in Spring Integration 4.3
 */
@Deprecated
public interface LockRegistry {

	/**
	 * Gets a {@link DistributedLock} from a registry.
	 *
	 * @param lockKey the locking key
	 * @return distributed lock
	 */
	DistributedLock get(String lockKey);

}
