package com.avito.android.advert.item.compatibility.v2;

import Cw.InterfaceC13362a;
import Dw.InterfaceC13445a;
import L7.a;
import Q7.a;
import aN.InterfaceC19793a;
import android.view.View;
import com.avito.android.beduin.common.component.real_estate_filter.B;
import com.avito.android.campaigns_sale.CampaignsSaleFragment;
import com.avito.android.campaigns_sale_search.CampaignsSaleSearchFragment;
import com.avito.android.cart_similar_items.CartSimilarItemsFragment;
import com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetFourBlocksView;
import com.avito.android.imv_goods_advert.ImvGoodsAdvertFragment;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import im.InterfaceC41424a;
import mn.InterfaceC44101a;
import um.b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class m implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f74378b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.l f74379c;

    public /* synthetic */ m(int i12, Y41.l lVar) {
        this.f74378b = i12;
        this.f74379c = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Y41.l lVar = this.f74379c;
        switch (this.f74378b) {
            case 0:
                int i12 = n.f74380k;
                lVar.invoke(view);
                break;
            case 1:
                int i13 = n.f74380k;
                lVar.invoke(view);
                break;
            case 2:
                lVar.invoke(a.C0604a.f9797a);
                break;
            case 3:
                lVar.invoke(a.b.f13509a);
                break;
            case 4:
                lVar.invoke(a.b.f13509a);
                break;
            case 5:
                int i14 = com.avito.android.advert_core.development_offers.k.f83338e;
                lVar.invoke(-1);
                break;
            case 6:
                int i15 = com.avito.android.advert_core.offers.h.f83818g;
                lVar.invoke(-1);
                break;
            case 7:
                int i16 = com.avito.android.autoteka.items.purchaseViaPackage.i.f96933f;
                lVar.invoke(null);
                break;
            case 8:
                lVar.invoke(view);
                break;
            case 9:
                int i17 = com.avito.android.beduin.common.component.inline_filter.item.d.f101510f;
                lVar.invoke(view);
                break;
            case 10:
                int i18 = B.f102269f;
                lVar.invoke(view);
                break;
            case 11:
                int i19 = com.avito.android.beduin.common.component.select_calendar.a.f102436i;
                lVar.invoke(view);
                break;
            case 12:
                lVar.invoke(view);
                break;
            case 13:
                CampaignsSaleFragment.a aVar = CampaignsSaleFragment.f113813B0;
                lVar.invoke(InterfaceC41424a.e.f398721a);
                break;
            case 14:
                CampaignsSaleFragment.a aVar2 = CampaignsSaleFragment.f113813B0;
                lVar.invoke(InterfaceC41424a.b.f398718a);
                break;
            case 15:
                CampaignsSaleFragment.a aVar3 = CampaignsSaleFragment.f113813B0;
                lVar.invoke(InterfaceC41424a.k.f398727a);
                break;
            case 16:
                CampaignsSaleFragment.a aVar4 = CampaignsSaleFragment.f113813B0;
                lVar.invoke(InterfaceC41424a.l.f398728a);
                break;
            case 17:
                CampaignsSaleSearchFragment.a aVar5 = CampaignsSaleSearchFragment.f114473A0;
                lVar.invoke(b.s.f440250a);
                break;
            case 18:
                CartSimilarItemsFragment.a aVar6 = CartSimilarItemsFragment.f115666C0;
                lVar.invoke(InterfaceC44101a.e.f414681a);
                break;
            case 19:
                lVar.invoke(InterfaceC13362a.r.f2759a);
                break;
            case 20:
                lVar.invoke(InterfaceC13362a.f.f2746a);
                break;
            case 21:
                lVar.invoke(InterfaceC13362a.o.f2756a);
                break;
            case 22:
                lVar.invoke(InterfaceC13445a.f.f3527a);
                break;
            case 23:
                lVar.invoke(InterfaceC13445a.b.f3523a);
                break;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                int i22 = UniversalWidgetFourBlocksView.f153527g;
                lVar.invoke(0);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                int i23 = UniversalWidgetFourBlocksView.f153527g;
                lVar.invoke(1);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                int i24 = UniversalWidgetFourBlocksView.f153527g;
                lVar.invoke(2);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                int i25 = UniversalWidgetFourBlocksView.f153527g;
                lVar.invoke(3);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                int i26 = com.avito.android.extended_profile_widgets.adapter.about_v2.j.f154188i;
                lVar.invoke(view);
                break;
            default:
                ImvGoodsAdvertFragment.a aVar7 = ImvGoodsAdvertFragment.f170275y0;
                lVar.invoke(InterfaceC19793a.C1490a.f20874a);
                break;
        }
    }
}
