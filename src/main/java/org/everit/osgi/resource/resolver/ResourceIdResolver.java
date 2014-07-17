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
