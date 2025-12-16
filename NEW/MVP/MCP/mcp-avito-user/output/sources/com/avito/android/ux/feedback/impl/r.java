package com.avito.android.ux.feedback.impl;

import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CampaignParams.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ux/feedback/impl/r;", "", "_avito_ux-feedback_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class r {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final SK0.f f319170a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f319171b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f319172c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f319173d;

    public r(@Y61.l SK0.f fVar, @Y61.l String str, @Y61.l String str2, @Y61.k String str3) {
        this.f319170a = fVar;
        this.f319171b = str;
        this.f319172c = str2;
        this.f319173d = str3;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return L.f(this.f319170a, rVar.f319170a) && L.f(this.f319171b, rVar.f319171b) && L.f(this.f319172c, rVar.f319172c) && L.f(this.f319173d, rVar.f319173d);
    }

    public final int hashCode() {
        SK0.f fVar = this.f319170a;
        int iHashCode = (fVar == null ? 0 : fVar.f14906a.hashCode()) * 31;
        String str = this.f319171b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f319172c;
        return this.f319173d.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CampaignParams(properties=");
        sb2.append(this.f319170a);
        sb2.append(", userId=");
        sb2.append(this.f319171b);
        sb2.append(", hashUserId=");
        sb2.append(this.f319172c);
        sb2.append(", appVersion=");
        return C22026a.c(sb2, this.f319173d, ')');
    }
}
