package com.avito.android.vas_planning_checkout.item.checkout;

import android.view.View;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.map_core.view.draw_button.DrawButtonRedesign;
import com.avito.android.map_core.view.find_me.FindMeButton;
import com.avito.android.photo_list_view.re23.image.loading.PublishImageLoading;
import com.avito.android.photo_list_view_groups.image_with_group.ImageWithGroupContent;
import com.avito.android.photo_list_view_groups.image_with_group_loading.ImageWithGroupLoading;
import com.avito.android.service_booking_calendar.flexible.header.view.ScheduleInfoPanelView;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class i implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f322935b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.a f322936c;

    public /* synthetic */ i(int i12, Y41.a aVar) {
        this.f322935b = i12;
        this.f322936c = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Y41.a aVar = this.f322936c;
        switch (this.f322935b) {
            case 0:
                int i12 = j.f322937k;
                aVar.invoke();
                break;
            case 1:
                int i13 = j.f322937k;
                aVar.invoke();
                break;
            case 2:
                int i14 = com.avito.android.vas_union.ui.items.vas_performance_click.i.f323332f;
                aVar.invoke();
                break;
            case 3:
                int i15 = com.avito.android.verification.common.list.button_default.i.f323413c;
                aVar.invoke();
                break;
            case 4:
                int i16 = com.avito.android.verification.common.list.modern_status.g.f323436g;
                aVar.invoke();
                break;
            case 5:
                int i17 = com.avito.android.verification.common.list.verification_group.g.f323469g;
                aVar.invoke();
                break;
            case 6:
                int i18 = com.avito.android.verification.inn.list.button.g.f323930d;
                aVar.invoke();
                break;
            case 7:
                int i19 = com.avito.android.verification.inn.list.disclosure.h.f323973c;
                aVar.invoke();
                break;
            case 8:
                int i22 = com.avito.android.verification.inn.list.group_card.f.f324007f;
                aVar.invoke();
                break;
            case 9:
                int i23 = com.avito.android.verification.inn.list.inn_info.h.f324028e;
                aVar.invoke();
                break;
            case 10:
                int i24 = com.avito.android.verification.list_items.verification_status.i.f324879h;
                aVar.invoke();
                break;
            case 11:
                aVar.invoke();
                break;
            case 12:
                int i25 = com.avito.android.wallet.page.topup.form.items.submit_button_item.g.f328346c;
                aVar.invoke();
                break;
            case 13:
                aVar.invoke();
                break;
            case 14:
                int i26 = com.avito.beduin.v2.component.aspect_ratio.android_view.a.f335493o;
                aVar.invoke();
                break;
            case 15:
                int i27 = com.avito.beduin.v2.component.box.android_view.a.f335548o;
                aVar.invoke();
                break;
            case 16:
                int i28 = com.avito.beduin.v2.component.column.android_view.b.f335597o;
                aVar.invoke();
                break;
            case 17:
                int i29 = com.avito.beduin.v2.component.flexlayout.android_view.b.f335725p;
                aVar.invoke();
                break;
            case 18:
                int i32 = com.avito.beduin.v2.component.row.android_view.c.f336146o;
                aVar.invoke();
                break;
            case 19:
                int i33 = PublishImageLoading.f218254l;
                aVar.invoke();
                break;
            case 20:
                int i34 = fG0.d.f395791k;
                aVar.invoke();
                break;
            case 21:
                int i35 = fG0.d.f395791k;
                aVar.invoke();
                break;
            case 22:
                int i36 = DrawButtonRedesign.f185709g;
                aVar.invoke();
                break;
            case 23:
                int i37 = FindMeButton.f185724b;
                aVar.invoke();
                break;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                aVar.invoke();
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                int i38 = ImageWithGroupContent.f218548m;
                aVar.invoke();
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                int i39 = ImageWithGroupLoading.f218589l;
                aVar.invoke();
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                int i42 = ScheduleInfoPanelView.f276095h;
                aVar.invoke();
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                int i43 = NavBar.f179818g;
                aVar.invoke();
                break;
            default:
                aVar.invoke();
                break;
        }
    }
}
