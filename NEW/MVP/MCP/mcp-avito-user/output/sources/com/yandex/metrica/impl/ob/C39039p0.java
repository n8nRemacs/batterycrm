package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C39282z4;
import com.yandex.metrica.networktasks.api.NetworkServiceLocator;

/* renamed from: com.yandex.metrica.impl.ob.p0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39039p0<C extends C39282z4> extends C39208w2<C> {

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final E4 f381274e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final C38698b8 f381275f;

    public C39039p0(@j.N C c12, @j.N InterfaceC39272yi interfaceC39272yi, @j.N E4 e42, @j.N C38698b8 c38698b8) {
        super(c12, interfaceC39272yi);
        this.f381274e = e42;
        this.f381275f = c38698b8;
    }

    public void a(@j.N C38715c0 c38715c0) {
        if (this.f382097c) {
            return;
        }
        synchronized (this.f382096b) {
            try {
                if (!this.f382097c) {
                    f();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        NetworkServiceLocator.f382415b.f382416a.a(C39099rd.a(e().b(), e(), c38715c0, this.f381274e, this.f381275f));
    }
}
