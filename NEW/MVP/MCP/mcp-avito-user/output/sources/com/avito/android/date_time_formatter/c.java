package com.avito.android.date_time_formatter;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: DateTimeFormatter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/date_time_formatter/c;", "Lcom/avito/android/date_time_formatter/b;", "_avito_date-time-formatter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c implements b {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.server_time.h f132565b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final f f132566c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final SimpleDateFormat f132567d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final SimpleDateFormat f132568e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final SimpleDateFormat f132569f;

    @Inject
    public c(@Y61.k com.avito.android.server_time.h hVar, @Y61.k f fVar, @Y61.k Locale locale) {
        this.f132565b = hVar;
        this.f132566c = fVar;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm", locale);
        this.f132567d = simpleDateFormat;
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("d MMMM", locale);
        this.f132568e = simpleDateFormat2;
        SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("yyyy", locale);
        this.f132569f = simpleDateFormat3;
        simpleDateFormat.setTimeZone(hVar.a());
        simpleDateFormat2.setTimeZone(hVar.a());
        simpleDateFormat3.setTimeZone(hVar.a());
    }

    @Override // com.avito.android.date_time_formatter.b
    @Y61.k
    public final String a(@Y61.l Long l12, @Y61.k TimeUnit timeUnit) {
        if (l12 == null) {
            return "";
        }
        long millis = timeUnit.toMillis(l12.longValue());
        com.avito.android.server_time.h hVar = this.f132565b;
        long jA2 = e.a(hVar);
        Date date = new Date(millis);
        SimpleDateFormat simpleDateFormat = this.f132567d;
        f fVar = this.f132566c;
        if (millis >= jA2 || millis >= jA2 - TimeUnit.DAYS.toMillis(1L)) {
            return millis >= jA2 ? fVar.b(simpleDateFormat.format(date)) : fVar.c(simpleDateFormat.format(date));
        }
        Calendar calendar = Calendar.getInstance(hVar.a());
        calendar.setTimeInMillis(millis);
        int i12 = calendar.get(1);
        long jNow = hVar.now();
        Calendar calendar2 = Calendar.getInstance(hVar.a());
        calendar2.setTimeInMillis(jNow);
        int i13 = calendar2.get(1);
        SimpleDateFormat simpleDateFormat2 = this.f132568e;
        return i12 == i13 ? fVar.a(simpleDateFormat2.format(date), simpleDateFormat.format(date)) : fVar.d(simpleDateFormat2.format(date), this.f132569f.format(date));
    }
}
