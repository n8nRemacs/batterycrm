package io.ktor.network.sockets;

import io.ktor.network.sockets.Z;
import java.util.HashMap;
import kotlin.Metadata;

/* compiled from: Builders.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lio/ktor/network/sockets/W;", "Lio/ktor/network/sockets/r;", "Lio/ktor/network/sockets/Z;", "ktor-network"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class W implements r<W, Z> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final io.ktor.network.selector.a f400238a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Z f400239b;

    public W(@Y61.k io.ktor.network.selector.a aVar, @Y61.k Z z12) {
        this.f400238a = aVar;
        this.f400239b = z12;
    }

    @Y61.k
    public final o0 a() {
        Z.d dVar = new Z.d(new HashMap(this.f400239b.f400246a));
        Z.f fVar = new Z.f(new HashMap(dVar.f400246a));
        dVar.a(dVar);
        return new o0(this.f400238a, fVar);
    }
}
