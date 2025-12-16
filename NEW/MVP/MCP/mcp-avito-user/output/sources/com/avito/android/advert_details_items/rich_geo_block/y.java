package com.avito.android.advert_details_items.rich_geo_block;

import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsRichGeoBlockView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_details_items/rich_geo_block/y;", "", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final /* data */ class y {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f85499a;

    /* renamed from: b, reason: collision with root package name */
    public final int f85500b;

    /* renamed from: c, reason: collision with root package name */
    public final int f85501c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f85502d;

    public y(@Y61.k String str, int i12, int i13, @Y61.k String str2) {
        this.f85499a = str;
        this.f85500b = i12;
        this.f85501c = i13;
        this.f85502d = str2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return L.f(this.f85499a, yVar.f85499a) && this.f85500b == yVar.f85500b && this.f85501c == yVar.f85501c && L.f(this.f85502d, yVar.f85502d);
    }

    public final int hashCode() {
        return this.f85502d.hashCode() + androidx.appcompat.app.r.e(this.f85501c, androidx.appcompat.app.r.e(this.f85500b, this.f85499a.hashCode() * 31, 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ClickableRange(annotation=");
        sb2.append(this.f85499a);
        sb2.append(", start=");
        sb2.append(this.f85500b);
        sb2.append(", end=");
        sb2.append(this.f85501c);
        sb2.append(", tag=");
        return C22026a.c(sb2, this.f85502d, ')');
    }

    public /* synthetic */ y(String str, int i12, int i13, String str2, int i14, C42822w c42822w) {
        this(str, i12, i13, (i14 & 8) != 0 ? "default_clickable_tag" : str2);
    }
}
