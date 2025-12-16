package n41;

import q41.InterfaceC47199b;

/* compiled from: AbstractEmptyQueueFuseable.java */
/* renamed from: n41.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC44184a<T> implements q41.d<T>, InterfaceC47199b<T> {
    public boolean i() {
        return false;
    }

    @Override // q41.g
    public final boolean isEmpty() {
        return true;
    }

    @Override // q41.g
    public final boolean offer(@j41.e T t12) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // q41.g
    public final T poll() {
        return null;
    }

    @Override // q41.InterfaceC47200c
    public final int v(int i12) {
        return i12 & 2;
    }

    public void cancel() {
    }

    @Override // q41.g
    public final void clear() {
    }

    public void dispose() {
    }

    @Override // org.reactivestreams.e
    public final void request(long j12) {
    }
}
