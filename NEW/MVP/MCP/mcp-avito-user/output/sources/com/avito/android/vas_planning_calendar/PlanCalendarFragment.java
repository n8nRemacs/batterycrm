package com.avito.android.vas_planning_calendar;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.ActivityC22955m;
import androidx.view.InterfaceC23040h0;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.planning.CalendarSelectionType;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.L0;
import com.avito.android.vas_planning_calendar.model.DateRange;
import com.avito.android.vas_planning_calendar.x;
import java.util.Date;
import javax.inject.Inject;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: PlanCalendarFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/vas_planning_calendar/PlanCalendarFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"DS_TCH_BDGT_ARCHITECTURE [Forbidden]", "DS_TCH_BDGT_ARCHITECTURE [Deprecated]"})
/* loaded from: classes5.dex */
public final class PlanCalendarFragment extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f322593h0;

    /* renamed from: i0, reason: collision with root package name */
    @Inject
    public y f322594i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f322595j0;

    /* renamed from: k0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.a f322596k0;

    /* renamed from: l0, reason: collision with root package name */
    @Inject
    public L0 f322597l0;

    /* renamed from: m0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f322598m0;

    /* compiled from: PlanCalendarFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vas_planning_calendar/PlanCalendarFragment$a;", "", "<init>", "()V", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    /* compiled from: PlanCalendarFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC23040h0, kotlin.jvm.internal.D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ N f322599b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Y41.l lVar) {
            this.f322599b = (N) lVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof InterfaceC23040h0) && (obj instanceof kotlin.jvm.internal.D)) {
                return this.f322599b.equals(((kotlin.jvm.internal.D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f322599b;
        }

        public final int hashCode() {
            return this.f322599b.hashCode();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // androidx.view.InterfaceC23040h0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f322599b.invoke(obj);
        }
    }

    public PlanCalendarFragment() {
        super(0, 1, null);
        this.f322598m0 = new io.reactivex.rxjava3.disposables.c();
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        Object serializable;
        Object serializable2;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            throw new IllegalStateException("Arguments not set");
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 33) {
            serializable = arguments.getSerializable("SELECTED_DATE_EXTRA", Date.class);
        } else {
            Object serializable3 = arguments.getSerializable("SELECTED_DATE_EXTRA");
            if (!(serializable3 instanceof Date)) {
                serializable3 = null;
            }
            serializable = (Date) serializable3;
        }
        Date date = (Date) serializable;
        DateRange dateRange = (DateRange) (i12 >= 33 ? (Parcelable) arguments.getParcelable("SELECTED_DATE_RANGE_EXTRA", DateRange.class) : arguments.getParcelable("SELECTED_DATE_RANGE_EXTRA"));
        if (i12 >= 33) {
            serializable2 = arguments.getSerializable("CALENDAR_SELECTION_TYPE_EXTRA", CalendarSelectionType.class);
        } else {
            Object serializable4 = arguments.getSerializable("CALENDAR_SELECTION_TYPE_EXTRA");
            serializable2 = (CalendarSelectionType) (serializable4 instanceof CalendarSelectionType ? serializable4 : null);
        }
        CalendarSelectionType calendarSelectionType = (CalendarSelectionType) serializable2;
        if (calendarSelectionType == null) {
            calendarSelectionType = CalendarSelectionType.f220022b;
        }
        com.avito.android.vas_planning_calendar.di.a.a().a(getResources(), this, date, dateRange, calendarSelectionType, (com.avito.android.vas_planning_calendar.di.c) C29972i.a(C29972i.b(this), com.avito.android.vas_planning_calendar.di.c.class)).a(this);
    }

    @Override // androidx.fragment.app.DialogFragment
    @Y61.k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        String string;
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("CALENDAR_TITLE_EXTRA")) == null) {
            string = requireContext().getString(R.string.plan_calendar_default_title);
        }
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(requireContext(), R.style.PlanCalendarBottomSheetDialogStyle);
        dVar.D(R.layout.plan_calendar_fragment, true);
        dVar.S(C35835l0.i(requireContext()).heightPixels);
        dVar.L(string, dVar.getContext().getString(R.string.plan_calendar_clear_data), true, true);
        y yVar = this.f322594i0;
        if (yVar == null) {
            yVar = null;
        }
        yVar.getF322574N().observe(requireActivity(), new b(new C36069c(this)));
        y yVar2 = this.f322594i0;
        if (yVar2 == null) {
            yVar2 = null;
        }
        yVar2.getF322575O().observe(requireActivity(), new b(new C36070d(this)));
        y yVar3 = this.f322594i0;
        if (yVar3 == null) {
            yVar3 = null;
        }
        com.avito.konveyor.adapter.a aVar = this.f322595j0;
        if (aVar == null) {
            aVar = null;
        }
        yVar3.K1(aVar);
        InterfaceC28373a interfaceC28373a = this.f322593h0;
        InterfaceC28373a interfaceC28373a2 = interfaceC28373a != null ? interfaceC28373a : null;
        com.avito.konveyor.adapter.a aVar2 = this.f322595j0;
        com.avito.konveyor.adapter.a aVar3 = aVar2 != null ? aVar2 : null;
        com.avito.konveyor.a aVar4 = this.f322596k0;
        com.avito.konveyor.a aVar5 = aVar4 != null ? aVar4 : null;
        ActivityC22955m activityC22955mRequireActivity = requireActivity();
        L0 l02 = this.f322597l0;
        x xVar = new x(interfaceC28373a2, aVar3, aVar5, dVar, activityC22955mRequireActivity, l02 != null ? l02 : null);
        y yVar4 = this.f322594i0;
        y yVar5 = yVar4 != null ? yVar4 : null;
        yVar5.getF322584X().observe(activityC22955mRequireActivity, new x.a(new u(xVar)));
        yVar5.getF322585Y().observe(activityC22955mRequireActivity, new x.a(new t(xVar)));
        yVar5.getF322586Z().observe(activityC22955mRequireActivity, new x.a(new r(xVar)));
        yVar5.getF322588b0().observe(activityC22955mRequireActivity, new x.a(new q(xVar)));
        yVar5.getF322587a0().observe(activityC22955mRequireActivity, new x.a(new p(xVar)));
        yVar5.getF322576P().observe(activityC22955mRequireActivity, new x.a(new n(xVar)));
        yVar5.getF322577Q().observe(activityC22955mRequireActivity, new x.a(new s(xVar)));
        com.jakewharton.rxrelay3.c f322583w = yVar5.getF322583W();
        com.jakewharton.rxrelay3.c f322582v = yVar5.getF322582V();
        dVar.P(new C36079m(f322583w));
        xVar.f322739e.setOnClickListener(new com.avito.android.user_adverts.root_screen.adverts_host.host_view.g(f322582v, 12));
        C36067a c36067a = new C36067a(this);
        l41.g<? super Throwable> gVar = C36068b.f322601b;
        com.jakewharton.rxrelay3.c cVar = xVar.f322742h;
        cVar.getClass();
        this.f322598m0.b(cVar.v0(c36067a, gVar, io.reactivex.rxjava3.internal.functions.a.f401993c));
        return dVar;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f322598m0.e();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@Y61.k DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        ActivityC22955m activityC22955mL1 = l1();
        if (activityC22955mL1 == null || activityC22955mL1.isChangingConfigurations() || activityC22955mL1.isFinishing()) {
            return;
        }
        activityC22955mL1.setResult(-1);
        activityC22955mL1.finish();
    }
}
