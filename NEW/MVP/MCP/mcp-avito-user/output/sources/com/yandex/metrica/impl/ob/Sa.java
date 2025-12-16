package com.yandex.metrica.impl.ob;

import com.yandex.metrica.ecommerce.ECommerceAmount;
import java.math.BigDecimal;

/* loaded from: classes7.dex */
public class Sa {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    public final BigDecimal f379359a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final String f379360b;

    public Sa(@j.N ECommerceAmount eCommerceAmount) {
        this(eCommerceAmount.getAmount(), eCommerceAmount.getUnit());
    }

    @j.N
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AmountWrapper{amount=");
        sb2.append(this.f379359a);
        sb2.append(", unit='");
        return AK.c.s(sb2, this.f379360b, "'}");
    }

    @j.k0
    public Sa(@j.N BigDecimal bigDecimal, @j.N String str) {
        this.f379359a = bigDecimal;
        this.f379360b = str;
    }
}
