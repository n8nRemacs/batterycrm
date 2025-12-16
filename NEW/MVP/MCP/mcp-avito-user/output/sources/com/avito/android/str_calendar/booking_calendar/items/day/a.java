package com.avito.android.str_calendar.booking_calendar.items.day;

import Y61.k;
import androidx.compose.runtime.internal.P;
import java.util.Date;
import kotlin.Metadata;

/* compiled from: StrBookingCalendarDayItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/booking_calendar/items/day/a;", "Lcom/avito/conveyor_item/a;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f286313b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f286314c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final StrBookingCalendarUiDayState f286315d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f286316e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f286317f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Date f286318g;

    public a(@k String str, @k String str2, @k StrBookingCalendarUiDayState strBookingCalendarUiDayState, boolean z12, boolean z13, @k Date date) {
        this.f286313b = str;
        this.f286314c = str2;
        this.f286315d = strBookingCalendarUiDayState;
        this.f286316e = z12;
        this.f286317f = z13;
        this.f286318g = date;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF287615b() {
        return getF286313b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF286313b() {
        return this.f286313b;
    }
}
