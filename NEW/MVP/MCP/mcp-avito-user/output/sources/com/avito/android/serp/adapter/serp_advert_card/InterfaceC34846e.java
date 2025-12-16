package com.avito.android.serp.adapter.serp_advert_card;

import android.net.Uri;
import com.avito.android.image_loader.From;
import com.avito.android.remote.model.DiscountIcon;
import com.avito.android.remote.model.QuorumFilterInfo;
import com.avito.android.remote.model.RadiusInfo;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.badge.Badge;
import com.facebook.drawee.view.SimpleDraweeView;
import hw.InterfaceC41177b;
import kotlin.G0;
import kotlin.Metadata;
import ru.avito.component.serp.AsyncViewportTracker;
import ru.avito.component.serp.DeliveryTerms;

/* compiled from: SerpAdvertListCard.kt */
@InterfaceC41177b
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/serp_advert_card/e;", "Lru/avito/component/serp/AsyncViewportTracker;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.serp.adapter.serp_advert_card.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC34846e extends AsyncViewportTracker {

    /* compiled from: SerpAdvertListCard.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.serp.adapter.serp_advert_card.e$a */
    public static final class a {
        public static /* synthetic */ void a(InterfaceC34846e interfaceC34846e, com.avito.android.image_loader.a aVar, From from, int i12) {
            if ((i12 & 4) != 0) {
                from = From.f169444d;
            }
            interfaceC34846e.B3(aVar, null, from);
        }

        public static void b(com.avito.android.serp.adapter.rich_snippets.realty.F f12, SimpleDraweeView simpleDraweeView, com.avito.android.image_loader.a aVar) {
            From from = From.f169444d;
            f12.getClass();
            f12.f270929b.b(simpleDraweeView, aVar, From.f169444d);
        }
    }

    void B1(long j12);

    void B3(@Y61.k com.avito.android.image_loader.a aVar, @Y61.l String str, @Y61.k From from);

    void B5(@Y61.l String str, @Y61.k RadiusInfo radiusInfo);

    void C(@Y61.l String str);

    void C9(@Y61.k String str);

    void Cd(@Y61.l String str, @Y61.l DiscountIcon discountIcon, boolean z12);

    void D0(@Y61.l QuorumFilterInfo quorumFilterInfo);

    void E0(@Y61.l String str);

    void F0(@Y61.l Y41.a<G0> aVar);

    void H2(@Y61.l Y41.a<G0> aVar);

    void M1(@Y61.l String str);

    @Y61.k
    Uri O(@Y61.k com.avito.android.image_loader.k kVar);

    void O5(boolean z12, boolean z13);

    void Q0(@Y61.l DeliveryTerms deliveryTerms);

    void S0(@Y61.l String str);

    void V(@Y61.l String str);

    void X3(@Y61.l String str);

    void ai(@Y61.l String str);

    void b2(@Y61.l String str);

    void c(@Y61.l Y41.a<G0> aVar);

    void d1(boolean z12);

    void d5(@Y61.l String str, @Y61.k RadiusInfo radiusInfo);

    void e1(@Y61.k Badge badge);

    void ew(boolean z12);

    void f1(@Y61.l String str);

    void f5(int i12);

    void i1(@Y61.l String str);

    void k60(@Y61.l String str, @Y61.l RadiusInfo radiusInfo);

    void l3(@Y61.l String str);

    void o1(boolean z12);

    void o2(@Y61.l String str);

    void o3(@Y61.l String str);

    void setActive(boolean z12);

    void setFavorite(boolean z12);

    void setTitle(@Y61.k String str);

    void setViewed(boolean z12);

    void vd(@Y61.l ru.avito.component.snippet_badge_bar.d dVar);

    void w0();

    void w1(boolean z12);

    void z0(boolean z12);

    void z3(@Y61.l String str, boolean z12, @Y61.l UniversalColor universalColor);
}
