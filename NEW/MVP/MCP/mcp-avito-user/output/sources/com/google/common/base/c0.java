package com.google.common.base;

import aZ0.InterfaceC19845a;
import com.google.common.base.L;
import com.google.common.base.i0;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: Stopwatch.java */
@InterfaceC37268l
@XY0.b
/* loaded from: classes6.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f359005a = i0.f359050a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f359006b;

    /* renamed from: c, reason: collision with root package name */
    public long f359007c;

    /* compiled from: Stopwatch.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f359008a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            f359008a = iArr;
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f359008a[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f359008a[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f359008a[TimeUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f359008a[TimeUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f359008a[TimeUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f359008a[TimeUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public final long a() {
        if (!this.f359006b) {
            return 0L;
        }
        ((i0.a) this.f359005a).getClass();
        return System.nanoTime() - this.f359007c;
    }

    @InterfaceC19845a
    public final void b() {
        M.n("This stopwatch is already running.", !this.f359006b);
        this.f359006b = true;
        ((i0.a) this.f359005a).getClass();
        this.f359007c = System.nanoTime();
    }

    public final String toString() {
        String str;
        long jA2 = a();
        TimeUnit timeUnit = TimeUnit.DAYS;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (timeUnit.convert(jA2, timeUnit2) <= 0) {
            timeUnit = TimeUnit.HOURS;
            if (timeUnit.convert(jA2, timeUnit2) <= 0) {
                timeUnit = TimeUnit.MINUTES;
                if (timeUnit.convert(jA2, timeUnit2) <= 0) {
                    timeUnit = TimeUnit.SECONDS;
                    if (timeUnit.convert(jA2, timeUnit2) <= 0) {
                        timeUnit = TimeUnit.MILLISECONDS;
                        if (timeUnit.convert(jA2, timeUnit2) <= 0) {
                            timeUnit = TimeUnit.MICROSECONDS;
                            if (timeUnit.convert(jA2, timeUnit2) <= 0) {
                                timeUnit = timeUnit2;
                            }
                        }
                    }
                }
            }
        }
        double dConvert = jA2 / timeUnit2.convert(1L, timeUnit);
        StringBuilder sb2 = new StringBuilder();
        L.b bVar = L.f358964a;
        sb2.append(String.format(Locale.ROOT, "%.4g", Double.valueOf(dConvert)));
        sb2.append(" ");
        switch (a.f359008a[timeUnit.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "μs";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = "s";
                break;
            case 5:
                str = "min";
                break;
            case 6:
                str = "h";
                break;
            case 7:
                str = "d";
                break;
            default:
                throw new AssertionError();
        }
        sb2.append(str);
        return sb2.toString();
    }
}
