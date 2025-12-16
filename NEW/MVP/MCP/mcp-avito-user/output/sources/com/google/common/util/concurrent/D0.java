package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: ListenableFuture.java */
@InterfaceC37531b0
@aZ0.f
/* loaded from: classes6.dex */
public interface D0<V> extends Future<V> {
    void N(Runnable runnable, Executor executor);
}
