package org.webrtc;

import j.P;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes9.dex */
class RefCountDelegate implements RefCounted {
    private final AtomicInteger refCount = new AtomicInteger(1);

    @P
    private final Runnable releaseCallback;

    public RefCountDelegate(@P Runnable runnable) {
        this.releaseCallback = runnable;
    }

    @Override // org.webrtc.RefCounted
    public void release() {
        Runnable runnable;
        int iDecrementAndGet = this.refCount.decrementAndGet();
        if (iDecrementAndGet < 0) {
            throw new IllegalStateException("release() called on an object with refcount < 1");
        }
        if (iDecrementAndGet != 0 || (runnable = this.releaseCallback) == null) {
            return;
        }
        runnable.run();
    }

    @Override // org.webrtc.RefCounted
    public void retain() {
        if (this.refCount.incrementAndGet() < 2) {
            throw new IllegalStateException("retain() called on an object with refcount < 1");
        }
    }

    public boolean safeRetain() {
        int i12 = this.refCount.get();
        while (i12 != 0) {
            if (this.refCount.weakCompareAndSet(i12, i12 + 1)) {
                return true;
            }
            i12 = this.refCount.get();
        }
        return false;
    }
}
