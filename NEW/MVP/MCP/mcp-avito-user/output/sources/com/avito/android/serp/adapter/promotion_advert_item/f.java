package com.avito.android.serp.adapter.promotion_advert_item;

import Y41.q;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import bV.C25568a;
import com.avito.android.R;
import com.avito.android.image_loader.From;
import com.avito.android.lib.design.docking_badge.DockingBadgeContainer;
import com.avito.android.lib.design.docking_badge.DockingBadgeEdgeType;
import com.avito.android.lib.design.docking_badge.DockingBadgeItem;
import com.avito.android.lib.design.strikethrough.StrikethroughTextView;
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
import com.avito.android.util.C35763c0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import ru.avito.component.serp.AsyncViewportTracker;
import ru.avito.component.serp.DeliveryTerms;
import ru.avito.component.snippet_badge_bar.a;
import sK0.C48063a;
import sK0.C48065c;

/* compiled from: AdvertGridPromotionItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/promotion_advert_item/f;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/serp/adapter/sale_advert_item/e;", "Lcom/avito/android/serp/adapter/serp_advert_card/o;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f extends com.avito.konveyor.adapter.b implements com.avito.android.serp.adapter.sale_advert_item.e, o {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final o f270521b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final FrameLayout f270522c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final SimpleDraweeView f270523d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final StrikethroughTextView f270524e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f270525f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final DockingBadgeContainer f270526g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final InterfaceC42726C f270527h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final InterfaceC42726C f270528i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(View view, h hVar, Locale locale, com.avito.android.connection_quality.connectivity.a aVar, AsyncViewportTracker.ViewContext viewContext, o oVar, int i12, C42822w c42822w) {
        super(view);
        oVar = (i12 & 32) != 0 ? new s(view, aVar, hVar, locale, viewContext) : oVar;
        this.f270521b = oVar;
        View viewFindViewById = view.findViewById(R.id.advert_grid_root);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        FrameLayout frameLayout = (FrameLayout) viewFindViewById;
        this.f270522c = frameLayout;
        View viewFindViewById2 = view.findViewById(R.id.image);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f270523d = (SimpleDraweeView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.discount);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.strikethrough.StrikethroughTextView");
        }
        this.f270524e = (StrikethroughTextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.discount_percentage);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f270525f = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.docking_badge_bar);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.docking_badge.DockingBadgeContainer");
        }
        this.f270526g = (DockingBadgeContainer) viewFindViewById5;
        this.f270527h = C42727D.c(new e(view));
        InterfaceC42726C interfaceC42726CC = C42727D.c(new d(view));
        this.f270528i = interfaceC42726CC;
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        layoutParams.width = ((Number) interfaceC42726CC.getValue()).intValue();
        frameLayout.setLayoutParams(layoutParams);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void B1(long j12) {
        this.f270521b.B1(j12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void B3(@k com.avito.android.image_loader.a aVar, @l String str, @k From from) {
        this.f270521b.B3(aVar, str, from);
        v.a(this.f270523d, ((Number) this.f270527h.getValue()).intValue());
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void B5(@l String str, @k RadiusInfo radiusInfo) {
        this.f270521b.B5(str, radiusInfo);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void C(@l String str) {
        this.f270521b.C(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void Cd(@l String str, @l DiscountIcon discountIcon, boolean z12) {
        StrikethroughTextView strikethroughTextView = this.f270524e;
        if (str == null || str.length() == 0) {
            strikethroughTextView.setText("");
            D6.w(strikethroughTextView);
        } else {
            I5.a(strikethroughTextView, str, false);
            D6.H(strikethroughTextView);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void D0(@l QuorumFilterInfo quorumFilterInfo) {
        this.f270521b.D0(quorumFilterInfo);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void E0(@l String str) {
        this.f270521b.E0(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void Ed(@k SerpDisplayType serpDisplayType, boolean z12) {
        this.f270521b.Ed(serpDisplayType, z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void F0(@k Y41.a<G0> aVar) {
        this.f270521b.F0(aVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void Fc(@l String str, @l UniversalColor universalColor, boolean z12, @l UniversalColor universalColor2) {
        this.f270521b.Fc(str, universalColor, z12, universalColor2);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void H2(@l Y41.a<G0> aVar) {
        this.f270521b.H2(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void IU(@l UniversalColor universalColor, @l UniversalColor universalColor2) {
        if (universalColor2 != null) {
            TextView textView = this.f270525f;
            textView.setTextColor(C48063a.f437606a.a(textView.getContext(), universalColor2));
        }
        if (universalColor != null) {
            int iA2 = C48063a.f437606a.a(this.f270522c.getContext(), universalColor);
            com.avito.android.lib.design.strikethrough.a aVar = new com.avito.android.lib.design.strikethrough.a(new C35763c0(iA2, null, null, null, 14, null), null, 2, 0 == true ? 1 : 0);
            StrikethroughTextView strikethroughTextView = this.f270524e;
            strikethroughTextView.setStyle(aVar);
            strikethroughTextView.setTextColor(iA2);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void K9(@l BadgeSticker badgeSticker, boolean z12) {
        this.f270521b.K9(badgeSticker, z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void L6(@k Y41.l lVar, @l BuyWithDeliveryButton buyWithDeliveryButton) {
        this.f270521b.L6(lVar, buyWithDeliveryButton);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void M1(@l String str) {
        this.f270521b.M1(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void N5(@l SellerRating sellerRating) {
        this.f270521b.N5(sellerRating);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    @k
    public final Uri O(@k com.avito.android.image_loader.k kVar) {
        return this.f270521b.O(kVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void O5(boolean z12, boolean z13) {
        this.f270521b.O5(z12, z13);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void Q0(@l DeliveryTerms deliveryTerms) {
        this.f270521b.Q0(deliveryTerms);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void S0(@l String str) {
        this.f270521b.S0(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void V(@l String str) {
        this.f270521b.V(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void W9(@k ShownItemsAbTestGroup shownItemsAbTestGroup) {
        this.f270521b.W9(shownItemsAbTestGroup);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void X2(@l UniversalColor universalColor, @k String str) {
        this.f270521b.X2(universalColor, str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void X3(@l String str) {
        this.f270521b.X3(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void Y4() {
        this.f270521b.Y4();
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void b2(@l String str) {
        this.f270521b.b2(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void c(@k Y41.a<G0> aVar) {
        this.f270521b.c(aVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void d1(boolean z12) {
        this.f270521b.d1(z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void d4(@l ru.avito.component.snippet_badge_bar.d dVar) {
        DockingBadgeContainer dockingBadgeContainer = this.f270526g;
        if (dVar != null) {
            ArrayList arrayList = dVar.f430566b;
            if (!arrayList.isEmpty()) {
                List<ru.avito.component.snippet_badge_bar.a> listE0 = C42745f0.E0(arrayList, 1);
                ArrayList arrayList2 = new ArrayList(C42745f0.q(listE0, 10));
                for (ru.avito.component.snippet_badge_bar.a aVar : listE0) {
                    Context context = dockingBadgeContainer.getContext();
                    String str = aVar.f430555a;
                    a.C12401a c12401a = aVar.f430556b;
                    DockingBadgeEdgeType dockingBadgeEdgeType = c12401a.f430561e;
                    if (dockingBadgeEdgeType == null) {
                        dockingBadgeEdgeType = DockingBadgeEdgeType.Flag;
                    }
                    C25568a.f57090g.getClass();
                    arrayList2.add(new DockingBadgeItem(str, null, c12401a.f430560d, dockingBadgeEdgeType, C25568a.a(C25568a.C2002a.b(R.style.Re23_DockingBadge_Promotion, context), null, C48065c.b(context, c12401a.f430558b, R.color.black), C48065c.b(context, c12401a.f430557a, R.color.white), 0, 0, 57), 2, null));
                }
                dockingBadgeContainer.setBadgeItems(arrayList2);
                D6.H(dockingBadgeContainer);
                return;
            }
        }
        D6.w(dockingBadgeContainer);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void d5(@l String str, @k RadiusInfo radiusInfo) {
        this.f270521b.d5(str, radiusInfo);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void e1(@k Badge badge) {
        this.f270521b.e1(badge);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void e7(@l String str) {
        this.f270521b.e7(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void f1(@l String str) {
        this.f270521b.f1(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void hZ(boolean z12) {
        this.f270521b.hZ(false);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void hf(float f12) {
        this.f270523d.setAspectRatio(1.0f);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void i1(@l String str) {
        this.f270521b.i1(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void k1(@l String str) {
        this.f270521b.k1(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void k5(boolean z12, boolean z13) {
        this.f270521b.k5(z12, z13);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void ka(@k Y41.a aVar, boolean z12) {
        this.f270521b.ka(aVar, z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void l3(@l String str) {
        this.f270521b.l3(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void l6(@k Y41.a aVar, boolean z12) {
        this.f270521b.l6(aVar, z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void m1(@l String str) {
        this.f270521b.m1(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void o1(boolean z12) {
        this.f270521b.o1(z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void o2(@l String str) {
        this.f270521b.o2(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void o3(@l String str) {
        this.f270521b.o3(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void setActive(boolean z12) {
        this.f270521b.setActive(z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void setViewed(boolean z12) {
        this.f270521b.setViewed(z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void w0() {
        this.f270521b.w0();
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void w1(boolean z12) {
        this.f270521b.w1(z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void a7() {
    }

    @Override // ru.avito.component.serp.AsyncViewportTracker
    public final void Z70(@k q<? super Integer, ? super Integer, ? super AsyncViewportTracker.ViewContext, G0> qVar) {
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.o
    public final void z0(boolean z12) {
    }
}
