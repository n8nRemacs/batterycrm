package io.ktor.client.call;

import Y61.k;
import io.ktor.client.request.c0;
import io.ktor.http.C41531l0;
import io.ktor.http.T;
import io.ktor.http.T0;
import io.ktor.http.content.p;
import io.ktor.util.InterfaceC41588c;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* compiled from: SavedCall.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/client/call/i;", "Lio/ktor/client/request/c0;", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class i implements c0 {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h f398819b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c0 f398820c;

    public i(@k h hVar, @k c0 c0Var) {
        this.f398819b = hVar;
        this.f398820c = c0Var;
    }

    @Override // io.ktor.http.InterfaceC41523h0
    @k
    /* renamed from: b */
    public final T getF398826g() {
        return this.f398820c.getF398826g();
    }

    @Override // io.ktor.client.request.c0
    @k
    /* renamed from: d */
    public final p getF399704e() {
        return this.f398820c.getF399704e();
    }

    @Override // io.ktor.client.request.c0
    /* renamed from: getCall */
    public final b getF399701b() {
        return this.f398819b;
    }

    @Override // io.ktor.client.request.c0, kotlinx.coroutines.T
    @k
    /* renamed from: getCoroutineContext */
    public final CoroutineContext getF398827h() {
        return this.f398820c.getF398827h();
    }

    @Override // io.ktor.client.request.c0
    @k
    /* renamed from: getMethod */
    public final C41531l0 getF399702c() {
        return this.f398820c.getF399702c();
    }

    @Override // io.ktor.client.request.c0
    @k
    /* renamed from: getUrl */
    public final T0 getF399703d() {
        return this.f398820c.getF399703d();
    }

    @Override // io.ktor.client.request.c0
    @k
    /* renamed from: q */
    public final InterfaceC41588c getF399706g() {
        return this.f398820c.getF399706g();
    }
}
