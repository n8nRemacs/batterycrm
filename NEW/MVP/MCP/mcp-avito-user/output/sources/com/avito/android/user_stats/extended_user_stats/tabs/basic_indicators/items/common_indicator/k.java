package com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.items.common_indicator;

import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CommonIndicatorItemData.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/basic_indicators/items/common_indicator/k;", "", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f317457a;

    /* renamed from: b, reason: collision with root package name */
    public final double f317458b;

    public k(@Y61.k String str, double d12) {
        this.f317457a = str;
        this.f317458b = d12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return L.f(this.f317457a, kVar.f317457a) && Double.compare(this.f317458b, kVar.f317458b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f317458b) + (this.f317457a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Contact(title=");
        sb2.append(this.f317457a);
        sb2.append(", value=");
        return androidx.compose.ui.graphics.colorspace.e.o(sb2, this.f317458b, ')');
    }
}
