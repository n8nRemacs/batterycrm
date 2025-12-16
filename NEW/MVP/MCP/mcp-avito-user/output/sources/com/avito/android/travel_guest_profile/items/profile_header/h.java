package com.avito.android.travel_guest_profile.items.profile_header;

import android.view.View;
import com.avito.android.upload_doc.view.document.j;
import com.avito.android.user_address.list.view.SingleAddressItemView;
import com.avito.android.user_advert.advert.items.promo_block_feed.k;
import com.avito.android.user_advert.advert.items.realty.verification.l;
import com.avito.android.user_advert.advert.items.reject.n;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f302095b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.a f302096c;

    public /* synthetic */ h(int i12, Y41.a aVar) {
        this.f302095b = i12;
        this.f302096c = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Y41.a aVar = this.f302096c;
        switch (this.f302095b) {
            case 0:
                int i12 = i.f302097k;
                aVar.invoke();
                break;
            case 1:
                int i13 = com.avito.android.travel_payment_selector.view.items.description.i.f302750e;
                if (aVar != null) {
                    aVar.invoke();
                    break;
                }
                break;
            case 2:
                int i14 = com.avito.android.trx_promo_goods.screens.configure.item.date.i.f303515d;
                aVar.invoke();
                break;
            case 3:
                int i15 = com.avito.android.ui.widget.tagged_input.d.f304705c;
                aVar.invoke();
                break;
            case 4:
                int i16 = j.f307036h;
                aVar.invoke();
                break;
            case 5:
                int i17 = j.f307036h;
                aVar.invoke();
                break;
            case 6:
                int i18 = j.f307036h;
                aVar.invoke();
                break;
            case 7:
                int i19 = SingleAddressItemView.f307425e;
                aVar.invoke();
                break;
            case 8:
                int i22 = com.avito.android.user_address.list.view.recycler.address.j.f307475f;
                aVar.invoke();
                break;
            case 9:
                int i23 = com.avito.android.user_address.list.view.recycler.address.j.f307475f;
                aVar.invoke();
                break;
            case 10:
                aVar.invoke();
                break;
            case 11:
                int i24 = com.avito.android.user_advert.advert.items.address.j.f309077d;
                aVar.invoke();
                break;
            case 12:
                int i25 = com.avito.android.user_advert.advert.items.alert_banner.j.f309196c;
                aVar.invoke();
                break;
            case 13:
                int i26 = com.avito.android.user_advert.advert.items.alert_banner.j.f309196c;
                aVar.invoke();
                break;
            case 14:
                int i27 = com.avito.android.user_advert.advert.items.contacts_bbl.e.f309329e;
                aVar.invoke();
                break;
            case 15:
                int i28 = com.avito.android.user_advert.advert.items.fill_parameters_banner.d.f309397e;
                if (aVar != null) {
                    aVar.invoke();
                    break;
                }
                break;
            case 16:
                int i29 = com.avito.android.user_advert.advert.items.job_list_item.i.f309555d;
                aVar.invoke();
                break;
            case 17:
                int i32 = com.avito.android.user_advert.advert.items.multiaddresses.j.f309734i;
                aVar.invoke();
                break;
            case 18:
                int i33 = com.avito.android.user_advert.advert.items.multiaddresses.j.f309734i;
                aVar.invoke();
                break;
            case 19:
                int i34 = com.avito.android.user_advert.advert.items.parameters.i.f309784d;
                aVar.invoke();
                break;
            case 20:
                int i35 = com.avito.android.user_advert.advert.items.portfolio_filled_widget.j.f309818f;
                aVar.invoke();
                break;
            case 21:
                int i36 = com.avito.android.user_advert.advert.items.premier_partner_promo.j.f309834h;
                aVar.invoke();
                break;
            case 22:
                int i37 = k.f309876h;
                aVar.invoke();
                break;
            case 23:
                int i38 = l.f309971h;
                aVar.invoke();
                break;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                int i39 = l.f309971h;
                aVar.invoke();
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                int i42 = com.avito.android.user_advert.advert.items.reject.e.f309992e;
                if (aVar != null) {
                    aVar.invoke();
                    break;
                }
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                int i43 = n.f310009i;
                if (aVar != null) {
                    aVar.invoke();
                    break;
                }
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                int i44 = com.avito.android.user_advert.advert.items.safe_deal_services.list.i.f310061c;
                aVar.invoke();
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                int i45 = com.avito.android.user_advert.advert.items.safe_show.i.f310090c;
                aVar.invoke();
                break;
            default:
                int i46 = com.avito.android.user_advert.advert.items.sales_contract.i.f310115c;
                aVar.invoke();
                break;
        }
    }
}
