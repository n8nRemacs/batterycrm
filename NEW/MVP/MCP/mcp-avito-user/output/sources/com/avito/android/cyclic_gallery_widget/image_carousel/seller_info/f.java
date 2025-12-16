package com.avito.android.cyclic_gallery_widget.image_carousel.seller_info;

import Y61.k;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CarouselSellerItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cyclic_gallery_widget/image_carousel/seller_info/f;", "LTV0/d;", "Lcom/avito/android/cyclic_gallery_widget/image_carousel/seller_info/g;", "Lcom/avito/android/cyclic_gallery_widget/image_carousel/seller_info/b;", "_avito_cyclic-gallery-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f implements TV0.d<g, b> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c f132134b;

    /* renamed from: c, reason: collision with root package name */
    public final float f132135c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final SellerInfoParams f132136d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f132137e;

    public f(@k com.jakewharton.rxrelay3.c cVar, float f12, @k SellerInfoParams sellerInfoParams, boolean z12) {
        this.f132134b = cVar;
        this.f132135c = f12;
        this.f132136d = sellerInfoParams;
        this.f132137e = z12;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0095  */
    @Override // TV0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O5(TV0.e r6, TV0.a r7, int r8) {
        /*
            r5 = this;
            com.avito.android.cyclic_gallery_widget.image_carousel.seller_info.g r6 = (com.avito.android.cyclic_gallery_widget.image_carousel.seller_info.g) r6
            com.avito.android.cyclic_gallery_widget.image_carousel.seller_info.b r7 = (com.avito.android.cyclic_gallery_widget.image_carousel.seller_info.b) r7
            com.avito.android.cyclic_gallery_widget.image_carousel.l r8 = r7.f132127l
            int r8 = r8.f132033f
            r6.Aa(r8)
            java.lang.String r8 = r7.f132118c
            boolean r0 = r7.f132124i
            r6.T50(r8, r0)
            com.avito.android.cyclic_gallery_widget.image_carousel.seller_info.SellerInfoParams r8 = r5.f132136d
            int r1 = r8.f132107c
            r6.qX(r1)
            java.lang.Float r1 = r7.f132119d
            java.lang.String r2 = r7.f132120e
            r6.S2(r2, r1)
            java.util.List<com.avito.android.remote.model.badge_bar.SerpBadge> r1 = r7.f132126k
            boolean r2 = com.avito.android.util.O2.a(r1)
            if (r2 == 0) goto L30
            boolean r2 = r5.f132137e
            if (r2 == 0) goto L30
            if (r0 != 0) goto L30
            r2 = 1
            goto L31
        L30:
            r2 = 0
        L31:
            r3 = 0
            if (r2 != 0) goto L37
            java.lang.String r4 = r7.f132121f
            goto L38
        L37:
            r4 = r3
        L38:
            if (r2 == 0) goto L3b
            goto L3c
        L3b:
            r1 = r3
        L3c:
            r6.dJ(r4)
            r6.t0(r1)
            boolean r1 = r8.f132106b
            if (r1 != 0) goto L48
            if (r0 == 0) goto L56
        L48:
            com.avito.android.remote.model.Image r1 = r7.f132122g
            if (r1 == 0) goto L56
            com.avito.android.image_loader.a r1 = com.avito.android.image_loader.b.b(r1)
            boolean r2 = r7.f132123h
            r6.bu(r1, r2, r0)
            goto L59
        L56:
            r6.bK()
        L59:
            com.avito.android.remote.model.GalleryItemConfigModel r0 = r7.f132128m
            if (r0 == 0) goto L95
            java.lang.Integer r1 = r0.getRatioHeight()
            if (r1 == 0) goto L8d
            int r2 = r1.intValue()
            if (r2 <= 0) goto L6a
            goto L6b
        L6a:
            r1 = r3
        L6b:
            if (r1 == 0) goto L8d
            int r1 = r1.intValue()
            float r1 = (float) r1
            java.lang.Integer r0 = r0.getRatioWidth()
            if (r0 == 0) goto L8d
            int r2 = r0.intValue()
            if (r2 <= 0) goto L7f
            goto L80
        L7f:
            r0 = r3
        L80:
            if (r0 == 0) goto L8d
            int r0 = r0.intValue()
            float r0 = (float) r0
            float r0 = r0 / r1
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            goto L8e
        L8d:
            r0 = r3
        L8e:
            if (r0 == 0) goto L95
            float r0 = r0.floatValue()
            goto L97
        L95:
            float r0 = r5.f132135c
        L97:
            r6.q0(r0)
            int r8 = r8.f132105a
            r6.oj(r8)
            com.avito.android.deep_linking.links.DeepLink r8 = r7.f132125j
            if (r8 != 0) goto La7
            r6.a(r3)
            goto Laf
        La7:
            com.avito.android.cyclic_gallery_widget.image_carousel.seller_info.e r8 = new com.avito.android.cyclic_gallery_widget.image_carousel.seller_info.e
            r8.<init>(r5, r7)
            r6.a(r8)
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.cyclic_gallery_widget.image_carousel.seller_info.f.O5(TV0.e, TV0.a, int):void");
    }
}
