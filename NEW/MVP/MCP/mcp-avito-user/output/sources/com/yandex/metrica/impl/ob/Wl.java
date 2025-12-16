package com.yandex.metrica.impl.ob;

import java.util.concurrent.Callable;

/* loaded from: classes7.dex */
class Wl implements Callable<String> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Xl f379830a;

    public Wl(Xl xl2) {
        this.f379830a = xl2;
    }

    @Override // java.util.concurrent.Callable
    public String call() {
        return this.f379830a.a();
    }
}
