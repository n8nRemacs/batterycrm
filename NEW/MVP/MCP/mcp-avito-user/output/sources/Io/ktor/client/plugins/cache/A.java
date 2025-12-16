package io.ktor.client.plugins.cache;

import io.ktor.client.request.c0;
import io.ktor.client.request.e0;
import io.ktor.http.C41531l0;
import io.ktor.http.T;
import io.ktor.http.T0;
import io.ktor.util.InterfaceC41588c;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* compiled from: HttpCache.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/client/plugins/cache/A;", "Lio/ktor/client/request/c0;", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
final class A implements c0 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C41531l0 f399111b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final T0 f399112c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC41588c f399113d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final io.ktor.http.content.p f399114e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final T f399115f;

    public A(@Y61.k e0 e0Var) {
        this.f399111b = e0Var.f399715b;
        this.f399112c = e0Var.f399714a;
        this.f399113d = e0Var.f399719f;
        this.f399114e = e0Var.f399717d;
        this.f399115f = e0Var.f399716c;
    }

    @Override // io.ktor.http.InterfaceC41523h0
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final T getF399115f() {
        return this.f399115f;
    }

    @Override // io.ktor.client.request.c0
    @Y61.k
    /* renamed from: d, reason: from getter */
    public final io.ktor.http.content.p getF399114e() {
        return this.f399114e;
    }

    @Override // io.ktor.client.request.c0
    @Y61.k
    /* renamed from: getCall */
    public final io.ktor.client.call.b getF399701b() {
        throw new IllegalStateException("This request has no call");
    }

    @Override // io.ktor.client.request.c0, kotlinx.coroutines.T
    @Y61.k
    /* renamed from: getCoroutineContext */
    public final CoroutineContext getF398924i() {
        getF399701b();
        throw null;
    }

    @Override // io.ktor.client.request.c0
    @Y61.k
    /* renamed from: getMethod, reason: from getter */
    public final C41531l0 getF399111b() {
        return this.f399111b;
    }

    @Override // io.ktor.client.request.c0
    @Y61.k
    /* renamed from: getUrl, reason: from getter */
    public final T0 getF399112c() {
        return this.f399112c;
    }

    @Override // io.ktor.client.request.c0
    @Y61.k
    /* renamed from: q, reason: from getter */
    public final InterfaceC41588c getF399113d() {
        return this.f399113d;
    }
}
