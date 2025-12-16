package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes3.dex */
public final class zce {
    public final ReentrantLock e;
    public final Condition f;
    public volatile Thread g;
    public final ByteBuffer b = ByteBuffer.allocate(0);
    public final ConcurrentLinkedDeque a = new ConcurrentLinkedDeque();
    public final int c = 51200;
    public final AtomicInteger d = new AtomicInteger();

    public zce() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.e = reentrantLock;
        this.f = reentrantLock.newCondition();
    }

    public final void a(byte[] bArr, int i, int i2) {
        if (i2 > this.c - this.d.get()) {
            this.e.lock();
            this.g = Thread.currentThread();
            while (this.c - this.d.get() < i2) {
                try {
                    if (Thread.currentThread().isInterrupted()) {
                        throw new InterruptedException();
                    }
                    this.f.await();
                } catch (Throwable th) {
                    this.g = null;
                    this.e.unlock();
                    throw th;
                }
            }
            this.g = null;
            this.e.unlock();
        }
        this.a.add(ByteBuffer.wrap(Arrays.copyOfRange(bArr, i, i + i2)));
        this.d.getAndAdd(i2);
    }
}
