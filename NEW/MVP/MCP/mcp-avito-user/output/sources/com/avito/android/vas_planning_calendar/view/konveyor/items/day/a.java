package com.avito.android.vas_planning_calendar.view.konveyor.items.day;

import Y61.k;
import com.avito.android.vas_planning_calendar.view.data.items.CalendarItemState;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DayItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_planning_calendar/view/konveyor/items/day/a;", "LTV0/a;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a implements TV0.a {

    /* renamed from: b, reason: collision with root package name */
    public final long f322702b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f322703c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final CalendarItemState f322704d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Date f322705e;

    public a(long j12, @k String str, @k CalendarItemState calendarItemState, @k Date date) {
        this.f322702b = j12;
        this.f322703c = str;
        this.f322704d = calendarItemState;
        this.f322705e = date;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF322702b() {
        return this.f322702b;
    }

    public /* synthetic */ a(long j12, String str, CalendarItemState calendarItemState, Date date, int i12, C42822w c42822w) {
        this(j12, str, (i12 & 4) != 0 ? CalendarItemState.f322685b : calendarItemState, date);
    }
}
