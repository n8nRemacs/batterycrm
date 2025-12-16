package com.google.common.math;

import java.math.RoundingMode;

/* compiled from: LongMath.java */
@e
@XY0.b
/* loaded from: classes6.dex */
public final class h {

    /* compiled from: LongMath.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f360347a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f360347a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f360347a[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f360347a[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f360347a[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f360347a[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f360347a[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f360347a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f360347a[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LongMath.java */
    public static abstract class b {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ b[] f360348b = {new a("SMALL", 0, null), new C10684b("LARGE", 1, null)};

        /* JADX INFO: Fake field, exist only in values array */
        b EF7;

        /* compiled from: LongMath.java */
        public enum a extends b {
        }

        /* compiled from: LongMath.java */
        /* renamed from: com.google.common.math.h$b$b, reason: collision with other inner class name */
        public enum C10684b extends b {
        }

        public b() {
            throw null;
        }

        public b(String str, int i12, a aVar) {
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f360348b.clone();
        }
    }
}
