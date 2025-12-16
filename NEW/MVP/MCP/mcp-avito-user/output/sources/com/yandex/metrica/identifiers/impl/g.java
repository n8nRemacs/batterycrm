package com.yandex.metrica.identifiers.impl;

import kotlin.jvm.internal.L;

/* loaded from: classes7.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final l f377725a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final f f377726b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f377727c;

    public g(@Y61.k l lVar, @Y61.l f fVar, @Y61.l String str) {
        this.f377725a = lVar;
        this.f377726b = fVar;
        this.f377727c = str;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return L.f(this.f377725a, gVar.f377725a) && L.f(this.f377726b, gVar.f377726b) && L.f(this.f377727c, gVar.f377727c);
    }

    public final int hashCode() {
        l lVar = this.f377725a;
        int iHashCode = (lVar != null ? lVar.hashCode() : 0) * 31;
        f fVar = this.f377726b;
        int iHashCode2 = (iHashCode + (fVar != null ? fVar.hashCode() : 0)) * 31;
        String str = this.f377727c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdsIdResult(status=");
        sb2.append(this.f377725a);
        sb2.append(", adsIdInfo=");
        sb2.append(this.f377726b);
        sb2.append(", errorExplanation=");
        return AK.c.s(sb2, this.f377727c, ")");
    }

    public /* synthetic */ g(l lVar, f fVar, String str, int i12) {
        this(lVar, (i12 & 2) != 0 ? null : fVar, (i12 & 4) != 0 ? null : str);
    }
}
