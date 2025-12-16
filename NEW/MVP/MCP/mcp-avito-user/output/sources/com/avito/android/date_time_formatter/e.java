package com.avito.android.date_time_formatter;

import com.avito.android.util.K;
import java.util.Calendar;
import kotlin.Metadata;

/* compiled from: DateTimeFormatter.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_date-time-formatter_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e {
    public static final long a(@Y61.k com.avito.android.server_time.h hVar) {
        Calendar calendar = Calendar.getInstance(hVar.a());
        calendar.setTimeInMillis(hVar.now());
        K.a(calendar);
        return calendar.getTimeInMillis();
    }
}
