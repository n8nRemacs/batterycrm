package com.avito.android.serp.adapter.serp_advert_card;

import android.view.View;
import com.avito.android.photo_list_view_groups.image_with_group_error.ImageWithGroupError;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.text.DecimalFormat;
import kotlin.jvm.internal.N;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class A implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f271721b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ N f271722c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ A(int i12, Y41.a aVar) {
        this.f271721b = i12;
        this.f271722c = (N) aVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.a, Y41.l, kotlin.jvm.internal.N] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ?? r02 = this.f271722c;
        switch (this.f271721b) {
            case 0:
                DecimalFormat decimalFormat = B.f271723i0;
                r02.invoke();
                break;
            case 1:
                DecimalFormat decimalFormat2 = B.f271723i0;
                r02.invoke();
                break;
            case 2:
                int i12 = com.avito.android.serp.adapter.video_snippet.d.f273692i;
                r02.invoke();
                break;
            case 3:
                int i13 = com.avito.android.service_booking_common.blueprints.check_price_list.p.f276262h;
                r02.invoke();
                break;
            case 4:
                int i14 = com.avito.android.service_booking_common.blueprints.contact.j.f276306i;
                r02.invoke();
                break;
            case 5:
                int i15 = com.avito.android.service_booking_common.blueprints.date.date_list.j.f276345f;
                r02.invoke();
                break;
            case 6:
                int i16 = com.avito.android.service_booking_common.blueprints.date.timeslot_list.i.f276403g;
                r02.invoke();
                break;
            case 7:
                r02.invoke(view);
                break;
            case 8:
                int i17 = com.avito.android.service_orders.list.blueprints.management_panels.j.f279324f;
                r02.invoke();
                break;
            case 9:
                int i18 = com.avito.android.service_orders.list.blueprints.management_panels.j.f279324f;
                r02.invoke();
                break;
            case 10:
                int i19 = com.avito.android.service_orders.list.blueprints.snippet_item.m.f279352m;
                r02.invoke();
                break;
            case 11:
                int i22 = com.avito.android.service_orders.list.blueprints.snippet_item.m.f279352m;
                r02.invoke();
                break;
            case 12:
                int i23 = com.avito.android.short_term_rent.bookingform.promocode.promocodeitem.m.f282210g;
                r02.invoke();
                break;
            case 13:
                int i24 = com.avito.android.shortcut_navigation_bar.adapter.category_node.d.f283265e;
                r02.invoke();
                break;
            case 14:
                int i25 = com.avito.android.shortcut_navigation_bar.adapter.category_node.h.f283275e;
                r02.invoke();
                break;
            case 15:
                int i26 = com.avito.android.shortcut_navigation_bar.adapter.horizontal_chips.g.f283292f;
                r02.invoke();
                break;
            case 16:
                int i27 = com.avito.android.shortcut_navigation_bar.adapter.horizontal_chips.u.f283324f;
                r02.invoke();
                break;
            case 17:
                int i28 = com.avito.android.str_calendar.seller.calandar_parameters.items.dialog.g.f287123e;
                r02.invoke();
                break;
            case 18:
                int i29 = com.avito.android.tariff_lf_constructor.configure.checkbox_selector.group.o.f299521i;
                r02.invoke();
                break;
            case 19:
                int i32 = com.avito.android.trx_promo_goods.screens.configure.item.discount_v2.k.f303534h;
                r02.invoke();
                break;
            case 20:
                int i33 = com.avito.android.trx_promo_impl.item.discount_v2.k.f304284h;
                r02.invoke();
                break;
            case 21:
                int i34 = com.avito.android.user_advert.advert.items.actions_item.m.f309046f;
                r02.invoke();
                break;
            case 22:
                r02.invoke();
                break;
            case 23:
                int i35 = com.avito.android.verification.inn.list.select.k.f324093e;
                r02.invoke();
                break;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                r02.invoke(view);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                r02.invoke();
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                int i36 = ImageWithGroupError.f218571j;
                r02.invoke();
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                r02.invoke();
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                r02.invoke();
                break;
            default:
                r02.invoke();
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ A(int i12, Y41.l lVar) {
        this.f271721b = i12;
        this.f271722c = (N) lVar;
    }
}
