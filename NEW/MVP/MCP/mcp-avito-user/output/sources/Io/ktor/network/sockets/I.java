package io.ktor.network.sockets;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import kotlin.Metadata;

/* compiled from: JavaSocketAddressUtils.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-network"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class I {
    @Y61.k
    public static final U a(@Y61.k SocketAddress socketAddress) {
        if (socketAddress instanceof InetSocketAddress) {
            return new H((InetSocketAddress) socketAddress);
        }
        if (socketAddress.getClass().getName().equals("java.net.UnixDomainSocketAddress")) {
            return new s0(socketAddress);
        }
        throw new IllegalStateException("Unknown socket address type");
    }
}
