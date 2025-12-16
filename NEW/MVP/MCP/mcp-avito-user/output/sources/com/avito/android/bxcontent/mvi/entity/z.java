package com.avito.android.bxcontent.mvi.entity;

import com.avito.android.bxcontent.search_bar_promo_widget.SearchPromoHeaderWidgetItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BxContentState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/z;", "", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class z {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f112446a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final SearchPromoHeaderWidgetItem f112447b;

    public z(boolean z12, @Y61.k SearchPromoHeaderWidgetItem searchPromoHeaderWidgetItem) {
        this.f112446a = z12;
        this.f112447b = searchPromoHeaderWidgetItem;
    }

    public static z a(z zVar, boolean z12) {
        return new z(z12, zVar.f112447b);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f112446a == zVar.f112446a && L.f(this.f112447b, zVar.f112447b);
    }

    public final int hashCode() {
        return this.f112447b.hashCode() + (Boolean.hashCode(this.f112446a) * 31);
    }

    @Y61.k
    public final String toString() {
        return "SearchPromoHeaderState(isOpened=" + this.f112446a + ", searchPromoHeaderWidgetItem=" + this.f112447b + ')';
    }
}
