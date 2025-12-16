package com.yandex.metrica.impl.ob;

import com.yandex.metrica.ecommerce.ECommerceAmount;
import com.yandex.metrica.ecommerce.ECommercePrice;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes7.dex */
public class Xa {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    public final Sa f379899a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    public final List<Sa> f379900b;

    public Xa(@j.N ECommercePrice eCommercePrice) {
        this(new Sa(eCommercePrice.getFiat()), a(eCommercePrice.getInternalComponents()));
    }

    @j.P
    public static List<Sa> a(@j.P List<ECommerceAmount> list) {
        if (list == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        for (ECommerceAmount eCommerceAmount : list) {
            linkedList.add(new Sa(eCommerceAmount.getAmount(), eCommerceAmount.getUnit()));
        }
        return linkedList;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("PriceWrapper{fiat=");
        sb2.append(this.f379899a);
        sb2.append(", internalComponents=");
        return androidx.compose.foundation.H.p(sb2, this.f379900b, '}');
    }

    @j.k0
    public Xa(@j.N Sa sa2, @j.P List<Sa> list) {
        this.f379899a = sa2;
        this.f379900b = list;
    }
}
