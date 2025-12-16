package com.yandex.metrica.impl.ob;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes7.dex */
public class J3 {

    /* renamed from: a, reason: collision with root package name */
    private final List<InterfaceC38918k4> f378560a = new CopyOnWriteArrayList();

    public void a(@j.N InterfaceC38918k4 interfaceC38918k4) {
        this.f378560a.add(interfaceC38918k4);
    }

    public void b(@j.N InterfaceC38918k4 interfaceC38918k4) {
        this.f378560a.remove(interfaceC38918k4);
    }

    public List<InterfaceC38918k4> a() {
        return this.f378560a;
    }
}
