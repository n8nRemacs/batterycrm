package com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.skeleton;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SkeletonItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/skeleton/a;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/a;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class a implements com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f221143b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f221144c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f221145d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f221146e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f221147f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f221148g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f221149h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f221150i;

    public a(@k String str, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18) {
        this.f221143b = str;
        this.f221144c = z12;
        this.f221145d = z13;
        this.f221146e = z14;
        this.f221147f = z15;
        this.f221148g = z16;
        this.f221149h = z17;
        this.f221150i = z18;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f221143b, aVar.f221143b) && this.f221144c == aVar.f221144c && this.f221145d == aVar.f221145d && this.f221146e == aVar.f221146e && this.f221147f == aVar.f221147f && this.f221148g == aVar.f221148g && this.f221149h == aVar.f221149h && this.f221150i == aVar.f221150i;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF124042b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF217914b() {
        return this.f221143b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f221150i) + r.i(r.i(r.i(r.i(r.i(r.i(this.f221143b.hashCode() * 31, 31, this.f221144c), 31, this.f221145d), 31, this.f221146e), 31, this.f221147f), 31, this.f221148g), 31, this.f221149h);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SkeletonItem(stringId=");
        sb2.append(this.f221143b);
        sb2.append(", showPeriodLoading=");
        sb2.append(this.f221144c);
        sb2.append(", showPositionLoading=");
        sb2.append(this.f221145d);
        sb2.append(", showQueryHeaderLoading=");
        sb2.append(this.f221146e);
        sb2.append(", showSortingControlLoading=");
        sb2.append(this.f221147f);
        sb2.append(", showQueryLoading=");
        sb2.append(this.f221148g);
        sb2.append(", showCompetitorLoading=");
        sb2.append(this.f221149h);
        sb2.append(", showChartLoading=");
        return r.x(sb2, this.f221150i, ')');
    }

    public /* synthetic */ a(String str, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? false : z12, (i12 & 4) != 0 ? false : z13, (i12 & 8) != 0 ? false : z14, (i12 & 16) != 0 ? false : z15, (i12 & 32) != 0 ? false : z16, (i12 & 64) != 0 ? false : z17, (i12 & 128) == 0 ? z18 : false);
    }
}
