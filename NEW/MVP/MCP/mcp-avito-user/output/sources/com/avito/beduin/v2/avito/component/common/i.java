package com.avito.beduin.v2.avito.component.common;

import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.beduin.v2.theme.r;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ShadowPatch.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/common/i;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.f<Float> f334133a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.f<Float> f334134b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.f<Float> f334135c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.f<r.b> f334136d;

    public i(@Y61.k com.avito.beduin.v2.theme.f<Float> fVar, @Y61.k com.avito.beduin.v2.theme.f<Float> fVar2, @Y61.k com.avito.beduin.v2.theme.f<Float> fVar3, @Y61.k com.avito.beduin.v2.theme.f<r.b> fVar4) {
        this.f334133a = fVar;
        this.f334134b = fVar2;
        this.f334135c = fVar3;
        this.f334136d = fVar4;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return L.f(this.f334133a, iVar.f334133a) && L.f(this.f334134b, iVar.f334134b) && L.f(this.f334135c, iVar.f334135c) && L.f(this.f334136d, iVar.f334136d);
    }

    public final int hashCode() {
        return this.f334136d.hashCode() + C31685o.f(this.f334135c, C31685o.f(this.f334134b, this.f334133a.hashCode() * 31, 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShadowPatch(dx=");
        sb2.append(this.f334133a);
        sb2.append(", dy=");
        sb2.append(this.f334134b);
        sb2.append(", radius=");
        sb2.append(this.f334135c);
        sb2.append(", color=");
        return C31685o.o(sb2, this.f334136d, ')');
    }
}
