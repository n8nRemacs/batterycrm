package com.avito.android.str_calendar.booking_calendar.items.empty;

import Y61.k;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: StrBookingCalendarEmptyItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/booking_calendar/items/empty/a;", "Lcom/avito/conveyor_item/a;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f286333b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f286334c;

    public a(@k String str, boolean z12) {
        this.f286333b = str;
        this.f286334c = z12;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF207385b() {
        return getF275532b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF275532b() {
        return this.f286333b;
    }
}
