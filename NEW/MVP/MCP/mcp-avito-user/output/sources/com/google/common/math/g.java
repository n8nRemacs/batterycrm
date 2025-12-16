package com.google.common.math;

/* compiled from: LinearTransformation.java */
@XY0.c
@com.google.common.math.e
@XY0.d
/* loaded from: classes6.dex */
public abstract class g {

    /* compiled from: LinearTransformation.java */
    public static final class b {
        public b(double d12, double d13, a aVar) {
        }
    }

    /* compiled from: LinearTransformation.java */
    public static final class c extends g {
        static {
            new c();
        }

        public final String toString() {
            return "NaN";
        }
    }

    /* compiled from: LinearTransformation.java */
    public static final class d extends g {
        public final String toString() {
            Double dValueOf = Double.valueOf(0.0d);
            return String.format("y = %g * x + %g", dValueOf, dValueOf);
        }
    }

    /* compiled from: LinearTransformation.java */
    public static final class e extends g {
        public final String toString() {
            return String.format("x = %g", Double.valueOf(0.0d));
        }
    }
}
