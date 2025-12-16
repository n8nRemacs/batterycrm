package XA0;

import Y41.l;
import ZF0.a;
import android.view.View;
import androidx.core.os.C22777e;
import com.avito.android.advert.item.comfortable_deal.k;
import com.avito.android.advert_core.domoteka_report_teaser.g;
import com.avito.android.blueprint.radiogroup.j;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.favorites.adapter.advert.s;
import com.avito.android.tariff.cpr.configure.advance.CprConfigureAdvanceFragment;
import com.avito.android.tariff.cpx.configure.levels.TariffCpxConfigureLevelsFragment;
import com.avito.android.tariff.cpx.info.items.card.h;
import com.avito.android.trx_promo_impl.TrxPromoFragment;
import com.avito.android.wallet.page.WalletPagePromoBannerView;
import gB0.InterfaceC40566a;
import kotlin.Q;
import sB0.c;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18766b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f18767c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DeepLink f18768d;

    public /* synthetic */ c(l lVar, DeepLink deepLink, int i12) {
        this.f18766b = i12;
        this.f18767c = lVar;
        this.f18768d = deepLink;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        DeepLink deepLink = this.f18768d;
        l lVar = this.f18767c;
        switch (this.f18766b) {
            case 0:
                lVar.invoke(deepLink);
                break;
            case 1:
                int i12 = k.f74307m;
                lVar.invoke(deepLink);
                break;
            case 2:
                int i13 = g.f83458f;
                lVar.invoke(deepLink);
                break;
            case 3:
                int i14 = j.f105646q;
                lVar.invoke(deepLink);
                break;
            case 4:
                int i15 = com.avito.android.blueprints.radiogroup.j.f106574h;
                lVar.invoke(deepLink);
                break;
            case 5:
                int i16 = s.f156471H;
                lVar.invoke(deepLink);
                break;
            case 6:
                int i17 = com.avito.android.serp.adapter.action_promo_banner.k.f268626j;
                lVar.invoke(deepLink);
                break;
            case 7:
                CprConfigureAdvanceFragment.a aVar = CprConfigureAdvanceFragment.f295152C0;
                lVar.invoke(new InterfaceC40566a.b(deepLink));
                break;
            case 8:
                CprConfigureAdvanceFragment.a aVar2 = CprConfigureAdvanceFragment.f295152C0;
                lVar.invoke(new InterfaceC40566a.b(deepLink));
                break;
            case 9:
                TariffCpxConfigureLevelsFragment.a aVar3 = TariffCpxConfigureLevelsFragment.f296048E0;
                lVar.invoke(new c.b(deepLink, C22777e.b(new Q("cpx_configure_levels_next_button_clicked", Boolean.TRUE))));
                break;
            case 10:
                int i18 = h.f296444e;
                lVar.invoke(deepLink);
                break;
            case 11:
                int i19 = h.f296444e;
                lVar.invoke(deepLink);
                break;
            case 12:
                int i22 = h.f296444e;
                lVar.invoke(deepLink);
                break;
            case 13:
                int i23 = h.f296444e;
                lVar.invoke(deepLink);
                break;
            case 14:
                int i24 = h.f296444e;
                lVar.invoke(deepLink);
                break;
            case 15:
                int i25 = com.avito.android.tariff_cpt.info.ui.items.card.h.f298282f;
                lVar.invoke(deepLink);
                break;
            case 16:
                int i26 = com.avito.android.tariff_cpt.info.ui.items.card.h.f298282f;
                lVar.invoke(deepLink);
                break;
            case 17:
                int i27 = com.avito.android.tariff_cpt.info.ui.items.card.h.f298282f;
                lVar.invoke(deepLink);
                break;
            case 18:
                int i28 = com.avito.android.tariff_cpt.info.ui.items.card.h.f298282f;
                lVar.invoke(deepLink);
                break;
            case 19:
                int i29 = com.avito.android.tariff_cpt.info.ui.items.card.h.f298282f;
                lVar.invoke(deepLink);
                break;
            case 20:
                TrxPromoFragment.a aVar4 = TrxPromoFragment.f303863H0;
                lVar.invoke(new a.e(deepLink));
                break;
            case 21:
                int i32 = WalletPagePromoBannerView.f327753g;
                lVar.invoke(deepLink);
                break;
            case 22:
                int i33 = com.avito.android.work_profile.profile.gig.ui.list.title_item.c.f331250g;
                lVar.invoke(deepLink);
                break;
            case 23:
                int i34 = com.avito.android.work_profile.profile.gig.ui.list.title_item.c.f331250g;
                lVar.invoke(deepLink);
                break;
            default:
                int i35 = com.avito.android.work_profile.profile.gig.ui.list.title_item.c.f331250g;
                lVar.invoke(deepLink);
                break;
        }
    }
}
