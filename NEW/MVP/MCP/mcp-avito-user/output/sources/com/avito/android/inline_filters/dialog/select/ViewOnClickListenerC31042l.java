package com.avito.android.inline_filters.dialog.select;

import D90.a;
import TP.a;
import android.content.Context;
import android.view.View;
import com.avito.android.deep_linking.links.UserAdvertsLink;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.item_color_picker.ItemColorPicker;
import com.avito.android.lib.design.master_plan_view.MasterPlanView;
import com.avito.android.lib.design.selector_card.SelectorCard;
import com.avito.android.orders.OrdersLink;
import com.avito.android.phone_reverification_info.PhoneReverificationInfoActivity;
import com.avito.android.profile_phones.phones_list.PhonesListFragment;
import com.avito.android.profile_settings_extended.adapter.basic_info_v2.BasicInfoV2ItemView;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.collections.C42784z0;
import y70.InterfaceC50076a;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.inline_filters.dialog.select.l, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* synthetic */ class ViewOnClickListenerC31042l implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f172169b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.l f172170c;

    public /* synthetic */ ViewOnClickListenerC31042l(int i12, Y41.l lVar) {
        this.f172169b = i12;
        this.f172170c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i12 = 3;
        String str = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Y41.l lVar = this.f172170c;
        switch (this.f172169b) {
            case 0:
                lVar.invoke(C42784z0.f406748b);
                break;
            case 1:
                lVar.invoke(C42784z0.f406748b);
                break;
            case 2:
                int i13 = com.avito.android.job.cv_info_actualization.ui.items.error.g.f174267f;
                lVar.invoke(a.AbstractC1070a.c.f15649a);
                break;
            case 3:
                lVar.invoke(view);
                break;
            case 4:
                lVar.invoke(view);
                break;
            case 5:
                int i14 = Chips.f178664L;
                lVar.invoke(view);
                break;
            case 6:
                Class<Context>[] clsArr = ComponentContainer.f178840r;
                if (lVar != null) {
                    lVar.invoke(view);
                    break;
                }
                break;
            case 7:
                int i15 = ItemColorPicker.f179422A;
                lVar.invoke(view);
                break;
            case 8:
                int i16 = MasterPlanView.f179664q;
                lVar.invoke(view);
                break;
            case 9:
                int i17 = SelectorCard.f180324g;
                lVar.invoke(view);
                break;
            case 10:
                lVar.invoke(view);
                break;
            case 11:
                int i18 = com.avito.android.passport.profile_add.merge.business_vrf_duplication.recycler.i.f212591g;
                lVar.invoke(view);
                break;
            case 12:
                int i19 = PhoneReverificationInfoActivity.f216041v;
                lVar.invoke(InterfaceC50076a.b.f442944a);
                break;
            case 13:
                int i22 = com.avito.android.profile.pro.impl.screen.item.avatar.g.f222995e;
                lVar.invoke(a.C13378b.f2980a);
                break;
            case 14:
                int i23 = com.avito.android.profile.pro.impl.screen.item.dashboard.g.f223087h;
                lVar.invoke(new a.h(new UserAdvertsLink(objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, i12, objArr == true ? 1 : 0)));
                break;
            case 15:
                int i24 = com.avito.android.profile.pro.impl.screen.item.dashboard.g.f223087h;
                lVar.invoke(new a.h(new OrdersLink(str, objArr5 == true ? 1 : 0, i12, objArr4 == true ? 1 : 0)));
                break;
            case 16:
                int i25 = com.avito.android.profile.pro.impl.screen.item.dashboard_list_item.g.f223138m;
                lVar.invoke(a.e.f2986a);
                break;
            case 17:
                PhonesListFragment.a aVar = PhonesListFragment.f227380K0;
                lVar.invoke(view);
                break;
            case 18:
                int i26 = com.avito.android.profile_settings_basic.adapter.setting_item.h.f228700h;
                lVar.invoke(view);
                break;
            case 19:
                int i27 = com.avito.android.profile_settings_extended.adapter.basic_info_v2.h.f229261q;
                lVar.invoke(BasicInfoV2ItemView.ClickType.f229243b);
                break;
            case 20:
                int i28 = com.avito.android.profile_settings_extended.adapter.basic_info_v2.h.f229261q;
                lVar.invoke(BasicInfoV2ItemView.ClickType.f229244c);
                break;
            case 21:
                int i29 = com.avito.android.profile_settings_extended.adapter.basic_info_v2.h.f229261q;
                lVar.invoke(BasicInfoV2ItemView.ClickType.f229245d);
                break;
            case 22:
                int i32 = com.avito.android.profile_settings_extended.adapter.basic_info_v2.h.f229261q;
                lVar.invoke(BasicInfoV2ItemView.ClickType.f229246e);
                break;
            case 23:
                int i33 = com.avito.android.profile_settings_extended.adapter.basic_info_v2.h.f229261q;
                lVar.invoke(BasicInfoV2ItemView.ClickType.f229247f);
                break;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                int i34 = com.avito.android.profile_settings_extended.adapter.basic_info_v2.h.f229261q;
                lVar.invoke(BasicInfoV2ItemView.ClickType.f229248g);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                int i35 = com.avito.android.profile_settings_extended.adapter.setting.l.f229858f;
                lVar.invoke(view);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                lVar.invoke(view);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                int i36 = com.avito.android.profile_vk_linking.group_management.adapter.group.i.f231110h;
                lVar.invoke(view);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                int i37 = com.avito.android.profile_vk_linking.group_management.adapter.group.i.f231110h;
                lVar.invoke(view);
                break;
            default:
                lVar.invoke(view);
                break;
        }
    }
}
