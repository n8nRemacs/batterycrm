package com.avito.android.seller_promotions;

import Bt0.InterfaceC13184a;
import Gy0.InterfaceC13931a;
import Hs0.InterfaceC14030a;
import NM0.a;
import Nt0.InterfaceC14610a;
import Oq0.d;
import QE0.a;
import QM0.a;
import RJ0.a;
import UM0.a;
import YM0.a;
import Zy0.InterfaceC19622a;
import android.view.View;
import bt0.InterfaceC25709a;
import com.avito.android.lib.design.list_item.ListItemSwitcher;
import com.avito.android.seller_promotions.SellerPromotionsFragment;
import com.avito.android.service_booking_calendar.day.schedule.DayScheduleFragment;
import com.avito.android.service_booking_day_settings.daysettings.DaySettingsFragment;
import com.avito.android.str_calendar.seller.calandar_parameters.StrCalendarParametersFragment;
import com.avito.android.str_insurance.screen.StrInsuranceFragment;
import com.avito.android.tariff.cpr.configure.advance.manual.CprConfigureAdvanceManualFragment;
import com.avito.android.travel_guest_profile.TravelGuestProfileFragment;
import com.avito.android.vas_performance.ui.items.competitive_vas.c;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import jt0.InterfaceC42425a;
import yt0.InterfaceC50300a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f267667b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.l f267668c;

    public /* synthetic */ b(int i12, Y41.l lVar) {
        this.f267667b = i12;
        this.f267668c = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Y41.l lVar = this.f267668c;
        switch (this.f267667b) {
            case 0:
                SellerPromotionsFragment.a aVar = SellerPromotionsFragment.f267623A0;
                lVar.invoke(d.e.f12583a);
                break;
            case 1:
                lVar.invoke(InterfaceC14030a.b.f7779a);
                break;
            case 2:
                lVar.invoke(InterfaceC14030a.l.f7789a);
                break;
            case 3:
                lVar.invoke(InterfaceC14030a.b.f7779a);
                break;
            case 4:
                int i12 = com.avito.android.service_booking_additional_settings.additionalsettings.recyclerview.item.booking_toggle.h.f275101d;
                lVar.invoke(Boolean.valueOf(((ListItemSwitcher) view).isChecked()));
                break;
            case 5:
                DayScheduleFragment.Companion companion = DayScheduleFragment.f275256y0;
                lVar.invoke(InterfaceC25709a.C2021a.f57518a);
                break;
            case 6:
                lVar.invoke(InterfaceC42425a.c.f405870a);
                break;
            case 7:
                DaySettingsFragment.a aVar2 = DaySettingsFragment.f276691v0;
                lVar.invoke(InterfaceC50300a.e.f443573a);
                break;
            case 8:
                lVar.invoke(InterfaceC50300a.g.f443575a);
                break;
            case 9:
                lVar.invoke(InterfaceC50300a.h.f443576a);
                break;
            case 10:
                lVar.invoke(InterfaceC13184a.g.f1759a);
                break;
            case 11:
                lVar.invoke(new InterfaceC14610a.d(false, 1, null));
                break;
            case 12:
                StrCalendarParametersFragment.a aVar3 = StrCalendarParametersFragment.f286684D0;
                lVar.invoke(InterfaceC13931a.C13933c.f6811a);
                break;
            case 13:
                StrCalendarParametersFragment.a aVar4 = StrCalendarParametersFragment.f286684D0;
                lVar.invoke(InterfaceC13931a.C13932b.f6810a);
                break;
            case 14:
                StrInsuranceFragment.a aVar5 = StrInsuranceFragment.f288620p0;
                lVar.invoke(InterfaceC19622a.c.f20596a);
                break;
            case 15:
                StrInsuranceFragment.a aVar6 = StrInsuranceFragment.f288620p0;
                lVar.invoke(InterfaceC19622a.d.f20597a);
                break;
            case 16:
                StrInsuranceFragment.a aVar7 = StrInsuranceFragment.f288620p0;
                lVar.invoke(InterfaceC19622a.f.f20599a);
                break;
            case 17:
                CprConfigureAdvanceManualFragment.a aVar8 = CprConfigureAdvanceManualFragment.f295324u0;
                lVar.invoke(view);
                break;
            case 18:
                TravelGuestProfileFragment.a aVar9 = TravelGuestProfileFragment.f301839v0;
                lVar.invoke(a.h.f13607a);
                break;
            case 19:
                int i13 = com.avito.android.user_address.suggest.view.recycler.h.f308183c;
                lVar.invoke(view);
                break;
            case 20:
                int i14 = com.avito.android.user_stats.extended_user_stats.tabs.expenses.items.total.g.f317780i;
                lVar.invoke(a.p.f14330a);
                break;
            case 21:
                int i15 = com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.sort_split.k.f318096e;
                lVar.invoke(a.l.f14326a);
                break;
            case 22:
                int i16 = com.avito.android.vas_performance.ui.items.competitive_vas.j.f321635l;
                lVar.invoke(c.a.f321619a);
                break;
            case 23:
                int i17 = com.avito.android.vas_performance.ui.items.competitive_vas.j.f321635l;
                lVar.invoke(c.b.f321620a);
                break;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                lVar.invoke(a.b.f11387a);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                lVar.invoke(a.d.f13697a);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                lVar.invoke(a.d.f16356a);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                lVar.invoke(a.C1118a.f16353a);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                lVar.invoke(a.d.f19455a);
                break;
            default:
                int i18 = fG0.d.f395791k;
                lVar.invoke("icon_shashlyk");
                break;
        }
    }
}
