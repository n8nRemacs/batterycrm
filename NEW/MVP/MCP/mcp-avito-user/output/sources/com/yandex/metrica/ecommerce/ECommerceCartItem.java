package com.yandex.metrica.ecommerce;

import com.yandex.metrica.impl.ob.A2;
import j.N;
import j.P;
import java.math.BigDecimal;

/* loaded from: classes7.dex */
public class ECommerceCartItem {

    /* renamed from: a, reason: collision with root package name */
    @N
    public final ECommerceProduct f377665a;

    /* renamed from: b, reason: collision with root package name */
    @N
    public final BigDecimal f377666b;

    /* renamed from: c, reason: collision with root package name */
    @N
    public final ECommercePrice f377667c;

    /* renamed from: d, reason: collision with root package name */
    @P
    public ECommerceReferrer f377668d;

    public ECommerceCartItem(@N ECommerceProduct eCommerceProduct, @N ECommercePrice eCommercePrice, long j12) {
        this(eCommerceProduct, eCommercePrice, A2.a(j12));
    }

    @N
    public ECommerceProduct getProduct() {
        return this.f377665a;
    }

    @N
    public BigDecimal getQuantity() {
        return this.f377666b;
    }

    @P
    public ECommerceReferrer getReferrer() {
        return this.f377668d;
    }

    @N
    public ECommercePrice getRevenue() {
        return this.f377667c;
    }

    @N
    public ECommerceCartItem setReferrer(@P ECommerceReferrer eCommerceReferrer) {
        this.f377668d = eCommerceReferrer;
        return this;
    }

    public String toString() {
        return "ECommerceCartItem{product=" + this.f377665a + ", quantity=" + this.f377666b + ", revenue=" + this.f377667c + ", referrer=" + this.f377668d + '}';
    }

    public ECommerceCartItem(@N ECommerceProduct eCommerceProduct, @N ECommercePrice eCommercePrice, double d12) {
        this(eCommerceProduct, eCommercePrice, new BigDecimal(A2.a(d12, 0.0d)));
    }

    public ECommerceCartItem(@N ECommerceProduct eCommerceProduct, @N ECommercePrice eCommercePrice, @N BigDecimal bigDecimal) {
        this.f377665a = eCommerceProduct;
        this.f377666b = bigDecimal;
        this.f377667c = eCommercePrice;
    }
}
