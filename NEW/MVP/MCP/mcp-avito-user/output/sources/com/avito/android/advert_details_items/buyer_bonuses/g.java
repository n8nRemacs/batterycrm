package com.avito.android.advert_details_items.buyer_bonuses;

import RI.b;
import Y41.l;
import com.avito.android.analytics.event.BannerEvent;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.ImvCarsDetailsLink;
import com.avito.android.deep_linking.links.ImvCarsDetailsLinkV2;
import com.avito.android.deep_linking.links.ProfileSettingsLink;
import com.avito.android.deep_linking.links.w;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.limits_info.FeesMethodsV2LimitsInfoItem;
import com.avito.android.hotel_booking.konveyor.text.BookingFormTextItem;
import com.avito.android.profile_settings_extended.adapter.re_agent_empty_info_banner.ReAgentEmptyInfoBannerItem;
import com.avito.android.promoblock.TnsPromoBlockItem;
import com.avito.android.promoblock.a;
import com.avito.android.promoblock.i;
import com.avito.android.publish.slots.market_price_v2.item.n;
import com.avito.android.publish_limits_info.ItemId;
import com.avito.android.remote.model.adverts.MyAdvertDetails;
import com.avito.android.social_management.adapter.SocialItem;
import com.avito.android.social_management.adapter.notification.j;
import com.avito.android.user_advert.advert.InterfaceC35426j0;
import com.avito.android.user_advert.advert.MyAdvertDetailsActivity;
import com.avito.android.user_advert.advert.items.installments_promoblock.a;
import com.avito.android.user_advert.advert.items.reject.k;
import com.avito.android.user_advert.advert.items.short_term_rent.switcher.p;
import eb.InterfaceC40078a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class g implements w {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f84486b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f84487c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f84488d;

    public /* synthetic */ g(int i12, Object obj, Object obj2) {
        this.f84486b = i12;
        this.f84488d = obj;
        this.f84487c = obj2;
    }

    @Override // com.avito.android.deep_linking.links.w
    public final void i7(DeepLink deepLink) {
        com.avito.android.analytics.provider.clickstream.a aVar;
        Object obj = this.f84487c;
        Object obj2 = this.f84488d;
        switch (this.f84486b) {
            case 0:
                ((com.avito.android.lib.design.bottom_sheet.d) obj2).dismiss();
                ((l) obj).invoke(deepLink);
                break;
            case 1:
                int i12 = com.avito.android.advert_stats.detail.tab.items.button.h.f86262e;
                ((com.jakewharton.rxrelay3.c) obj2).accept(deepLink);
                ((l) obj).invoke(new InterfaceC40078a.c(deepLink));
                break;
            case 2:
                FeesMethodsV2LimitsInfoItem feesMethodsV2LimitsInfoItem = (FeesMethodsV2LimitsInfoItem) obj;
                com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.limits_info.d dVar = (com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.limits_info.d) obj2;
                dVar.f158426b.b(new ItemId(feesMethodsV2LimitsInfoItem.f158409b), feesMethodsV2LimitsInfoItem.f158416i);
                dVar.f158427c.invoke(deepLink);
                break;
            case 3:
                ((com.avito.android.hotel_booking.konveyor.text.h) obj2).f163808b.invoke(new b.f(deepLink, ((BookingFormTextItem) obj).f163783b));
                break;
            case 4:
                com.avito.android.profile_settings_extended.adapter.re_agent_empty_info_banner.d dVar2 = (com.avito.android.profile_settings_extended.adapter.re_agent_empty_info_banner.d) obj2;
                dVar2.f229768b.c(new BannerEvent.a("agent-profile/empty-info", "profile_management", null, "link-click", 4, null));
                DeepLink deepLink2 = ((ReAgentEmptyInfoBannerItem) obj).f229758e.f229761c;
                ProfileSettingsLink profileSettingsLink = deepLink2 instanceof ProfileSettingsLink ? (ProfileSettingsLink) deepLink2 : null;
                dVar2.f229769c.invoke(new yc0.w(deepLink, profileSettingsLink != null ? profileSettingsLink.f133614c : null));
                break;
            case 5:
                ((i) obj2).f231793b.accept(new a.c((TnsPromoBlockItem) obj, deepLink));
                break;
            case 6:
                n nVar = (n) obj2;
                if ((deepLink instanceof ImvCarsDetailsLink) || (deepLink instanceof ImvCarsDetailsLinkV2)) {
                    nVar.f244580d.b(((JO.l) obj).f8955c);
                }
                nVar.f244583g.accept(deepLink);
                break;
            case 7:
                ((com.avito.android.social_management.adapter.notification.f) obj2).f284541b.accept(new j.b((SocialItem.Notification) obj, deepLink));
                break;
            case 8:
                MyAdvertDetailsActivity myAdvertDetailsActivity = ((com.avito.android.user_advert.advert.items.auto_publish.g) obj2).f309254c;
                if (myAdvertDetailsActivity != null) {
                    InterfaceC35426j0 interfaceC35426j0 = myAdvertDetailsActivity.f308326q;
                    (interfaceC35426j0 != null ? interfaceC35426j0 : null).T1((com.avito.android.user_advert.advert.items.auto_publish.a) obj, deepLink);
                    break;
                }
                break;
            case 9:
                com.avito.android.user_advert.advert.items.installments_promoblock.h hVar = (com.avito.android.user_advert.advert.items.installments_promoblock.h) obj2;
                b.a.a(hVar.f309522c, deepLink, null, null, 6);
                a.C9491a c9491a = (a.C9491a) obj;
                if (c9491a != null && (aVar = c9491a.f309505g) != null) {
                    hVar.f309523d.c(aVar);
                    break;
                }
                break;
            case 10:
                MyAdvertDetailsActivity myAdvertDetailsActivity2 = ((k) obj2).f310007b;
                if (myAdvertDetailsActivity2 != null) {
                    myAdvertDetailsActivity2.d2((com.avito.android.user_advert.advert.items.reject.a) obj, deepLink);
                    break;
                }
                break;
            case 11:
                com.avito.android.user_advert.advert.items.service_booking.f fVar = (com.avito.android.user_advert.advert.items.service_booking.f) obj2;
                MyAdvertDetailsActivity myAdvertDetailsActivity3 = fVar.f310134c;
                if (myAdvertDetailsActivity3 != null) {
                    myAdvertDetailsActivity3.f2(deepLink);
                }
                MyAdvertDetails.SbStatusBlock.Event event = ((com.avito.android.user_advert.advert.items.service_booking.a) obj).f310124g;
                if (event != null) {
                    fVar.f310133b.a(event);
                    break;
                }
                break;
            case 12:
                MyAdvertDetailsActivity myAdvertDetailsActivity4 = ((com.avito.android.user_advert.advert.items.short_term_rent.switcher.e) obj2).f310256b;
                if (myAdvertDetailsActivity4 != null) {
                    InterfaceC35426j0 interfaceC35426j02 = myAdvertDetailsActivity4.f308326q;
                    (interfaceC35426j02 != null ? interfaceC35426j02 : null).z0((OH0.b) obj, deepLink);
                    break;
                }
                break;
            default:
                MyAdvertDetailsActivity myAdvertDetailsActivity5 = ((p) obj2).f310274b;
                if (myAdvertDetailsActivity5 != null) {
                    InterfaceC35426j0 interfaceC35426j03 = myAdvertDetailsActivity5.f308326q;
                    (interfaceC35426j03 != null ? interfaceC35426j03 : null).X1((OH0.e) obj, deepLink);
                    break;
                }
                break;
        }
    }
}
