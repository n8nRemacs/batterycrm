package io.reactivex.rxjava3.internal.observers;

import java.util.concurrent.atomic.AtomicInteger;
import q41.InterfaceC47199b;

/* compiled from: BasicIntQueueDisposable.java */
/* renamed from: io.reactivex.rxjava3.internal.observers.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC41805c<T> extends AtomicInteger implements InterfaceC47199b<T> {
    private static final long serialVersionUID = -1001730202384742097L;

    @Override // q41.g
    public final boolean offer(T t12) {
        throw new UnsupportedOperationException("Should not be called");
    }
}
