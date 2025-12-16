package com.avito.android.bxcontent.search_bar_promo_widget;

import com.avito.android.search_bar.utils.UdfToolbarColors;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SearchPromoHeaderWidgetUpdatedState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/search_bar_promo_widget/h;", "", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class h {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f112879a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final UdfToolbarColors f112880b;

    public h(boolean z12, @Y61.l UdfToolbarColors udfToolbarColors) {
        this.f112879a = z12;
        this.f112880b = udfToolbarColors;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final UdfToolbarColors getF112880b() {
        return this.f112880b;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getF112879a() {
        return this.f112879a;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f112879a == hVar.f112879a && L.f(this.f112880b, hVar.f112880b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f112879a) * 31;
        UdfToolbarColors udfToolbarColors = this.f112880b;
        return iHashCode + (udfToolbarColors == null ? 0 : udfToolbarColors.hashCode());
    }

    @Y61.k
    public final String toString() {
        return "SearchPromoHeaderWidgetUpdatedState(isShow=" + this.f112879a + ", udfToolbarColors=" + this.f112880b + ')';
    }

    public /* synthetic */ h(boolean z12, UdfToolbarColors udfToolbarColors, int i12, C42822w c42822w) {
        this(z12, (i12 & 2) != 0 ? null : udfToolbarColors);
    }
}
