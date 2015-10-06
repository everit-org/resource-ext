/*
 * Copyright (C) 2011 Everit Kft. (http://www.everit.biz)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.everit.resource.resolver;

import java.util.Optional;

/**
 * The Resource ID Resolver maps an unique identifier to a Resource ID.
 */
public interface ResourceIdResolver {

  /**
   * Maps the given unique identifier to a Resource ID.
   *
   * @param uniqueIdentifier
   *          The unique identifier to map as a Resource ID. Cannot be null.
   * @return an {@link Optional} with the Resource ID defined by the unique identifier or an
   *         {@link Optional} with <code>null</code> value if it cannot be mapped.
   */
  Optional<Long> getResourceId(String uniqueIdentifier);

}
