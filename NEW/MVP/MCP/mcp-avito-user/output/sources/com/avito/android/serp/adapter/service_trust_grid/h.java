package com.avito.android.serp.adapter.service_trust_grid;

import Y41.q;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
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
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
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

/* compiled from: AdvertGridServiceTrustItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/service_trust_grid/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/serp/adapter/service_trust_grid/f;", "Lcom/avito/android/serp/adapter/serp_advert_card/o;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h extends com.avito.konveyor.adapter.b implements f, o {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final o f272224b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final SimpleDraweeView f272225c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC42726C f272226d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final View f272227e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f272228f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(View view, com.avito.android.server_time.h hVar, Locale locale, com.avito.android.connection_quality.connectivity.a aVar, AsyncViewportTracker.ViewContext viewContext, o oVar, int i12, C42822w c42822w) {
        super(view);
        oVar = (i12 & 32) != 0 ? new s(view, aVar, hVar, locale, viewContext) : oVar;
        this.f272224b = oVar;
        View viewFindViewById = view.findViewById(R.id.image);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f272225c = (SimpleDraweeView) viewFindViewById;
        this.f272226d = C42727D.c(new g(view));
        View viewFindViewById2 = view.findViewById(R.id.services_seller_type_container);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f272227e = viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.services_seller_type);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f272228f = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.rating_count);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.rating_star);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        Context context = view.getContext();
        textView.setTextColor(C35835l0.d(R.attr.black, context));
        ((ImageView) viewFindViewById5).setImageTintList(C35835l0.e(R.attr.orange, context));
        hZ(false);
        hf(1.0f);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void B1(long j12) {
        this.f272224b.B1(j12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void B3(@k com.avito.android.image_loader.a aVar, @l String str, @k From from) {
        this.f272224b.B3(aVar, str, from);
        v.a(this.f272225c, ((Number) this.f272226d.getValue()).intValue());
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void B5(@l String str, @k RadiusInfo radiusInfo) {
        this.f272224b.B5(str, radiusInfo);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void C(@l String str) {
        this.f272224b.C(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void Cd(@l String str, @l DiscountIcon discountIcon, boolean z12) {
        this.f272224b.Cd(str, discountIcon, z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void D0(@l QuorumFilterInfo quorumFilterInfo) {
        this.f272224b.D0(quorumFilterInfo);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void E0(@l String str) {
        this.f272224b.E0(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void Ed(@k SerpDisplayType serpDisplayType, boolean z12) {
        this.f272224b.Ed(serpDisplayType, z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void F0(@k Y41.a<G0> aVar) {
        this.f272224b.F0(aVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void Fc(@l String str, @l UniversalColor universalColor, boolean z12, @l UniversalColor universalColor2) {
        this.f272224b.Fc(str, universalColor, z12, universalColor2);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void H2(@l Y41.a<G0> aVar) {
        this.f272224b.H2(aVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void IU(@l UniversalColor universalColor, @l UniversalColor universalColor2) {
        this.f272224b.IU(universalColor, universalColor2);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void K9(@l BadgeSticker badgeSticker, boolean z12) {
        this.f272224b.K9(badgeSticker, z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void L6(@k Y41.l lVar, @l BuyWithDeliveryButton buyWithDeliveryButton) {
        this.f272224b.L6(lVar, buyWithDeliveryButton);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void M1(@l String str) {
        this.f272224b.M1(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void N5(@l SellerRating sellerRating) {
        this.f272224b.N5(sellerRating);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    @k
    public final Uri O(@k com.avito.android.image_loader.k kVar) {
        return this.f272224b.O(kVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void O5(boolean z12, boolean z13) {
        this.f272224b.O5(z12, z13);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void Q0(@l DeliveryTerms deliveryTerms) {
        this.f272224b.Q0(deliveryTerms);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void S0(@l String str) {
        this.f272224b.S0(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void V(@l String str) {
        this.f272224b.V(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void W9(@k ShownItemsAbTestGroup shownItemsAbTestGroup) {
        this.f272224b.W9(shownItemsAbTestGroup);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void X2(@l UniversalColor universalColor, @k String str) {
        this.f272224b.X2(universalColor, str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void X3(@l String str) {
        this.f272224b.X3(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void Y4() {
        this.f272224b.Y4();
    }

    @Override // ru.avito.component.serp.AsyncViewportTracker
    public final void Z70(@k q<? super Integer, ? super Integer, ? super AsyncViewportTracker.ViewContext, G0> qVar) {
        this.f272224b.Z70(qVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void a7() {
        this.f272224b.a7();
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void b2(@l String str) {
        this.f272224b.b2(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void c(@k Y41.a<G0> aVar) {
        this.f272224b.c(aVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void d1(boolean z12) {
        this.f272224b.d1(z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void d4(@l ru.avito.component.snippet_badge_bar.d dVar) {
        this.f272224b.d4(dVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void d5(@l String str, @k RadiusInfo radiusInfo) {
        this.f272224b.d5(str, radiusInfo);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void e1(@k Badge badge) {
        this.f272224b.e1(badge);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void e7(@l String str) {
        this.f272224b.e7(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void f1(@l String str) {
        this.f272224b.f1(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void hZ(boolean z12) {
        this.f272224b.hZ(false);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void hf(float f12) {
        this.f272224b.hf(1.0f);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void i1(@l String str) {
        this.f272224b.i1(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void k1(@l String str) {
        this.f272224b.k1(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void k5(boolean z12, boolean z13) {
        this.f272224b.k5(z12, z13);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void ka(@k Y41.a aVar, boolean z12) {
        this.f272224b.ka(aVar, z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void l3(@l String str) {
        this.f272224b.l3(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void l6(@k Y41.a aVar, boolean z12) {
        this.f272224b.l6(aVar, z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void m1(@l String str) {
        this.f272224b.m1(str);
    }

    @Override // com.avito.android.serp.adapter.service_trust_grid.f
    public final void nU(@l String str) {
        TextView textView = this.f272228f;
        I5.a(textView, str, false);
        this.f272227e.setVisibility(textView.getVisibility());
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void o1(boolean z12) {
        this.f272224b.o1(z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void o2(@l String str) {
        this.f272224b.o2(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void o3(@l String str) {
        this.f272224b.o3(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void setActive(boolean z12) {
        this.f272224b.setActive(z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void setViewed(boolean z12) {
        this.f272224b.setViewed(z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void w0() {
        this.f272224b.w0();
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void w1(boolean z12) {
        this.f272224b.w1(z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void z0(boolean z12) {
        this.f272224b.z0(z12);
    }
}
