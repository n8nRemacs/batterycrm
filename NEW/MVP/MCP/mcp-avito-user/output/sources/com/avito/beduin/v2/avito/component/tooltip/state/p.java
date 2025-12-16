package com.avito.beduin.v2.avito.component.tooltip.state;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvitoTooltipState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/tooltip/state/p;", "Lcom/avito/beduin/v2/avito/component/tooltip/state/q;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class p implements q {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final String f335455a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f335456b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f335457c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f335458d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f335459e;

    public p(@Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l Y41.a<G0> aVar, boolean z12) {
        this.f335455a = str;
        this.f335456b = str2;
        this.f335457c = str3;
        this.f335458d = aVar;
        this.f335459e = z12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return L.f(this.f335455a, pVar.f335455a) && L.f(this.f335456b, pVar.f335456b) && L.f(this.f335457c, pVar.f335457c) && L.f(this.f335458d, pVar.f335458d) && this.f335459e == pVar.f335459e;
    }

    public final int hashCode() {
        String str = this.f335455a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f335456b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f335457c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Y41.a<G0> aVar = this.f335458d;
        return Boolean.hashCode(this.f335459e) + ((iHashCode3 + (aVar != null ? aVar.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Common(title=");
        sb2.append(this.f335455a);
        sb2.append(", text=");
        sb2.append(this.f335456b);
        sb2.append(", buttonText=");
        sb2.append(this.f335457c);
        sb2.append(", onButtonClick=");
        sb2.append(this.f335458d);
        sb2.append(", closeButtonVisible=");
        return androidx.appcompat.app.r.x(sb2, this.f335459e, ')');
    }
}
