package com.avito.android.serp.adapter.action_promo_banner;

import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ActionPromoBannerConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/action_promo_banner/d;", "Lcom/avito/android/serp/adapter/action_promo_banner/c;", "<init>", "()V", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements c {
    @Inject
    public d() {
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    @Override // com.avito.android.serp.adapter.action_promo_banner.c
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.serp.adapter.action_promo_banner.ActionPromoBannerItem a(@Y61.k com.avito.android.remote.model.ActionPromoBanner r12) {
        /*
            r11 = this;
            java.lang.String r1 = r12.getId()
            r0 = 0
            if (r1 != 0) goto L8
            return r0
        L8:
            com.avito.android.remote.model.text.AttributedText r2 = r12.getTitle()
            if (r2 != 0) goto Lf
            return r0
        Lf:
            java.lang.Boolean r3 = r12.getClosable()
            if (r3 == 0) goto L69
            boolean r8 = r3.booleanValue()
            com.avito.android.remote.model.ActionPromoBanner$BackgroundCustomGradient r3 = r12.getBackgroundCustomGradient()
            if (r3 == 0) goto L32
            java.util.List r3 = r3.getColors()
            if (r3 == 0) goto L32
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r3 = kotlin.collections.C42745f0.C(r3)
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L32
            goto L33
        L32:
            r3 = r0
        L33:
            com.avito.android.remote.model.text.AttributedText r4 = r12.getText()
            com.avito.android.remote.model.ButtonAction r5 = r12.getButton()
            com.avito.android.serp.adapter.action_promo_banner.ActionPromoBannerItem$Background r6 = new com.avito.android.serp.adapter.action_promo_banner.ActionPromoBannerItem$Background
            java.lang.String r7 = r12.getBackgroundGradient()
            com.avito.android.remote.model.UniversalColor r9 = r12.getBackgroundUniversalColor()
            java.lang.String r10 = r12.getBackgroundColor()
            r6.<init>(r3, r7, r9, r10)
            com.avito.android.remote.model.UniversalImage r7 = r12.getBackgroundImage()
            com.avito.android.remote.model.UniversalColor r12 = r12.getCloseIconColor()
            if (r12 != 0) goto L5d
            com.avito.android.remote.model.UniversalColor r12 = new com.avito.android.remote.model.UniversalColor
            java.lang.String r3 = "black"
            r12.<init>(r3, r0, r0)
        L5d:
            com.avito.android.serp.adapter.action_promo_banner.ActionPromoBannerItem r9 = new com.avito.android.serp.adapter.action_promo_banner.ActionPromoBannerItem
            r0 = r9
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
        L69:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.serp.adapter.action_promo_banner.d.a(com.avito.android.remote.model.ActionPromoBanner):com.avito.android.serp.adapter.action_promo_banner.ActionPromoBannerItem");
    }
}
