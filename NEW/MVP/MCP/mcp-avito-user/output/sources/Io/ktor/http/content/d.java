package io.ktor.http.content;

import io.ktor.http.CacheControl;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CachingOptions.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/http/content/d;", "", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final CacheControl f399962a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Q31.b f399963b;

    public d() {
        this(null, null, 3, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f399962a, dVar.f399962a) && L.f(this.f399963b, dVar.f399963b);
    }

    public final int hashCode() {
        CacheControl cacheControl = this.f399962a;
        int iHashCode = (cacheControl == null ? 0 : cacheControl.hashCode()) * 31;
        Q31.b bVar = this.f399963b;
        return iHashCode + (bVar != null ? bVar.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "CachingOptions(cacheControl=" + this.f399962a + ", expires=" + this.f399963b + ')';
    }

    public d(CacheControl cacheControl, Q31.b bVar, int i12, C42822w c42822w) {
        cacheControl = (i12 & 1) != 0 ? null : cacheControl;
        bVar = (i12 & 2) != 0 ? null : bVar;
        this.f399962a = cacheControl;
        this.f399963b = bVar;
    }
}
