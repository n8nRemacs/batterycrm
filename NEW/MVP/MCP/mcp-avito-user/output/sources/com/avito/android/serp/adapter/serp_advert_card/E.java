package com.avito.android.serp.adapter.serp_advert_card;

import android.net.Uri;
import com.avito.android.analytics.event.native_video.VideoStopReason;
import com.avito.android.remote.model.DiscountIcon;
import com.avito.android.remote.model.QuorumFilterInfo;
import com.avito.android.remote.model.SellerRating;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.badge.Badge;
import com.avito.android.remote.model.price_list.PriceList;
import hw.InterfaceC41177b;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import ru.avito.component.serp.AsyncViewportTracker;
import ru.avito.component.serp.DeliveryTerms;

/* compiled from: SerpAdvertXlCard.kt */
@InterfaceC41177b
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/serp_advert_card/E;", "LQ81/a;", "Lru/avito/component/serp/AsyncViewportTracker;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface E extends Q81.a, AsyncViewportTracker {

    /* compiled from: SerpAdvertXlCard.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void C(@Y61.l String str);

    void D0(@Y61.l QuorumFilterInfo quorumFilterInfo);

    void D1(@Y61.k Y41.a<G0> aVar, @Y61.k Y41.a<G0> aVar2);

    void E0(@Y61.l String str);

    void F0(@Y61.l Y41.a<G0> aVar);

    void F30(@Y61.k ArrayList arrayList);

    void M1(@Y61.l String str);

    void N5(@Y61.l SellerRating sellerRating);

    @Y61.k
    Uri O(@Y61.k com.avito.android.image_loader.k kVar);

    void O70(int i12, int i13);

    void Q0(@Y61.l DeliveryTerms deliveryTerms);

    void Q3(@Y61.k Y41.p<? super String, ? super String, G0> pVar);

    void R0(@Y61.k Y41.l<? super String, G0> lVar);

    void S0(@Y61.l String str);

    void Sc(@Y61.l String str);

    void Tu(int i12);

    void V(@Y61.l String str);

    void a1(@Y61.k Y41.r<? super String, ? super Double, ? super Double, ? super VideoStopReason, G0> rVar);

    void b0(@Y61.l String str);

    void c(@Y61.l Y41.a<G0> aVar);

    void d1(boolean z12);

    void d4(@Y61.l ru.avito.component.snippet_badge_bar.d dVar);

    void e1(@Y61.k Badge badge);

    void ee(@Y61.l PriceList priceList);

    void f1(@Y61.l String str);

    void h(@Y61.l String str);

    void i1(@Y61.l String str);

    void i3(@Y61.k List<? extends Q<? extends com.avito.android.image_loader.k, Boolean>> list);

    void k1(@Y61.l String str);

    void m1(@Y61.l String str);

    void o1(boolean z12);

    void oC(@Y61.l Y41.a<G0> aVar);

    void sa(@Y61.l String str, boolean z12);

    void setActive(boolean z12);

    void setFavorite(boolean z12);

    void setTitle(@Y61.k String str);

    void setViewed(boolean z12);

    void so(@Y61.l String str, @Y61.l DiscountIcon discountIcon);

    void vb(@Y61.l String str);

    void w0();

    void w1(boolean z12);

    void w4();

    void x7(@Y61.l Y41.l<? super Integer, G0> lVar);

    void z0(boolean z12);

    void z3(@Y61.l String str, boolean z12, @Y61.l UniversalColor universalColor);
}
