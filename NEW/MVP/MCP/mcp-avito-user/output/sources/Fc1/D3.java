package Fc1;

import AA.a;
import QI.a;
import TI.a;
import VI.a;
import android.content.DialogInterface;
import com.avito.android.auto_select.contact_me.AutoSelectContactMeBottomSheetFragment;
import com.avito.android.hotel_booking.enter_data.EnterDataFragment;
import com.avito.android.hotel_booking.select_radio.SelectRadioFragment;
import com.avito.android.hotel_booking.select_single_value.SelectSingleValueFragment;
import com.avito.android.iac_problems.impl_module.miui_permission.IacMiuiPermissionBottomSheetDialogResult;
import com.avito.android.iac_problems.impl_module.miui_permission.IacMiuiPermissionBottomSheetFragment;
import com.avito.android.iac_problems.impl_module.problems_bottom_sheet.IacProblemBottomSheetDialogResult;
import com.avito.android.iac_problems.impl_module.problems_bottom_sheet.IacProblemsBottomSheetFragment;
import com.avito.android.messenger.conversation.mvi.menu.t;
import com.avito.android.str_seller_orders.orders_filters.StrOrdersFiltersFragment;
import com.vk.api.sdk.ui.VKCaptchaActivity;
import com.vk.api.sdk.ui.VKConfirmationActivity;
import gf.InterfaceC40670a;
import kotlin.collections.C42784z0;
import qz0.InterfaceC47467a;
import v31.C49159a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class D3 implements DialogInterface.OnCancelListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4848b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4849c;

    public /* synthetic */ D3(Object obj, int i12) {
        this.f4848b = i12;
        this.f4849c = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Object obj = this.f4849c;
        switch (this.f4848b) {
            case 0:
                E3 e32 = (E3) obj;
                e32.f4909l.setValue(Boolean.FALSE);
                e32.f4905h.show();
                break;
            case 1:
                VKCaptchaActivity.a aVar = VKCaptchaActivity.f366692e;
                VKCaptchaActivity vKCaptchaActivity = (VKCaptchaActivity) obj;
                VKCaptchaActivity.f366693f = null;
                com.vk.api.sdk.utils.o.f366748a.getClass();
                com.vk.api.sdk.utils.o.b();
                vKCaptchaActivity.setResult(0);
                vKCaptchaActivity.finish();
                break;
            case 2:
                VKConfirmationActivity.f366698c = false;
                ((VKConfirmationActivity) obj).finish();
                break;
            case 3:
                AutoSelectContactMeBottomSheetFragment.a aVar2 = AutoSelectContactMeBottomSheetFragment.f95928m0;
                ((AutoSelectContactMeBottomSheetFragment) obj).f5().accept(InterfaceC40670a.C11218a.f396668a);
                break;
            case 4:
                int i12 = com.avito.android.crm_candidates.view.dialogs.h.f129989E;
                ((com.avito.konveyor.adapter.d) obj).l(C42784z0.f406748b, null);
                break;
            case 5:
                com.avito.android.extended_profile_map.w wVar = (com.avito.android.extended_profile_map.w) obj;
                wVar.f151337k = null;
                wVar.f151331e.invoke(a.f.f165a);
                break;
            case 6:
                ((com.avito.android.extended_profile_map.bottom_sheet.f) obj).b();
                break;
            case 7:
                EnterDataFragment.a aVar3 = EnterDataFragment.f163474n0;
                ((EnterDataFragment) obj).f5().accept(a.b.f13655a);
                break;
            case 8:
                SelectRadioFragment.a aVar4 = SelectRadioFragment.f163976n0;
                ((SelectRadioFragment) obj).g5().accept(a.b.f15514a);
                break;
            case 9:
                SelectSingleValueFragment.a aVar5 = SelectSingleValueFragment.f164053n0;
                ((SelectSingleValueFragment) obj).f5().accept(a.b.f17049a);
                break;
            case 10:
                IacMiuiPermissionBottomSheetFragment.a aVar6 = IacMiuiPermissionBottomSheetFragment.f168779j0;
                ((IacMiuiPermissionBottomSheetFragment) obj).f5(IacMiuiPermissionBottomSheetDialogResult.Closed.f168777c);
                break;
            case 11:
                IacProblemsBottomSheetFragment.a aVar7 = IacProblemsBottomSheetFragment.f168849t0;
                ((IacProblemsBottomSheetFragment) obj).f5(IacProblemBottomSheetDialogResult.f168845b);
                break;
            case 12:
                ((com.avito.android.location_list.k0) obj).f182065l.accept(kotlin.G0.f406611a);
                break;
            case 13:
                Y41.a<kotlin.G0> aVar8 = ((com.avito.android.messenger.channels.mvi.view.H) obj).f188657E;
                if (aVar8 != null) {
                    aVar8.invoke();
                    break;
                }
                break;
            case 14:
                ((t.e.c) obj).f191532c.invoke();
                break;
            case 15:
                ((com.avito.android.messenger.conversation.mvi.message_menu.t) obj).f191812e.accept(kotlin.G0.f406611a);
                break;
            case 16:
                ((com.avito.android.messenger.conversation.mvi.send.Q0) obj).f194356I.accept(kotlin.G0.f406611a);
                break;
            case 17:
                int i13 = com.avito.android.parameters_sheet.d.f210694K;
                ((com.avito.android.parameters_sheet.d) obj).dismiss();
                break;
            case 18:
                StrOrdersFiltersFragment.a aVar9 = StrOrdersFiltersFragment.f289101n0;
                ((StrOrdersFiltersFragment) obj).f5().accept(InterfaceC47467a.b.f429541a);
                break;
            case 19:
                ru.cyberity.cbr.camera.video.presentation.a.a((ru.cyberity.cbr.camera.video.presentation.a) obj, dialogInterface);
                break;
            case 20:
                ru.cyberity.cbr.presentation.screen.verification.a.a((ru.cyberity.cbr.presentation.screen.verification.a) obj, dialogInterface);
                break;
            default:
                C49159a c49159a = (C49159a) obj;
                C13697p1 c13697p1 = c49159a.f440438l;
                c13697p1.f5742a.clear();
                c13697p1.f5743b.clear();
                c49159a.f440433g.a();
                break;
        }
    }
}
