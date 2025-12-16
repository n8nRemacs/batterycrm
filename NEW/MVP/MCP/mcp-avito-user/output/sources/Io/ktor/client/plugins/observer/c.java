package io.ktor.client.plugins.observer;

import Y61.k;
import io.ktor.client.request.c0;
import io.ktor.http.C41531l0;
import io.ktor.http.T;
import io.ktor.http.T0;
import io.ktor.http.content.p;
import io.ktor.util.InterfaceC41588c;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* compiled from: DelegatedCall.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/client/plugins/observer/c;", "Lio/ktor/client/request/c0;", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class c implements c0 {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final a f399606b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c0 f399607c;

    public c(@k a aVar, @k c0 c0Var) {
        this.f399606b = aVar;
        this.f399607c = c0Var;
    }

    @Override // io.ktor.http.InterfaceC41523h0
    @k
    /* renamed from: b */
    public final T getF399282f() {
        return this.f399607c.getF399282f();
    }

    @Override // io.ktor.client.request.c0
    @k
    /* renamed from: d */
    public final p getF399704e() {
        return this.f399607c.getF399704e();
    }

    @Override // io.ktor.client.request.c0
    @k
    /* renamed from: getCall */
    public final io.ktor.client.call.b getF399701b() {
        return this.f399606b;
    }

    @Override // io.ktor.client.request.c0, kotlinx.coroutines.T
    @k
    /* renamed from: getCoroutineContext */
    public final CoroutineContext getF401642c() {
        return this.f399607c.getF401642c();
    }

    @Override // io.ktor.client.request.c0
    @k
    /* renamed from: getMethod */
    public final C41531l0 getF399702c() {
        return this.f399607c.getF399702c();
    }

    @Override // io.ktor.client.request.c0
    @k
    /* renamed from: getUrl */
    public final T0 getF399703d() {
        return this.f399607c.getF399703d();
    }

    @Override // io.ktor.client.request.c0
    @k
    /* renamed from: q */
    public final InterfaceC41588c getF399706g() {
        return this.f399607c.getF399706g();
    }
}
