package com.avito.beduin.v2.avito.component.common;

import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.beduin.v2.theme.r;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BorderPatch.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/common/b;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.f<Float> f334118a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.f<r.b> f334119b;

    public b(@Y61.k com.avito.beduin.v2.theme.f<Float> fVar, @Y61.k com.avito.beduin.v2.theme.f<r.b> fVar2) {
        this.f334118a = fVar;
        this.f334119b = fVar2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f334118a, bVar.f334118a) && L.f(this.f334119b, bVar.f334119b);
    }

    public final int hashCode() {
        return this.f334119b.hashCode() + (this.f334118a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BorderPatch(width=");
        sb2.append(this.f334118a);
        sb2.append(", color=");
        return C31685o.o(sb2, this.f334119b, ')');
    }
}
