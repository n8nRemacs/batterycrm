package com.avito.android.tariff.dialog;

import Fc1.DialogInterfaceOnShowListenerC13648j6;
import Y41.p;
import Y61.k;
import Y61.l;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.lib.design.modal.a;
import com.avito.android.mnz_common.ui.TariffCountBar;
import com.avito.android.paid_services.routing.BarInfo;
import com.avito.android.paid_services.routing.DialogInfo;
import com.avito.android.paid_services.routing.ProgressState;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: TariffDialogFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/tariff/dialog/TariffDialogFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TariffDialogFragment extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: j0, reason: collision with root package name */
    @k
    public static final a f297465j0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    @l
    public TariffCountBar f297466h0;

    /* renamed from: i0, reason: collision with root package name */
    @l
    public BarInfo f297467i0;

    /* compiled from: TariffDialogFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff/dialog/TariffDialogFragment$a;", "", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: TariffDialogFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/design/modal/a$b;", "Landroid/content/DialogInterface;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/modal/a$b;Landroid/content/DialogInterface;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements p<a.b, DialogInterface, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ DialogInfo f297468l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ TariffDialogFragment f297469m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(DialogInfo dialogInfo, TariffDialogFragment tariffDialogFragment) {
            super(2);
            this.f297468l = dialogInfo;
            this.f297469m = tariffDialogFragment;
        }

        @Override // Y41.p
        public final G0 invoke(a.b bVar, DialogInterface dialogInterface) {
            a.b bVar2 = bVar;
            DialogInfo dialogInfo = this.f297468l;
            bVar2.setTitle(dialogInfo.f210619b);
            bVar2.setSubtitle(dialogInfo.f210620c);
            TariffDialogFragment tariffDialogFragment = this.f297469m;
            bVar2.N3(dialogInfo.f210621d, new com.avito.android.tariff.dialog.b(tariffDialogFragment));
            TariffCountBar tariffCountBar = tariffDialogFragment.f297466h0;
            if (tariffCountBar != null) {
                bVar2.setCustomView(tariffCountBar);
            }
            bVar2.setCancelable(true);
            return G0.f406611a;
        }
    }

    public TariffDialogFragment() {
        super(0, 1, null);
    }

    @Override // androidx.fragment.app.DialogFragment
    @k
    public final Dialog onCreateDialog(@l Bundle bundle) {
        Float fValueOf;
        ProgressState progressState;
        Bundle arguments = getArguments();
        if (arguments == null) {
            throw new IllegalArgumentException("args must be set");
        }
        DialogInfo dialogInfo = (DialogInfo) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) arguments.getParcelable("dialog_params", DialogInfo.class) : arguments.getParcelable("dialog_params"));
        if (dialogInfo == null) {
            throw new IllegalArgumentException("dialog params must be set");
        }
        BarInfo barInfo = dialogInfo.f210622e;
        this.f297467i0 = barInfo;
        TariffCountBar tariffCountBar = null;
        if (barInfo != null) {
            if (bundle != null || (fValueOf = barInfo.f210615e) == null) {
                fValueOf = Float.valueOf(barInfo.f210617g);
            }
            float fFloatValue = fValueOf.floatValue();
            if (bundle != null || (progressState = barInfo.f210616f) == null) {
                progressState = barInfo.f210618h;
            }
            if (progressState == null) {
                progressState = ProgressState.f210623b;
            }
            TariffCountBar tariffCountBar2 = new TariffCountBar(requireContext(), null, 0, 6, null);
            tariffCountBar2.setTitle(barInfo.f210612b);
            TextView textView = tariffCountBar2.f197989d;
            I5.a(textView != null ? textView : null, barInfo.f210613c, false);
            tariffCountBar2.setDescriptionStatus(barInfo.f210614d);
            tariffCountBar2.setProgress(fFloatValue);
            tariffCountBar2.setProgressState(progressState);
            tariffCountBar = tariffCountBar2;
        }
        this.f297466h0 = tariffCountBar;
        com.avito.android.lib.design.modal.a aVarC = a.C5284a.c(com.avito.android.lib.design.modal.a.f179704d, requireContext(), new b(dialogInfo, this));
        if (bundle == null) {
            aVarC.setOnShowListener(new DialogInterfaceOnShowListenerC13648j6(this, 5));
        }
        return aVarC;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@k DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        ActivityC22955m activityC22955mL1 = l1();
        if (activityC22955mL1 == null || activityC22955mL1.isFinishing() || activityC22955mL1.isChangingConfigurations()) {
            return;
        }
        activityC22955mL1.finish();
    }
}
