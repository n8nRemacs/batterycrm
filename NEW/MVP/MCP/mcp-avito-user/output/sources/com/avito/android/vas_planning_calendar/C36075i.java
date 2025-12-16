package com.avito.android.vas_planning_calendar;

import android.app.Application;
import android.content.Intent;
import android.os.Parcelable;
import com.avito.android.planning.CalendarSelectionType;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.Date;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: VasPlanCalendarIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_planning_calendar/i;", "Lcom/avito/android/vas_planning_calendar/h;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.vas_planning_calendar.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36075i implements InterfaceC36074h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Application f322667a;

    @Inject
    public C36075i(@Y61.k Application application) {
        this.f322667a = application;
    }

    @Override // com.avito.android.vas_planning_calendar.InterfaceC36074h
    @Y61.k
    public final Intent a(@Y61.l Date date, @Y61.k CalendarSelectionType calendarSelectionType) {
        PlanCalendarActivity.f322592m.getClass();
        return new Intent(this.f322667a, (Class<?>) PlanCalendarActivity.class).putExtra("SELECTED_DATE_EXTRA", date).putExtra("SELECTED_DATE_RANGE_EXTRA", (Parcelable) null).putExtra("CALENDAR_SELECTION_TYPE_EXTRA", calendarSelectionType).putExtra("CALENDAR_TITLE_EXTRA", (String) null);
    }
}
