package com.yandex.metrica.impl.ob;

import com.yandex.metrica.ecommerce.ECommerceEvent;
import java.util.List;

/* loaded from: classes7.dex */
public class Ta extends ECommerceEvent {

    /* renamed from: b, reason: collision with root package name */
    public final int f379508b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public final Ua f379509c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final Fa f379510d;

    @j.k0
    public Ta(int i12, @j.N Ua ua2, @j.N Fa fa2) {
        this.f379508b = i12;
        this.f379509c = ua2;
        this.f379510d = fa2;
    }

    @Override // com.yandex.metrica.ecommerce.ECommerceEvent
    @j.N
    public String getPublicDescription() {
        int i12 = this.f379508b;
        return i12 != 4 ? i12 != 5 ? "unknown cart action info" : "remove cart item info" : "add cart item info";
    }

    @Override // com.yandex.metrica.ecommerce.ECommerceEvent, com.yandex.metrica.impl.ob.Za
    public List<Na<C38979mf, Vm>> toProto() {
        return (List) this.f379510d.fromModel(this);
    }

    @j.N
    public String toString() {
        return "CartActionInfoEvent{eventType=" + this.f379508b + ", cartItem=" + this.f379509c + ", converter=" + this.f379510d + '}';
    }
}
