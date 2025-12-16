package com.google.common.util.concurrent;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* compiled from: ForwardingLock.java */
@InterfaceC37531b0
@XY0.d
/* renamed from: com.google.common.util.concurrent.r0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractLockC37562r0 implements Lock {
    public abstract Lock a();

    @Override // java.util.concurrent.locks.Lock
    public final void lock() {
        a().lock();
    }

    @Override // java.util.concurrent.locks.Lock
    public final void lockInterruptibly() throws InterruptedException {
        a().lockInterruptibly();
    }

    @Override // java.util.concurrent.locks.Lock
    public Condition newCondition() {
        return a().newCondition();
    }

    @Override // java.util.concurrent.locks.Lock
    public final boolean tryLock() {
        return a().tryLock();
    }

    @Override // java.util.concurrent.locks.Lock
    public final void unlock() {
        a().unlock();
    }

    @Override // java.util.concurrent.locks.Lock
    public final boolean tryLock(long j12, TimeUnit timeUnit) {
        return a().tryLock(j12, timeUnit);
    }
}
