package io.ktor.client.request;

import io.ktor.http.C41531l0;
import io.ktor.http.T0;
import io.ktor.util.InterfaceC41588c;
import io.ktor.util.InterfaceC41603j0;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* compiled from: DefaultHttpRequest.kt */
@InterfaceC41603j0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/client/request/b0;", "Lio/ktor/client/request/c0;", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public class b0 implements c0 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final io.ktor.client.call.b f399701b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C41531l0 f399702c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final T0 f399703d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final io.ktor.http.content.p f399704e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final io.ktor.http.V f399705f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC41588c f399706g;

    public b0(@Y61.k io.ktor.client.call.b bVar, @Y61.k e0 e0Var) {
        this.f399701b = bVar;
        this.f399702c = e0Var.f399715b;
        this.f399703d = e0Var.f399714a;
        this.f399704e = e0Var.f399717d;
        this.f399705f = e0Var.f399716c;
        this.f399706g = e0Var.f399719f;
    }

    @Override // io.ktor.http.InterfaceC41523h0
    @Y61.k
    /* renamed from: b */
    public final io.ktor.http.T getF399115f() {
        return this.f399705f;
    }

    @Override // io.ktor.client.request.c0
    @Y61.k
    /* renamed from: d, reason: from getter */
    public final io.ktor.http.content.p getF399114e() {
        return this.f399704e;
    }

    @Override // io.ktor.client.request.c0
    @Y61.k
    /* renamed from: getCall, reason: from getter */
    public final io.ktor.client.call.b getF399701b() {
        return this.f399701b;
    }

    @Override // io.ktor.client.request.c0, kotlinx.coroutines.T
    @Y61.k
    /* renamed from: getCoroutineContext */
    public final CoroutineContext getF398924i() {
        return this.f399701b.getF398924i();
    }

    @Override // io.ktor.client.request.c0
    @Y61.k
    /* renamed from: getMethod, reason: from getter */
    public final C41531l0 getF399111b() {
        return this.f399702c;
    }

    @Override // io.ktor.client.request.c0
    @Y61.k
    /* renamed from: getUrl, reason: from getter */
    public final T0 getF399112c() {
        return this.f399703d;
    }

    @Override // io.ktor.client.request.c0
    @Y61.k
    /* renamed from: q, reason: from getter */
    public final InterfaceC41588c getF399113d() {
        return this.f399706g;
    }
}
