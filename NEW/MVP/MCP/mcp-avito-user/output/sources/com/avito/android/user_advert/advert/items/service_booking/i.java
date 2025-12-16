package com.avito.android.user_advert.advert.items.service_booking;

import android.view.View;
import com.avito.android.user_advert.advert.items.verification.l;
import com.avito.android.user_adverts.tab_actions.host.items.k;
import com.avito.android.user_adverts.tab_actions.host.items.r;
import com.avito.android.user_adverts_views.advert_item.p;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class i implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f310136b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.a f310137c;

    public /* synthetic */ i(int i12, Y41.a aVar) {
        this.f310136b = i12;
        this.f310137c = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Y41.a aVar = this.f310137c;
        switch (this.f310136b) {
            case 0:
                int i12 = j.f310138f;
                aVar.invoke();
                break;
            case 1:
                int i13 = com.avito.android.user_advert.advert.items.service_subscription_banner.i.f310209h;
                aVar.invoke();
                break;
            case 2:
                int i14 = com.avito.android.user_advert.advert.items.services.i.f310228e;
                if (aVar != null) {
                    aVar.invoke();
                    break;
                }
                break;
            case 3:
                int i15 = com.avito.android.user_advert.advert.items.short_term_rent.action.h.f310240c;
                aVar.invoke();
                break;
            case 4:
                int i16 = l.f310398k;
                aVar.invoke();
                break;
            case 5:
                int i17 = l.f310398k;
                aVar.invoke();
                break;
            case 6:
                int i18 = com.avito.android.user_advert.soa_with_price.blueprint.i.f311879c;
                aVar.invoke();
                break;
            case 7:
                aVar.invoke();
                break;
            case 8:
                int i19 = com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.suggestion.e.f312962c;
                aVar.invoke();
                break;
            case 9:
                if (aVar != null) {
                    aVar.invoke();
                    break;
                }
                break;
            case 10:
                int i22 = k.f314334g;
                aVar.invoke();
                break;
            case 11:
                int i23 = r.f314348h;
                aVar.invoke();
                break;
            case 12:
                int i24 = p.f316523F0;
                aVar.invoke();
                break;
            case 13:
                int i25 = p.f316523F0;
                aVar.invoke();
                break;
            case 14:
                int i26 = p.f316523F0;
                aVar.invoke();
                break;
            case 15:
                int i27 = p.f316523F0;
                aVar.invoke();
                break;
            case 16:
                int i28 = p.f316523F0;
                aVar.invoke();
                break;
            case 17:
                int i29 = p.f316523F0;
                aVar.invoke();
                break;
            case 18:
                int i32 = com.avito.android.vas_discount.ui.items.button.h.f319728c;
                aVar.invoke();
                break;
            case 19:
                int i33 = com.avito.android.vas_performance.screens.visual.item.item.i.f321075l;
                aVar.invoke();
                break;
            case 20:
                int i34 = com.avito.android.vas_performance.ui.items.applied_services.h.f321576j;
                aVar.invoke();
                break;
            case 21:
                int i35 = com.avito.android.vas_performance.ui.items.applied_services.h.f321576j;
                aVar.invoke();
                break;
            case 22:
                int i36 = com.avito.android.vas_performance.ui.items.button.h.f321613c;
                aVar.invoke();
                break;
            case 23:
                int i37 = com.avito.android.vas_performance.ui.items.competitive_vas_info_action.i.f321659d;
                aVar.invoke();
                break;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                int i38 = com.avito.android.vas_performance.ui.items.info_action.i.f321707d;
                aVar.invoke();
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                int i39 = com.avito.android.vas_performance.ui.items.vas.i.f321808i;
                aVar.invoke();
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                int i42 = com.avito.android.vas_planning.item.date_time.l.f322385h;
                aVar.invoke();
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                int i43 = com.avito.android.vas_planning.item.date_time.l.f322385h;
                aVar.invoke();
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                int i44 = com.avito.android.vas_planning.item.date_time.l.f322385h;
                aVar.invoke();
                break;
            default:
                int i45 = com.avito.android.vas_planning.item.date_time.l.f322385h;
                aVar.invoke();
                break;
        }
    }
}
