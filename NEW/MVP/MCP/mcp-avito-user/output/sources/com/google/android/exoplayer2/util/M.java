package com.google.android.exoplayer2.util;

import android.os.Handler;
import android.os.Message;
import com.google.android.exoplayer2.util.InterfaceC36601q;
import java.util.ArrayList;

/* compiled from: SystemHandlerWrapper.java */
/* loaded from: classes6.dex */
final class M implements InterfaceC36601q {

    /* renamed from: b, reason: collision with root package name */
    @j.B
    public static final ArrayList f348092b = new ArrayList(50);

    /* renamed from: a, reason: collision with root package name */
    public final Handler f348093a;

    /* compiled from: SystemHandlerWrapper.java */
    public static final class b implements InterfaceC36601q.a {

        /* renamed from: a, reason: collision with root package name */
        @j.P
        public Message f348094a;

        public b() {
        }

        @Override // com.google.android.exoplayer2.util.InterfaceC36601q.a
        public final void a() {
            Message message = this.f348094a;
            message.getClass();
            message.sendToTarget();
            b();
        }

        public final void b() {
            this.f348094a = null;
            ArrayList arrayList = M.f348092b;
            synchronized (arrayList) {
                if (arrayList.size() < 50) {
                    arrayList.add(this);
                }
            }
        }
    }

    public M(Handler handler) {
        this.f348093a = handler;
    }

    public static b l() {
        b bVar;
        ArrayList arrayList = f348092b;
        synchronized (arrayList) {
            try {
                bVar = arrayList.isEmpty() ? new b() : (b) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    @Override // com.google.android.exoplayer2.util.InterfaceC36601q
    public final void a() {
        this.f348093a.removeCallbacksAndMessages(null);
    }

    @Override // com.google.android.exoplayer2.util.InterfaceC36601q
    public final InterfaceC36601q.a b(int i12, @j.P Object obj) {
        b bVarL = l();
        bVarL.f348094a = this.f348093a.obtainMessage(i12, obj);
        return bVarL;
    }

    @Override // com.google.android.exoplayer2.util.InterfaceC36601q
    public final InterfaceC36601q.a c(int i12, int i13, int i14) {
        b bVarL = l();
        bVarL.f348094a = this.f348093a.obtainMessage(i12, i13, i14);
        return bVarL;
    }

    @Override // com.google.android.exoplayer2.util.InterfaceC36601q
    public final boolean d(Runnable runnable) {
        return this.f348093a.post(runnable);
    }

    @Override // com.google.android.exoplayer2.util.InterfaceC36601q
    public final boolean e(long j12) {
        return this.f348093a.sendEmptyMessageAtTime(2, j12);
    }

    @Override // com.google.android.exoplayer2.util.InterfaceC36601q
    public final boolean f(int i12) {
        return this.f348093a.sendEmptyMessage(i12);
    }

    @Override // com.google.android.exoplayer2.util.InterfaceC36601q
    public final boolean g() {
        return this.f348093a.hasMessages(0);
    }

    @Override // com.google.android.exoplayer2.util.InterfaceC36601q
    public final InterfaceC36601q.a h(int i12) {
        b bVarL = l();
        bVarL.f348094a = this.f348093a.obtainMessage(i12);
        return bVarL;
    }

    @Override // com.google.android.exoplayer2.util.InterfaceC36601q
    public final boolean i(InterfaceC36601q.a aVar) {
        b bVar = (b) aVar;
        Message message = bVar.f348094a;
        message.getClass();
        boolean zSendMessageAtFrontOfQueue = this.f348093a.sendMessageAtFrontOfQueue(message);
        bVar.b();
        return zSendMessageAtFrontOfQueue;
    }

    @Override // com.google.android.exoplayer2.util.InterfaceC36601q
    public final InterfaceC36601q.a j(int i12, @j.P Object obj) {
        b bVarL = l();
        bVarL.f348094a = this.f348093a.obtainMessage(20, 0, i12, obj);
        return bVarL;
    }

    @Override // com.google.android.exoplayer2.util.InterfaceC36601q
    public final void k() {
        this.f348093a.removeMessages(2);
    }
}
