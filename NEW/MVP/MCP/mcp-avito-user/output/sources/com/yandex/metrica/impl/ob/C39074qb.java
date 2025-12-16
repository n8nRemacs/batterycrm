package com.yandex.metrica.impl.ob;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.yandex.metrica.impl.ob.qb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39074qb implements InterfaceC38975mb, InterfaceC39000nb {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Z3 f381454a;

    /* renamed from: b, reason: collision with root package name */
    private AtomicLong f381455b;

    public C39074qb(@j.N L7 l72, @j.N Z3 z32) {
        this.f381454a = z32;
        this.f381455b = new AtomicLong(l72.c());
        l72.a(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.metrica.impl.ob.InterfaceC38975mb
    public boolean a() {
        return this.f381455b.get() >= ((long) ((Lg) this.f381454a.b()).I());
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC39000nb
    public void b(@j.N List<Integer> list) {
        this.f381455b.addAndGet(-list.size());
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC39000nb
    public void a(@j.N List<Integer> list) {
        this.f381455b.addAndGet(list.size());
    }
}
