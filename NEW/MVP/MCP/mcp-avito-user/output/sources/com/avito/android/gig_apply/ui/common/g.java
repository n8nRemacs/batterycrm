package com.avito.android.gig_apply.ui.common;

import androidx.compose.foundation.H;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ListItemsWithShowMoreWidget.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/gig_apply/ui/common/g;", "", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* data */ class g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f159937a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final List<String> f159938b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f159939c;

    public g() {
        this(null, null, false, 7, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return L.f(this.f159937a, gVar.f159937a) && L.f(this.f159938b, gVar.f159938b) && this.f159939c == gVar.f159939c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f159939c) + H.e(this.f159937a.hashCode() * 31, 31, this.f159938b);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ListItemsWithShowMoreWidgetState(title=");
        sb2.append(this.f159937a);
        sb2.append(", items=");
        sb2.append(this.f159938b);
        sb2.append(", isShowMoreEnabled=");
        return androidx.appcompat.app.r.x(sb2, this.f159939c, ')');
    }

    public g(@Y61.k String str, @Y61.k List<String> list, boolean z12) {
        this.f159937a = str;
        this.f159938b = list;
        this.f159939c = z12;
    }

    public g(String str, List list, boolean z12, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "" : str, (i12 & 2) != 0 ? C42784z0.f406748b : list, (i12 & 4) != 0 ? true : z12);
    }
}
