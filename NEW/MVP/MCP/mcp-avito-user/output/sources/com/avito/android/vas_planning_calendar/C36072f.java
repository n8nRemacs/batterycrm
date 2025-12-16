package com.avito.android.vas_planning_calendar;

import androidx.view.M0;
import androidx.view.P0;
import com.avito.android.planning.CalendarSelectionType;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.vas_planning_calendar.model.DateRange;
import java.util.Date;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PlanCalendarViewModelFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_planning_calendar/f;", "Landroidx/lifecycle/P0$c;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.vas_planning_calendar.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36072f implements P0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.vas_planning_calendar.domain.a f322653a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f322654b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.vas_planning_calendar.data.a f322655c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Date f322656d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final DateRange f322657e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.vas_planning_calendar.data.l f322658f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final CalendarSelectionType f322659g;

    @Inject
    public C36072f(@Y61.k com.avito.android.vas_planning_calendar.domain.a aVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.vas_planning_calendar.data.a aVar2, @Y61.l @com.avito.android.vas_planning_calendar.di.d Date date, @Y61.l @com.avito.android.vas_planning_calendar.di.e DateRange dateRange, @Y61.k com.avito.android.vas_planning_calendar.data.l lVar, @Y61.k CalendarSelectionType calendarSelectionType) {
        this.f322653a = aVar;
        this.f322654b = interfaceC35745a5;
        this.f322655c = aVar2;
        this.f322656d = date;
        this.f322657e = dateRange;
        this.f322658f = lVar;
        this.f322659g = calendarSelectionType;
    }

    @Override // androidx.lifecycle.P0.c
    @Y61.k
    public final <T extends M0> T create(@Y61.k Class<T> cls) {
        if (!cls.isAssignableFrom(M.class)) {
            throw new IllegalArgumentException("Unknown ViewModel class");
        }
        return new M(this.f322653a, this.f322654b, this.f322655c, this.f322658f, (this.f322656d == null && this.f322657e == null) ? false : true, this.f322659g);
    }
}
