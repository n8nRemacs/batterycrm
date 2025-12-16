package com.avito.android.user_stats.extended_user_stats.metrics;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: MetricsBottomSheetDialog.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/metrics/f;", "", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.lib.design.bottom_sheet.k f317285a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f317286b;

    public f(@k com.avito.android.lib.design.bottom_sheet.k kVar, @l String str) {
        this.f317285a = kVar;
        this.f317286b = str;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return L.f(this.f317285a, fVar.f317285a) && L.f(this.f317286b, fVar.f317286b);
    }

    public final int hashCode() {
        int iHashCode = this.f317285a.hashCode() * 31;
        String str = this.f317286b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectedMetricBottomSheet(item=");
        sb2.append(this.f317285a);
        sb2.append(", type=");
        return C22026a.c(sb2, this.f317286b, ')');
    }

    public /* synthetic */ f(com.avito.android.lib.design.bottom_sheet.k kVar, String str, int i12, C42822w c42822w) {
        this(kVar, (i12 & 2) != 0 ? null : str);
    }
}
