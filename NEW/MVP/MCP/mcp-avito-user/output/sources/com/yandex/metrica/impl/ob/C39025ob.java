package com.yandex.metrica.impl.ob;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.yandex.metrica.impl.ob.ob, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39025ob {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final List<InterfaceC38975mb> f381236a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final InterfaceC39050pb f381237b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f381238c = new AtomicBoolean(true);

    public C39025ob(@j.N List<InterfaceC38975mb> list, @j.N InterfaceC39050pb interfaceC39050pb) {
        this.f381236a = list;
        this.f381237b = interfaceC39050pb;
    }

    public void a() {
        this.f381238c.set(false);
    }

    public void b() {
        this.f381238c.set(true);
    }

    public void c() {
        if (this.f381238c.get()) {
            if (this.f381236a.isEmpty()) {
                ((L3) this.f381237b).c();
                return;
            }
            Iterator<InterfaceC38975mb> it = this.f381236a.iterator();
            boolean zA2 = false;
            while (it.hasNext()) {
                zA2 |= it.next().a();
            }
            if (zA2) {
                ((L3) this.f381237b).c();
            }
        }
    }
}
