package com.avito.android.serp.adapter.sale_advert_item;

import Y41.q;
import Y61.k;
import Y61.l;
import android.net.Uri;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.image_loader.From;
import com.avito.android.lib.util.v;
import com.avito.android.remote.model.BuyWithDeliveryButton;
import com.avito.android.remote.model.DiscountIcon;
import com.avito.android.remote.model.QuorumFilterInfo;
import com.avito.android.remote.model.RadiusInfo;
import com.avito.android.remote.model.SellerRating;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.badge.Badge;
import com.avito.android.remote.model.sales.utils.BadgeSticker;
import com.avito.android.serp.adapter.serp_advert_card.ShownItemsAbTestGroup;
import com.avito.android.serp.adapter.serp_advert_card.o;
import com.avito.android.serp.adapter.serp_advert_card.s;
import com.avito.android.server_time.h;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.Locale;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import ru.avito.component.serp.AsyncViewportTracker;
import ru.avito.component.serp.DeliveryTerms;

/* compiled from: AdvertGridSaleItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/sale_advert_item/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/serp/adapter/sale_advert_item/e;", "Lcom/avito/android/serp/adapter/serp_advert_card/o;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g extends com.avito.konveyor.adapter.b implements e, o {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final o f271557b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final SimpleDraweeView f271558c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC42726C f271559d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(View view, h hVar, Locale locale, com.avito.android.connection_quality.connectivity.a aVar, AsyncViewportTracker.ViewContext viewContext, o oVar, int i12, C42822w c42822w) {
        super(view);
        oVar = (i12 & 32) != 0 ? new s(view, aVar, hVar, locale, viewContext) : oVar;
        this.f271557b = oVar;
        View viewFindViewById = view.findViewById(R.id.image);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f271558c = (SimpleDraweeView) viewFindViewById;
        this.f271559d = C42727D.c(new f(view));
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void B1(long j12) {
        this.f271557b.B1(j12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void B3(@k com.avito.android.image_loader.a aVar, @l String str, @k From from) {
        this.f271557b.B3(aVar, str, from);
        v.a(this.f271558c, ((Number) this.f271559d.getValue()).intValue());
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void B5(@l String str, @k RadiusInfo radiusInfo) {
        this.f271557b.B5(str, radiusInfo);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void C(@l String str) {
        this.f271557b.C(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void Cd(@l String str, @l DiscountIcon discountIcon, boolean z12) {
        this.f271557b.Cd(str, discountIcon, z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void D0(@l QuorumFilterInfo quorumFilterInfo) {
        this.f271557b.D0(quorumFilterInfo);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void E0(@l String str) {
        this.f271557b.E0(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void Ed(@k SerpDisplayType serpDisplayType, boolean z12) {
        this.f271557b.Ed(serpDisplayType, z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void F0(@k Y41.a<G0> aVar) {
        this.f271557b.F0(aVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void Fc(@l String str, @l UniversalColor universalColor, boolean z12, @l UniversalColor universalColor2) {
        this.f271557b.Fc(str, universalColor, z12, universalColor2);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void H2(@l Y41.a<G0> aVar) {
        this.f271557b.H2(aVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void IU(@l UniversalColor universalColor, @l UniversalColor universalColor2) {
        this.f271557b.IU(universalColor, universalColor2);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void K9(@l BadgeSticker badgeSticker, boolean z12) {
        this.f271557b.K9(badgeSticker, z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void L6(@k Y41.l lVar, @l BuyWithDeliveryButton buyWithDeliveryButton) {
        this.f271557b.L6(lVar, buyWithDeliveryButton);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void M1(@l String str) {
        this.f271557b.M1(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void N5(@l SellerRating sellerRating) {
        this.f271557b.N5(sellerRating);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    @k
    public final Uri O(@k com.avito.android.image_loader.k kVar) {
        return this.f271557b.O(kVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void O5(boolean z12, boolean z13) {
        this.f271557b.O5(z12, z13);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void Q0(@l DeliveryTerms deliveryTerms) {
        this.f271557b.Q0(deliveryTerms);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void S0(@l String str) {
        this.f271557b.S0(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void V(@l String str) {
        this.f271557b.V(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void W9(@k ShownItemsAbTestGroup shownItemsAbTestGroup) {
        this.f271557b.W9(shownItemsAbTestGroup);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void X2(@l UniversalColor universalColor, @k String str) {
        this.f271557b.X2(universalColor, str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void X3(@l String str) {
        this.f271557b.X3(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void Y4() {
        this.f271557b.Y4();
    }

    @Override // ru.avito.component.serp.AsyncViewportTracker
    public final void Z70(@k q<? super Integer, ? super Integer, ? super AsyncViewportTracker.ViewContext, G0> qVar) {
        this.f271557b.Z70(qVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void a7() {
        this.f271557b.a7();
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void b2(@l String str) {
        this.f271557b.b2(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void c(@k Y41.a<G0> aVar) {
        this.f271557b.c(aVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void d1(boolean z12) {
        this.f271557b.d1(z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void d4(@l ru.avito.component.snippet_badge_bar.d dVar) {
        this.f271557b.d4(dVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void d5(@l String str, @k RadiusInfo radiusInfo) {
        this.f271557b.d5(str, radiusInfo);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void e1(@k Badge badge) {
        this.f271557b.e1(badge);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void e7(@l String str) {
        this.f271557b.e7(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void f1(@l String str) {
        this.f271557b.f1(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void hZ(boolean z12) {
        this.f271557b.hZ(false);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void hf(float f12) {
        this.f271557b.hf(1.0f);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void i1(@l String str) {
        this.f271557b.i1(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void k1(@l String str) {
        this.f271557b.k1(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void k5(boolean z12, boolean z13) {
        this.f271557b.k5(z12, z13);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void ka(@k Y41.a aVar, boolean z12) {
        this.f271557b.ka(aVar, z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void l3(@l String str) {
        this.f271557b.l3(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void l6(@k Y41.a aVar, boolean z12) {
        this.f271557b.l6(aVar, z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void m1(@l String str) {
        this.f271557b.m1(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void o1(boolean z12) {
        this.f271557b.o1(z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void o2(@l String str) {
        this.f271557b.o2(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void o3(@l String str) {
        this.f271557b.o3(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void setActive(boolean z12) {
        this.f271557b.setActive(z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void setViewed(boolean z12) {
        this.f271557b.setViewed(z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void w0() {
        this.f271557b.w0();
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void w1(boolean z12) {
        this.f271557b.w1(z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void z0(boolean z12) {
        this.f271557b.z0(z12);
    }
}
