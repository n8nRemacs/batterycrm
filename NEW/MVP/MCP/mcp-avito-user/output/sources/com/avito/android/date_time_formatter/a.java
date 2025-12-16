package com.avito.android.date_time_formatter;

import android.content.res.Resources;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.util.InterfaceC35945t1;
import com.avito.android.util.K;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* compiled from: BlacklistDateFormatter.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/date_time_formatter/a;", "Lcom/avito/android/util/t1;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@J41.c
/* loaded from: classes12.dex */
public final class a implements InterfaceC35945t1<Long> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.server_time.f f132554a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Resources f132555b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final SimpleDateFormat f132556c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final SimpleDateFormat f132557d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f132558e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Calendar f132559f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Calendar f132560g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Date f132561h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final String[] f132562i;

    public a(@Y61.k Resources resources, @Y61.k com.avito.android.server_time.f fVar, @Y61.k Locale locale) {
        this.f132554a = fVar;
        this.f132555b = resources;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(resources.getString(R.string.messenger_blacklist_date_format), locale);
        this.f132556c = simpleDateFormat;
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(resources.getString(R.string.messenger_blacklist_time_format), locale);
        this.f132557d = simpleDateFormat2;
        this.f132561h = new Date();
        TimeZone f274002b = fVar.getF274002b();
        this.f132559f = Calendar.getInstance(f274002b, locale);
        this.f132560g = Calendar.getInstance(f274002b, locale);
        simpleDateFormat.setTimeZone(f274002b);
        simpleDateFormat2.setTimeZone(f274002b);
        this.f132558e = resources.getString(R.string.yesterday);
        this.f132562i = resources.getStringArray(R.array.on_day_of_week);
    }

    @Override // com.avito.android.util.InterfaceC35945t1
    @Y61.k
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final String a(@Y61.l Long l12) {
        if (l12 == null) {
            return "";
        }
        long jLongValue = l12.longValue();
        Calendar calendar = this.f132560g;
        calendar.setTimeInMillis(jLongValue);
        Date date = this.f132561h;
        date.setTime(jLongValue);
        long jNow = this.f132554a.now();
        Calendar calendar2 = this.f132559f;
        calendar2.setTimeInMillis(jNow);
        K.a(calendar2);
        long timeInMillis = calendar2.getTimeInMillis();
        Resources resources = this.f132555b;
        if (jLongValue >= timeInMillis) {
            return resources.getString(R.string.blocked_on_date_template, this.f132557d.format(date));
        }
        TimeUnit timeUnit = TimeUnit.DAYS;
        if (jLongValue >= timeInMillis - timeUnit.toMillis(1L)) {
            return resources.getString(R.string.blocked_date_template, this.f132558e);
        }
        long millis = timeInMillis - timeUnit.toMillis(6L);
        SimpleDateFormat simpleDateFormat = this.f132556c;
        if (jLongValue < millis) {
            return resources.getString(R.string.blocked_date_template, simpleDateFormat.format(date));
        }
        int i12 = calendar.get(7) - 1;
        String[] strArr = this.f132562i;
        String str = strArr != null ? strArr[i12] : null;
        return str != null ? resources.getString(R.string.blocked_date_template, str) : resources.getString(R.string.blocked_date_template, simpleDateFormat.format(date));
    }
}
