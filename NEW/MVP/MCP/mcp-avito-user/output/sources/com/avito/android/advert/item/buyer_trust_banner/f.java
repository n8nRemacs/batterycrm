package com.avito.android.advert.item.buyer_trust_banner;

import Y41.l;
import Y61.k;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.w;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.lib.design.gradient.AvitoLinearGradientDrawable;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.buyer_trust_banner.BuyerTrustBanner;
import com.avito.android.util.text.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.L;
import sK0.C48063a;

/* compiled from: BuyerTrustBannerPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/buyer_trust_banner/f;", "LTV0/d;", "Lcom/avito/android/advert/item/buyer_trust_banner/h;", "Lcom/avito/android/advert/item/buyer_trust_banner/BuyerTrustBannerItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class f implements TV0.d<h, BuyerTrustBannerItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f74223b;

    /* compiled from: BuyerTrustBannerPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements w, D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l f74224b;

        public a(l lVar) {
            this.f74224b = lVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof w) && (obj instanceof D)) {
                return L.f(this.f74224b, ((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f74224b;
        }

        public final int hashCode() {
            return this.f74224b.hashCode();
        }

        @Override // com.avito.android.deep_linking.links.w
        public final /* synthetic */ void i7(DeepLink deepLink) {
            this.f74224b.invoke(deepLink);
        }
    }

    @Inject
    public f(@k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f74223b = aVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        UniversalColor color;
        String gradientName;
        Integer numH;
        List<UniversalColor> gradientColors;
        h hVar = (h) eVar;
        BuyerTrustBanner buyerTrustBanner = ((BuyerTrustBannerItem) aVar).f74215e;
        buyerTrustBanner.getText().setOnDeepLinkClickListener(new a(new e(1, this.f74223b, com.avito.android.deeplink_handler.handler.composite.a.class, "handle", "handle(Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Landroid/os/Bundle;)V", 0)));
        j.a(hVar.f74228d, buyerTrustBanner.getText(), null);
        BuyerTrustBanner.Background background = buyerTrustBanner.getBackground();
        InterfaceC42726C interfaceC42726C = hVar.f74229e;
        Context context = hVar.f74227c;
        Banner banner = hVar.f74226b;
        if (background != null && (gradientColors = background.getGradientColors()) != null) {
            List<UniversalColor> list = gradientColors;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(C48063a.f437606a.a(context, (UniversalColor) it.next())));
            }
            int[] iArrL0 = C42745f0.L0(arrayList);
            if (iArrL0.length >= 2) {
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, iArrL0);
                gradientDrawable.setCornerRadius(((Number) interfaceC42726C.getValue()).intValue());
                banner.setBackground(gradientDrawable);
                return;
            }
        }
        if (background != null && (gradientName = background.getGradientName()) != null && (numH = com.avito.android.lib.util.f.h(gradientName)) != null) {
            AvitoLinearGradientDrawable.a.C5275a c5275a = new AvitoLinearGradientDrawable.a.C5275a(hVar.f74227c, numH.intValue(), 0, 4, null);
            c5275a.f179264a = ((Number) interfaceC42726C.getValue()).intValue();
            banner.setBackground(new AvitoLinearGradientDrawable(c5275a.a()));
        } else if (background != null && (color = background.getColor()) != null) {
            C48063a.f437606a.getClass();
            Banner.h(banner, C48063a.e(context, color));
        } else {
            AvitoLinearGradientDrawable.a.C5275a c5275a2 = new AvitoLinearGradientDrawable.a.C5275a(hVar.f74227c, R.attr.gradientLinearMonoHorizontalViolet, 0, 4, null);
            c5275a2.f179264a = ((Number) interfaceC42726C.getValue()).intValue();
            banner.setBackground(new AvitoLinearGradientDrawable(c5275a2.a()));
        }
    }
}
