/**
 * This file is part of org.everit.osgi.resource.ext.
 *
 * org.everit.osgi.resource.ext is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * org.everit.osgi.resource.ext is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with org.everit.osgi.resource.ext.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.everit.osgi.resource.ext.provider;

/**
 * The Resource ID Provider component maps the previously created mapped principal to a Resource ID.
 */
public interface ResourceIdProvider {

    /**
     * Maps the given unique identifier to a Resource ID based on different data sources: such as database, LDAP, etc.
     * It is also supported to combine different ResourceIdProviders to use multiple data sources.
     *
     * @param uniqueIdentifier
     *            The unique identifier to map as a Resource ID. Cannot be null.
     * @return The Resource ID defined by the unique identifier or <code>null</code> if it cannot be mapped.
     */
    Long getResourceId(String uniqueIdentifier);

}
