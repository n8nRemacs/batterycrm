package io.ktor.client.plugins.websocket;

import io.ktor.client.request.a0;
import io.ktor.http.C41519f0;
import io.ktor.http.T;
import io.ktor.http.U;
import io.ktor.http.V;
import io.ktor.util.C41596g;
import kotlin.Metadata;

/* compiled from: WebSocketContent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/client/plugins/websocket/A;", "Lio/ktor/client/request/a0;", "<init>", "()V", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class A extends a0 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final V f399656b;

    public A() {
        String strB = C41596g.b(io.ktor.util.D.b());
        U u12 = new U(0, 1, null);
        C41519f0.f400005a.getClass();
        u12.d(C41519f0.f400030z, "websocket");
        u12.d(C41519f0.f400010f, "Upgrade");
        u12.d(C41519f0.f400026v, strB);
        u12.d(C41519f0.f400027w, "13");
        this.f399656b = u12.l();
    }

    @Override // io.ktor.http.content.p
    @Y61.k
    public final T c() {
        return this.f399656b;
    }

    @Y61.k
    public final String toString() {
        return "WebSocketContent";
    }
}
