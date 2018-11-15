/*
 * Copyright (c) 2017-2018 Aion foundation.
 *
 *     This file is part of the aion network project.
 *
 *     The aion network project is free software: you can redistribute it
 *     and/or modify it under the terms of the GNU General Public License
 *     as published by the Free Software Foundation, either version 3 of
 *     the License, or any later version.
 *
 *     The aion network project is distributed in the hope that it will
 *     be useful, but WITHOUT ANY WARRANTY; without even the implied
 *     warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 *     See the GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with the aion network project source files.
 *     If not, see <https://www.gnu.org/licenses/>.
 *
 * Contributors:
 *     Aion foundation.
 */

package org.aion.api.server.http;

import java.util.Optional;

// @ThreadSafe
public enum RpcServerVendor {
    NANO, // nano httpd
    UNDERTOW; // undertow (jboss)

    public static Optional<RpcServerVendor> fromString(String _vendor) {
        if (_vendor == null) return Optional.empty();

        for (RpcServerVendor vendor : values())
            if (vendor.name().equalsIgnoreCase(_vendor)) return Optional.of(vendor);

        return Optional.empty();
    }
}
