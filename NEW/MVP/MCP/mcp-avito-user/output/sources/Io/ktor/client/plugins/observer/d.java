package io.ktor.client.plugins.observer;

import Y61.k;
import io.ktor.http.C41533m0;
import io.ktor.http.C41535n0;
import io.ktor.http.T;
import io.ktor.util.InterfaceC41603j0;
import io.ktor.utils.io.W0;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* compiled from: DelegatedCall.kt */
@InterfaceC41603j0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/client/plugins/observer/d;", "Lio/ktor/client/statement/d;", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class d extends io.ktor.client.statement.d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final a f399608b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final W0 f399609c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final io.ktor.client.statement.d f399610d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final CoroutineContext f399611e;

    public d(@k a aVar, @k W0 w02, @k io.ktor.client.statement.d dVar) {
        this.f399608b = aVar;
        this.f399609c = w02;
        this.f399610d = dVar;
        this.f399611e = dVar.getF399611e();
    }

    @Override // io.ktor.http.InterfaceC41523h0
    @k
    /* renamed from: b */
    public final T getF399282f() {
        return this.f399610d.getF399282f();
    }

    @Override // io.ktor.client.statement.d
    @k
    /* renamed from: c, reason: from getter */
    public final W0 getF399609c() {
        return this.f399609c;
    }

    @Override // io.ktor.client.statement.d
    @k
    /* renamed from: e */
    public final Q31.b getF399280d() {
        return this.f399610d.getF399280d();
    }

    @Override // io.ktor.client.statement.d
    @k
    /* renamed from: f */
    public final Q31.b getF399281e() {
        return this.f399610d.getF399281e();
    }

    @Override // io.ktor.client.statement.d
    @k
    /* renamed from: g */
    public final C41535n0 getF399278b() {
        return this.f399610d.getF399278b();
    }

    @Override // io.ktor.client.statement.d
    @k
    /* renamed from: getCall */
    public final io.ktor.client.call.b getF399772b() {
        return this.f399608b;
    }

    @Override // kotlinx.coroutines.T
    @k
    /* renamed from: getCoroutineContext, reason: from getter */
    public final CoroutineContext getF399611e() {
        return this.f399611e;
    }

    @Override // io.ktor.client.statement.d
    @k
    /* renamed from: h */
    public final C41533m0 getF399279c() {
        return this.f399610d.getF399279c();
    }
}
