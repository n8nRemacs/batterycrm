package io.ktor.client.plugins.cache;

import io.ktor.client.request.c0;
import io.ktor.http.T;
import io.ktor.http.U;
import io.ktor.http.V;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: HttpCacheEntry.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/client/plugins/cache/m;", "", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Q31.b f399167a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Map<String, String> f399168b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final io.ktor.client.statement.d f399169c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final byte[] f399170d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final V f399171e;

    public m(@Y61.k Q31.b bVar, @Y61.k Map<String, String> map, @Y61.k io.ktor.client.statement.d dVar, @Y61.k byte[] bArr) {
        this.f399167a = bVar;
        this.f399168b = map;
        this.f399169c = dVar;
        this.f399170d = bArr;
        T.a aVar = T.f399899a;
        U u12 = new U(0, 1, null);
        u12.e(dVar.getF399779i());
        this.f399171e = u12.l();
    }

    @Y61.k
    public final io.ktor.client.statement.d a() {
        io.ktor.client.statement.d dVar = this.f399169c;
        io.ktor.client.a aVar = dVar.getF399772b().f398804b;
        c0 c0Var = dVar.getF399772b().f398805c;
        if (c0Var == null) {
            c0Var = null;
        }
        io.ktor.client.statement.d dVar2 = new io.ktor.client.call.h(aVar, c0Var, dVar, this.f399170d).f398806d;
        if (dVar2 != null) {
            return dVar2;
        }
        return null;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (obj == null || !(obj instanceof m)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        return L.f(this.f399168b, ((m) obj).f399168b);
    }

    public final int hashCode() {
        return this.f399168b.hashCode();
    }
}
