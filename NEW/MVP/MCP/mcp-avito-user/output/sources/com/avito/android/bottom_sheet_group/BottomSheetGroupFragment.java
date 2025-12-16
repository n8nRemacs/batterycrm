package com.avito.android.bottom_sheet_group;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.bottom_sheet_group.BottomSheetGroupParameterWrapper;
import com.avito.android.bottom_sheet_group.di.a;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.remote.model.category_parameters.BottomSheetGroupParameter;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35835l0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BottomSheetGroupFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/bottom_sheet_group/BottomSheetGroupFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$a;", "Lcom/avito/android/bottom_sheet_group/u;", "<init>", "()V", "_avito_bottom-sheet-group_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BottomSheetGroupFragment extends BaseDialogFragment implements InterfaceC28477j.a, u {

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public a f107180h0;

    /* renamed from: i0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.a f107181i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.h f107182j0;

    public BottomSheetGroupFragment() {
        super(0, 1, null);
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@Y61.l Bundle bundle) {
        BottomSheetGroupParameterWrapper.ParameterState parameterState = bundle != null ? (BottomSheetGroupParameterWrapper.ParameterState) bundle.getParcelable("parameter_state") : null;
        BottomSheetGroupParameter bottomSheetGroupParameter = (BottomSheetGroupParameter) requireArguments().getParcelable("bottom_sheet_group_parameter");
        a.InterfaceC3206a interfaceC3206aA = com.avito.android.bottom_sheet_group.di.q.a();
        interfaceC3206aA.a((com.avito.android.bottom_sheet_group.di.b) C29972i.a(C29972i.b(this), com.avito.android.bottom_sheet_group.di.b.class));
        interfaceC3206aA.e(parameterState);
        interfaceC3206aA.d(bottomSheetGroupParameter);
        interfaceC3206aA.b(getResources());
        interfaceC3206aA.build().a(this);
    }

    @Override // androidx.fragment.app.DialogFragment
    @Y61.k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        String title = ((BottomSheetGroupParameter) requireArguments().getParcelable("bottom_sheet_group_parameter")).getTitle();
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, requireContext(), Integer.valueOf(R.style.Theme_DesignSystem_Re23)), R.style.Re23_BottomSheet_Default);
        dVar.A(R.layout.bottom_sheet_group_list, R.layout.select_main_button);
        dVar.T();
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, title, true, true, 2);
        dVar.setCancelable(true);
        dVar.S(C35835l0.i(dVar.getContext()).heightPixels);
        dVar.K(true);
        dVar.J(true);
        dVar.setCanceledOnTouchOutside(true);
        dVar.setOnDismissListener(new o(0));
        View viewFindViewById = dVar.findViewById(R.id.bottom_sheet_group_container);
        com.avito.konveyor.adapter.h hVar = this.f107182j0;
        com.avito.konveyor.adapter.h hVar2 = hVar != null ? hVar : null;
        com.avito.konveyor.a aVar = this.f107181i0;
        n nVar = new n(viewFindViewById, aVar != null ? aVar : null, hVar2, (Button) dVar.findViewById(R.id.main_button), (TextView) dVar.findViewById(R.id.bottom_sheet_action_button));
        a aVar2 = this.f107180h0;
        if (aVar2 == null) {
            aVar2 = null;
        }
        aVar2.b(nVar);
        a aVar3 = this.f107180h0;
        (aVar3 != null ? aVar3 : null).a(this);
        return dVar;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        a aVar = this.f107180h0;
        if (aVar == null) {
            aVar = null;
        }
        aVar.c0();
        a aVar2 = this.f107180h0;
        (aVar2 != null ? aVar2 : null).e0();
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        super.onSaveInstanceState(bundle);
        a aVar = this.f107180h0;
        if (aVar == null) {
            aVar = null;
        }
        bundle.putParcelable("parameter_state", aVar.d0());
    }
}
