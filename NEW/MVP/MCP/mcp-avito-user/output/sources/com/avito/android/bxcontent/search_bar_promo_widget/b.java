package com.avito.android.bxcontent.search_bar_promo_widget;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SearchPromoHeaderWidgetConverter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/search_bar_promo_widget/b;", "Lcom/avito/android/bxcontent/search_bar_promo_widget/a;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final m f112859a;

    @Inject
    public b(@Y61.k m mVar) {
        this.f112859a = mVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    @Override // com.avito.android.bxcontent.search_bar_promo_widget.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.bxcontent.search_bar_promo_widget.SearchPromoHeaderWidgetItem a(@Y61.k com.avito.android.remote.model.serp.SearchPromoHeaderWidget r13) {
        /*
            r12 = this;
            com.avito.android.remote.model.serp.SearchPromoHeaderWidget$SearchBarPromoTitle r0 = r13.getTitle()
            r1 = 0
            if (r0 == 0) goto La7
            com.avito.android.remote.model.text.AttributedText r0 = r0.getText()
            if (r0 != 0) goto Lf
            goto La7
        Lf:
            com.avito.android.remote.model.serp.SearchPromoHeaderWidget$SearchBarPromoTitle r2 = r13.getTitle()
            if (r2 == 0) goto La7
            com.avito.android.deep_linking.links.DeepLink r2 = r2.getDeeplink()
            if (r2 != 0) goto L1d
            goto La7
        L1d:
            java.util.List r3 = r13.getColors()
            if (r3 == 0) goto L31
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r3 = kotlin.collections.C42745f0.C(r3)
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L31
            r10 = r3
            goto L32
        L31:
            r10 = r1
        L32:
            java.util.UUID r3 = java.util.UUID.randomUUID()
            java.lang.String r6 = r3.toString()
            com.avito.android.bxcontent.search_bar_promo_widget.SearchPromoHeaderWidgetItem$SearchBarPromoItemTitle r7 = new com.avito.android.bxcontent.search_bar_promo_widget.SearchPromoHeaderWidgetItem$SearchBarPromoItemTitle
            com.avito.android.bxcontent.search_bar_promo_widget.SearchPromoHeaderWidgetItem$SearchBarPromoItemHeaderButton r3 = new com.avito.android.bxcontent.search_bar_promo_widget.SearchPromoHeaderWidgetItem$SearchBarPromoItemHeaderButton
            com.avito.android.remote.model.serp.SearchPromoHeaderWidget$SearchBarPromoTitle r4 = r13.getTitle()
            if (r4 == 0) goto L4f
            com.avito.android.remote.model.serp.SearchPromoHeaderWidget$HeaderButton r4 = r4.getHeaderButton()
            if (r4 == 0) goto L4f
            java.lang.String r4 = r4.getStyle()
            goto L50
        L4f:
            r4 = r1
        L50:
            com.avito.android.remote.model.serp.SearchPromoHeaderWidget$SearchBarPromoTitle r5 = r13.getTitle()
            if (r5 == 0) goto L61
            com.avito.android.remote.model.serp.SearchPromoHeaderWidget$HeaderButton r5 = r5.getHeaderButton()
            if (r5 == 0) goto L61
            com.avito.android.remote.model.UniversalColor r5 = r5.getBackgroundColor()
            goto L62
        L61:
            r5 = r1
        L62:
            com.avito.android.remote.model.serp.SearchPromoHeaderWidget$SearchBarPromoTitle r8 = r13.getTitle()
            if (r8 == 0) goto L73
            com.avito.android.remote.model.serp.SearchPromoHeaderWidget$HeaderButton r8 = r8.getHeaderButton()
            if (r8 == 0) goto L73
            com.avito.android.remote.model.UniversalColor r8 = r8.getColor()
            goto L74
        L73:
            r8 = r1
        L74:
            r3.<init>(r4, r5, r8)
            r7.<init>(r0, r2, r3)
            com.avito.android.remote.model.UniversalImage r9 = r13.getBackgroundImage()
            com.avito.android.remote.model.ToolbarConfig r0 = r13.getToolbarConfig()
            if (r0 == 0) goto L9b
            com.avito.android.bxcontent.search_bar_promo_widget.UdfToolbarAndStatusBarConfig r2 = new com.avito.android.bxcontent.search_bar_promo_widget.UdfToolbarAndStatusBarConfig
            com.avito.android.bxcontent.search_bar_promo_widget.m r3 = r12.f112859a
            com.avito.android.search_bar.utils.UdfToolbarColors r3 = r3.a(r0)
            com.avito.android.remote.model.NavigationBarStyle$ThemeAppearance r0 = r0.getThemeAppearance()
            if (r0 == 0) goto L96
            com.avito.android.lib.util.darkTheme.ThemeAppearance r1 = nl.C44441d.b(r0)
        L96:
            r2.<init>(r3, r1)
            r11 = r2
            goto L9c
        L9b:
            r11 = r1
        L9c:
            com.avito.android.remote.model.UniversalImage r8 = r13.getImage()
            com.avito.android.bxcontent.search_bar_promo_widget.SearchPromoHeaderWidgetItem r13 = new com.avito.android.bxcontent.search_bar_promo_widget.SearchPromoHeaderWidgetItem
            r5 = r13
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return r13
        La7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.bxcontent.search_bar_promo_widget.b.a(com.avito.android.remote.model.serp.SearchPromoHeaderWidget):com.avito.android.bxcontent.search_bar_promo_widget.SearchPromoHeaderWidgetItem");
    }
}
