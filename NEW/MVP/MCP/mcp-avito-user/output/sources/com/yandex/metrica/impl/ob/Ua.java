package com.yandex.metrica.impl.ob;

import com.yandex.metrica.ecommerce.ECommerceCartItem;
import java.math.BigDecimal;

/* loaded from: classes7.dex */
public class Ua {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    public final Ya f379603a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final BigDecimal f379604b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public final Xa f379605c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    public final C38676ab f379606d;

    public Ua(@j.N ECommerceCartItem eCommerceCartItem) {
        this(new Ya(eCommerceCartItem.getProduct()), eCommerceCartItem.getQuantity(), new Xa(eCommerceCartItem.getRevenue()), eCommerceCartItem.getReferrer() == null ? null : new C38676ab(eCommerceCartItem.getReferrer()));
    }

    @j.N
    public String toString() {
        return "CartItemWrapper{product=" + this.f379603a + ", quantity=" + this.f379604b + ", revenue=" + this.f379605c + ", referrer=" + this.f379606d + '}';
    }

    @j.k0
    public Ua(@j.N Ya ya2, @j.N BigDecimal bigDecimal, @j.N Xa xa2, @j.P C38676ab c38676ab) {
        this.f379603a = ya2;
        this.f379604b = bigDecimal;
        this.f379605c = xa2;
        this.f379606d = c38676ab;
    }
}
