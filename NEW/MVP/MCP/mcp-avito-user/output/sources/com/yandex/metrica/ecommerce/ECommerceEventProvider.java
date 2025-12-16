package com.yandex.metrica.ecommerce;

import com.yandex.metrica.impl.ob.Ba;
import com.yandex.metrica.impl.ob.C38676ab;
import com.yandex.metrica.impl.ob.C38701bb;
import com.yandex.metrica.impl.ob.C38726cb;
import com.yandex.metrica.impl.ob.C38751db;
import com.yandex.metrica.impl.ob.C38776eb;
import com.yandex.metrica.impl.ob.Ga;
import com.yandex.metrica.impl.ob.Pa;
import com.yandex.metrica.impl.ob.Qa;
import com.yandex.metrica.impl.ob.Ra;
import com.yandex.metrica.impl.ob.Ta;
import com.yandex.metrica.impl.ob.Ua;
import com.yandex.metrica.impl.ob.Va;
import com.yandex.metrica.impl.ob.Wa;
import com.yandex.metrica.impl.ob.Ya;
import j.N;
import j.P;

/* loaded from: classes7.dex */
public class ECommerceEventProvider {
    @N
    public ECommerceEvent addCartItemEvent(@N ECommerceCartItem eCommerceCartItem) {
        return new Ta(4, new Ua(eCommerceCartItem), new Ba());
    }

    @N
    public ECommerceEvent beginCheckoutEvent(@N ECommerceOrder eCommerceOrder) {
        return new Va(6, new Wa(eCommerceOrder), new Ga());
    }

    @N
    public ECommerceEvent purchaseEvent(@N ECommerceOrder eCommerceOrder) {
        return new Va(7, new Wa(eCommerceOrder), new Ga());
    }

    @N
    public ECommerceEvent removeCartItemEvent(@N ECommerceCartItem eCommerceCartItem) {
        return new Ta(5, new Ua(eCommerceCartItem), new Ba());
    }

    @N
    public ECommerceEvent showProductCardEvent(@N ECommerceProduct eCommerceProduct, @N ECommerceScreen eCommerceScreen) {
        return new C38726cb(new Ya(eCommerceProduct), new C38701bb(eCommerceScreen), new Pa());
    }

    @N
    public ECommerceEvent showProductDetailsEvent(@N ECommerceProduct eCommerceProduct, @P ECommerceReferrer eCommerceReferrer) {
        return new C38751db(new Ya(eCommerceProduct), eCommerceReferrer == null ? null : new C38676ab(eCommerceReferrer), new Qa());
    }

    @N
    public ECommerceEvent showScreenEvent(@N ECommerceScreen eCommerceScreen) {
        return new C38776eb(new C38701bb(eCommerceScreen), new Ra());
    }
}
