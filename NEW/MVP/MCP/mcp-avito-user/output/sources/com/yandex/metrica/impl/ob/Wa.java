package com.yandex.metrica.impl.ob;

import com.yandex.metrica.ecommerce.ECommerceCartItem;
import com.yandex.metrica.ecommerce.ECommerceOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes7.dex */
public class Wa {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    public final String f379811a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final String f379812b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public final List<Ua> f379813c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    public final Map<String, String> f379814d;

    public Wa(@j.N ECommerceOrder eCommerceOrder) {
        this(UUID.randomUUID().toString(), eCommerceOrder.getIdentifier(), a(eCommerceOrder.getCartItems()), A2.c(eCommerceOrder.getPayload()));
    }

    @j.N
    private static List<Ua> a(@j.N List<ECommerceCartItem> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<ECommerceCartItem> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new Ua(it.next()));
        }
        return arrayList;
    }

    @j.N
    public String toString() {
        StringBuilder sb2 = new StringBuilder("OrderWrapper{uuid='");
        sb2.append(this.f379811a);
        sb2.append("', identifier='");
        sb2.append(this.f379812b);
        sb2.append("', cartItems=");
        sb2.append(this.f379813c);
        sb2.append(", payload=");
        return androidx.appcompat.app.r.w(sb2, this.f379814d, '}');
    }

    @j.k0
    public Wa(@j.N String str, @j.N String str2, @j.N List<Ua> list, @j.P Map<String, String> map) {
        this.f379811a = str;
        this.f379812b = str2;
        this.f379813c = list;
        this.f379814d = map;
    }
}
