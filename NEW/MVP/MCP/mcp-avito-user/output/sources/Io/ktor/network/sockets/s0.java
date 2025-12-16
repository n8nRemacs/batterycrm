package io.ktor.network.sockets;

import java.net.SocketAddress;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SocketAddressJvm.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lio/ktor/network/sockets/s0;", "Lio/ktor/network/sockets/U;", "a", "ktor-network"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class s0 extends U {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final SocketAddress f400272a;

    /* compiled from: SocketAddressJvm.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/ktor/network/sockets/s0$a;", "", "<init>", "()V", "Ljava/lang/Class;", "unixDomainSocketAddressClass", "Ljava/lang/Class;", "ktor-network"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
        try {
            Class.forName("java.net.UnixDomainSocketAddress");
        } catch (ClassNotFoundException unused) {
        }
    }

    public s0(@Y61.k SocketAddress socketAddress) {
        super(null);
        this.f400272a = socketAddress;
        if (!socketAddress.getClass().getName().equals("java.net.UnixDomainSocketAddress")) {
            throw new IllegalStateException("address should be java.net.UnixDomainSocketAddress");
        }
    }

    @Override // io.ktor.network.sockets.U
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final SocketAddress getF400272a() {
        return this.f400272a;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return s0.class.equals(obj != null ? obj.getClass() : null) && kotlin.jvm.internal.L.f(this.f400272a, ((s0) obj).f400272a);
    }

    public final int hashCode() {
        return this.f400272a.hashCode();
    }

    @Y61.k
    public final String toString() {
        return this.f400272a.toString();
    }
}
