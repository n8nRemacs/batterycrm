package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert.item.AdvertDetailsFastOpenParams;
import com.avito.android.advert_details_items.carousel_photogallery.CarouselPhotoGalleryItem;
import com.avito.android.advert_details_items.photogallery.AdvertDetailsGalleryItem;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.Image;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import lE.C43624b;

/* compiled from: AdvertDetailsGalleryItemFactory.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/L1;", "Lcom/avito/android/advert/item/blocks/items_factories/K1;", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class L1 implements K1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final Integer f73790a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73791b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.J0 f73792c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final AdvertDetailsFastOpenParams f73793d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C43624b f73794e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.gallery.a f73795f;

    /* compiled from: AdvertDetailsGalleryItemFactory.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/L1$a;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final List<Image> f73796a;

        /* renamed from: b, reason: collision with root package name */
        public final int f73797b;

        public a(@Y61.l List<Image> list, int i12) {
            this.f73796a = list;
            this.f73797b = i12;
        }
    }

    @Inject
    public L1(@Y61.l Integer num, @Y61.k com.avito.android.advert.item.similars.j jVar, @Y61.k com.avito.android.J0 j02, @Y61.k AdvertDetailsFastOpenParams advertDetailsFastOpenParams, @Y61.k C43624b c43624b, @Y61.k com.avito.android.advert.item.gallery.a aVar) {
        this.f73790a = num;
        this.f73791b = jVar;
        this.f73792c = j02;
        this.f73793d = advertDetailsFastOpenParams;
        this.f73794e = c43624b;
        this.f73795f = aVar;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.K1
    @Y61.l
    public final AdvertDetailsGalleryItem a(@Y61.l Boolean bool, @Y61.k String str) {
        Image image = this.f73793d.f71329f;
        if (image == null) {
            return null;
        }
        return new AdvertDetailsGalleryItem(0L, null, Collections.singletonList(image), null, null, null, null, null, null, 0, this.f73792c.a(), str, bool != null ? bool.booleanValue() : true, null, true, this.f73791b.a(), null, null, null, null, null, false, null, null, 196899, null);
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.K1
    @Y61.l
    public final CarouselPhotoGalleryItem b(@Y61.k AdvertDetails advertDetails) {
        a aVarD = d(advertDetails);
        List<Image> list = aVarD.f73796a;
        if ((list == null || list.isEmpty()) && advertDetails.getVideo() == null) {
            return null;
        }
        return new CarouselPhotoGalleryItem(0L, null, aVarD.f73796a, advertDetails.getVideo(), aVarD.f73797b, this.f73792c.a(), advertDetails.isGigItem(), this.f73791b.a(), null, null, 771, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a4  */
    @Override // com.avito.android.advert.item.blocks.items_factories.K1
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.advert_details_items.photogallery.AdvertDetailsGalleryItem c(@Y61.k com.avito.android.remote.model.AdvertDetails r34) {
        /*
            r33 = this;
            r0 = r33
            com.avito.android.advert.item.blocks.items_factories.L1$a r1 = r33.d(r34)
            java.util.List<com.avito.android.remote.model.Image> r2 = r1.f73796a
            java.util.Collection r2 = (java.util.Collection) r2
            r3 = 0
            if (r2 == 0) goto L13
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L21
        L13:
            com.avito.android.remote.model.Video r2 = r34.getVideo()
            if (r2 != 0) goto L21
            com.avito.android.remote.model.NativeVideo r2 = r34.getNativeVideo()
            if (r2 != 0) goto L21
            goto L100
        L21:
            java.util.List r9 = r34.getRealtyLayouts()
            java.util.List r10 = r34.getRealtyLayoutIndexes()
            com.avito.android.remote.model.RealtyAiDesignImagesResponse r2 = r34.getRealtyAiDesignImages()
            if (r2 == 0) goto L35
            java.util.Map r2 = r2.convert()
            r11 = r2
            goto L36
        L35:
            r11 = r3
        L36:
            com.avito.android.remote.model.Video r12 = r34.getVideo()
            com.avito.android.remote.model.NativeVideo r13 = r34.getNativeVideo()
            com.avito.android.J0 r2 = r0.f73792c
            long r16 = r2.a()
            com.avito.android.advert.item.similars.j r2 = r0.f73791b
            int r22 = r2.a()
            java.lang.String r18 = r34.getId()
            boolean r19 = r34.isActive()
            com.avito.android.remote.model.gallery.GalleryConfig r20 = r34.getGalleryConfig()
            com.avito.android.remote.model.autotekateaser.AutotekaTeaserItemResponse r2 = r34.getAutotekaTeaser()
            if (r2 == 0) goto L63
            com.avito.android.remote.model.autotekateaser.AutotekaTeaserResult r2 = r2.getAutotekaData()
            r25 = r2
            goto L65
        L63:
            r25 = r3
        L65:
            com.avito.android.remote.model.model_card.ModelCardInfo r2 = r34.getModelCardInfo()
            if (r2 == 0) goto L72
            com.avito.android.remote.model.model_card.GalleryTeaser r2 = r2.getGalleryItem()
            r26 = r2
            goto L74
        L72:
            r26 = r3
        L74:
            java.util.List r2 = r34.getBeduinTeasers()
            if (r2 == 0) goto La4
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r2 = r2.iterator()
        L85:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L9b
            java.lang.Object r5 = r2.next()
            com.avito.android.remote.model.beduin_teaser.BeduinTeaser r5 = (com.avito.android.remote.model.beduin_teaser.BeduinTeaser) r5
            com.avito.android.remote.model.beduin_teaser.BeduinItemTeaser r5 = r5.getSlideTeaser()
            if (r5 == 0) goto L85
            r4.add(r5)
            goto L85
        L9b:
            boolean r2 = r4.isEmpty()
            if (r2 != 0) goto La4
            r27 = r4
            goto La6
        La4:
            r27 = r3
        La6:
            boolean r2 = r34.isRestyle()
            r4 = 1
            r21 = r2 ^ 1
            com.avito.android.remote.model.ItemCardRedesign r2 = r34.getItemCardRedesign()
            r5 = 0
            if (r2 == 0) goto Lbf
            java.lang.Boolean r2 = r2.getCarouselGallery()
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            boolean r2 = kotlin.jvm.internal.L.f(r2, r6)
            goto Lc0
        Lbf:
            r2 = r5
        Lc0:
            if (r2 == 0) goto Ld7
            lE.b r2 = r0.f73794e
            DE0.a r2 = r2.v()
            java.lang.Object r2 = r2.invoke()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto Ld7
            r28 = r4
            goto Ld9
        Ld7:
            r28 = r5
        Ld9:
            com.avito.android.remote.model.ItemCardRedesign r2 = r34.getItemCardRedesign()
            if (r2 == 0) goto Le3
            com.avito.android.remote.model.CarouselGalleryGroup r3 = r2.getCarouselGalleryGroup()
        Le3:
            r29 = r3
            java.util.List r30 = r34.getGalleryButtons()
            com.avito.android.advert_details_items.photogallery.AdvertDetailsGalleryItem r3 = new com.avito.android.advert_details_items.photogallery.AdvertDetailsGalleryItem
            r4 = r3
            r23 = 0
            r24 = 0
            r5 = 0
            r7 = 0
            java.util.List<com.avito.android.remote.model.Image> r8 = r1.f73796a
            r14 = 0
            int r15 = r1.f73797b
            r31 = 196867(0x30103, float:2.7587E-40)
            r32 = 0
            r4.<init>(r5, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
        L100:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.item.blocks.items_factories.L1.c(com.avito.android.remote.model.AdvertDetails):com.avito.android.advert_details_items.photogallery.AdvertDetailsGalleryItem");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.advert.item.blocks.items_factories.L1.a d(com.avito.android.remote.model.AdvertDetails r8) {
        /*
            r7 = this;
            com.avito.android.advert.item.gallery.a r0 = r7.f73795f
            r0.getClass()
            java.util.List r0 = com.avito.android.advert.item.gallery.a.a(r8)
            com.avito.android.advert.item.AdvertDetailsFastOpenParams r1 = r7.f73793d
            java.lang.String r2 = r1.f71330g
            java.lang.String r3 = "111"
            boolean r2 = kotlin.jvm.internal.L.f(r2, r3)
            if (r2 != 0) goto L42
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            java.lang.Boolean r3 = r1.f71331h
            boolean r2 = kotlin.jvm.internal.L.f(r3, r2)
            if (r2 != 0) goto L42
            boolean r2 = com.avito.android.util.O2.a(r0)
            if (r2 != 0) goto L43
            com.avito.android.remote.model.NativeVideo r2 = r8.getNativeVideo()
            if (r2 == 0) goto L2c
            goto L43
        L2c:
            com.avito.android.remote.model.Image r0 = r1.f71329f
            if (r0 == 0) goto L3f
            java.lang.String r2 = "426"
            java.lang.String r1 = r1.f71330g
            boolean r1 = kotlin.jvm.internal.L.f(r1, r2)
            if (r1 != 0) goto L3f
            java.util.List r0 = java.util.Collections.singletonList(r0)
            goto L43
        L3f:
            kotlin.collections.z0 r0 = kotlin.collections.C42784z0.f406748b
            goto L43
        L42:
            r0 = 0
        L43:
            java.util.List r1 = r8.getRealtyLayouts()
            r2 = 0
            if (r1 == 0) goto L4f
            int r1 = r1.size()
            goto L50
        L4f:
            r1 = r2
        L50:
            java.util.List r3 = r8.getImages()
            if (r3 == 0) goto L5b
            int r3 = r3.size()
            goto L5c
        L5b:
            r3 = r2
        L5c:
            com.avito.android.remote.model.Video r4 = r8.getVideo()
            com.avito.android.remote.model.ItemCardRedesign r8 = r8.getItemCardRedesign()
            if (r8 == 0) goto L71
            java.lang.Boolean r8 = r8.getCarouselGallery()
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            boolean r8 = kotlin.jvm.internal.L.f(r8, r5)
            goto L72
        L71:
            r8 = r2
        L72:
            r5 = 1
            if (r8 == 0) goto L89
            lE.b r8 = r7.f73794e
            DE0.a r8 = r8.v()
            java.lang.Object r8 = r8.invoke()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L89
            r8 = r5
            goto L8a
        L89:
            r8 = r2
        L8a:
            java.lang.Integer r6 = r7.f73790a
            if (r8 == 0) goto L95
            if (r6 == 0) goto Lcc
            int r2 = r6.intValue()
            goto Lcc
        L95:
            if (r1 <= 0) goto La5
            if (r6 == 0) goto La5
            int r8 = r6.intValue()
            int r8 = r8 + r1
            int r1 = r1 + r3
            int r1 = r1 - r5
            int r2 = kotlin.ranges.s.g(r8, r2, r1)
            goto Lcc
        La5:
            if (r6 != 0) goto La8
            goto Laf
        La8:
            int r8 = r6.intValue()
            if (r8 != 0) goto Laf
            goto Lcc
        Laf:
            if (r1 <= 0) goto Lb3
            r8 = r5
            goto Lb4
        Lb3:
            r8 = r2
        Lb4:
            if (r6 != 0) goto Lb7
            goto Lc4
        Lb7:
            if (r8 == 0) goto Lc0
            int r8 = r6.intValue()
            int r2 = r8 + (-1)
            goto Lc4
        Lc0:
            int r2 = r6.intValue()
        Lc4:
            int r1 = r1 + r2
            if (r4 == 0) goto Lcb
            if (r2 < r5) goto Lcb
            int r1 = r1 + 1
        Lcb:
            r2 = r1
        Lcc:
            com.avito.android.advert.item.blocks.items_factories.L1$a r8 = new com.avito.android.advert.item.blocks.items_factories.L1$a
            r8.<init>(r0, r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.item.blocks.items_factories.L1.d(com.avito.android.remote.model.AdvertDetails):com.avito.android.advert.item.blocks.items_factories.L1$a");
    }
}
