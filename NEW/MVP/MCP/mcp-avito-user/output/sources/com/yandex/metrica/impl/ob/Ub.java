package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.executors.ICommonExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public abstract class Ub<T> implements Qb<T> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private ICommonExecutor f379607a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private volatile Runnable f379608b;

    public Ub(@j.N ICommonExecutor iCommonExecutor) {
        this.f379607a = iCommonExecutor;
    }

    public void a(@j.N Runnable runnable, long j12) {
        this.f379607a.executeDelayed(runnable, j12, TimeUnit.SECONDS);
        this.f379608b = runnable;
    }

    @Override // com.yandex.metrica.impl.ob.Qb
    public void a() {
        Runnable runnable = this.f379608b;
        if (runnable != null) {
            this.f379607a.remove(runnable);
            this.f379608b = null;
        }
    }
}
