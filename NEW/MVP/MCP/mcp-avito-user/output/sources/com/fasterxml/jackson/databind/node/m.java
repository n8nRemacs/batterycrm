package com.fasterxml.jackson.databind.node;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

/* compiled from: JsonNodeFactory.java */
/* loaded from: classes4.dex */
public class m implements Serializable, l {

    /* renamed from: b, reason: collision with root package name */
    public static final m f342203b = new m();
    private static final long serialVersionUID = 1;

    public static w b(String str) {
        w wVar = w.f342218c;
        if (str == null) {
            return null;
        }
        return str.isEmpty() ? w.f342218c : new w(str);
    }

    public final y a(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            return r.f342215b;
        }
        if (bigDecimal.signum() == 0) {
            return g.f342194c;
        }
        try {
            bigDecimal = bigDecimal.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal.stripTrailingZeros();
        } catch (ArithmeticException unused) {
        }
        return new g(bigDecimal);
    }
}
