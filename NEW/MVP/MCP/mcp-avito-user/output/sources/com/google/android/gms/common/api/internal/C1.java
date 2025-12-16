package com.google.android.gms.common.api.internal;

import java.util.concurrent.locks.ReentrantLock;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
final class C1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E f348982b;

    public C1(E e12) {
        this.f348982b = e12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        E e12 = this.f348982b;
        ReentrantLock reentrantLock = e12.f348999z;
        ReentrantLock reentrantLock2 = e12.f348999z;
        reentrantLock.lock();
        try {
            E.m(e12);
        } finally {
            reentrantLock2.unlock();
        }
    }
}
