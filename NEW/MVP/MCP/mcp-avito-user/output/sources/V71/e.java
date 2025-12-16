package V71;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: CapturingMatcher.java */
/* loaded from: classes7.dex */
public class e<T> implements org.mockito.d<T>, d, B, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f16928b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final Lock f16929c;

    public e() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        reentrantReadWriteLock.readLock();
        this.f16929c = reentrantReadWriteLock.writeLock();
    }

    @Override // V71.d
    public final void a(Object obj) {
        Lock lock = this.f16929c;
        lock.lock();
        try {
            this.f16928b.add(obj);
        } finally {
            lock.unlock();
        }
    }

    @Override // org.mockito.d
    public final boolean b(Object obj) {
        return true;
    }

    public final String toString() {
        return "<Capturing argument>";
    }
}
