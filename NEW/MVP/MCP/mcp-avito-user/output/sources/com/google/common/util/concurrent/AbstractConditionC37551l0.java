package com.google.common.util.concurrent;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;

/* compiled from: ForwardingCondition.java */
@InterfaceC37531b0
@XY0.d
/* renamed from: com.google.common.util.concurrent.l0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractConditionC37551l0 implements Condition {
    public abstract Condition a();

    @Override // java.util.concurrent.locks.Condition
    public final void await() throws InterruptedException {
        a().await();
    }

    @Override // java.util.concurrent.locks.Condition
    public final long awaitNanos(long j12) {
        return a().awaitNanos(j12);
    }

    @Override // java.util.concurrent.locks.Condition
    public final void awaitUninterruptibly() {
        a().awaitUninterruptibly();
    }

    @Override // java.util.concurrent.locks.Condition
    public final boolean awaitUntil(Date date) {
        return a().awaitUntil(date);
    }

    @Override // java.util.concurrent.locks.Condition
    public final void signal() {
        a().signal();
    }

    @Override // java.util.concurrent.locks.Condition
    public final void signalAll() {
        a().signalAll();
    }

    @Override // java.util.concurrent.locks.Condition
    public final boolean await(long j12, TimeUnit timeUnit) {
        return a().await(j12, timeUnit);
    }
}
