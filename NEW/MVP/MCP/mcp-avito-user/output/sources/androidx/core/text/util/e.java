package androidx.core.text.util;

import android.icu.text.DateFormat;
import androidx.annotation.RestrictTo;
import j.X;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: LocalePreferences.java */
@X
/* loaded from: classes.dex */
public final class e {

    /* compiled from: LocalePreferences.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44892a;

        static {
            int[] iArr = new int[DateFormat.HourCycle.values().length];
            f44892a = iArr;
            try {
                iArr[DateFormat.HourCycle.HOUR_CYCLE_11.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44892a[DateFormat.HourCycle.HOUR_CYCLE_12.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44892a[DateFormat.HourCycle.HOUR_CYCLE_23.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f44892a[DateFormat.HourCycle.HOUR_CYCLE_24.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: LocalePreferences.java */
    @X
    public static class b {
    }

    /* compiled from: LocalePreferences.java */
    @X
    public static class c {
    }

    /* compiled from: LocalePreferences.java */
    public static class d {

        /* compiled from: LocalePreferences.java */
        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo
        public @interface a {
        }
    }

    /* compiled from: LocalePreferences.java */
    /* renamed from: androidx.core.text.util.e$e, reason: collision with other inner class name */
    public static class C1748e {

        /* compiled from: LocalePreferences.java */
        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo
        /* renamed from: androidx.core.text.util.e$e$a */
        public @interface a {
        }
    }

    /* compiled from: LocalePreferences.java */
    public static class f {

        /* compiled from: LocalePreferences.java */
        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo
        public @interface a {
        }
    }

    /* compiled from: LocalePreferences.java */
    public static class g {

        /* compiled from: LocalePreferences.java */
        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo
        public @interface a {
        }
    }
}
