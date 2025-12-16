package org.apache.http.impl.conn.tsccm;

import android.net.TrafficStats;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.conn.ConnectionPoolTimeoutException;
import org.apache.http.conn.ManagedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.impl.conn.DefaultClientConnectionOperator;
import org.apache.http.params.HttpParams;

@Deprecated
/* loaded from: classes2.dex */
public class ThreadSafeClientConnManager implements ClientConnectionManager {
    protected ClientConnectionOperator connOperator;
    protected final AbstractConnPool connectionPool;
    private final Log log = LogFactory.getLog(getClass());
    protected SchemeRegistry schemeRegistry;

    public ThreadSafeClientConnManager(HttpParams httpParams, SchemeRegistry schemeRegistry) {
        if (httpParams == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        this.schemeRegistry = schemeRegistry;
        this.connOperator = createConnectionOperator(schemeRegistry);
        this.connectionPool = createConnectionPool(httpParams);
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public void closeExpiredConnections() {
        this.connectionPool.closeExpiredConnections();
        this.connectionPool.deleteClosedConnections();
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public void closeIdleConnections(long j, TimeUnit timeUnit) {
        this.connectionPool.closeIdleConnections(j, timeUnit);
        this.connectionPool.deleteClosedConnections();
    }

    public ClientConnectionOperator createConnectionOperator(SchemeRegistry schemeRegistry) {
        return new DefaultClientConnectionOperator(schemeRegistry);
    }

    public AbstractConnPool createConnectionPool(HttpParams httpParams) throws IllegalStateException {
        ConnPoolByRoute connPoolByRoute = new ConnPoolByRoute(this.connOperator, httpParams);
        connPoolByRoute.enableConnectionGC();
        return connPoolByRoute;
    }

    public void finalize() throws Throwable {
        shutdown();
        super.finalize();
    }

    public int getConnectionsInPool(HttpRoute httpRoute) {
        return ((ConnPoolByRoute) this.connectionPool).getConnectionsInPool(httpRoute);
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public SchemeRegistry getSchemeRegistry() {
        return this.schemeRegistry;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00a5  */
    @Override // org.apache.http.conn.ClientConnectionManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void releaseConnection(org.apache.http.conn.ManagedClientConnection r11, long r12, java.util.concurrent.TimeUnit r14) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r11 instanceof org.apache.http.impl.conn.tsccm.BasicPooledConnAdapter
            if (r0 == 0) goto Lab
            org.apache.http.impl.conn.tsccm.BasicPooledConnAdapter r11 = (org.apache.http.impl.conn.tsccm.BasicPooledConnAdapter) r11
            org.apache.http.impl.conn.AbstractPoolEntry r0 = r11.getPoolEntry()
            if (r0 == 0) goto L1b
            org.apache.http.conn.ClientConnectionManager r0 = r11.getManager()
            if (r0 != r10) goto L13
            goto L1b
        L13:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Connection not obtained from this manager."
            r11.<init>(r12)
            throw r11
        L1b:
            org.apache.http.impl.conn.AbstractPoolEntry r0 = r11.getPoolEntry()     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
            org.apache.http.impl.conn.tsccm.BasicPoolEntry r0 = (org.apache.http.impl.conn.tsccm.BasicPoolEntry) r0     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
            org.apache.http.conn.OperatedClientConnection r0 = r0.getConnection()     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
            java.net.Socket r0 = r0.getSocket()     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
            if (r0 == 0) goto L37
            android.net.TrafficStats.untagSocket(r0)     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
            goto L37
        L2f:
            r0 = move-exception
            r7 = r12
            r9 = r14
            goto L95
        L33:
            r0 = move-exception
            r7 = r12
            r9 = r14
            goto L6d
        L37:
            boolean r0 = r11.isOpen()     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
            if (r0 == 0) goto L55
            boolean r0 = r11.isMarkedReusable()     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
            if (r0 != 0) goto L55
            org.apache.commons.logging.Log r0 = r10.log     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
            boolean r0 = r0.isDebugEnabled()     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
            if (r0 == 0) goto L52
            org.apache.commons.logging.Log r0 = r10.log     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
            java.lang.String r1 = "Released connection open but not marked reusable."
            r0.debug(r1)     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
        L52:
            r11.shutdown()     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L33
        L55:
            org.apache.http.impl.conn.AbstractPoolEntry r0 = r11.getPoolEntry()
            r2 = r0
            org.apache.http.impl.conn.tsccm.BasicPoolEntry r2 = (org.apache.http.impl.conn.tsccm.BasicPoolEntry) r2
            boolean r3 = r11.isMarkedReusable()
            r11.detach()
            if (r2 == 0) goto L94
            org.apache.http.impl.conn.tsccm.AbstractConnPool r1 = r10.connectionPool
            r4 = r12
            r6 = r14
            r1.freeEntry(r2, r3, r4, r6)
            return
        L6d:
            org.apache.commons.logging.Log r12 = r10.log     // Catch: java.lang.Throwable -> L7d
            boolean r12 = r12.isDebugEnabled()     // Catch: java.lang.Throwable -> L7d
            if (r12 == 0) goto L7f
            org.apache.commons.logging.Log r12 = r10.log     // Catch: java.lang.Throwable -> L7d
            java.lang.String r13 = "Exception shutting down released connection."
            r12.debug(r13, r0)     // Catch: java.lang.Throwable -> L7d
            goto L7f
        L7d:
            r0 = move-exception
            goto L95
        L7f:
            org.apache.http.impl.conn.AbstractPoolEntry r12 = r11.getPoolEntry()
            r5 = r12
            org.apache.http.impl.conn.tsccm.BasicPoolEntry r5 = (org.apache.http.impl.conn.tsccm.BasicPoolEntry) r5
            boolean r6 = r11.isMarkedReusable()
            r11.detach()
            if (r5 == 0) goto L94
            org.apache.http.impl.conn.tsccm.AbstractConnPool r4 = r10.connectionPool
            r4.freeEntry(r5, r6, r7, r9)
        L94:
            return
        L95:
            org.apache.http.impl.conn.AbstractPoolEntry r12 = r11.getPoolEntry()
            r5 = r12
            org.apache.http.impl.conn.tsccm.BasicPoolEntry r5 = (org.apache.http.impl.conn.tsccm.BasicPoolEntry) r5
            boolean r6 = r11.isMarkedReusable()
            r11.detach()
            if (r5 == 0) goto Laa
            org.apache.http.impl.conn.tsccm.AbstractConnPool r4 = r10.connectionPool
            r4.freeEntry(r5, r6, r7, r9)
        Laa:
            throw r0
        Lab:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Connection class mismatch, connection not obtained from this manager."
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager.releaseConnection(org.apache.http.conn.ManagedClientConnection, long, java.util.concurrent.TimeUnit):void");
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public ClientConnectionRequest requestConnection(final HttpRoute httpRoute, Object obj) {
        final PoolEntryRequest poolEntryRequestRequestPoolEntry = this.connectionPool.requestPoolEntry(httpRoute, obj);
        return new ClientConnectionRequest() { // from class: org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager.1
            @Override // org.apache.http.conn.ClientConnectionRequest
            public void abortRequest() {
                poolEntryRequestRequestPoolEntry.abortRequest();
            }

            @Override // org.apache.http.conn.ClientConnectionRequest
            public ManagedClientConnection getConnection(long j, TimeUnit timeUnit) throws SocketException, InterruptedException, ConnectionPoolTimeoutException {
                if (httpRoute == null) {
                    throw new IllegalArgumentException("Route may not be null.");
                }
                if (ThreadSafeClientConnManager.this.log.isDebugEnabled()) {
                    ThreadSafeClientConnManager.this.log.debug("ThreadSafeClientConnManager.getConnection: " + httpRoute + ", timeout = " + j);
                }
                BasicPoolEntry poolEntry = poolEntryRequestRequestPoolEntry.getPoolEntry(j, timeUnit);
                try {
                    Socket socket = poolEntry.getConnection().getSocket();
                    if (socket != null) {
                        TrafficStats.tagSocket(socket);
                    }
                } catch (IOException e) {
                    ThreadSafeClientConnManager.this.log.debug("Problem tagging socket.", e);
                }
                return new BasicPooledConnAdapter(ThreadSafeClientConnManager.this, poolEntry);
            }
        };
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public void shutdown() {
        this.connectionPool.shutdown();
    }

    public int getConnectionsInPool() {
        int i;
        synchronized (this.connectionPool) {
            i = this.connectionPool.numConnections;
        }
        return i;
    }
}
