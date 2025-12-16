package io.ktor.client.statement;

import io.ktor.client.request.k0;
import io.ktor.http.C41533m0;
import io.ktor.http.C41535n0;
import io.ktor.http.T;
import io.ktor.util.InterfaceC41603j0;
import io.ktor.utils.io.W0;
import io.ktor.utils.io.X;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* compiled from: DefaultHttpResponse.kt */
@InterfaceC41603j0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/client/statement/b;", "Lio/ktor/client/statement/d;", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class b extends d {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final io.ktor.client.call.b f399772b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final CoroutineContext f399773c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C41535n0 f399774d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C41533m0 f399775e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Q31.b f399776f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Q31.b f399777g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final W0 f399778h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final T f399779i;

    public b(@Y61.k io.ktor.client.call.b bVar, @Y61.k k0 k0Var) {
        this.f399772b = bVar;
        this.f399773c = k0Var.f399762f;
        this.f399774d = k0Var.f399757a;
        this.f399775e = k0Var.f399760d;
        this.f399776f = k0Var.f399758b;
        this.f399777g = k0Var.f399763g;
        Object obj = k0Var.f399761e;
        X value = obj instanceof W0 ? (W0) obj : null;
        if (value == null) {
            W0.f400795a.getClass();
            value = W0.a.f400797b.getValue();
        }
        this.f399778h = value;
        this.f399779i = k0Var.f399759c;
    }

    @Override // io.ktor.http.InterfaceC41523h0
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final T getF399282f() {
        return this.f399779i;
    }

    @Override // io.ktor.client.statement.d
    @Y61.k
    /* renamed from: c, reason: from getter */
    public final W0 getF399609c() {
        return this.f399778h;
    }

    @Override // io.ktor.client.statement.d
    @Y61.k
    /* renamed from: e, reason: from getter */
    public final Q31.b getF399280d() {
        return this.f399776f;
    }

    @Override // io.ktor.client.statement.d
    @Y61.k
    /* renamed from: f, reason: from getter */
    public final Q31.b getF399281e() {
        return this.f399777g;
    }

    @Override // io.ktor.client.statement.d
    @Y61.k
    /* renamed from: g, reason: from getter */
    public final C41535n0 getF399278b() {
        return this.f399774d;
    }

    @Override // io.ktor.client.statement.d
    @Y61.k
    /* renamed from: getCall, reason: from getter */
    public final io.ktor.client.call.b getF399772b() {
        return this.f399772b;
    }

    @Override // kotlinx.coroutines.T
    @Y61.k
    /* renamed from: getCoroutineContext, reason: from getter */
    public final CoroutineContext getF399611e() {
        return this.f399773c;
    }

    @Override // io.ktor.client.statement.d
    @Y61.k
    /* renamed from: h, reason: from getter */
    public final C41533m0 getF399279c() {
        return this.f399775e;
    }
}
