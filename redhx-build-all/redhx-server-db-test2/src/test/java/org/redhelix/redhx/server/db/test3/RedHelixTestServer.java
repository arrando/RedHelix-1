/*
 * Copyright 2015 JBlade LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License
 *
 */
package org.redhelix.redhx.server.db.test3;

import org.jboss.resteasy.plugins.server.tjws.TJWSEmbeddedJaxrsServer;
import org.redhelix.server.main.RedHxServlet;

/**
 *
 *
 * @since RedHelix Version 0.2
 * @author Hank Bruning
 *
 */
public final class RedHelixTestServer
{

    public static final int TCP_PORT_NUMBER = 6701;

    static TJWSEmbeddedJaxrsServer startServer()
    {
        TJWSEmbeddedJaxrsServer tjws = new TJWSEmbeddedJaxrsServer();

        tjws.setPort(TCP_PORT_NUMBER);
        tjws.start();

        RedHxServlet servlet = new RedHxServlet();

        tjws.addServlet(servlet);

        return tjws;
    }
}
