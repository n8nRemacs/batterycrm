package com.yandex.metrica.coreutils.services;

import com.yandex.metrica.coreutils.services.a;

/* compiled from: ActivationBarrier.java */
/* loaded from: classes7.dex */
class c implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a.b f377646b;

    public c(a.b bVar) {
        this.f377646b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((b) this.f377646b.f377642b).onWaitFinished();
    }
}
