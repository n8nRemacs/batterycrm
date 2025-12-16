package io.ktor.util.date;

import Y61.k;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Date.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lio/ktor/util/date/WeekDay;", "", "a", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class WeekDay {

    /* JADX INFO: Fake field, exist only in values array */
    WeekDay EF5;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ WeekDay[] f400454c = {new WeekDay("MONDAY", 0), new WeekDay("TUESDAY", 1), new WeekDay("WEDNESDAY", 2), new WeekDay("THURSDAY", 3), new WeekDay("FRIDAY", 4), new WeekDay("SATURDAY", 5), new WeekDay("SUNDAY", 6)};

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f400453b = new a(null);

    /* compiled from: Date.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/util/date/WeekDay$a;", "", "<init>", "()V", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public WeekDay() {
        throw null;
    }

    public static WeekDay valueOf(String str) {
        return (WeekDay) Enum.valueOf(WeekDay.class, str);
    }

    public static WeekDay[] values() {
        return (WeekDay[]) f400454c.clone();
    }
}
