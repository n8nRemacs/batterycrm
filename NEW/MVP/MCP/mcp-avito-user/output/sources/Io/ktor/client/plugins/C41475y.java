package io.ktor.client.plugins;

import io.ktor.http.C41531l0;
import io.ktor.http.T0;
import io.ktor.util.InterfaceC41588c;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* compiled from: HttpCallValidator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/client/plugins/y;", "Lio/ktor/client/request/c0;", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: io.ktor.client.plugins.y, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41475y implements io.ktor.client.request.c0 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C41531l0 f399692b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final T0 f399693c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC41588c f399694d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final io.ktor.http.V f399695e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ io.ktor.client.request.d0 f399696f;

    public C41475y(io.ktor.client.request.d0 d0Var) {
        this.f399696f = d0Var;
        this.f399692b = d0Var.f399708b;
        this.f399693c = d0Var.f399707a.b();
        this.f399694d = d0Var.f399712f;
        this.f399695e = d0Var.f399709c.l();
    }

    @Override // io.ktor.http.InterfaceC41523h0
    @Y61.k
    /* renamed from: b */
    public final io.ktor.http.T getF399115f() {
        return this.f399695e;
    }

    @Override // io.ktor.client.request.c0
    @Y61.k
    /* renamed from: d */
    public final io.ktor.http.content.p getF399114e() {
        io.ktor.client.request.d0 d0Var = this.f399696f;
        Object obj = d0Var.f399710d;
        io.ktor.http.content.p pVar = obj instanceof io.ktor.http.content.p ? (io.ktor.http.content.p) obj : null;
        if (pVar != null) {
            return pVar;
        }
        throw new IllegalStateException(("Content was not transformed to OutgoingContent yet. Current body is " + d0Var.f399710d).toString());
    }

    @Override // io.ktor.client.request.c0
    @Y61.k
    /* renamed from: getCall */
    public final io.ktor.client.call.b getF399701b() {
        throw new IllegalStateException("Call is not initialized");
    }

    @Override // io.ktor.client.request.c0, kotlinx.coroutines.T
    @Y61.k
    /* renamed from: getCoroutineContext */
    public final CoroutineContext getF399611e() {
        getF399701b();
        throw null;
    }

    @Override // io.ktor.client.request.c0
    @Y61.k
    /* renamed from: getMethod, reason: from getter */
    public final C41531l0 getF399692b() {
        return this.f399692b;
    }

    @Override // io.ktor.client.request.c0
    @Y61.k
    /* renamed from: getUrl, reason: from getter */
    public final T0 getF399693c() {
        return this.f399693c;
    }

    @Override // io.ktor.client.request.c0
    @Y61.k
    /* renamed from: q, reason: from getter */
    public final InterfaceC41588c getF399694d() {
        return this.f399694d;
    }
}
