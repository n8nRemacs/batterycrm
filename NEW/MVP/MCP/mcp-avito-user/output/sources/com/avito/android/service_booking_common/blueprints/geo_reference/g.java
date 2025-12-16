package com.avito.android.service_booking_common.blueprints.geo_reference;

import android.view.View;
import com.avito.android.service_booking_day_settings.daysettings.adapter.k;
import com.avito.android.service_booking_settings.work_hours.item.booking_restrictions.i;
import com.avito.android.service_orders.list.blueprints.banner_item.j;
import com.avito.android.service_orders.list.blueprints.snippet_item.m;
import com.avito.android.settings.adapter.D;
import com.avito.android.settings.adapter.L;
import com.avito.android.settings.adapter.V;
import com.avito.android.short_term_rent.bookingform.items.dotted_text.n;
import com.avito.android.short_term_rent.promo_codes.ui.StrSoftBookingPromoCodesDialogFragment;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f276417b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.a f276418c;

    public /* synthetic */ g(int i12, Y41.a aVar) {
        this.f276417b = i12;
        this.f276418c = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Y41.a aVar = this.f276418c;
        switch (this.f276417b) {
            case 0:
                int i12 = h.f276419e;
                aVar.invoke();
                break;
            case 1:
                int i13 = k.f276744g;
                aVar.invoke();
                break;
            case 2:
                int i14 = k.f276744g;
                aVar.invoke();
                break;
            case 3:
                int i15 = i.f277954f;
                aVar.invoke();
                break;
            case 4:
                int i16 = i.f277954f;
                aVar.invoke();
                break;
            case 5:
                int i17 = com.avito.android.service_booking_settings.work_hours.item.schedule_period.i.f278034e;
                aVar.invoke();
                break;
            case 6:
                int i18 = com.avito.android.service_booking_settings.work_hours.item.schedule_period.i.f278034e;
                aVar.invoke();
                break;
            case 7:
                int i19 = com.avito.android.service_booking_utils.save_schedule_modal.b.f278386d;
                aVar.invoke();
                break;
            case 8:
                int i22 = com.avito.android.service_booking_utils.save_schedule_modal.b.f278386d;
                aVar.invoke();
                break;
            case 9:
                int i23 = j.f279269f;
                aVar.invoke();
                break;
            case 10:
                int i24 = m.f279352m;
                if (aVar != null) {
                    aVar.invoke();
                    break;
                }
                break;
            case 11:
                int i25 = D.f280730e;
                aVar.invoke();
                break;
            case 12:
                int i26 = L.f280742c;
                aVar.invoke();
                break;
            case 13:
                int i27 = V.f280754d;
                aVar.invoke();
                break;
            case 14:
                int i28 = V.f280754d;
                aVar.invoke();
                break;
            case 15:
                aVar.invoke();
                break;
            case 16:
                aVar.invoke();
                break;
            case 17:
                int i29 = com.avito.android.short_term_rent.bookingform.items.button.g.f281480c;
                aVar.invoke();
                break;
            case 18:
                int i32 = n.f281500c;
                aVar.invoke();
                break;
            case 19:
                StrSoftBookingPromoCodesDialogFragment.a aVar2 = StrSoftBookingPromoCodesDialogFragment.f282484m0;
                aVar.invoke();
                break;
            case 20:
                aVar.invoke();
                break;
            case 21:
                aVar.invoke();
                break;
            case 22:
                aVar.invoke();
                break;
            case 23:
                aVar.invoke();
                break;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                int i33 = com.avito.android.shortcut_navigation_bar.adapter.tag.i.f283360c;
                aVar.invoke();
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                int i34 = com.avito.android.stories.view.story_banner.d.f285341i;
                aVar.invoke();
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                aVar.invoke();
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                int i35 = com.avito.android.str_booking.ui.details.i.f286004e;
                aVar.invoke();
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                int i36 = com.avito.android.str_booking.ui.info.k.f286060l;
                aVar.invoke();
                break;
            default:
                int i37 = com.avito.android.str_booking.ui.info.k.f286060l;
                aVar.invoke();
                break;
        }
    }
}
