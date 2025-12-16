package com.avito.android.vas_planning.remove;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import bM0.C25532d;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.modal.a;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.vas_planning.remove.f;
import io.reactivex.rxjava3.core.z;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: VasPlannerRemoveDialogFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/vas_planning/remove/VasPlannerRemoveDialogFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"DS_TCH_BDGT_ARCHITECTURE [Forbidden]", "DS_TCH_BDGT_ARCHITECTURE [Deprecated]"})
/* loaded from: classes5.dex */
public final class VasPlannerRemoveDialogFragment extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public o f322469h0;

    /* renamed from: i0, reason: collision with root package name */
    @Inject
    public m f322470i0;

    /* compiled from: VasPlannerRemoveDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/design/modal/a$b;", "Landroid/content/DialogInterface;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/modal/a$b;Landroid/content/DialogInterface;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<a.b, DialogInterface, G0> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(a.b bVar, DialogInterface dialogInterface) {
            a.b bVar2 = bVar;
            final VasPlannerRemoveDialogFragment vasPlannerRemoveDialogFragment = VasPlannerRemoveDialogFragment.this;
            m mVar = vasPlannerRemoveDialogFragment.f322470i0;
            if (mVar == null) {
                mVar = null;
            }
            bVar2.setTitle(mVar.f322496a.getString(R.string.vas_planning_remove_dialog_title));
            bVar2.setButtonsOrientation(1);
            m mVar2 = vasPlannerRemoveDialogFragment.f322470i0;
            if (mVar2 == null) {
                mVar2 = null;
            }
            bVar2.setSubtitle(mVar2.f322496a.getString(R.string.vas_planning_remove_dialog_subtitle, mVar2.f322497b.f322474d));
            m mVar3 = vasPlannerRemoveDialogFragment.f322470i0;
            if (mVar3 == null) {
                mVar3 = null;
            }
            bVar2.Q3(mVar3.f322496a.getString(R.string.vas_planning_remove_dialog_primary_action), new View.OnClickListener() { // from class: com.avito.android.vas_planning.remove.d
                /* JADX WARN: Type inference failed for: r6v5, types: [io.reactivex.rxjava3.disposables.d, java.lang.Object] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Button button = view instanceof Button ? (Button) view : null;
                    if (button != null) {
                        button.setLoading(true);
                    }
                    o oVar = vasPlannerRemoveDialogFragment.f322469h0;
                    o oVar2 = oVar != null ? oVar : null;
                    if (oVar2.f322502M.getF318621e()) {
                        VasPlannerRemoveInfo vasPlannerRemoveInfo = oVar2.f322498E;
                        String str = vasPlannerRemoveInfo.f322472b;
                        String str2 = vasPlannerRemoveInfo.f322475e;
                        String str3 = vasPlannerRemoveInfo.f322473c;
                        oVar2.f322501L.c(new XL0.a(str, str2, str3));
                        z<TypedResult<C25532d>> zVarF = oVar2.f322500K.a(vasPlannerRemoveInfo.f322472b, str3).F();
                        InterfaceC35745a5 interfaceC35745a5 = oVar2.f322499J;
                        oVar2.f322502M = zVarF.x0(interfaceC35745a5.a()).j0(interfaceC35745a5.e()).v0(new p(oVar2), new q(oVar2), io.reactivex.rxjava3.internal.functions.a.f401993c);
                    }
                }
            });
            m mVar4 = vasPlannerRemoveDialogFragment.f322470i0;
            bVar2.M3((mVar4 != null ? mVar4 : null).f322496a.getString(R.string.vas_planning_remove_dialog_secondary_action), new e(vasPlannerRemoveDialogFragment));
            return G0.f406611a;
        }
    }

    public VasPlannerRemoveDialogFragment() {
        super(0, 1, null);
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        VasPlannerRemoveInfo vasPlannerRemoveInfo = (VasPlannerRemoveInfo) (arguments == null ? null : Build.VERSION.SDK_INT >= 33 ? (Parcelable) arguments.getParcelable("vas_plan_remove_info_arg", VasPlannerRemoveInfo.class) : arguments.getParcelable("vas_plan_remove_info_arg"));
        if (vasPlannerRemoveInfo == null) {
            throw new IllegalStateException("vas_plan_remove_info_arg must be set");
        }
        com.avito.android.vas_planning.remove.di.a.a().a(requireActivity(), vasPlannerRemoveInfo, (com.avito.android.vas_planning.remove.di.c) C29972i.a(C29972i.b(this), com.avito.android.vas_planning.remove.di.c.class)).a(this);
        o oVar = this.f322469h0;
        (oVar != null ? oVar : null).f322504O.observe(requireActivity(), new f.a(new c(this)));
    }

    @Override // androidx.fragment.app.DialogFragment
    @Y61.k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        return a.C5284a.c(com.avito.android.lib.design.modal.a.f179704d, requireContext(), new a());
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@Y61.k DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (requireActivity().isChangingConfigurations()) {
            return;
        }
        requireActivity().finish();
    }
}
