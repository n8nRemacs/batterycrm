package com.avito.android.carousel_items.domain;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CarouselItemsInteractorImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/carousel_items/domain/g;", "", "_avito_carousel-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ArrayList f115285a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final DeepLink f115286b;

    public g(@k ArrayList arrayList, @l DeepLink deepLink) {
        this.f115285a = arrayList;
        this.f115286b = deepLink;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f115285a.equals(gVar.f115285a) && L.f(this.f115286b, gVar.f115286b);
    }

    public final int hashCode() {
        int iHashCode = this.f115285a.hashCode() * 31;
        DeepLink deepLink = this.f115286b;
        return iHashCode + (deepLink == null ? 0 : deepLink.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CarouselPayload(newItems=");
        sb2.append(this.f115285a);
        sb2.append(", newLink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f115286b, ')');
    }
}
