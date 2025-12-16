package com.avito.android.bxcontent.mvi.entity;

import com.avito.android.hero_banner.widget.HeroBannerWidgetItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BxContentState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/x;", "", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class x {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f112442a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final HeroBannerWidgetItem f112443b;

    public x(boolean z12, @Y61.k HeroBannerWidgetItem heroBannerWidgetItem) {
        this.f112442a = z12;
        this.f112443b = heroBannerWidgetItem;
    }

    public static x a(x xVar, boolean z12) {
        return new x(z12, xVar.f112443b);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f112442a == xVar.f112442a && L.f(this.f112443b, xVar.f112443b);
    }

    public final int hashCode() {
        return this.f112443b.hashCode() + (Boolean.hashCode(this.f112442a) * 31);
    }

    @Y61.k
    public final String toString() {
        return "HeroBannerState(isOpened=" + this.f112442a + ", heroBannerWidgetItem=" + this.f112443b + ')';
    }
}
