package com.avito.android.date_time_formatter;

import android.content.res.Resources;
import com.avito.android.R;
import com.avito.android.util.K;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: RelativeDateFormatter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/date_time_formatter/p;", "Lcom/avito/android/date_time_formatter/o;", "_avito_date-time-formatter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@J41.c
/* loaded from: classes12.dex */
public final class p implements o {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.server_time.f f132580a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final SimpleDateFormat f132581b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final SimpleDateFormat f132582c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final SimpleDateFormat f132583d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final SimpleDateFormat f132584e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final String f132585f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Calendar f132586g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Date f132587h;

    @Inject
    public p(@Y61.k Resources resources, @Y61.k com.avito.android.server_time.f fVar, @Y61.k Locale locale) {
        this.f132580a = fVar;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(resources.getString(R.string.date_time_formatter_relative_date_format), locale);
        this.f132581b = simpleDateFormat;
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(resources.getString(R.string.date_time_formatter_relative_time_format), locale);
        this.f132582c = simpleDateFormat2;
        SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat(resources.getString(R.string.date_time_formatter_relative_weekday_format), locale);
        this.f132583d = simpleDateFormat3;
        this.f132584e = new SimpleDateFormat(resources.getString(R.string.date_time_formatter_relative_year_format), locale);
        this.f132587h = new Date();
        TimeZone f274002b = fVar.getF274002b();
        this.f132586g = Calendar.getInstance(f274002b, locale);
        simpleDateFormat.setTimeZone(f274002b);
        simpleDateFormat2.setTimeZone(f274002b);
        simpleDateFormat3.setTimeZone(f274002b);
        this.f132585f = resources.getString(R.string.yesterday_cap);
    }

    @Override // com.avito.android.util.InterfaceC35945t1
    public final String a(Long l12) {
        Long l13 = l12;
        if (l13 == null) {
            return "";
        }
        long jLongValue = l13.longValue();
        long jNow = this.f132580a.now();
        Calendar calendar = this.f132586g;
        calendar.setTimeInMillis(jNow);
        K.a(calendar);
        long timeInMillis = calendar.getTimeInMillis();
        calendar.set(6, 1);
        long timeInMillis2 = calendar.getTimeInMillis();
        Date date = this.f132587h;
        date.setTime(jLongValue);
        if (jLongValue >= timeInMillis) {
            return this.f132582c.format(date);
        }
        TimeUnit timeUnit = TimeUnit.DAYS;
        return jLongValue >= timeInMillis - timeUnit.toMillis(1L) ? this.f132585f : jLongValue >= timeInMillis - timeUnit.toMillis(6L) ? this.f132583d.format(date) : jLongValue >= timeInMillis2 ? C43066x.X(".", this.f132581b.format(date)) : this.f132584e.format(date);
    }
}
