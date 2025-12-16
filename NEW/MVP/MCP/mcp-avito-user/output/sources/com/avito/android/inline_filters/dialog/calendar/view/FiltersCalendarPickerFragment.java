package com.avito.android.inline_filters.dialog.calendar.view;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.C22777e;
import androidx.view.C23038g0;
import androidx.view.InterfaceC23040h0;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.inline_filters.calendar.FiltersCalendarPickerMode;
import com.avito.android.inline_filters.calendar.SelectedDateRange;
import com.avito.android.inline_filters.di.c;
import com.avito.android.inline_filters.dialog.calendar.models.FlexDatesState;
import com.avito.android.inline_filters.dialog.calendar.o;
import com.avito.android.inline_filters.dialog.calendar.view.FiltersCalendarPickerFragment;
import com.avito.android.str_calendar.common.models.DateRange;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35968w3;
import com.avito.android.util.L0;
import java.util.concurrent.atomic.AtomicReference;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;

/* compiled from: FiltersCalendarPickerFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/inline_filters/dialog/calendar/view/FiltersCalendarPickerFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"DS_TCH_BDGT_ARCHITECTURE [Forbidden]", "DS_TCH_BDGT_ARCHITECTURE [Deprecated]"})
/* loaded from: classes14.dex */
public final class FiltersCalendarPickerFragment extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: h0, reason: collision with root package name */
    @Y61.k
    public final C35968w3 f171321h0;

    /* renamed from: i0, reason: collision with root package name */
    @Inject
    public com.avito.android.inline_filters.dialog.calendar.o f171322i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f171323j0;

    /* renamed from: k0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f171324k0;

    /* renamed from: l0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f171325l0;

    /* renamed from: m0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.a f171326m0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public L0 f171327n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public AtomicReference f171328o0;

    /* renamed from: q0, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f171320q0 = {m0.f406844a.e(new Y(FiltersCalendarPickerFragment.class, "openParams", "getOpenParams()Lcom/avito/android/inline_filters/dialog/calendar/view/FiltersCalendarPickerOpenParams;", 0))};

    /* renamed from: p0, reason: collision with root package name */
    @Y61.k
    public static final a f171319p0 = new a(null);

    /* compiled from: FiltersCalendarPickerFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/inline_filters/dialog/calendar/view/FiltersCalendarPickerFragment$a;", "", "<init>", "()V", "", "EXTRA_FLEX_DATES_OPTION_ID", "Ljava/lang/String;", "EXTRA_SELECTED_DATE_RANGE", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: FiltersCalendarPickerFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = FiltersCalendarPickerFragment.f171319p0;
            FiltersCalendarPickerFragment.this.h5();
            return G0.f406611a;
        }
    }

    /* compiled from: FiltersCalendarPickerFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements InterfaceC23040h0, D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ N f171330b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(Y41.l lVar) {
            this.f171330b = (N) lVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof InterfaceC23040h0) && (obj instanceof D)) {
                return this.f171330b.equals(((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f171330b;
        }

        public final int hashCode() {
            return this.f171330b.hashCode();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // androidx.view.InterfaceC23040h0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f171330b.invoke(obj);
        }
    }

    public FiltersCalendarPickerFragment() {
        super(0, 1, null);
        this.f171321h0 = new C35968w3(this);
        this.f171328o0 = (AtomicReference) io.reactivex.rxjava3.disposables.d.E(io.reactivex.rxjava3.internal.functions.a.f401992b);
    }

    public static final void f5(FiltersCalendarPickerFragment filtersCalendarPickerFragment, DateRange dateRange, Integer num) {
        Bundle bundleA = C22777e.a();
        bundleA.putSerializable("date_from", dateRange != null ? dateRange.f286636b : null);
        bundleA.putSerializable("date_to", dateRange != null ? dateRange.f286637c : null);
        if (num != null) {
            bundleA.putInt("flex_dates", num.intValue());
        }
        filtersCalendarPickerFragment.getParentFragmentManager().o0(bundleA, "filters_calendar_picker_request");
        filtersCalendarPickerFragment.dismissAllowingStateLoss();
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@Y61.l Bundle bundle) {
        SelectedDateRange selectedDateRange;
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        SelectedDateRange selectedDateRange2 = g5().f171331b.f171044b;
        if (bundle != null) {
            selectedDateRange = (SelectedDateRange) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle.getParcelable("selected_date_range", SelectedDateRange.class) : bundle.getParcelable("selected_date_range"));
        } else {
            selectedDateRange = null;
        }
        Integer numValueOf = bundle != null ? Integer.valueOf(bundle.getInt("flex_dates_option")) : null;
        c.a aVarA = com.avito.android.inline_filters.di.a.a();
        aVarA.a((com.avito.android.inline_filters.di.d) C29972i.a(C29972i.b(this), com.avito.android.inline_filters.di.d.class));
        if (selectedDateRange != null) {
            selectedDateRange2 = selectedDateRange;
        }
        aVarA.b(selectedDateRange2);
        aVarA.e(numValueOf);
        aVarA.f(g5().f171331b);
        aVarA.d(g5().f171332c);
        aVarA.c(com.avito.android.analytics.screens.s.b(this));
        aVarA.build().b(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f171323j0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).a(fA2.b());
    }

    public final FiltersCalendarPickerOpenParams g5() {
        return (FiltersCalendarPickerOpenParams) this.f171321h0.getValue(this, f171320q0[0]);
    }

    public final void h5() {
        getParentFragmentManager().o0(C22777e.b(new Q("dismissed", Boolean.TRUE)), "filters_calendar_picker_request");
        dismissAllowingStateLoss();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(@Y61.k DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        h5();
    }

    @Override // androidx.fragment.app.DialogFragment
    @Y61.k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f171323j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(requireContext(), R.style.Re23_BottomSheet_Default);
        dVar.T();
        dVar.K(true);
        dVar.J(true);
        dVar.setCancelable(false);
        dVar.setCanceledOnTouchOutside(false);
        dVar.S(C35835l0.i(requireContext()).heightPixels);
        dVar.R(new b());
        dVar.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.avito.android.inline_filters.dialog.calendar.view.a
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                FiltersCalendarPickerFragment.a aVar = FiltersCalendarPickerFragment.f171319p0;
                this.f171333b.h5();
            }
        });
        dVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.avito.android.inline_filters.dialog.calendar.view.b
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                FiltersCalendarPickerFragment.a aVar = FiltersCalendarPickerFragment.f171319p0;
                this.f171334b.h5();
            }
        });
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f171323j0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
        return dVar;
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment, androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        String str;
        boolean z12;
        View viewInflate = layoutInflater.inflate(R.layout.filters_calendar_picker_view, (ViewGroup) null);
        FiltersCalendarPickerMode filtersCalendarPickerMode = g5().f171332c.f171055c;
        if (filtersCalendarPickerMode instanceof FiltersCalendarPickerMode.Normal) {
            str = null;
        } else {
            if (!(filtersCalendarPickerMode instanceof FiltersCalendarPickerMode.Strict)) {
                throw new NoWhenBranchMatchedException();
            }
            str = ((FiltersCalendarPickerMode.Strict) filtersCalendarPickerMode).f171049b;
        }
        InterfaceC28373a interfaceC28373a = this.f171324k0;
        InterfaceC28373a interfaceC28373a2 = interfaceC28373a != null ? interfaceC28373a : null;
        com.avito.konveyor.adapter.a aVar = this.f171325l0;
        com.avito.konveyor.adapter.a aVar2 = aVar != null ? aVar : null;
        com.avito.konveyor.a aVar3 = this.f171326m0;
        com.avito.konveyor.a aVar4 = aVar3 != null ? aVar3 : null;
        L0 l02 = this.f171327n0;
        L0 l03 = l02 != null ? l02 : null;
        FiltersCalendarPickerMode filtersCalendarPickerMode2 = g5().f171332c.f171055c;
        if (filtersCalendarPickerMode2 instanceof FiltersCalendarPickerMode.Normal) {
            z12 = true;
        } else {
            if (!(filtersCalendarPickerMode2 instanceof FiltersCalendarPickerMode.Strict)) {
                throw new NoWhenBranchMatchedException();
            }
            z12 = false;
        }
        w wVar = new w(interfaceC28373a2, viewInflate, aVar2, aVar4, this, l03, new com.avito.android.inline_filters.dialog.calendar.n(viewInflate, z12), str, g5().f171331b.f171047e != null);
        com.avito.android.inline_filters.dialog.calendar.o oVar = this.f171322i0;
        if (oVar == null) {
            oVar = null;
        }
        wVar.a(oVar);
        com.avito.android.inline_filters.dialog.calendar.o oVar2 = this.f171322i0;
        if (oVar2 == null) {
            oVar2 = null;
        }
        com.avito.konveyor.adapter.a aVar5 = this.f171325l0;
        if (aVar5 == null) {
            aVar5 = null;
        }
        oVar2.K1(aVar5);
        com.avito.android.inline_filters.dialog.calendar.o oVar3 = this.f171322i0;
        if (oVar3 == null) {
            oVar3 = null;
        }
        oVar3.getF171290a0().observe(getViewLifecycleOwner(), new c(new com.avito.android.inline_filters.dialog.calendar.view.c(this)));
        com.avito.android.inline_filters.dialog.calendar.o oVar4 = this.f171322i0;
        (oVar4 != null ? oVar4 : null).getF171294e0().observe(getViewLifecycleOwner(), new c(new d(this)));
        e eVar = new e(this);
        f fVar = new f(this);
        com.jakewharton.rxrelay3.c cVar = wVar.f171373p;
        cVar.getClass();
        this.f171328o0 = (AtomicReference) cVar.v0(eVar, fVar, io.reactivex.rxjava3.internal.functions.a.f401993c);
        return viewInflate;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [io.reactivex.rxjava3.disposables.d, java.util.concurrent.atomic.AtomicReference] */
    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f171328o0.dispose();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@Y61.k DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        h5();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        super.onSaveInstanceState(bundle);
        com.avito.android.inline_filters.dialog.calendar.o oVar = this.f171322i0;
        if (oVar == null) {
            oVar = null;
        }
        o.a aVarK2 = oVar.K2();
        com.avito.android.inline_filters.dialog.calendar.o oVar2 = this.f171322i0;
        C23038g0 c23038g0Q6 = (oVar2 != null ? oVar2 : null).getF9429K();
        bundle.putParcelable("selected_date_range", new SelectedDateRange(aVarK2.f171279a, aVarK2.f171280b));
        FlexDatesState flexDatesState = (FlexDatesState) c23038g0Q6.getValue();
        if (flexDatesState != null) {
            bundle.putInt("flex_dates_option", flexDatesState.f171273d);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f171323j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
    }
}
