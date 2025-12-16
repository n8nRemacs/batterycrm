package com.avito.android.reputation.ui.items.reputation_radial_progress_bar;

import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ReputationRadialProgressBarState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/reputation/ui/items/reputation_radial_progress_bar/n;", "", "_avito_reputation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final Integer f255034a;

    /* renamed from: b, reason: collision with root package name */
    public final int f255035b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Integer f255036c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final com.avito.beduin.v2.theme.r f255037d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final com.avito.beduin.v2.theme.r f255038e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final com.avito.beduin.v2.theme.r f255039f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final com.avito.beduin.v2.theme.r f255040g;

    /* renamed from: h, reason: collision with root package name */
    public final int f255041h;

    public n(@Y61.l Integer num, int i12, @Y61.l Integer num2, @Y61.l com.avito.beduin.v2.theme.r rVar, @Y61.l com.avito.beduin.v2.theme.r rVar2, @Y61.l com.avito.beduin.v2.theme.r rVar3, @Y61.l com.avito.beduin.v2.theme.r rVar4, int i13) {
        this.f255034a = num;
        this.f255035b = i12;
        this.f255036c = num2;
        this.f255037d = rVar;
        this.f255038e = rVar2;
        this.f255039f = rVar3;
        this.f255040g = rVar4;
        this.f255041h = i13;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return L.f(this.f255034a, nVar.f255034a) && this.f255035b == nVar.f255035b && L.f(this.f255036c, nVar.f255036c) && L.f(this.f255037d, nVar.f255037d) && L.f(this.f255038e, nVar.f255038e) && L.f(this.f255039f, nVar.f255039f) && L.f(this.f255040g, nVar.f255040g) && this.f255041h == nVar.f255041h;
    }

    public final int hashCode() {
        Integer num = this.f255034a;
        int iE2 = androidx.appcompat.app.r.e(this.f255035b, (num == null ? 0 : num.hashCode()) * 31, 31);
        Integer num2 = this.f255036c;
        int iHashCode = (iE2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        com.avito.beduin.v2.theme.r rVar = this.f255037d;
        int iHashCode2 = (iHashCode + (rVar == null ? 0 : rVar.hashCode())) * 31;
        com.avito.beduin.v2.theme.r rVar2 = this.f255038e;
        int iHashCode3 = (iHashCode2 + (rVar2 == null ? 0 : rVar2.hashCode())) * 31;
        com.avito.beduin.v2.theme.r rVar3 = this.f255039f;
        int iHashCode4 = (iHashCode3 + (rVar3 == null ? 0 : rVar3.hashCode())) * 31;
        com.avito.beduin.v2.theme.r rVar4 = this.f255040g;
        return Integer.hashCode(this.f255041h) + ((iHashCode4 + (rVar4 != null ? rVar4.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ReputationRadialProgressBarState(threshold=");
        sb2.append(this.f255034a);
        sb2.append(", score=");
        sb2.append(this.f255035b);
        sb2.append(", progressBarWidth=");
        sb2.append(this.f255036c);
        sb2.append(", leftColor=");
        sb2.append(this.f255037d);
        sb2.append(", rightColor=");
        sb2.append(this.f255038e);
        sb2.append(", backgroundLeftColor=");
        sb2.append(this.f255039f);
        sb2.append(", backgroundRightColor=");
        sb2.append(this.f255040g);
        sb2.append(", thresholdHeight=");
        return androidx.appcompat.app.r.t(sb2, this.f255041h, ')');
    }
}
