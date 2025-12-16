package com.yandex.metrica.ecommerce;

import androidx.appcompat.app.r;
import j.N;
import j.P;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class ECommerceOrder {

    /* renamed from: a, reason: collision with root package name */
    @N
    public final String f377670a;

    /* renamed from: b, reason: collision with root package name */
    @N
    public final List<ECommerceCartItem> f377671b;

    /* renamed from: c, reason: collision with root package name */
    @P
    public Map<String, String> f377672c;

    public ECommerceOrder(@N String str, @N List<ECommerceCartItem> list) {
        this.f377670a = str;
        this.f377671b = list;
    }

    @N
    public List<ECommerceCartItem> getCartItems() {
        return this.f377671b;
    }

    @N
    public String getIdentifier() {
        return this.f377670a;
    }

    @P
    public Map<String, String> getPayload() {
        return this.f377672c;
    }

    public ECommerceOrder setPayload(@P Map<String, String> map) {
        this.f377672c = map;
        return this;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ECommerceOrder{identifier='");
        sb2.append(this.f377670a);
        sb2.append("', cartItems=");
        sb2.append(this.f377671b);
        sb2.append(", payload=");
        return r.w(sb2, this.f377672c, '}');
    }
}
