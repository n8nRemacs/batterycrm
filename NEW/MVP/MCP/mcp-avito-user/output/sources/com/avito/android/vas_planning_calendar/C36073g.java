package com.avito.android.vas_planning_calendar;

import com.avito.android.planning.CalendarSelectionType;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.vas_planning_calendar.model.DateRange;
import java.util.Date;
import javax.inject.Provider;

/* compiled from: PlanCalendarViewModelFactory_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.vas_planning_calendar.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36073g implements dagger.internal.h<C36072f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.vas_planning_calendar.domain.a> f322660a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f322661b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.vas_planning_calendar.data.a> f322662c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f322663d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f322664e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.u f322665f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.l f322666g;

    public C36073g(dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.l lVar3, dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f322660a = provider;
        this.f322661b = provider2;
        this.f322662c = provider3;
        this.f322663d = lVar;
        this.f322664e = lVar2;
        this.f322665f = uVar;
        this.f322666g = lVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C36072f(this.f322660a.get(), this.f322661b.get(), this.f322662c.get(), (Date) this.f322663d.f393949a, (DateRange) this.f322664e.f393949a, (com.avito.android.vas_planning_calendar.data.l) this.f322665f.get(), (CalendarSelectionType) this.f322666g.f393949a);
    }
}
