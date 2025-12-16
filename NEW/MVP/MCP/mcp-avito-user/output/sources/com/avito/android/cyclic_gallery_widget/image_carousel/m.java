package com.avito.android.cyclic_gallery_widget.image_carousel;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ImageCarouselItemView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cyclic_gallery_widget/image_carousel/m;", "", "_avito_cyclic-gallery-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class m {

    /* renamed from: a, reason: collision with root package name */
    public final float f132040a;

    /* renamed from: b, reason: collision with root package name */
    public final float f132041b;

    /* renamed from: c, reason: collision with root package name */
    public final float f132042c;

    /* renamed from: d, reason: collision with root package name */
    public final float f132043d;

    public m(float f12, float f13, float f14, float f15) {
        this.f132040a = f12;
        this.f132041b = f13;
        this.f132042c = f14;
        this.f132043d = f15;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Float.compare(this.f132040a, mVar.f132040a) == 0 && Float.compare(this.f132041b, mVar.f132041b) == 0 && Float.compare(this.f132042c, mVar.f132042c) == 0 && Float.compare(this.f132043d, mVar.f132043d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f132043d) + androidx.appcompat.app.r.d(this.f132042c, androidx.appcompat.app.r.d(this.f132041b, Float.hashCode(this.f132040a) * 31, 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GalleryRatio(galleryHeightRatio=");
        sb2.append(this.f132040a);
        sb2.append(", imageWidthRatio=");
        sb2.append(this.f132041b);
        sb2.append(", actionRatio=");
        sb2.append(this.f132042c);
        sb2.append(", sellerRatio=");
        return androidx.appcompat.app.r.k(')', this.f132043d, sb2);
    }

    public /* synthetic */ m(float f12, float f13, float f14, float f15, int i12, C42822w c42822w) {
        this(f12, f13, (i12 & 4) != 0 ? f13 / 2 : f14, (i12 & 8) != 0 ? 0.7777778f * f13 : f15);
    }
}
