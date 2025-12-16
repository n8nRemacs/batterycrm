package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* compiled from: ListeningExecutorService.java */
@XY0.c
@InterfaceC37531b0
@aZ0.f
/* loaded from: classes6.dex */
public interface H0 extends ExecutorService {
    @Override // java.util.concurrent.ExecutorService
    D0<?> submit(Runnable runnable);

    @Override // java.util.concurrent.ExecutorService
    <T> D0<T> submit(Runnable runnable, @T0 T t12);

    @Override // java.util.concurrent.ExecutorService
    <T> D0<T> submit(Callable<T> callable);
}
