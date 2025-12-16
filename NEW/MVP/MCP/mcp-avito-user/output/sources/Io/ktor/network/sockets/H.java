package io.ktor.network.sockets;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import kotlin.Metadata;

/* compiled from: SocketAddressJvm.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/network/sockets/H;", "Lio/ktor/network/sockets/U;", "ktor-network"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class H extends U {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InetSocketAddress f400227a;

    public H(@Y61.k InetSocketAddress inetSocketAddress) {
        super(null);
        this.f400227a = inetSocketAddress;
    }

    @Override // io.ktor.network.sockets.U
    public final SocketAddress a() {
        return this.f400227a;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return H.class.equals(obj != null ? obj.getClass() : null) && kotlin.jvm.internal.L.f(this.f400227a, ((H) obj).f400227a);
    }

    public final int hashCode() {
        return this.f400227a.hashCode();
    }

    @Y61.k
    public final String toString() {
        return this.f400227a.toString();
    }

    public H(@Y61.k String str, int i12) {
        this(new InetSocketAddress(str, i12));
    }
}
