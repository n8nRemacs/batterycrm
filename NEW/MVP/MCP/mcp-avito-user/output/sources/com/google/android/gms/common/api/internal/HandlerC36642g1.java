package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.internal.base.zau;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* renamed from: com.google.android.gms.common.api.internal.g1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class HandlerC36642g1 extends zau {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C36648i1 f349115a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC36642g1(C36648i1 c36648i1, Looper looper) {
        super(looper);
        this.f349115a = c36648i1;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i12 = message.what;
        if (i12 != 0) {
            if (i12 != 1) {
                return;
            }
            RuntimeException runtimeException = (RuntimeException) message.obj;
            "Runtime exception on the transformation worker thread: ".concat(String.valueOf(runtimeException.getMessage()));
            throw runtimeException;
        }
        com.google.android.gms.common.api.m mVar = (com.google.android.gms.common.api.m) message.obj;
        synchronized (this.f349115a.f349140d) {
            try {
                C36648i1 c36648i1 = this.f349115a.f349138b;
                C36729v.j(c36648i1);
                if (mVar == null) {
                    c36648i1.b(new Status(13, "Transform returned null", null, null));
                } else if (mVar instanceof W0) {
                    c36648i1.b(null);
                } else {
                    synchronized (c36648i1.f349140d) {
                        c36648i1.f349139c = mVar;
                        c36648i1.c();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
