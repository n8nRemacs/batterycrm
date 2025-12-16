package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.base.zau;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* renamed from: com.google.android.gms.common.api.internal.n0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class HandlerC36659n0 extends zau {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C36661o0 f349183a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC36659n0(C36661o0 c36661o0, Looper looper) {
        super(looper);
        this.f349183a = c36661o0;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i12 = message.what;
        if (i12 != 1) {
            if (i12 == 2) {
                throw ((RuntimeException) message.obj);
            }
            return;
        }
        AbstractC36657m0 abstractC36657m0 = (AbstractC36657m0) message.obj;
        C36661o0 c36661o0 = this.f349183a;
        abstractC36657m0.getClass();
        c36661o0.f349189a.lock();
        try {
            if (c36661o0.f349199x == abstractC36657m0.f349176a) {
                abstractC36657m0.a();
            }
        } finally {
            c36661o0.f349189a.unlock();
        }
    }
}
