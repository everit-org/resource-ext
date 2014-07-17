/**
 * This file is part of Everit - Resource Resolver API.
 *
 * Everit - Resource Resolver API is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Everit - Resource Resolver API is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Everit - Resource Resolver API.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.everit.osgi.resource.resolver;

/**
 * The Resource ID Resolver maps an unique identifier to a Resource ID.
 */
public interface ResourceIdResolver {

    /**
     * Maps the given unique identifier to a Resource ID.
     *
     * @param uniqueIdentifier
     *            The unique identifier to map as a Resource ID. Cannot be null.
     * @return The Resource ID defined by the unique identifier or <code>null</code> if it cannot be mapped.
     */
    Long getResourceId(String uniqueIdentifier);

}
