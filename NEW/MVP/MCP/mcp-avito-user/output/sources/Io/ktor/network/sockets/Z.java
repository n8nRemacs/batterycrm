package io.ktor.network.sockets;

import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SocketOptions.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lio/ktor/network/sockets/Z;", "", "a", "b", "c", "d", "e", "f", "Lio/ktor/network/sockets/Z$a;", "Lio/ktor/network/sockets/Z$c;", "Lio/ktor/network/sockets/Z$d;", "ktor-network"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public abstract class Z {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final b f400245b = new b(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Map<Object, Object> f400246a;

    /* compiled from: SocketOptions.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/network/sockets/Z$a;", "Lio/ktor/network/sockets/Z;", "ktor-network"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class a extends Z {
    }

    /* compiled from: SocketOptions.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/network/sockets/Z$b;", "", "<init>", "()V", "ktor-network"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: SocketOptions.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/network/sockets/Z$c;", "Lio/ktor/network/sockets/Z;", "ktor-network"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class c extends Z {
        public c() {
            throw null;
        }
    }

    /* compiled from: SocketOptions.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/network/sockets/Z$d;", "Lio/ktor/network/sockets/Z;", "ktor-network"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static class d extends Z {

        /* renamed from: c, reason: collision with root package name */
        public int f400247c;

        /* renamed from: d, reason: collision with root package name */
        public int f400248d;

        public d(@Y61.k HashMap map) {
            super(map, null);
            this.f400247c = -1;
            this.f400248d = -1;
        }

        public void a(@Y61.k Z z12) {
            if (z12 instanceof d) {
                d dVar = (d) z12;
                this.f400247c = dVar.f400247c;
                this.f400248d = dVar.f400248d;
            }
        }
    }

    /* compiled from: SocketOptions.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/network/sockets/Z$e;", "Lio/ktor/network/sockets/Z$d;", "ktor-network"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class e extends d {
        @Override // io.ktor.network.sockets.Z.d
        public final void a(@Y61.k Z z12) {
            super.a(z12);
            if (z12 instanceof e) {
                throw null;
            }
        }
    }

    /* compiled from: SocketOptions.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/network/sockets/Z$f;", "Lio/ktor/network/sockets/Z$d;", "ktor-network"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class f extends d {
        public f() {
            throw null;
        }

        @Override // io.ktor.network.sockets.Z.d
        public final void a(@Y61.k Z z12) {
            super.a(z12);
            boolean z13 = z12 instanceof f;
        }
    }

    public Z() {
        throw null;
    }

    public Z(Map map, C42822w c42822w) {
        this.f400246a = map;
        n0.f400257b.getClass();
    }
}
