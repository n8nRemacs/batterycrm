package kotlin.time;

import java.util.concurrent.TimeUnit;
import kotlin.InterfaceC42733c0;
import kotlin.K0;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DurationUnitJvm.kt */
@K0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/time/DurationUnit;", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42733c0
/* loaded from: classes8.dex */
public final class DurationUnit {

    /* renamed from: c, reason: collision with root package name */
    public static final DurationUnit f410631c;

    /* renamed from: d, reason: collision with root package name */
    public static final DurationUnit f410632d;

    /* renamed from: e, reason: collision with root package name */
    public static final DurationUnit f410633e;

    /* renamed from: f, reason: collision with root package name */
    public static final DurationUnit f410634f;

    /* renamed from: g, reason: collision with root package name */
    public static final DurationUnit f410635g;

    /* renamed from: h, reason: collision with root package name */
    public static final DurationUnit f410636h;

    /* renamed from: i, reason: collision with root package name */
    public static final DurationUnit f410637i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ DurationUnit[] f410638j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f410639k;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TimeUnit f410640b;

    static {
        DurationUnit durationUnit = new DurationUnit("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
        f410631c = durationUnit;
        DurationUnit durationUnit2 = new DurationUnit("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
        f410632d = durationUnit2;
        DurationUnit durationUnit3 = new DurationUnit("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
        f410633e = durationUnit3;
        DurationUnit durationUnit4 = new DurationUnit("SECONDS", 3, TimeUnit.SECONDS);
        f410634f = durationUnit4;
        DurationUnit durationUnit5 = new DurationUnit("MINUTES", 4, TimeUnit.MINUTES);
        f410635g = durationUnit5;
        DurationUnit durationUnit6 = new DurationUnit("HOURS", 5, TimeUnit.HOURS);
        f410636h = durationUnit6;
        DurationUnit durationUnit7 = new DurationUnit("DAYS", 6, TimeUnit.DAYS);
        f410637i = durationUnit7;
        DurationUnit[] durationUnitArr = {durationUnit, durationUnit2, durationUnit3, durationUnit4, durationUnit5, durationUnit6, durationUnit7};
        f410638j = durationUnitArr;
        f410639k = kotlin.enums.c.a(durationUnitArr);
    }

    public DurationUnit(String str, int i12, TimeUnit timeUnit) {
        this.f410640b = timeUnit;
    }

    public static DurationUnit valueOf(String str) {
        return (DurationUnit) Enum.valueOf(DurationUnit.class, str);
    }

    public static DurationUnit[] values() {
        return (DurationUnit[]) f410638j.clone();
    }
}
