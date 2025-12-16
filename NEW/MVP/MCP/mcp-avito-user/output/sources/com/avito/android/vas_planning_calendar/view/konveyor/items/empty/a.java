package com.avito.android.vas_planning_calendar.view.konveyor.items.empty;

import Y61.k;
import com.avito.android.vas_planning_calendar.view.data.items.CalendarItemState;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: EmptyItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_planning_calendar/view/konveyor/items/empty/a;", "LTV0/a;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a implements TV0.a {

    /* renamed from: b, reason: collision with root package name */
    public final long f322716b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final CalendarItemState f322717c;

    public a(long j12, @k CalendarItemState calendarItemState) {
        this.f322716b = j12;
        this.f322717c = calendarItemState;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF322716b() {
        return this.f322716b;
    }

    public /* synthetic */ a(long j12, CalendarItemState calendarItemState, int i12, C42822w c42822w) {
        this(j12, (i12 & 2) != 0 ? CalendarItemState.f322685b : calendarItemState);
    }
}
