package Fc1;

import Lx.InterfaceC14447b;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.view.C22823h0;
import com.avito.android.early_access.EarlyAccessDialog;
import com.avito.android.early_access.entities.ReEarlyAccessData;
import com.avito.android.lib.design.progress_bar.ProgressBar;
import com.avito.android.mnz_common.ui.TariffCountBar;
import com.avito.android.paid_services.routing.BarInfo;
import com.avito.android.paid_services.routing.ProgressState;
import com.avito.android.services_transportation_widget.location_sheet.ServiceTransportationLocationSheet;
import com.avito.android.tariff.dialog.TariffDialogFragment;
import com.google.android.material.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: R8$$SyntheticClass */
/* renamed from: Fc1.j6, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class DialogInterfaceOnShowListenerC13648j6 implements DialogInterface.OnShowListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5608a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5609b;

    public /* synthetic */ DialogInterfaceOnShowListenerC13648j6(Object obj, int i12) {
        this.f5608a = i12;
        this.f5609b = obj;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        com.avito.android.lib.design.bottom_sheet.d dVar;
        View currentFocus;
        BarInfo barInfo;
        Float f12;
        Object obj = this.f5609b;
        switch (this.f5608a) {
            case 0:
                int i12 = DialogC13657k6.f5629t;
                DialogC13657k6 dialogC13657k6 = (DialogC13657k6) obj;
                dialogC13657k6.s().b(3);
                Window window = dialogC13657k6.getWindow();
                if (window != null) {
                    if (Build.VERSION.SDK_INT < 30) {
                        window.setSoftInputMode(16);
                        break;
                    } else {
                        C22823h0.K(window.getDecorView(), new AK.c(8));
                        break;
                    }
                }
                break;
            case 1:
                int i13 = ru.mts.biometry.sdk.feature.passport.ui.address.f.f436482i0;
                View viewFindViewById = ((com.google.android.material.bottomsheet.h) dialogInterface).findViewById(R.id.design_bottom_sheet);
                if (viewFindViewById != null) {
                    BottomSheetBehavior bottomSheetBehaviorB = BottomSheetBehavior.B(viewFindViewById);
                    ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
                    ru.mts.biometry.sdk.feature.passport.ui.address.f fVar = (ru.mts.biometry.sdk.feature.passport.ui.address.f) obj;
                    layoutParams.height = fVar.getResources().getDisplayMetrics().heightPixels - ru.mts.biometry.sdk.feature.passport.ui.address.f.f436482i0;
                    viewFindViewById.setLayoutParams(layoutParams);
                    bottomSheetBehaviorB.b(3);
                    bottomSheetBehaviorB.f355974K = true;
                    bottomSheetBehaviorB.f355973J = true;
                    viewFindViewById.setBackgroundColor(androidx.core.content.d.getColor(fVar.requireContext(), android.R.color.transparent));
                    break;
                }
                break;
            case 2:
                ((com.avito.android.realty_agency.inline_filters.location_suggest.a) obj).s();
                break;
            case 3:
                EarlyAccessDialog earlyAccessDialog = (EarlyAccessDialog) obj;
                InterfaceC14447b interfaceC14447b = earlyAccessDialog.f145060l0;
                (interfaceC14447b != null ? interfaceC14447b : null).b(((ReEarlyAccessData) earlyAccessDialog.f145064p0.getValue()).f145322b);
                break;
            case 4:
                ServiceTransportationLocationSheet.a aVar = ServiceTransportationLocationSheet.f280664j0;
                if (dialogInterface != null && (currentFocus = (dVar = (com.avito.android.lib.design.bottom_sheet.d) obj).getCurrentFocus()) != null) {
                    currentFocus.postDelayed(new ServiceTransportationLocationSheet.e(dVar.getWindow(), currentFocus), 100L);
                    break;
                }
                break;
            default:
                TariffDialogFragment.a aVar2 = TariffDialogFragment.f297465j0;
                TariffDialogFragment tariffDialogFragment = (TariffDialogFragment) obj;
                Dialog dialog = tariffDialogFragment.getDialog();
                com.avito.android.lib.design.modal.a aVar3 = dialog instanceof com.avito.android.lib.design.modal.a ? (com.avito.android.lib.design.modal.a) dialog : null;
                long jLongValue = aVar3 != null ? ((Number) aVar3.f179705b.getValue()).longValue() : 0L;
                TariffCountBar tariffCountBar = tariffDialogFragment.f297466h0;
                if (tariffCountBar != null && (barInfo = tariffDialogFragment.f297467i0) != null && (f12 = barInfo.f210615e) != null) {
                    float fFloatValue = f12.floatValue();
                    ProgressState progressState = barInfo.f210616f;
                    if (progressState != null) {
                        com.avito.android.lib.design.progress_bar.e eVar = new com.avito.android.lib.design.progress_bar.e(0L, 0L, jLongValue + 250, 3, null);
                        ProgressBar progressBar = tariffCountBar.f197990e;
                        ProgressBar progressBar2 = progressBar == null ? null : progressBar;
                        int iB2 = tariffCountBar.b(progressState);
                        int iA2 = tariffCountBar.a(progressState);
                        ProgressState progressState2 = barInfo.f210618h;
                        eVar.b(progressBar2, fFloatValue, barInfo.f210617g, iB2, tariffCountBar.b(progressState2), iA2, tariffCountBar.a(progressState2));
                        break;
                    }
                }
                break;
        }
    }
}
