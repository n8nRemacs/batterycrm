package com.yandex.metrica.impl.ob;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes7.dex */
class Nm implements Executor {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Handler f379018a;

    public Nm(Om om2, Handler handler) {
        this.f379018a = handler;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f379018a.post(runnable);
    }
}
