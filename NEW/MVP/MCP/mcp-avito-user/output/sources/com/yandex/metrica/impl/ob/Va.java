package com.yandex.metrica.impl.ob;

import com.yandex.metrica.ecommerce.ECommerceEvent;
import java.util.List;

/* loaded from: classes7.dex */
public class Va extends ECommerceEvent {

    /* renamed from: b, reason: collision with root package name */
    public final int f379778b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public final Wa f379779c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final Fa f379780d;

    @j.k0
    public Va(int i12, @j.N Wa wa2, @j.N Fa fa2) {
        this.f379778b = i12;
        this.f379779c = wa2;
        this.f379780d = fa2;
    }

    @Override // com.yandex.metrica.ecommerce.ECommerceEvent
    @j.N
    public String getPublicDescription() {
        return "order info";
    }

    @Override // com.yandex.metrica.ecommerce.ECommerceEvent, com.yandex.metrica.impl.ob.Za
    public List<Na<C38979mf, Vm>> toProto() {
        return (List) this.f379780d.fromModel(this);
    }

    public String toString() {
        return "OrderInfoEvent{eventType=" + this.f379778b + ", order=" + this.f379779c + ", converter=" + this.f379780d + '}';
    }
}
