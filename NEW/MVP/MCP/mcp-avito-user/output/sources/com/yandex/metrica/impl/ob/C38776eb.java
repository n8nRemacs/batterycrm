package com.yandex.metrica.impl.ob;

import com.yandex.metrica.ecommerce.ECommerceEvent;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.eb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38776eb extends ECommerceEvent {

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final C38701bb f380468b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final Fa f380469c;

    @j.k0
    public C38776eb(@j.N C38701bb c38701bb, @j.N Fa fa2) {
        this.f380468b = c38701bb;
        this.f380469c = fa2;
    }

    @Override // com.yandex.metrica.ecommerce.ECommerceEvent
    @j.N
    public String getPublicDescription() {
        return "shown screen info";
    }

    @Override // com.yandex.metrica.ecommerce.ECommerceEvent, com.yandex.metrica.impl.ob.Za
    public List<Na<C38979mf, Vm>> toProto() {
        return (List) this.f380469c.fromModel(this);
    }

    public String toString() {
        return "ShownScreenInfoEvent{screen=" + this.f380468b + ", converter=" + this.f380469c + '}';
    }
}
