package com.yandex.metrica.ecommerce;

import AK.c;
import com.yandex.metrica.impl.ob.A2;
import j.N;
import java.math.BigDecimal;

/* loaded from: classes7.dex */
public class ECommerceAmount {

    /* renamed from: a, reason: collision with root package name */
    @N
    public final BigDecimal f377663a;

    /* renamed from: b, reason: collision with root package name */
    @N
    public final String f377664b;

    public ECommerceAmount(long j12, @N String str) {
        this(A2.a(j12), str);
    }

    @N
    public BigDecimal getAmount() {
        return this.f377663a;
    }

    @N
    public String getUnit() {
        return this.f377664b;
    }

    @N
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ECommerceAmount{amount=");
        sb2.append(this.f377663a);
        sb2.append(", unit='");
        return c.s(sb2, this.f377664b, "'}");
    }

    public ECommerceAmount(double d12, @N String str) {
        this(new BigDecimal(A2.a(d12, 0.0d)), str);
    }

    public ECommerceAmount(@N BigDecimal bigDecimal, @N String str) {
        this.f377663a = bigDecimal;
        this.f377664b = str;
    }
}
