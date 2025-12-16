package com.avito.android.str_calendar.seller.calendar.data;

import androidx.compose.runtime.internal.P;
import com.avito.android.util.K;
import java.util.Calendar;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: StrServerCalendarSource.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/calendar/data/n;", "Lcom/avito/android/str_calendar/seller/calendar/data/m;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class n implements m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.server_time.f f287545a;

    @Inject
    public n(@Y61.k com.avito.android.server_time.f fVar) {
        this.f287545a = fVar;
    }

    @Override // com.avito.android.str_calendar.seller.calendar.data.m
    @Y61.k
    public final Calendar a() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(this.f287545a.now());
        K.a(calendar);
        return calendar;
    }
}
