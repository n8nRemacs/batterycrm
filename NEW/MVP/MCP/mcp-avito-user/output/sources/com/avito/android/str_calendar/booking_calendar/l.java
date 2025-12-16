package com.avito.android.str_calendar.booking_calendar;

import androidx.recyclerview.widget.GridLayoutManager;
import kotlin.Metadata;

/* compiled from: StrBookingCalendarViewHolder.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/booking_calendar/l;", "Landroidx/recyclerview/widget/GridLayoutManager$c;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class l extends GridLayoutManager.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.avito.konveyor.adapter.a f286351e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.avito.konveyor.a f286352f;

    public l(com.avito.konveyor.adapter.a aVar, com.avito.konveyor.a aVar2) {
        this.f286351e = aVar;
        this.f286352f = aVar2;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.c
    public final int f(int i12) {
        int iB2 = this.f286351e.b(i12);
        com.avito.konveyor.a aVar = this.f286352f;
        if (iB2 == aVar.Y(com.avito.android.str_calendar.booking_calendar.items.month.b.class)) {
            return 7;
        }
        if (iB2 == aVar.Y(com.avito.android.str_calendar.booking_calendar.items.day.b.class) || iB2 == aVar.Y(com.avito.android.str_calendar.booking_calendar.items.empty.b.class)) {
            return 1;
        }
        throw new UnsupportedOperationException("Unknown view type");
    }
}
