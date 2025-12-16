package io.ktor.client.call;

import Y61.k;
import io.ktor.http.C41533m0;
import io.ktor.http.C41535n0;
import io.ktor.http.T;
import io.ktor.utils.io.C41619a;
import io.ktor.utils.io.W0;
import io.ktor.utils.io.Y;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.P0;
import kotlinx.coroutines.Q0;

/* compiled from: SavedCall.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/client/call/j;", "Lio/ktor/client/statement/d;", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class j extends io.ktor.client.statement.d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h f398821b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C41535n0 f398822c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final C41533m0 f398823d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Q31.b f398824e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Q31.b f398825f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final T f398826g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final CoroutineContext f398827h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final C41619a f398828i;

    public j(@k h hVar, @k byte[] bArr, @k io.ktor.client.statement.d dVar) {
        this.f398821b = hVar;
        P0 p0A = Q0.a();
        this.f398822c = dVar.getF398822c();
        this.f398823d = dVar.getF398823d();
        this.f398824e = dVar.getF398824e();
        this.f398825f = dVar.getF398825f();
        this.f398826g = dVar.getF399115f();
        this.f398827h = dVar.getF401596i().plus(p0A);
        this.f398828i = Y.a(bArr);
    }

    @Override // io.ktor.http.InterfaceC41523h0
    @k
    /* renamed from: b, reason: from getter */
    public final T getF399115f() {
        return this.f398826g;
    }

    @Override // io.ktor.client.statement.d
    @k
    /* renamed from: c */
    public final W0 getF399609c() {
        return this.f398828i;
    }

    @Override // io.ktor.client.statement.d
    @k
    /* renamed from: e, reason: from getter */
    public final Q31.b getF398824e() {
        return this.f398824e;
    }

    @Override // io.ktor.client.statement.d
    @k
    /* renamed from: f, reason: from getter */
    public final Q31.b getF398825f() {
        return this.f398825f;
    }

    @Override // io.ktor.client.statement.d
    @k
    /* renamed from: g, reason: from getter */
    public final C41535n0 getF398822c() {
        return this.f398822c;
    }

    @Override // io.ktor.client.statement.d
    /* renamed from: getCall */
    public final b getF399772b() {
        return this.f398821b;
    }

    @Override // kotlinx.coroutines.T
    @k
    /* renamed from: getCoroutineContext, reason: from getter */
    public final CoroutineContext getF401596i() {
        return this.f398827h;
    }

    @Override // io.ktor.client.statement.d
    @k
    /* renamed from: h, reason: from getter */
    public final C41533m0 getF398823d() {
        return this.f398823d;
    }
}
