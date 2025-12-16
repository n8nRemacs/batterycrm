package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.P3;

/* renamed from: com.yandex.metrica.impl.ob.w2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39208w2<C extends P3> implements InterfaceC38941l2 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private C f382095a;

    /* renamed from: b, reason: collision with root package name */
    final Object f382096b = new Object();

    /* renamed from: c, reason: collision with root package name */
    boolean f382097c = false;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final InterfaceC39272yi f382098d;

    public C39208w2(@j.N C c12, @j.N InterfaceC39272yi interfaceC39272yi) {
        this.f382095a = c12;
        this.f382098d = interfaceC39272yi;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38941l2
    public void a() {
        synchronized (this.f382096b) {
            try {
                if (this.f382097c) {
                    this.f382097c = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38941l2
    public void b() {
        synchronized (this.f382096b) {
            try {
                if (!this.f382097c) {
                    c();
                    this.f382097c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void d() {
        synchronized (this.f382096b) {
            if (!this.f382097c) {
                synchronized (this.f382096b) {
                    try {
                        if (!this.f382097c) {
                            f();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                c();
            }
        }
    }

    @j.N
    public C e() {
        return this.f382095a;
    }

    public void f() {
        this.f382098d.a();
    }

    public void c() {
    }
}
