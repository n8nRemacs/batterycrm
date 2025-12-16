package com.yandex.metrica.impl.ob;

import com.yandex.metrica.ecommerce.ECommerceEvent;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.cb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38726cb extends ECommerceEvent {

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final Ya f380308b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public final C38701bb f380309c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final Fa f380310d;

    @j.k0
    public C38726cb(@j.N Ya ya2, @j.N C38701bb c38701bb, @j.N Fa fa2) {
        this.f380308b = ya2;
        this.f380309c = c38701bb;
        this.f380310d = fa2;
    }

    @Override // com.yandex.metrica.ecommerce.ECommerceEvent
    @j.N
    public String getPublicDescription() {
        return "shown product card info";
    }

    @Override // com.yandex.metrica.ecommerce.ECommerceEvent, com.yandex.metrica.impl.ob.Za
    public List<Na<C38979mf, Vm>> toProto() {
        return (List) this.f380310d.fromModel(this);
    }

    public String toString() {
        return "ShownProductCardInfoEvent{product=" + this.f380308b + ", screen=" + this.f380309c + ", converter=" + this.f380310d + '}';
    }
}
