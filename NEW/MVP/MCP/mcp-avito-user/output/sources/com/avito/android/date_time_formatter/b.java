package com.avito.android.date_time_formatter;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.u0;

/* compiled from: DateTimeFormatter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/date_time_formatter/b;", "", "a", "_avito_date-time-formatter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final a f132563a = a.f132564a;

    /* compiled from: DateTimeFormatter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/date_time_formatter/b$a;", "", "<init>", "()V", "_avito_date-time-formatter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f132564a = new a();

        @Y61.k
        public static String a(long j12) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long hours = timeUnit.toHours(j12);
            if (hours <= 0) {
                long minutes = timeUnit.toMinutes(j12);
                long seconds = timeUnit.toSeconds(j12) - TimeUnit.MINUTES.toSeconds(minutes);
                u0 u0Var = u0.f406856a;
                return String.format("%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(minutes), Long.valueOf(seconds)}, 2));
            }
            long minutes2 = timeUnit.toMinutes(j12);
            TimeUnit timeUnit2 = TimeUnit.HOURS;
            long minutes3 = minutes2 - timeUnit2.toMinutes(hours);
            long seconds2 = (timeUnit.toSeconds(j12) - timeUnit2.toSeconds(hours)) - TimeUnit.MINUTES.toSeconds(minutes3);
            u0 u0Var2 = u0.f406856a;
            return String.format("%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(hours), Long.valueOf(minutes3), Long.valueOf(seconds2)}, 3));
        }
    }

    @Y61.k
    String a(@Y61.l Long l12, @Y61.k TimeUnit timeUnit);
}
