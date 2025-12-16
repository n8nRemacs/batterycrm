package SE0;

import FE.a;
import QE0.a;
import Y41.l;
import com.avito.android.advert.item.disclaimer_pd.h;
import com.avito.android.advert.item.job_seeker_apply_info.f;
import com.avito.android.advert_core.auto_select_parameters_v2.advantage.i;
import com.avito.android.advert_core.comfortable_deal_promo.j;
import com.avito.android.advert_core.pp_recall_promo.n;
import com.avito.android.authorization.select_profile.adapter.text.e;
import com.avito.android.auto_select.confirmation_dialog.AutoSelectConfirmationBottomSheetFragment;
import com.avito.android.competitor_analytics.mvi.entity.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.w;
import com.avito.android.edit_seller_type.mvi.entity.a;
import com.avito.android.mandatory_verification.items.header.k;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import eF.InterfaceC39997a;
import ef.InterfaceC40098a;
import sz.AbstractC48438c;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements w {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14846b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f14847c;

    public /* synthetic */ a(int i12, l lVar) {
        this.f14846b = i12;
        this.f14847c = lVar;
    }

    @Override // com.avito.android.deep_linking.links.w
    public final void i7(DeepLink deepLink) {
        l lVar = this.f14847c;
        switch (this.f14846b) {
            case 0:
                lVar.invoke(new a.C0891a(deepLink));
                break;
            case 1:
                if (lVar != null) {
                    lVar.invoke(deepLink);
                    break;
                }
                break;
            case 2:
                int i12 = h.f75231c;
                lVar.invoke(deepLink);
                break;
            case 3:
                int i13 = f.f77237d;
                lVar.invoke(deepLink);
                break;
            case 4:
                int i14 = com.avito.android.advert.item.service_order_request.l.f79908i;
                lVar.invoke(deepLink);
                break;
            case 5:
                int i15 = com.avito.android.advert_core.auto_select_parameters_v2.h.f82989h;
                lVar.invoke(deepLink);
                break;
            case 6:
                int i16 = i.f82973h;
                lVar.invoke(deepLink);
                break;
            case 7:
                int i17 = j.f83088h;
                lVar.invoke(deepLink);
                break;
            case 8:
                int i18 = n.f83986n;
                lVar.invoke(deepLink);
                break;
            case 9:
                int i19 = n.f83986n;
                lVar.invoke(deepLink);
                break;
            case 10:
                int i22 = e.f94289c;
                lVar.invoke(deepLink);
                break;
            case 11:
                AutoSelectConfirmationBottomSheetFragment.a aVar = AutoSelectConfirmationBottomSheetFragment.f95853n0;
                lVar.invoke(new InterfaceC40098a.C11099a(deepLink));
                break;
            case 12:
                lVar.invoke(deepLink);
                break;
            case 13:
                lVar.invoke(deepLink);
                break;
            case 14:
                lVar.invoke(new a.i(deepLink));
                break;
            case 15:
                lVar.invoke(new a.i(deepLink));
                break;
            case 16:
                lVar.invoke(new a.i(deepLink));
                break;
            case 17:
                lVar.invoke(deepLink);
                break;
            case 18:
                lVar.invoke(deepLink);
                break;
            case 19:
                lVar.invoke(deepLink);
                break;
            case 20:
                lVar.invoke(deepLink);
                break;
            case 21:
                lVar.invoke(new a.d(deepLink));
                break;
            case 22:
                lVar.invoke(new a.d(deepLink));
                break;
            case 23:
                lVar.invoke(new AbstractC48438c.b(deepLink));
                break;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                lVar.invoke(deepLink);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                lVar.invoke(new a.b(deepLink));
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                lVar.invoke(new InterfaceC39997a.c(deepLink));
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                int i23 = k.f184663f;
                lVar.invoke(deepLink);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                lVar.invoke(deepLink);
                break;
            default:
                lVar.invoke(deepLink);
                break;
        }
    }
}
