package com.yandex.metrica.impl.ob;

import com.yandex.metrica.networktasks.api.NetworkServiceLocator;
import com.yandex.metrica.networktasks.api.NetworkTask;

/* renamed from: com.yandex.metrica.impl.ob.xi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39248xi implements InterfaceC39272yi {

    /* renamed from: a, reason: collision with root package name */
    private final C39104ri f382207a;

    public C39248xi(@j.N C39104ri c39104ri) {
        this.f382207a = c39104ri;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC39272yi
    public void a() {
        NetworkTask networkTaskC = this.f382207a.c();
        if (networkTaskC != null) {
            NetworkServiceLocator.f382415b.f382416a.a(networkTaskC);
        }
    }
}
