package kotlin.reflect.jvm.internal.impl.storage;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.C42822w;

/* compiled from: locks.kt */
/* loaded from: classes8.dex */
public class d implements m {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Lock f409973b;

    public d() {
        this(null, 1, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.m
    public void lock() {
        this.f409973b.lock();
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.m
    public final void unlock() {
        this.f409973b.unlock();
    }

    public d(Lock lock, int i12, C42822w c42822w) {
        this.f409973b = (i12 & 1) != 0 ? new ReentrantLock() : lock;
    }
}
