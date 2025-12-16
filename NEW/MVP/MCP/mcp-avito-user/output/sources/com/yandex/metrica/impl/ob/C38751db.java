package com.yandex.metrica.impl.ob;

import com.yandex.metrica.ecommerce.ECommerceEvent;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.db, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38751db extends ECommerceEvent {

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final Ya f380365b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    public final C38676ab f380366c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final Fa f380367d;

    @j.k0
    public C38751db(@j.N Ya ya2, @j.P C38676ab c38676ab, @j.N Fa fa2) {
        this.f380365b = ya2;
        this.f380366c = c38676ab;
        this.f380367d = fa2;
    }

    @Override // com.yandex.metrica.ecommerce.ECommerceEvent
    @j.N
    public String getPublicDescription() {
        return "shown product details info";
    }

    @Override // com.yandex.metrica.ecommerce.ECommerceEvent, com.yandex.metrica.impl.ob.Za
    public List<Na<C38979mf, Vm>> toProto() {
        return (List) this.f380367d.fromModel(this);
    }

    public String toString() {
        return "ShownProductDetailInfoEvent{product=" + this.f380365b + ", referrer=" + this.f380366c + ", converter=" + this.f380367d + '}';
    }
}
