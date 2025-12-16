package com.avito.android.cyclic_gallery_widget.image_carousel;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CarouselActionItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cyclic_gallery_widget/image_carousel/d;", "LTV0/d;", "Lcom/avito/android/cyclic_gallery_widget/image_carousel/g;", "Lcom/avito/android/cyclic_gallery_widget/image_carousel/b;", "_avito_cyclic-gallery-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d implements TV0.d<g, b> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f132004b;

    /* renamed from: c, reason: collision with root package name */
    public final float f132005c;

    /* compiled from: CarouselActionItemPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ActionType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ActionType actionType = ActionType.f131985d;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ActionType actionType2 = ActionType.f131985d;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ActionType actionType3 = ActionType.f131985d;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                ActionType actionType4 = ActionType.f131985d;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public d(float f12, @Y61.k com.jakewharton.rxrelay3.c cVar) {
        this.f132004b = cVar;
        this.f132005c = f12;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    @Override // TV0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O5(TV0.e r5, TV0.a r6, int r7) {
        /*
            r4 = this;
            com.avito.android.cyclic_gallery_widget.image_carousel.g r5 = (com.avito.android.cyclic_gallery_widget.image_carousel.g) r5
            com.avito.android.cyclic_gallery_widget.image_carousel.b r6 = (com.avito.android.cyclic_gallery_widget.image_carousel.b) r6
            com.avito.android.cyclic_gallery_widget.image_carousel.l r7 = r6.f132000d
            int r7 = r7.f132033f
            r5.Aa(r7)
            com.avito.android.cyclic_gallery_widget.image_carousel.a r6 = r6.f131999c
            java.lang.String r7 = r6.f131994b
            com.avito.android.cyclic_gallery_widget.image_carousel.ActionType r0 = r6.f131993a
            int r1 = r0.f131991b
            ru.avito.component.serp.PhoneLoadingState r2 = r6.f131997e
            java.lang.Integer r3 = r0.f131992c
            r5.wN(r7, r1, r3, r2)
            int r7 = r6.f131995c
            r5.ke(r7)
            com.avito.android.remote.model.GalleryItemConfigModel r6 = r6.f131996d
            if (r6 == 0) goto L5a
            java.lang.Integer r7 = r6.getRatioHeight()
            r1 = 0
            if (r7 == 0) goto L53
            int r2 = r7.intValue()
            if (r2 <= 0) goto L31
            goto L32
        L31:
            r7 = r1
        L32:
            if (r7 == 0) goto L53
            int r7 = r7.intValue()
            float r7 = (float) r7
            java.lang.Integer r6 = r6.getRatioWidth()
            if (r6 == 0) goto L53
            int r2 = r6.intValue()
            if (r2 <= 0) goto L46
            goto L47
        L46:
            r6 = r1
        L47:
            if (r6 == 0) goto L53
            int r6 = r6.intValue()
            float r6 = (float) r6
            float r6 = r6 / r7
            java.lang.Float r1 = java.lang.Float.valueOf(r6)
        L53:
            if (r1 == 0) goto L5a
            float r6 = r1.floatValue()
            goto L5c
        L5a:
            float r6 = r4.f132005c
        L5c:
            r5.q0(r6)
            io.reactivex.rxjava3.disposables.c r6 = new io.reactivex.rxjava3.disposables.c
            r6.<init>()
            com.avito.android.cyclic_gallery_widget.image_carousel.e r7 = new com.avito.android.cyclic_gallery_widget.image_carousel.e
            r7.<init>(r5, r6)
            r5.d(r7)
            int r7 = r0.ordinal()
            if (r7 == 0) goto L90
            r0 = 1
            if (r7 == r0) goto L8d
            r0 = 2
            if (r7 == r0) goto L8a
            r0 = 3
            if (r7 == r0) goto L87
            r0 = 4
            if (r7 != r0) goto L81
            com.avito.android.cyclic_gallery_widget.image_carousel.i$f r7 = com.avito.android.cyclic_gallery_widget.image_carousel.i.f.f132023a
            goto L92
        L81:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L87:
            com.avito.android.cyclic_gallery_widget.image_carousel.i$a r7 = com.avito.android.cyclic_gallery_widget.image_carousel.i.a.f132018a
            goto L92
        L8a:
            com.avito.android.cyclic_gallery_widget.image_carousel.i$h r7 = com.avito.android.cyclic_gallery_widget.image_carousel.i.h.f132026a
            goto L92
        L8d:
            com.avito.android.cyclic_gallery_widget.image_carousel.i$c r7 = com.avito.android.cyclic_gallery_widget.image_carousel.i.c.f132020a
            goto L92
        L90:
            com.avito.android.cyclic_gallery_widget.image_carousel.i$b r7 = com.avito.android.cyclic_gallery_widget.image_carousel.i.b.f132019a
        L92:
            io.reactivex.rxjava3.core.z r5 = r5.A()
            com.avito.android.cyclic_gallery_widget.image_carousel.f r0 = new com.avito.android.cyclic_gallery_widget.image_carousel.f
            r0.<init>(r4, r7)
            io.reactivex.rxjava3.disposables.d r5 = r5.t0(r0)
            r6.b(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.cyclic_gallery_widget.image_carousel.d.O5(TV0.e, TV0.a, int):void");
    }
}
