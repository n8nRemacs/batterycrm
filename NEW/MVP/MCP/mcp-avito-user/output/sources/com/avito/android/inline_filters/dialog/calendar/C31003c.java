package com.avito.android.inline_filters.dialog.calendar;

import android.content.Context;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.view.C22985S;
import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23040h0;
import androidx.view.Lifecycle;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.r;
import com.avito.android.di.C29972i;
import com.avito.android.inline_filters.calendar.FiltersCalendarPickerConfig;
import com.avito.android.inline_filters.calendar.FiltersCalendarPickerMode;
import com.avito.android.inline_filters.calendar.FiltersCalendarPickerUiConfig;
import com.avito.android.inline_filters.calendar.SelectedDateRange;
import com.avito.android.inline_filters.di.c;
import com.avito.android.inline_filters.dialog.AbstractC30998a;
import com.avito.android.inline_filters.dialog.calendar.o;
import com.avito.android.util.C35835l0;
import com.avito.android.util.L0;
import java.util.concurrent.atomic.AtomicReference;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.InterfaceC42830m;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: FiltersCalendarPickerDialog.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/inline_filters/dialog/calendar/c;", "Lcom/avito/android/inline_filters/dialog/a;", "Lcom/avito/android/inline_filters/dialog/E;", "Landroidx/lifecycle/P;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* renamed from: com.avito.android.inline_filters.dialog.calendar.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C31003c extends AbstractC30998a<com.avito.android.inline_filters.dialog.E> implements InterfaceC22983P {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Y41.l<EN.b, G0> f171187d;

    /* renamed from: e, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f171188e;

    /* renamed from: f, reason: collision with root package name */
    @Inject
    public o f171189f;

    /* renamed from: g, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f171190g;

    /* renamed from: h, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.a f171191h;

    /* renamed from: i, reason: collision with root package name */
    @Inject
    public L0 f171192i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final C22985S f171193j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final AtomicReference f171194k;

    /* compiled from: FiltersCalendarPickerDialog.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.inline_filters.dialog.calendar.c$a */
    public static final class a implements InterfaceC23040h0, kotlin.jvm.internal.D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ N f171195b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l lVar) {
            this.f171195b = (N) lVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof InterfaceC23040h0) && (obj instanceof kotlin.jvm.internal.D)) {
                return this.f171195b.equals(((kotlin.jvm.internal.D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f171195b;
        }

        public final int hashCode() {
            return this.f171195b.hashCode();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // androidx.view.InterfaceC23040h0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f171195b.invoke(obj);
        }
    }

    public C31003c(@Y61.k Context context, @Y61.k Y41.l lVar, @Y61.l Parcelable parcelable, @Y61.k FiltersCalendarPickerConfig filtersCalendarPickerConfig, @Y61.k FiltersCalendarPickerUiConfig filtersCalendarPickerUiConfig) {
        boolean z12;
        String str;
        super(context, R.style.Re23_BottomSheet_Default);
        this.f171187d = lVar;
        boolean z13 = true;
        C22985S c22985s = new C22985S(this, true);
        this.f171193j = c22985s;
        this.f171194k = (AtomicReference) io.reactivex.rxjava3.disposables.d.E(io.reactivex.rxjava3.internal.functions.a.f401992b);
        SelectedDateRange selectedDateRange = parcelable instanceof SelectedDateRange ? (SelectedDateRange) parcelable : null;
        selectedDateRange = selectedDateRange == null ? filtersCalendarPickerConfig.f171044b : selectedDateRange;
        c.a aVarA = com.avito.android.inline_filters.di.a.a();
        aVarA.a((com.avito.android.inline_filters.di.d) C29972i.a(C29972i.b(context), com.avito.android.inline_filters.di.d.class));
        aVarA.b(selectedDateRange);
        aVarA.e(null);
        aVarA.f(filtersCalendarPickerConfig);
        aVarA.d(filtersCalendarPickerUiConfig);
        com.avito.android.analytics.screens.r.f90693e.getClass();
        aVarA.c(r.a.a());
        aVarA.build().a(this);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.filters_calendar_picker_view, (ViewGroup) null);
        FiltersCalendarPickerMode filtersCalendarPickerMode = filtersCalendarPickerUiConfig.f171055c;
        boolean z14 = filtersCalendarPickerMode instanceof FiltersCalendarPickerMode.Normal;
        if (z14) {
            z12 = true;
        } else {
            if (!(filtersCalendarPickerMode instanceof FiltersCalendarPickerMode.Strict)) {
                throw new NoWhenBranchMatchedException();
            }
            z12 = false;
        }
        com.avito.android.lib.design.bottom_sheet.d dVar = this.f171146b;
        dVar.G(viewInflate, false);
        dVar.T();
        dVar.K(true);
        dVar.setCancelable(z12);
        dVar.setCanceledOnTouchOutside(z12);
        dVar.S(C35835l0.g(dVar.getContext()).y);
        com.avito.android.lib.design.bottom_sheet.d dVar2 = this.f171146b;
        View viewFindViewById = dVar2.findViewById(R.id.filters_calendar_picker_root);
        if (z14) {
            str = null;
        } else {
            if (!(filtersCalendarPickerMode instanceof FiltersCalendarPickerMode.Strict)) {
                throw new NoWhenBranchMatchedException();
            }
            str = ((FiltersCalendarPickerMode.Strict) filtersCalendarPickerMode).f171049b;
        }
        InterfaceC28373a interfaceC28373a = this.f171188e;
        InterfaceC28373a interfaceC28373a2 = interfaceC28373a != null ? interfaceC28373a : null;
        com.avito.konveyor.adapter.a aVar = this.f171190g;
        com.avito.konveyor.adapter.a aVar2 = aVar != null ? aVar : null;
        com.avito.konveyor.a aVar3 = this.f171191h;
        com.avito.konveyor.a aVar4 = aVar3 != null ? aVar3 : null;
        L0 l02 = this.f171192i;
        L0 l03 = l02 != null ? l02 : null;
        if (!z14) {
            if (!(filtersCalendarPickerMode instanceof FiltersCalendarPickerMode.Strict)) {
                throw new NoWhenBranchMatchedException();
            }
            z13 = false;
        }
        com.avito.android.inline_filters.dialog.calendar.view.w wVar = new com.avito.android.inline_filters.dialog.calendar.view.w(interfaceC28373a2, viewFindViewById, aVar2, aVar4, this, l03, new n(viewFindViewById, z13), str, false);
        o oVar = this.f171189f;
        wVar.a(oVar == null ? null : oVar);
        o oVar2 = this.f171189f;
        oVar2 = oVar2 == null ? null : oVar2;
        com.avito.konveyor.adapter.a aVar5 = this.f171190g;
        oVar2.K1(aVar5 == null ? null : aVar5);
        o oVar3 = this.f171189f;
        (oVar3 == null ? null : oVar3).getF171290a0().observe(this, new a(new C31004d(this)));
        o oVar4 = this.f171189f;
        (oVar4 != null ? oVar4 : null).getF171294e0().observe(this, new a(new C31005e(this)));
        h hVar = new h(this);
        f fVar = new f(hVar);
        g gVar = new g(hVar);
        com.jakewharton.rxrelay3.c cVar = wVar.f171373p;
        cVar.getClass();
        this.f171194k = (AtomicReference) cVar.v0(fVar, gVar, io.reactivex.rxjava3.internal.functions.a.f401993c);
        dVar2.setOnCancelListener(new DialogInterfaceOnCancelListenerC31002b(0, hVar));
        dVar2.setOnDismissListener(new com.avito.android.advert_item_actions.view.d(2, hVar));
        c22985s.h(Lifecycle.State.f46683f);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [io.reactivex.rxjava3.disposables.d, java.util.concurrent.atomic.AtomicReference] */
    @Override // com.avito.android.inline_filters.dialog.AbstractC30998a
    public final void a() {
        this.f171193j.h(Lifecycle.State.f46679b);
        this.f171194k.dispose();
        c();
    }

    @Override // com.avito.android.inline_filters.dialog.AbstractC30998a
    @Y61.k
    public final Parcelable b() {
        o oVar = this.f171189f;
        if (oVar == null) {
            oVar = null;
        }
        o.a aVarK2 = oVar.K2();
        return new SelectedDateRange(aVarK2.f171279a, aVarK2.f171280b);
    }

    @Override // com.avito.android.inline_filters.dialog.AbstractC30998a
    public final void d() {
        com.avito.android.lib.design.bottom_sheet.d dVar = this.f171146b;
        com.avito.android.lib.util.g.a(dVar);
        dVar.s();
    }

    @Override // androidx.view.InterfaceC22983P
    @Y61.k
    public final Lifecycle getLifecycle() {
        return this.f171193j;
    }
}
