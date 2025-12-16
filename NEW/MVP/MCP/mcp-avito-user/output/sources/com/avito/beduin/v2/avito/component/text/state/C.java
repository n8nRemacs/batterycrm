package com.avito.beduin.v2.avito.component.text.state;

import com.avito.android.messenger.blacklist.mvi.C31685o;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvitoTextState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/text/state/C;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class C {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f335313a;

    /* renamed from: b, reason: collision with root package name */
    public final int f335314b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f335315c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.l<j> f335316d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final com.avito.beduin.v2.theme.r f335317e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f335318f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f335319g;

    public C(@Y61.k String str, int i12, boolean z12, @Y61.k com.avito.beduin.v2.theme.l<j> lVar, @Y61.l com.avito.beduin.v2.theme.r rVar, @Y61.l String str2, @Y61.l Y41.a<G0> aVar) {
        this.f335313a = str;
        this.f335314b = i12;
        this.f335315c = z12;
        this.f335316d = lVar;
        this.f335317e = rVar;
        this.f335318f = str2;
        this.f335319g = aVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c12 = (C) obj;
        return L.f(this.f335313a, c12.f335313a) && this.f335314b == c12.f335314b && this.f335315c == c12.f335315c && L.f(this.f335316d, c12.f335316d) && L.f(this.f335317e, c12.f335317e) && L.f(this.f335318f, c12.f335318f) && L.f(this.f335319g, c12.f335319g);
    }

    public final int hashCode() {
        int iG2 = C31685o.g(this.f335316d, androidx.appcompat.app.r.i(androidx.appcompat.app.r.e(this.f335314b, this.f335313a.hashCode() * 31, 31), 31, this.f335315c), 31);
        com.avito.beduin.v2.theme.r rVar = this.f335317e;
        int iHashCode = (iG2 + (rVar == null ? 0 : rVar.hashCode())) * 31;
        String str = this.f335318f;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Y41.a<G0> aVar = this.f335319g;
        return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ExpandableText(expandText=");
        sb2.append(this.f335313a);
        sb2.append(", compactNumberOfLines=");
        sb2.append(this.f335314b);
        sb2.append(", shouldUseNewLine=");
        sb2.append(this.f335315c);
        sb2.append(", expandTextStyle=");
        sb2.append(this.f335316d);
        sb2.append(", expandTextColor=");
        sb2.append(this.f335317e);
        sb2.append(", expandIcon=");
        sb2.append(this.f335318f);
        sb2.append(", onExpand=");
        return androidx.appcompat.app.r.v(sb2, this.f335319g, ')');
    }
}
