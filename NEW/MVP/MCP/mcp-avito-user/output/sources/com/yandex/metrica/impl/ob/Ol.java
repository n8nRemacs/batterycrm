package com.yandex.metrica.impl.ob;

import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: classes7.dex */
public final class Ol {

    /* renamed from: a, reason: collision with root package name */
    private static final BigInteger f379108a = BigInteger.valueOf(Long.MAX_VALUE);

    /* renamed from: b, reason: collision with root package name */
    private static final BigInteger f379109b = BigInteger.valueOf(Long.MIN_VALUE);

    public static final kotlin.Q a(BigDecimal bigDecimal) {
        int i12 = -bigDecimal.scale();
        BigInteger bigIntegerUnscaledValue = bigDecimal.unscaledValue();
        while (true) {
            if (bigIntegerUnscaledValue.compareTo(f379108a) <= 0 && bigIntegerUnscaledValue.compareTo(f379109b) >= 0) {
                return new kotlin.Q(Long.valueOf(bigIntegerUnscaledValue.longValue()), Integer.valueOf(i12));
            }
            bigIntegerUnscaledValue = bigIntegerUnscaledValue.divide(BigInteger.TEN);
            i12++;
        }
    }
}
