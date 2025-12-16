package com.google.android.gms.common.api.internal;

import java.util.concurrent.locks.ReentrantLock;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* renamed from: com.google.android.gms.common.api.internal.a0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractRunnableC36623a0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C36626b0 f349068b;

    public /* synthetic */ AbstractRunnableC36623a0(C36626b0 c36626b0, Z z12) {
        this.f349068b = c36626b0;
    }

    @j.l0
    public abstract void a();

    @Override // java.lang.Runnable
    @j.l0
    public final void run() {
        C36626b0 c36626b0 = this.f349068b;
        ReentrantLock reentrantLock = c36626b0.f349078b;
        ReentrantLock reentrantLock2 = c36626b0.f349078b;
        reentrantLock.lock();
        try {
            try {
                if (!Thread.interrupted()) {
                    a();
                }
            } catch (RuntimeException e12) {
                HandlerC36659n0 handlerC36659n0 = c36626b0.f349077a.f349193r;
                handlerC36659n0.sendMessage(handlerC36659n0.obtainMessage(2, e12));
            }
        } finally {
            reentrantLock2.unlock();
        }
    }
}
