package com.avito.android.vas_planning_calendar;

import androidx.recyclerview.widget.C23424o;
import androidx.view.C23038g0;
import androidx.view.M0;
import com.avito.android.planning.CalendarSelectionType;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.vas_planning_calendar.model.DateRange;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: PlanCalendarViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_planning_calendar/M;", "Lcom/avito/android/vas_planning_calendar/y;", "Landroidx/lifecycle/M0;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class M extends M0 implements y {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.vas_planning_calendar.domain.a f322569E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f322570J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.vas_planning_calendar.data.a f322571K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.vas_planning_calendar.data.l f322572L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final CalendarSelectionType f322573M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<Date> f322574N = new com.avito.android.util.architecture_components.D<>();

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<DateRange> f322575O = new com.avito.android.util.architecture_components.D<>();

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final C23038g0<Boolean> f322576P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<Integer> f322577Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f322578R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f322579S;

    /* renamed from: T, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f322580T;

    /* renamed from: U, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f322581U;

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f322582V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f322583W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public final C23038g0<C23424o.e> f322584X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public final C23038g0<G0> f322585Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public final C23038g0<G0> f322586Z;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.k
    public final C23038g0<Runnable> f322587a0;

    /* renamed from: b0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<String> f322588b0;

    /* renamed from: c0, reason: collision with root package name */
    @Y61.l
    public com.avito.konveyor.adapter.a f322589c0;

    /* renamed from: d0, reason: collision with root package name */
    @Y61.k
    public List<? extends TV0.a> f322590d0;

    /* renamed from: e0, reason: collision with root package name */
    public com.avito.android.vas_planning_calendar.data.e f322591e0;

    public M(@Y61.k com.avito.android.vas_planning_calendar.domain.a aVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.vas_planning_calendar.data.a aVar2, @Y61.k com.avito.android.vas_planning_calendar.data.l lVar, boolean z12, @Y61.k CalendarSelectionType calendarSelectionType) {
        this.f322569E = aVar;
        this.f322570J = interfaceC35745a5;
        this.f322571K = aVar2;
        this.f322572L = lVar;
        this.f322573M = calendarSelectionType;
        C23038g0<Boolean> c23038g0 = new C23038g0<>();
        this.f322576P = c23038g0;
        C23038g0 c23038g02 = new C23038g0();
        this.f322577Q = new com.avito.android.util.architecture_components.D<>();
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        this.f322578R = cVar;
        com.jakewharton.rxrelay3.c cVar2 = new com.jakewharton.rxrelay3.c();
        this.f322579S = cVar2;
        com.jakewharton.rxrelay3.c cVar3 = new com.jakewharton.rxrelay3.c();
        com.jakewharton.rxrelay3.c cVar4 = new com.jakewharton.rxrelay3.c();
        this.f322580T = cVar4;
        this.f322581U = cVar2;
        this.f322582V = cVar3;
        this.f322583W = cVar4;
        this.f322584X = new C23038g0<>();
        this.f322585Y = new C23038g0<>();
        this.f322586Z = new C23038g0<>();
        this.f322587a0 = new C23038g0<>();
        this.f322588b0 = new com.avito.android.util.architecture_components.D<>();
        me();
        le();
        cVar.b(cVar3.C0(300L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.b.f404942b).j0(interfaceC35745a5.e()).v0(new G(this), new H(this), io.reactivex.rxjava3.internal.functions.a.f401993c));
        c23038g0.setValue(Boolean.valueOf(z12));
        c23038g02.setValue("");
        ke();
        this.f322590d0 = C42784z0.f406748b;
    }

    @Override // com.avito.android.vas_planning_calendar.y
    /* renamed from: Cd, reason: from getter */
    public final com.avito.android.util.architecture_components.D getF322574N() {
        return this.f322574N;
    }

    @Override // com.avito.android.vas_planning_calendar.y
    /* renamed from: E1, reason: from getter */
    public final com.avito.android.util.architecture_components.D getF322577Q() {
        return this.f322577Q;
    }

    @Override // com.avito.android.vas_planning_calendar.y
    /* renamed from: H0, reason: from getter */
    public final C23038g0 getF322585Y() {
        return this.f322585Y;
    }

    @Override // com.avito.android.vas_planning_calendar.y
    public final void K1(@Y61.l com.avito.konveyor.adapter.a aVar) {
        this.f322589c0 = aVar;
        if (aVar != null) {
            aVar.c(new UV0.c(this.f322590d0));
        }
    }

    @Override // com.avito.android.vas_planning_calendar.y
    /* renamed from: Lb, reason: from getter */
    public final com.avito.android.util.architecture_components.D getF322575O() {
        return this.f322575O;
    }

    @Override // com.avito.android.vas_planning_calendar.y
    /* renamed from: R0, reason: from getter */
    public final C23038g0 getF322584X() {
        return this.f322584X;
    }

    @Override // com.avito.android.vas_planning_calendar.y
    @Y61.k
    /* renamed from: b1, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF322583W() {
        return this.f322583W;
    }

    @Override // com.avito.android.vas_planning_calendar.y
    @Y61.k
    /* renamed from: c2, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF322581U() {
        return this.f322581U;
    }

    @Override // com.avito.android.vas_planning_calendar.y
    /* renamed from: g0, reason: from getter */
    public final C23038g0 getF322586Z() {
        return this.f322586Z;
    }

    @Override // com.avito.android.vas_planning_calendar.y
    /* renamed from: j0, reason: from getter */
    public final C23038g0 getF322587a0() {
        return this.f322587a0;
    }

    @Override // com.avito.android.vas_planning_calendar.y
    /* renamed from: j1, reason: from getter */
    public final com.avito.android.util.architecture_components.D getF322588b0() {
        return this.f322588b0;
    }

    public final void ke() {
        this.f322578R.b(this.f322569E.a().j0(this.f322570J.e()).v0(new E(this), new F(this), io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    public final void le() {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        com.jakewharton.rxrelay3.c cVar = this.f322580T;
        cVar.getClass();
        this.f322578R.b(cVar.C0(300L, timeUnit, io.reactivex.rxjava3.schedulers.b.f404942b).j0(this.f322570J.e()).v0(new I(this), new J(this), io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    public final void me() {
        this.f322578R.b(this.f322579S.j0(this.f322570J.e()).v0(new K(this), new L(this), io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        super.onCleared();
        this.f322578R.e();
    }

    @Override // com.avito.android.vas_planning_calendar.y
    @Y61.k
    /* renamed from: r1, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF322582V() {
        return this.f322582V;
    }

    @Override // com.avito.android.vas_planning_calendar.y
    /* renamed from: t1, reason: from getter */
    public final C23038g0 getF322576P() {
        return this.f322576P;
    }
}
