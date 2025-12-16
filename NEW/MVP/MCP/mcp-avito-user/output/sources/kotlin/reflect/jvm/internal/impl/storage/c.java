package kotlin.reflect.jvm.internal.impl.storage;

/* compiled from: locks.kt */
/* loaded from: classes8.dex */
public final class c extends d {
    public c() {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:?, code lost:
    
        throw null;
     */
    @Override // kotlin.reflect.jvm.internal.impl.storage.d, kotlin.reflect.jvm.internal.impl.storage.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void lock() {
        /*
            r5 = this;
            r0 = 0
            java.util.concurrent.locks.Lock r1 = r5.f409973b     // Catch: java.lang.InterruptedException -> Lf
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.InterruptedException -> Lf
            r3 = 50
            boolean r1 = r1.tryLock(r3, r2)     // Catch: java.lang.InterruptedException -> Lf
            if (r1 == 0) goto Le
            return
        Le:
            throw r0
        Lf:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.storage.c.lock():void");
    }
}
