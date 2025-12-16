package com.avito.android.vas_performance.ui.competitive;

import androidx.compose.runtime.internal.P;
import com.avito.android.mnz_common.data.MnzFloatingFooter;
import com.avito.android.util.P2;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CompetitiveVasViewState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/ui/competitive/t;", "", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class t {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final P2<CL0.c> f321525a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final List<com.avito.conveyor_item.a> f321526b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f321527c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final MnzFloatingFooter f321528d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f321529e;

    public t() {
        this(null, null, null, null, false, 31, null);
    }

    public static t a(t tVar, P2 p22, C42784z0 c42784z0) {
        return new t(p22, c42784z0, tVar.f321527c, tVar.f321528d, tVar.f321529e);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return L.f(this.f321525a, tVar.f321525a) && L.f(this.f321526b, tVar.f321526b) && L.f(this.f321527c, tVar.f321527c) && L.f(this.f321528d, tVar.f321528d) && this.f321529e == tVar.f321529e;
    }

    public final int hashCode() {
        int iHashCode = this.f321525a.hashCode() * 31;
        List<com.avito.conveyor_item.a> list = this.f321526b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f321527c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        MnzFloatingFooter mnzFloatingFooter = this.f321528d;
        return Boolean.hashCode(this.f321529e) + ((iHashCode3 + (mnzFloatingFooter != null ? mnzFloatingFooter.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CompetitiveVasViewState(loadingState=");
        sb2.append(this.f321525a);
        sb2.append(", items=");
        sb2.append(this.f321526b);
        sb2.append(", buttonTitle=");
        sb2.append(this.f321527c);
        sb2.append(", floatingFooter=");
        sb2.append(this.f321528d);
        sb2.append(", showFloatingFooter=");
        return androidx.appcompat.app.r.x(sb2, this.f321529e, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t(@Y61.k P2<? super CL0.c> p22, @Y61.l List<? extends com.avito.conveyor_item.a> list, @Y61.l String str, @Y61.l MnzFloatingFooter mnzFloatingFooter, boolean z12) {
        this.f321525a = p22;
        this.f321526b = list;
        this.f321527c = str;
        this.f321528d = mnzFloatingFooter;
        this.f321529e = z12;
    }

    public /* synthetic */ t(P2 p22, List list, String str, MnzFloatingFooter mnzFloatingFooter, boolean z12, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? P2.c.f318721a : p22, (i12 & 2) != 0 ? null : list, (i12 & 4) != 0 ? null : str, (i12 & 8) == 0 ? mnzFloatingFooter : null, (i12 & 16) != 0 ? false : z12);
    }
}
