package com.google.firebase.components;

import j.B;
import j.N;
import wZ0.InterfaceC49583a;

/* compiled from: OptionalProvider.java */
/* loaded from: classes13.dex */
class s<T> implements wZ0.b<T>, InterfaceC49583a<T> {

    /* renamed from: c, reason: collision with root package name */
    public static final g f360782c = new g(1);

    /* renamed from: d, reason: collision with root package name */
    public static final i f360783d = new i(1);

    /* renamed from: a, reason: collision with root package name */
    @B
    public InterfaceC49583a.InterfaceC12820a<T> f360784a;

    /* renamed from: b, reason: collision with root package name */
    public volatile wZ0.b<T> f360785b;

    public s(g gVar, wZ0.b bVar) {
        this.f360784a = gVar;
        this.f360785b = bVar;
    }

    @Override // wZ0.InterfaceC49583a
    public final void a(@N final InterfaceC49583a.InterfaceC12820a<T> interfaceC12820a) {
        wZ0.b<T> bVar;
        wZ0.b<T> bVar2;
        wZ0.b<T> bVar3 = this.f360785b;
        i iVar = f360783d;
        if (bVar3 != iVar) {
            interfaceC12820a.d(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f360785b;
            if (bVar != iVar) {
                bVar2 = bVar;
            } else {
                final InterfaceC49583a.InterfaceC12820a<T> interfaceC12820a2 = this.f360784a;
                this.f360784a = new InterfaceC49583a.InterfaceC12820a() { // from class: com.google.firebase.components.r
                    @Override // wZ0.InterfaceC49583a.InterfaceC12820a
                    public final void d(wZ0.b bVar4) {
                        interfaceC12820a2.d(bVar4);
                        interfaceC12820a.d(bVar4);
                    }
                };
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            interfaceC12820a.d(bVar);
        }
    }

    @Override // wZ0.b
    public final T get() {
        return this.f360785b.get();
    }
}
