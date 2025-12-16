package com.avito.android.sbc.utils;

import Y61.k;
import androidx.compose.runtime.internal.P;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.text.C43066x;

/* compiled from: DiscountDispatchDateUtils.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sbc/utils/g;", "", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Locale f260185a;

    /* renamed from: b, reason: collision with root package name */
    public final ZoneId f260186b = ZoneId.of("Europe/Moscow");

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC42726C f260187c = C42727D.c(new a());

    /* compiled from: DiscountDispatchDateUtils.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/time/format/DateTimeFormatter;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<DateTimeFormatter> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final DateTimeFormatter invoke() {
            return DateTimeFormatter.ofPattern("d MMM", g.this.f260185a);
        }
    }

    public g(@k Locale locale) {
        this.f260185a = locale;
    }

    public static String a(String str) {
        return str.charAt(str.length() - 1) == '.' ? C43066x.y(1, str) : str;
    }

    public static int b(@k Date date) {
        Date date2 = new Date();
        if (date.before(date2)) {
            return 0;
        }
        return ((int) TimeUnit.DAYS.convert(date.getTime() - date2.getTime(), TimeUnit.MILLISECONDS)) + 1;
    }

    public static Date e(g gVar, LocalDate localDate) {
        LocalTime localTime = LocalTime.NOON;
        gVar.getClass();
        return Date.from(ZonedDateTime.of(localDate.atTime(localTime), gVar.f260186b).toInstant());
    }

    public final int c(@k LocalDate localDate) {
        Date date = new Date();
        Date dateFrom = Date.from(ZonedDateTime.of(localDate.atTime(LocalTime.MAX), this.f260186b).toInstant());
        if (dateFrom.before(date)) {
            return 0;
        }
        return ((int) TimeUnit.DAYS.convert(dateFrom.getTime() - date.getTime(), TimeUnit.MILLISECONDS)) + 1;
    }

    @k
    public final String d(@k LocalDate localDate) {
        return localDate.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", this.f260185a));
    }

    @k
    public final LocalDate f(long j12) {
        return Instant.ofEpochMilli(j12 * 1000).atZone(this.f260186b).toLocalDate();
    }
}
