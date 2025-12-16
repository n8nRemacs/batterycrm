package com.avito.android.service_booking_common;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* compiled from: DateUtils.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito-discouraged_avito-libs_service-booking-common"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b {
    public static final Calendar a() {
        return Calendar.getInstance(TimeZone.getTimeZone("UTC"), new Locale("ru", "RU"));
    }

    @Y61.k
    public static final Date b(@Y61.k String str) {
        return new Date(TimeUnit.MILLISECONDS.convert(Long.parseLong(str), TimeUnit.SECONDS));
    }
}
