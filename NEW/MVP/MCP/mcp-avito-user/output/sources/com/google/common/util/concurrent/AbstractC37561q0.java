package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* compiled from: ForwardingListeningExecutorService.java */
@XY0.c
@InterfaceC37531b0
@XY0.d
/* renamed from: com.google.common.util.concurrent.q0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC37561q0 extends AbstractExecutorServiceC37553m0 implements H0 {
    @Override // com.google.common.util.concurrent.AbstractExecutorServiceC37553m0
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public abstract H0 X();

    @Override // com.google.common.util.concurrent.AbstractExecutorServiceC37553m0, java.util.concurrent.ExecutorService
    public final /* bridge */ /* synthetic */ Future submit(Runnable runnable, @T0 Object obj) {
        return submit(runnable, (Runnable) obj);
    }

    @Override // com.google.common.util.concurrent.AbstractExecutorServiceC37553m0, java.util.concurrent.ExecutorService
    public final <T> D0<T> submit(Callable<T> callable) {
        return X().submit((Callable) callable);
    }

    @Override // com.google.common.util.concurrent.AbstractExecutorServiceC37553m0, java.util.concurrent.ExecutorService
    public final D0<?> submit(Runnable runnable) {
        return X().submit(runnable);
    }

    @Override // com.google.common.util.concurrent.AbstractExecutorServiceC37553m0, java.util.concurrent.ExecutorService
    public final <T> D0<T> submit(Runnable runnable, @T0 T t12) {
        return X().submit(runnable, (Runnable) t12);
    }
}
