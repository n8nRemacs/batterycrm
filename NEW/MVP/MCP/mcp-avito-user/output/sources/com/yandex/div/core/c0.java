package com.yandex.div.core;

import java.util.concurrent.ExecutorService;

/* compiled from: DivKitConfiguration_ExecutorServiceFactory.java */
@dagger.internal.e
/* loaded from: classes7.dex */
public final class c0 implements dagger.internal.h<ExecutorService> {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f367286a;

    public c0(a0 a0Var) {
        this.f367286a = a0Var;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        ExecutorService executorService = this.f367286a.f367272b;
        dagger.internal.t.d(executorService);
        return executorService;
    }
}
