package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.base.zau;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* renamed from: com.google.android.gms.common.api.internal.i0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class HandlerC36647i0 extends zau {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C36653k0 f349136a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC36647i0(C36653k0 c36653k0, Looper looper) {
        super(looper);
        this.f349136a = c36653k0;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i12 = message.what;
        C36653k0 c36653k0 = this.f349136a;
        if (i12 != 1) {
            if (i12 != 2) {
                return;
            }
            C36653k0.o(c36653k0);
        } else {
            ReentrantLock reentrantLock = c36653k0.f349147b;
            reentrantLock.lock();
            try {
                if (c36653k0.p()) {
                    c36653k0.r();
                }
            } finally {
                reentrantLock.unlock();
            }
        }
    }
}
