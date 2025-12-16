package com.yandex.metrica.ecommerce;

import androidx.compose.foundation.H;
import j.N;
import j.P;
import java.util.List;

/* loaded from: classes7.dex */
public class ECommercePrice {

    /* renamed from: a, reason: collision with root package name */
    @N
    public final ECommerceAmount f377673a;

    /* renamed from: b, reason: collision with root package name */
    @P
    public List<ECommerceAmount> f377674b;

    public ECommercePrice(@N ECommerceAmount eCommerceAmount) {
        this.f377673a = eCommerceAmount;
    }

    @N
    public ECommerceAmount getFiat() {
        return this.f377673a;
    }

    @P
    public List<ECommerceAmount> getInternalComponents() {
        return this.f377674b;
    }

    public ECommercePrice setInternalComponents(@P List<ECommerceAmount> list) {
        this.f377674b = list;
        return this;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ECommercePrice{fiat=");
        sb2.append(this.f377673a);
        sb2.append(", internalComponents=");
        return H.p(sb2, this.f377674b, '}');
    }
}
