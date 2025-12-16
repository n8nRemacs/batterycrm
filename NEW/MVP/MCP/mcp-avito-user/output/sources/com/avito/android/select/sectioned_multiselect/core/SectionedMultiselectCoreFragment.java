package com.avito.android.select.sectioned_multiselect.core;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import androidx.view.InterfaceC23487e;
import aq0.InterfaceC23653b;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.category_parameters.SectionedMultiselectParameter;
import com.avito.android.select.Arguments;
import com.avito.android.select.sectioned_multiselect.core.di.c;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35835l0;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: SectionedMultiselectCoreFragment.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/select/sectioned_multiselect/core/SectionedMultiselectCoreFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/select/o;", "Lcom/avito/android/analytics/screens/j$b;", "Lcom/avito/android/select/sectioned_multiselect/core/a;", "<init>", "()V", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SectionedMultiselectCoreFragment extends BaseDialogFragment implements com.avito.android.select.o, InterfaceC28477j.b, InterfaceC34651a {

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f266536h0;

    /* renamed from: i0, reason: collision with root package name */
    @Inject
    public com.avito.android.recycler.data_aware.c f266537i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f266538j0;

    /* renamed from: k0, reason: collision with root package name */
    @Inject
    public InterfaceC34659i f266539k0;

    /* renamed from: l0, reason: collision with root package name */
    @Inject
    public P f266540l0;

    /* renamed from: m0, reason: collision with root package name */
    public String f266541m0;

    /* renamed from: n0, reason: collision with root package name */
    public String f266542n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f266543o0;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f266544p0;

    /* renamed from: q0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.inline_filters.dialog.n f266545q0;

    /* compiled from: SectionedMultiselectCoreFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            InterfaceC34659i interfaceC34659i = SectionedMultiselectCoreFragment.this.f266539k0;
            if (interfaceC34659i == null) {
                interfaceC34659i = null;
            }
            interfaceC34659i.d();
            return G0.f406611a;
        }
    }

    public SectionedMultiselectCoreFragment() {
        super(0, 1, null);
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@Y61.l Bundle bundle) {
        List<String> radioIds;
        Bundle bundle2 = bundle != null ? bundle.getBundle("presenter_state") : null;
        this.f266544p0 = bundle != null ? bundle.getBoolean("restart_fragment") : false;
        Bundle bundleRequireArguments = requireArguments();
        int i12 = Build.VERSION.SDK_INT;
        SectionedMultiselectParameter sectionedMultiselectParameter = (SectionedMultiselectParameter) (i12 >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("arguments", SectionedMultiselectParameter.class) : bundleRequireArguments.getParcelable("arguments"));
        Bundle bundleRequireArguments2 = requireArguments();
        SearchParams searchParams = (SearchParams) (i12 >= 34 ? (Parcelable) bundleRequireArguments2.getParcelable("params", SearchParams.class) : bundleRequireArguments2.getParcelable("params"));
        if (searchParams == null) {
            searchParams = new SearchParams(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 1, null);
        }
        this.f266541m0 = sectionedMultiselectParameter.getId();
        this.f266542n0 = sectionedMultiselectParameter.getTitle();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (SectionedMultiselectParameter.Value value : sectionedMultiselectParameter.getValues()) {
            arrayList.add(value);
            List<SectionedMultiselectParameter.Value> options = value.getOptions();
            if (options != null) {
                for (SectionedMultiselectParameter.Value value2 : options) {
                    SectionedMultiselectParameter.Displaying displaying = sectionedMultiselectParameter.getDisplaying();
                    if (displaying == null || (radioIds = displaying.getRadioIds()) == null || !radioIds.contains(value2.getId())) {
                        arrayList.add(value2);
                    } else {
                        arrayList2.add(value2);
                    }
                }
            }
        }
        String str = this.f266541m0;
        String str2 = str == null ? null : str;
        C42784z0 c42784z0 = C42784z0.f406748b;
        Arguments arguments = new Arguments(false, str2, null, c42784z0, c42784z0, sectionedMultiselectParameter.getTitle(), null, true, false, false, true, true, false, false, false, null, false, null, null, null, null, false, false, false, false, false, false, false, null, null, searchParams, false, false, null, false, false, requireArguments().getBoolean("sectioned_pagination"), 0, null, null, -1073749179, 239, null);
        c.a aVarA = com.avito.android.select.sectioned_multiselect.core.di.a.a();
        aVarA.d((InterfaceC23653b) C29972i.a(C29972i.b(this), InterfaceC23653b.class));
        aVarA.a(cv.c.b(this));
        aVarA.c(sectionedMultiselectParameter.getId());
        aVarA.q(bundle2);
        aVarA.h(C42745f0.M0(arrayList));
        aVarA.g(requireActivity());
        aVarA.b(getResources());
        Boolean hasSuggest = sectionedMultiselectParameter.getHasSuggest();
        aVarA.f(hasSuggest != null ? hasSuggest.booleanValue() : false);
        com.avito.android.select.p pVarF5 = f5();
        aVarA.e(pVarF5 != null ? pVarF5.E4(arguments) : null);
        aVarA.o(searchParams);
        aVarA.build().a(this);
        if (!this.f266544p0) {
            P p12 = this.f266540l0;
            if (p12 == null) {
                p12 = null;
            }
            p12.p6(false);
        }
        P p13 = this.f266540l0;
        P p14 = p13 != null ? p13 : null;
        arrayList.addAll(arrayList2);
        G0 g02 = G0.f406611a;
        p14.Fd(sectionedMultiselectParameter, C42745f0.M0(arrayList));
    }

    public final com.avito.android.select.p f5() {
        InterfaceC23487e targetFragment = getTargetFragment();
        com.avito.android.select.p pVar = targetFragment instanceof com.avito.android.select.p ? (com.avito.android.select.p) targetFragment : null;
        if (pVar != null) {
            return pVar;
        }
        androidx.core.content.j jVarL1 = l1();
        if (jVarL1 instanceof com.avito.android.select.p) {
            return (com.avito.android.select.p) jVarL1;
        }
        return null;
    }

    public final void g5() {
        dismissAllowingStateLoss();
        com.avito.android.inline_filters.dialog.n nVar = this.f266545q0;
        if (nVar != null) {
            nVar.onDialogClose();
        }
        com.avito.android.select.p pVarF5 = f5();
        if (pVarF5 == null) {
            return;
        }
        String str = this.f266541m0;
        if (str == null) {
            str = null;
        }
        pVarF5.q(str);
    }

    @Override // androidx.fragment.app.DialogFragment
    @Y61.k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, requireContext(), Integer.valueOf(R.style.Theme_DesignSystem_Re23)), R.style.Re23_BottomSheet_Default);
        dVar.A(R.layout.sectioned_multiselect_dialog, R.layout.select_main_button);
        dVar.T();
        String str = this.f266542n0;
        if (str == null) {
            str = null;
        }
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, str, true, true, 2);
        dVar.setCancelable(true);
        dVar.S(C35835l0.i(dVar.getContext()).heightPixels);
        dVar.K(true);
        dVar.J(true);
        dVar.setCanceledOnTouchOutside(true);
        dVar.setOnDismissListener(new com.avito.android.bottom_sheet_group.o(0));
        dVar.R(new a());
        View viewFindViewById = dVar.findViewById(R.id.sections_container);
        com.avito.konveyor.adapter.j jVar = this.f266538j0;
        com.avito.konveyor.adapter.j jVar2 = jVar != null ? jVar : null;
        com.avito.android.recycler.data_aware.c cVar = this.f266537i0;
        C34656f c34656f = new C34656f(viewFindViewById, cVar != null ? cVar : null, jVar2, (Button) dVar.findViewById(R.id.main_button), (TextView) dVar.findViewById(R.id.bottom_sheet_action_button));
        InterfaceC34659i interfaceC34659i = this.f266539k0;
        if (interfaceC34659i == null) {
            interfaceC34659i = null;
        }
        interfaceC34659i.e(this);
        InterfaceC34659i interfaceC34659i2 = this.f266539k0;
        if (interfaceC34659i2 == null) {
            interfaceC34659i2 = null;
        }
        interfaceC34659i2.b(this);
        InterfaceC34659i interfaceC34659i3 = this.f266539k0;
        (interfaceC34659i3 != null ? interfaceC34659i3 : null).c(c34656f);
        return dVar;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        InterfaceC34659i interfaceC34659i = this.f266539k0;
        if (interfaceC34659i == null) {
            interfaceC34659i = null;
        }
        interfaceC34659i.c0();
        InterfaceC34659i interfaceC34659i2 = this.f266539k0;
        if (interfaceC34659i2 == null) {
            interfaceC34659i2 = null;
        }
        interfaceC34659i2.e0();
        InterfaceC34659i interfaceC34659i3 = this.f266539k0;
        (interfaceC34659i3 != null ? interfaceC34659i3 : null).a();
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@Y61.k DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.f266543o0) {
            return;
        }
        g5();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        super.onSaveInstanceState(bundle);
        InterfaceC34659i interfaceC34659i = this.f266539k0;
        if (interfaceC34659i == null) {
            interfaceC34659i = null;
        }
        bundle.putBundle("presenter_state", interfaceC34659i.d0());
        bundle.putBoolean("restart_fragment", true);
    }
}
