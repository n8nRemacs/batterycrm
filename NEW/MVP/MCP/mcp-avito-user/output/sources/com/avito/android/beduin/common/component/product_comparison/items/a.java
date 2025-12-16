package com.avito.android.beduin.common.component.product_comparison.items;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.beduin.common.component.image.ImageStyle;
import com.avito.android.beduin.common.component.product_comparison.BeduinProductComparisonTextItemParams;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinProductComparisonItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/product_comparison/items/a;", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Image f102145a;

    /* renamed from: b, reason: collision with root package name */
    public final float f102146b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final ImageStyle f102147c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f102148d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final BeduinProductComparisonTextItemParams f102149e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f102150f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final BeduinProductComparisonTextItemParams f102151g;

    /* renamed from: h, reason: collision with root package name */
    public final int f102152h;

    public a(@k Image image, float f12, @l ImageStyle imageStyle, @k String str, @l BeduinProductComparisonTextItemParams beduinProductComparisonTextItemParams, @l String str2, @l BeduinProductComparisonTextItemParams beduinProductComparisonTextItemParams2, int i12) {
        this.f102145a = image;
        this.f102146b = f12;
        this.f102147c = imageStyle;
        this.f102148d = str;
        this.f102149e = beduinProductComparisonTextItemParams;
        this.f102150f = str2;
        this.f102151g = beduinProductComparisonTextItemParams2;
        this.f102152h = i12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f102145a, aVar.f102145a) && Float.compare(this.f102146b, aVar.f102146b) == 0 && L.f(this.f102147c, aVar.f102147c) && L.f(this.f102148d, aVar.f102148d) && L.f(this.f102149e, aVar.f102149e) && L.f(this.f102150f, aVar.f102150f) && L.f(this.f102151g, aVar.f102151g) && this.f102152h == aVar.f102152h;
    }

    public final int hashCode() {
        int iD2 = r.d(this.f102146b, this.f102145a.hashCode() * 31, 31);
        ImageStyle imageStyle = this.f102147c;
        int iD3 = H.d((iD2 + (imageStyle == null ? 0 : imageStyle.hashCode())) * 31, 31, this.f102148d);
        BeduinProductComparisonTextItemParams beduinProductComparisonTextItemParams = this.f102149e;
        int iHashCode = (iD3 + (beduinProductComparisonTextItemParams == null ? 0 : beduinProductComparisonTextItemParams.hashCode())) * 31;
        String str = this.f102150f;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        BeduinProductComparisonTextItemParams beduinProductComparisonTextItemParams2 = this.f102151g;
        return Integer.hashCode(this.f102152h) + ((iHashCode2 + (beduinProductComparisonTextItemParams2 != null ? beduinProductComparisonTextItemParams2.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinProductComparisonHeader(image=");
        sb2.append(this.f102145a);
        sb2.append(", imageRatio=");
        sb2.append(this.f102146b);
        sb2.append(", imageStyle=");
        sb2.append(this.f102147c);
        sb2.append(", title=");
        sb2.append(this.f102148d);
        sb2.append(", titleParams=");
        sb2.append(this.f102149e);
        sb2.append(", description=");
        sb2.append(this.f102150f);
        sb2.append(", descriptionParams=");
        sb2.append(this.f102151g);
        sb2.append(", headerHeight=");
        return r.t(sb2, this.f102152h, ')');
    }
}
