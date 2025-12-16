package com.avito.android.reputation.ui.items.reputation_progress_bar;

import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ReputationProgressBarState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/reputation/ui/items/reputation_progress_bar/t;", "", "_avito_reputation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class t {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final Integer f254976a;

    /* renamed from: b, reason: collision with root package name */
    public final int f254977b;

    /* renamed from: c, reason: collision with root package name */
    public final float f254978c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final com.avito.beduin.v2.theme.r f254979d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final com.avito.beduin.v2.theme.r f254980e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final com.avito.beduin.v2.theme.r f254981f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Integer f254982g;

    /* renamed from: h, reason: collision with root package name */
    public final int f254983h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final com.avito.beduin.v2.theme.r f254984i;

    /* renamed from: j, reason: collision with root package name */
    public final int f254985j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final com.avito.beduin.v2.theme.r f254986k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final com.avito.beduin.v2.theme.r f254987l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f254988m;

    public t(@Y61.l Integer num, int i12, float f12, @Y61.l com.avito.beduin.v2.theme.r rVar, @Y61.l com.avito.beduin.v2.theme.r rVar2, @Y61.l com.avito.beduin.v2.theme.r rVar3, @Y61.l Integer num2, int i13, @Y61.l com.avito.beduin.v2.theme.r rVar4, int i14, @Y61.l com.avito.beduin.v2.theme.r rVar5, @Y61.l com.avito.beduin.v2.theme.r rVar6, boolean z12) {
        this.f254976a = num;
        this.f254977b = i12;
        this.f254978c = f12;
        this.f254979d = rVar;
        this.f254980e = rVar2;
        this.f254981f = rVar3;
        this.f254982g = num2;
        this.f254983h = i13;
        this.f254984i = rVar4;
        this.f254985j = i14;
        this.f254986k = rVar5;
        this.f254987l = rVar6;
        this.f254988m = z12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return L.f(this.f254976a, tVar.f254976a) && this.f254977b == tVar.f254977b && Float.compare(this.f254978c, tVar.f254978c) == 0 && L.f(this.f254979d, tVar.f254979d) && L.f(this.f254980e, tVar.f254980e) && L.f(this.f254981f, tVar.f254981f) && L.f(this.f254982g, tVar.f254982g) && this.f254983h == tVar.f254983h && L.f(this.f254984i, tVar.f254984i) && this.f254985j == tVar.f254985j && L.f(this.f254986k, tVar.f254986k) && L.f(this.f254987l, tVar.f254987l) && this.f254988m == tVar.f254988m;
    }

    public final int hashCode() {
        Integer num = this.f254976a;
        int iD2 = androidx.appcompat.app.r.d(this.f254978c, androidx.appcompat.app.r.e(this.f254977b, (num == null ? 0 : num.hashCode()) * 31, 31), 31);
        com.avito.beduin.v2.theme.r rVar = this.f254979d;
        int iHashCode = (iD2 + (rVar == null ? 0 : rVar.hashCode())) * 31;
        com.avito.beduin.v2.theme.r rVar2 = this.f254980e;
        int iHashCode2 = (iHashCode + (rVar2 == null ? 0 : rVar2.hashCode())) * 31;
        com.avito.beduin.v2.theme.r rVar3 = this.f254981f;
        int iHashCode3 = (iHashCode2 + (rVar3 == null ? 0 : rVar3.hashCode())) * 31;
        Integer num2 = this.f254982g;
        int iE2 = androidx.appcompat.app.r.e(this.f254983h, (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31, 31);
        com.avito.beduin.v2.theme.r rVar4 = this.f254984i;
        int iE3 = androidx.appcompat.app.r.e(this.f254985j, (iE2 + (rVar4 == null ? 0 : rVar4.hashCode())) * 31, 31);
        com.avito.beduin.v2.theme.r rVar5 = this.f254986k;
        int iHashCode4 = (iE3 + (rVar5 == null ? 0 : rVar5.hashCode())) * 31;
        com.avito.beduin.v2.theme.r rVar6 = this.f254987l;
        return Boolean.hashCode(this.f254988m) + ((iHashCode4 + (rVar6 != null ? rVar6.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ReputationProgressBarState(threshold=");
        sb2.append(this.f254976a);
        sb2.append(", score=");
        sb2.append(this.f254977b);
        sb2.append(", trackHeight=");
        sb2.append(this.f254978c);
        sb2.append(", leftColor=");
        sb2.append(this.f254979d);
        sb2.append(", rightColor=");
        sb2.append(this.f254980e);
        sb2.append(", backgroundColor=");
        sb2.append(this.f254981f);
        sb2.append(", futureScore=");
        sb2.append(this.f254982g);
        sb2.append(", futureScoreCircleRadius=");
        sb2.append(this.f254983h);
        sb2.append(", futureScoreCircleColor=");
        sb2.append(this.f254984i);
        sb2.append(", deltaStripWidth=");
        sb2.append(this.f254985j);
        sb2.append(", deltaColor=");
        sb2.append(this.f254986k);
        sb2.append(", deltaBackgroundColor=");
        sb2.append(this.f254987l);
        sb2.append(", isScaleVisible=");
        return androidx.appcompat.app.r.x(sb2, this.f254988m, ')');
    }
}
