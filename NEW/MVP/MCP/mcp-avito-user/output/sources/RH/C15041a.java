package Rh;

import Ce.InterfaceC13293a;
import Lr.InterfaceC14431a;
import Md.InterfaceC14470a;
import Nd.InterfaceC14561a;
import Ui.InterfaceC15523b;
import Vb.InterfaceC15661a;
import Vr.InterfaceC15709a;
import Y41.l;
import com.avito.android.advert.item.hotel.hotel_offer.konveyor.main.r;
import com.avito.android.advert.item.safedeal.real_one_click_payment_block.h;
import com.avito.android.advert.item.safedeal.real_one_click_payment_block.j;
import com.avito.android.ai_assistant.screens.chat.q;
import com.avito.android.auction.AuctionFragment;
import com.avito.android.auction.details.AuctionDetailsSheetActivity;
import com.avito.android.authorization.login.LoginActivity;
import com.avito.android.authorization.login.u;
import com.avito.android.authorization.select_profile.SelectProfilePresenterImpl;
import com.avito.android.authorization.select_profile.social_login.SocialRegistrationSuggestsFragment;
import com.avito.android.beduin_shared.model.action.BeduinOpenDeeplinkAction;
import com.avito.android.blueprints.publish.delivery_toggles.g;
import com.avito.android.calltracking.C29283k;
import com.avito.android.calltracking.I;
import com.avito.android.code_check.CodeCheckAbstractFragment;
import com.avito.android.code_check.p;
import com.avito.android.code_check_public.a;
import com.avito.android.comfortable_deal.submitting.select.SubmittingSelectFragment;
import com.avito.android.cpt.activation.CptActivationFragment;
import com.avito.android.cpt.mass_activation.CptMassActivationDialogFragment;
import com.avito.android.cpt.mass_activation.CptMassActivationDialogV2Fragment;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.w;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.external_apps.deep_linking.SendEmailLink;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.G0;

/* compiled from: R8$$SyntheticClass */
/* renamed from: Rh.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class C15041a implements w {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14556b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14557c;

    public /* synthetic */ C15041a(Object obj, int i12) {
        this.f14556b = i12;
        this.f14557c = obj;
    }

    @Override // com.avito.android.deep_linking.links.w
    public final void i7(DeepLink deepLink) {
        Object obj = this.f14557c;
        switch (this.f14556b) {
            case 0:
                b.a.a(((com.avito.android.beduin.common.component.list_item.a) obj).f101699h, deepLink, null, null, 6);
                break;
            case 1:
                b.a.a(((com.avito.android.advert.item.header.d) obj).f75836b, deepLink, null, null, 6);
                break;
            case 2:
                l<? super DeepLink, G0> lVar = ((r) obj).f76149A;
                if (lVar != null) {
                    lVar.invoke(deepLink);
                    break;
                }
                break;
            case 3:
                ((com.avito.android.advert_core.safedeal.a) obj).a(deepLink);
                break;
            case 4:
                int i12 = j.f78929l;
                ((h.b) obj).r(null, deepLink, null);
                break;
            case 5:
                ((com.avito.android.advert.item.safedeal.trust_factors.expandable_list_item.c) obj).f79139b.j(deepLink);
                break;
            case 6:
                b.a.a(((com.avito.android.advert.item.services_price.d) obj).f79963b, deepLink, null, null, 6);
                break;
            case 7:
                b.a.a(((com.avito.android.advert.item.services_title.d) obj).f80021b, deepLink, null, null, 6);
                break;
            case 8:
                ((q) obj).f89483d.invoke(new InterfaceC15661a.b(deepLink));
                break;
            case 9:
                AuctionFragment auctionFragment = ((com.avito.android.auction.r) obj).f92606c;
                if (auctionFragment != null) {
                    com.avito.android.deeplink_handler.handler.composite.a aVar = auctionFragment.f92306o0;
                    if (aVar == null) {
                        aVar = null;
                    }
                    b.a.a(aVar, deepLink, null, null, 6);
                    break;
                }
                break;
            case 10:
                int i13 = AuctionDetailsSheetActivity.f92320s;
                ((com.avito.android.auction.details.q) ((AuctionDetailsSheetActivity) obj).f92322n.getValue()).accept(new InterfaceC14470a.b(deepLink));
                break;
            case 11:
                ((com.avito.android.auction.offer.h) obj).f92526d.z4(new InterfaceC14561a.d(deepLink));
                break;
            case 12:
                ((com.avito.android.auction.offer.items.link.d) obj).f92552c.z4(new InterfaceC14561a.d(deepLink));
                break;
            case 13:
                u uVar = (u) obj;
                if (deepLink instanceof SendEmailLink) {
                    SendEmailLink sendEmailLink = (SendEmailLink) deepLink;
                    String strI = uVar.f94074k.i();
                    String str = sendEmailLink.f155028d;
                    if (str == null) {
                        str = "";
                    }
                    deepLink = new SendEmailLink(sendEmailLink.f155026b, sendEmailLink.f155027c, strI.concat(str));
                }
                LoginActivity loginActivity = uVar.f94061A;
                if (loginActivity != null) {
                    loginActivity.f(deepLink);
                    break;
                }
                break;
            case 14:
                b.a.a(((SelectProfilePresenterImpl) obj).f94233e, deepLink, null, null, 6);
                break;
            case 15:
                SocialRegistrationSuggestsFragment socialRegistrationSuggestsFragment = ((com.avito.android.authorization.select_profile.social_login.j) obj).f94405m;
                if (socialRegistrationSuggestsFragment != null) {
                    socialRegistrationSuggestsFragment.q5(deepLink);
                    break;
                }
                break;
            case 16:
                ((com.avito.android.auto_evidence_request.items.attributed_text_item.d) obj).f95185b.invoke(new InterfaceC13293a.b(deepLink));
                break;
            case 17:
                b.a.a(((com.avito.android.beduin.common.component.radio_group.e) obj).f102206k, deepLink, null, null, 6);
                break;
            case 18:
                ((InterfaceC15523b) obj).o(new BeduinOpenDeeplinkAction(deepLink));
                break;
            case 19:
                ((com.avito.android.blueprint.switcher.e) obj).f105773d.accept(deepLink);
                break;
            case 20:
                ((g) obj).f106190c.accept(deepLink);
                break;
            case 21:
                ((com.avito.android.bundles.vas_union.item.additional_info_block.d) obj).f108568b.onNext(deepLink);
                break;
            case 22:
                ((com.avito.android.bundles.vas_union.item.lightning_block.d) obj).f108596b.onNext(deepLink);
                break;
            case 23:
                ((C29283k) obj).f113746d.accept(new I.a(deepLink));
                break;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                p.a((CodeCheckAbstractFragment) obj, new a.InterfaceC3494a.b(deepLink, null, 2, null));
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                int i14 = com.avito.android.comfortable_deal.submitting.recycler.items.selectItem.g.f123246j;
                ((Y41.a) obj).invoke();
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                com.avito.android.deeplink_handler.handler.composite.a aVar2 = ((SubmittingSelectFragment) obj).f123267p0;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                b.a.a(aVar2, deepLink, null, null, 6);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                CptActivationFragment.a aVar3 = CptActivationFragment.f126198B0;
                ((CptActivationFragment) obj).q5().accept(new InterfaceC14431a.d(deepLink));
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                CptMassActivationDialogFragment.a aVar4 = CptMassActivationDialogFragment.f126412x0;
                ((CptMassActivationDialogFragment) obj).f5().accept(new InterfaceC15709a.d(deepLink));
                break;
            default:
                CptMassActivationDialogV2Fragment.a aVar5 = CptMassActivationDialogV2Fragment.f126446A0;
                ((CptMassActivationDialogV2Fragment) obj).g5().accept(new InterfaceC15709a.d(deepLink));
                break;
        }
    }
}
