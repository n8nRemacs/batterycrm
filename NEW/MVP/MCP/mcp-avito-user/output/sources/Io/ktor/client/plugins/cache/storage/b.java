package io.ktor.client.plugins.cache.storage;

import io.ktor.http.C41533m0;
import io.ktor.http.C41535n0;
import io.ktor.http.T;
import io.ktor.http.T0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: HttpCacheStorage.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/client/plugins/cache/storage/b;", "", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final T0 f399187a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C41535n0 f399188b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Q31.b f399189c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Q31.b f399190d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C41533m0 f399191e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Q31.b f399192f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final T f399193g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Map<String, String> f399194h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final byte[] f399195i;

    public b(@Y61.k T0 t02, @Y61.k C41535n0 c41535n0, @Y61.k Q31.b bVar, @Y61.k Q31.b bVar2, @Y61.k C41533m0 c41533m0, @Y61.k Q31.b bVar3, @Y61.k T t12, @Y61.k Map<String, String> map, @Y61.k byte[] bArr) {
        this.f399187a = t02;
        this.f399188b = c41535n0;
        this.f399189c = bVar;
        this.f399190d = bVar2;
        this.f399191e = c41533m0;
        this.f399192f = bVar3;
        this.f399193g = t12;
        this.f399194h = map;
        this.f399195i = bArr;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f399187a, bVar.f399187a) && L.f(this.f399194h, bVar.f399194h);
    }

    public final int hashCode() {
        return this.f399194h.hashCode() + (this.f399187a.f399910i.hashCode() * 31);
    }
}
