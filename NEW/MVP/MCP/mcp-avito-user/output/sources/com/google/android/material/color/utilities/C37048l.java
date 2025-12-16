package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import java.util.HashMap;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: DynamicColor.java */
@RestrictTo
/* renamed from: com.google.android.material.color.utilities.l, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37048l {

    /* renamed from: a, reason: collision with root package name */
    public final Function<C37049m, Double> f356350a;

    /* renamed from: b, reason: collision with root package name */
    public final Function<C37049m, C37048l> f356351b;

    /* renamed from: c, reason: collision with root package name */
    public final Function<C37049m, Double> f356352c;

    /* renamed from: d, reason: collision with root package name */
    public final Function<C37049m, Double> f356353d;

    /* compiled from: DynamicColor.java */
    /* renamed from: com.google.android.material.color.utilities.l$a */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f356354a;

        static {
            int[] iArr = new int[TonePolarity.values().length];
            f356354a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f356354a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f356354a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C37048l(Function function, Function function2, Function function3, q qVar, Function function4, Function function5, Function function6, Function function7) {
        new HashMap();
        this.f356350a = function3;
        this.f356351b = function4;
        this.f356352c = function5;
        this.f356353d = function6;
    }

    public static double a(C37049m c37049m, Function function, Function function2, BiFunction biFunction, Function function3, Function function4, com.fasterxml.jackson.databind.introspect.F f12, Function function5) {
        double dDoubleValue = ((Double) function.apply(c37049m)).doubleValue();
        C37048l c37048l = function3 == null ? null : (C37048l) function3.apply(c37049m);
        if (c37048l == null) {
            return dDoubleValue;
        }
        double dA2 = C37040d.a(dDoubleValue, c37048l.f356350a.apply(c37049m).doubleValue());
        Double d12 = (Double) function2.apply(c37048l);
        double dDoubleValue2 = d12.doubleValue();
        double dDoubleValue3 = ((Double) biFunction.apply(Double.valueOf(dA2), d12)).doubleValue();
        double dA3 = C37040d.a(dDoubleValue2, dDoubleValue3);
        double dDoubleValue4 = f12 == null ? 1.0d : Double.valueOf(0.0d).doubleValue();
        double dDoubleValue5 = 21.0d;
        if (function5 != null && function5.apply(Double.valueOf(dA2)) != null) {
            dDoubleValue5 = ((Double) function5.apply(Double.valueOf(dA2))).doubleValue();
        }
        double d13 = dA3 < dDoubleValue4 ? dDoubleValue4 : dA3 > dDoubleValue5 ? dDoubleValue5 : dA3;
        if (d13 != dA3) {
            dDoubleValue3 = b(dDoubleValue2, d13);
        }
        Function<C37049m, C37048l> function6 = c37048l.f356351b;
        if ((function6 == null || function6.apply(c37049m) == null) && Math.round(dDoubleValue3) <= 60 && Math.round(dDoubleValue3) > 49) {
            dDoubleValue3 = 49.0d;
        }
        if ((function4 != null ? (O) function4.apply(c37049m) : null) != null && Math.abs(dDoubleValue3 - ((Double) function2.apply(null)).doubleValue()) < 15.0d) {
            throw null;
        }
        return dDoubleValue3;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static double b(double r22, double r24) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.color.utilities.C37048l.b(double, double):double");
    }

    public static C37048l c(final Function<C37049m, N> function, final Function<C37049m, Double> function2, final Function<C37049m, C37048l> function3, final Function<C37049m, O> function4) {
        final int i12 = 0;
        Function function5 = new Function() { // from class: com.google.android.material.color.utilities.g
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C37049m c37049m = (C37049m) obj;
                switch (i12) {
                    case 0:
                        ((N) function.apply(c37049m)).getClass();
                        break;
                    default:
                        ((N) function.apply(c37049m)).getClass();
                        break;
                }
                return Double.valueOf(0.0d);
            }
        };
        final int i13 = 1;
        Function function6 = new Function() { // from class: com.google.android.material.color.utilities.g
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C37049m c37049m = (C37049m) obj;
                switch (i13) {
                    case 0:
                        ((N) function.apply(c37049m)).getClass();
                        break;
                    default:
                        ((N) function.apply(c37049m)).getClass();
                        break;
                }
                return Double.valueOf(0.0d);
            }
        };
        final int i14 = 0;
        Function function7 = new Function() { // from class: com.google.android.material.color.utilities.h
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                switch (i14) {
                    case 0:
                        C37049m c37049m = (C37049m) obj;
                        Function function8 = function2;
                        C37045i c37045i = new C37045i(c37049m, 1);
                        Function function9 = function3;
                        return Double.valueOf(C37048l.a(c37049m, function8, c37045i, new C37047k(function8, c37049m, function9), function9, function4, null, new com.fasterxml.jackson.databind.introspect.F(2)));
                    default:
                        C37049m c37049m2 = (C37049m) obj;
                        Function function10 = function2;
                        C37045i c37045i2 = new C37045i(c37049m2, 0);
                        Function function11 = function3;
                        return Double.valueOf(C37048l.a(c37049m2, function10, c37045i2, new C37046j(function11, c37049m2), function11, function4, null, null));
                }
            }
        };
        final int i15 = 1;
        return new C37048l(function5, function6, function2, null, function3, function7, new Function() { // from class: com.google.android.material.color.utilities.h
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                switch (i15) {
                    case 0:
                        C37049m c37049m = (C37049m) obj;
                        Function function8 = function2;
                        C37045i c37045i = new C37045i(c37049m, 1);
                        Function function9 = function3;
                        return Double.valueOf(C37048l.a(c37049m, function8, c37045i, new C37047k(function8, c37049m, function9), function9, function4, null, new com.fasterxml.jackson.databind.introspect.F(2)));
                    default:
                        C37049m c37049m2 = (C37049m) obj;
                        Function function10 = function2;
                        C37045i c37045i2 = new C37045i(c37049m2, 0);
                        Function function11 = function3;
                        return Double.valueOf(C37048l.a(c37049m2, function10, c37045i2, new C37046j(function11, c37049m2), function11, function4, null, null));
                }
            }
        }, function4);
    }
}
