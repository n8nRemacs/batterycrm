package com.avito.android.hero_banner.widget;

import com.avito.android.search_bar.utils.UdfToolbarColors;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: HeroBannerWidgetUpdatedState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hero_banner/widget/k;", "", "_avito_bx-content_widget_hero-banner_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class k {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f161916a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final UdfToolbarColors f161917b;

    public k(boolean z12, @Y61.l UdfToolbarColors udfToolbarColors) {
        this.f161916a = z12;
        this.f161917b = udfToolbarColors;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final UdfToolbarColors getF161917b() {
        return this.f161917b;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getF161916a() {
        return this.f161916a;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f161916a == kVar.f161916a && L.f(this.f161917b, kVar.f161917b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f161916a) * 31;
        UdfToolbarColors udfToolbarColors = this.f161917b;
        return iHashCode + (udfToolbarColors == null ? 0 : udfToolbarColors.hashCode());
    }

    @Y61.k
    public final String toString() {
        return "HeroBannerWidgetUpdatedState(isShow=" + this.f161916a + ", udfToolbarColors=" + this.f161917b + ')';
    }

    public /* synthetic */ k(boolean z12, UdfToolbarColors udfToolbarColors, int i12, C42822w c42822w) {
        this(z12, (i12 & 2) != 0 ? null : udfToolbarColors);
    }
}
