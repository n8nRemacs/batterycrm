package com.yandex.metrica.coreutils.services;

import com.yandex.metrica.coreutils.services.a;

/* compiled from: ActivationBarrier.java */
/* loaded from: classes7.dex */
class b implements a.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f377644a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a.b f377645b;

    public b(a.b bVar, Runnable runnable) {
        this.f377645b = bVar;
        this.f377644a = runnable;
    }

    @Override // com.yandex.metrica.coreutils.services.a.c
    public final void onWaitFinished() {
        this.f377645b.f377641a = true;
        this.f377644a.run();
    }
}
