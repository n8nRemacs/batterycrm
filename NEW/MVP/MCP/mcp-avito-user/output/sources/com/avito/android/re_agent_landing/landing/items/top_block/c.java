package com.avito.android.re_agent_landing.landing.items.top_block;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TopBlockItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/re_agent_landing/landing/items/top_block/c;", "Lcom/avito/conveyor_item/a;", "_avito_re-agent-landing_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f250794b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f250795c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f250796d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f250797e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f250798f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f250799g;

    public c(String str, String str2, String str3, String str4, String str5, String str6, int i12, C42822w c42822w) {
        this.f250794b = (i12 & 1) != 0 ? "top_block_item" : str;
        this.f250795c = str2;
        this.f250796d = str3;
        this.f250797e = str4;
        this.f250798f = str5;
        this.f250799g = str6;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f250794b, cVar.f250794b) && L.f(this.f250795c, cVar.f250795c) && L.f(this.f250796d, cVar.f250796d) && L.f(this.f250797e, cVar.f250797e) && L.f(this.f250798f, cVar.f250798f) && L.f(this.f250799g, cVar.f250799g);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF79005b() {
        return getF244870b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF244870b() {
        return this.f250794b;
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(H.d(this.f250794b.hashCode() * 31, 31, this.f250795c), 31, this.f250796d), 31, this.f250797e);
        String str = this.f250798f;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f250799g;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TopBlockItem(stringId=");
        sb2.append(this.f250794b);
        sb2.append(", title=");
        sb2.append(this.f250795c);
        sb2.append(", description=");
        sb2.append(this.f250796d);
        sb2.append(", animationUri=");
        sb2.append(this.f250797e);
        sb2.append(", animationUriDark=");
        sb2.append(this.f250798f);
        sb2.append(", buttonTitle=");
        return C22026a.c(sb2, this.f250799g, ')');
    }
}
