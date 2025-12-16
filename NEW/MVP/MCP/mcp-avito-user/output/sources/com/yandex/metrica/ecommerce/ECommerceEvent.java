package com.yandex.metrica.ecommerce;

import com.yandex.metrica.impl.ob.C38979mf;
import com.yandex.metrica.impl.ob.Na;
import com.yandex.metrica.impl.ob.Vm;
import com.yandex.metrica.impl.ob.Za;
import j.N;
import j.P;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class ECommerceEvent implements Za {

    /* renamed from: a, reason: collision with root package name */
    @N
    private static ECommerceEventProvider f377669a = new ECommerceEventProvider();

    @N
    public static ECommerceEvent addCartItemEvent(@N ECommerceCartItem eCommerceCartItem) {
        return f377669a.addCartItemEvent(eCommerceCartItem);
    }

    @N
    public static ECommerceEvent beginCheckoutEvent(@N ECommerceOrder eCommerceOrder) {
        return f377669a.beginCheckoutEvent(eCommerceOrder);
    }

    @N
    public static ECommerceEvent purchaseEvent(@N ECommerceOrder eCommerceOrder) {
        return f377669a.purchaseEvent(eCommerceOrder);
    }

    @N
    public static ECommerceEvent removeCartItemEvent(@N ECommerceCartItem eCommerceCartItem) {
        return f377669a.removeCartItemEvent(eCommerceCartItem);
    }

    @N
    public static ECommerceEvent showProductCardEvent(@N ECommerceProduct eCommerceProduct, @N ECommerceScreen eCommerceScreen) {
        return f377669a.showProductCardEvent(eCommerceProduct, eCommerceScreen);
    }

    @N
    public static ECommerceEvent showProductDetailsEvent(@N ECommerceProduct eCommerceProduct, @P ECommerceReferrer eCommerceReferrer) {
        return f377669a.showProductDetailsEvent(eCommerceProduct, eCommerceReferrer);
    }

    @N
    public static ECommerceEvent showScreenEvent(@N ECommerceScreen eCommerceScreen) {
        return f377669a.showScreenEvent(eCommerceScreen);
    }

    @N
    public String getPublicDescription() {
        return "E-commerce base event";
    }

    @Override // com.yandex.metrica.impl.ob.Za
    public abstract /* synthetic */ List<Na<C38979mf, Vm>> toProto();
}
