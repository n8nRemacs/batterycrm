package com.avito.android.advert_stats.item;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: StatisticDatesFormatter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_stats/item/A;", "Lcom/avito/android/advert_stats/item/z;", "<init>", "()V", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class A implements z {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Locale f86673a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final SimpleDateFormat f86674b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final SimpleDateFormat f86675c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final SimpleDateFormat f86676d;

    @Inject
    public A() {
        Locale locale = new Locale("ru", "RU");
        this.f86673a = locale;
        this.f86674b = new SimpleDateFormat("EEEE, d MMMM", locale);
        this.f86675c = new SimpleDateFormat("d", locale);
        this.f86676d = new SimpleDateFormat("d MMMM", locale);
    }

    @Override // com.avito.android.advert_stats.item.z
    @Y61.k
    public final String a(long j12, long j13) {
        long j14 = 1000;
        long j15 = j12 * j14;
        long j16 = j13 * j14;
        Calendar calendar = Calendar.getInstance(this.f86673a);
        calendar.setTimeInMillis(j15);
        int i12 = calendar.get(2);
        calendar.setTimeInMillis(j16);
        int i13 = calendar.get(2);
        SimpleDateFormat simpleDateFormat = this.f86676d;
        return i12 == i13 ? androidx.compose.foundation.H.i('-', this.f86675c.format(Long.valueOf(j15)), simpleDateFormat.format(Long.valueOf(j16))) : androidx.appcompat.app.r.r(simpleDateFormat.format(Long.valueOf(j15)), " – ", simpleDateFormat.format(Long.valueOf(j16)));
    }

    @Override // com.avito.android.advert_stats.item.z
    @Y61.k
    public final String b(long j12) {
        return this.f86674b.format(Long.valueOf(j12 * 1000));
    }
}
