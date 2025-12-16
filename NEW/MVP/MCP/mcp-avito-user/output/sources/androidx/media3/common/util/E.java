package androidx.media3.common.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.common.util.InterfaceC23123n;
import j.P;
import java.util.ArrayList;

/* compiled from: SystemHandlerWrapper.java */
/* loaded from: classes.dex */
final class E implements InterfaceC23123n {

    /* renamed from: b, reason: collision with root package name */
    @j.B
    public static final ArrayList f47875b = new ArrayList(50);

    /* renamed from: a, reason: collision with root package name */
    public final Handler f47876a;

    /* compiled from: SystemHandlerWrapper.java */
    public static final class b implements InterfaceC23123n.a {

        /* renamed from: a, reason: collision with root package name */
        @P
        public Message f47877a;

        public b() {
        }

        @Override // androidx.media3.common.util.InterfaceC23123n.a
        public final void a() {
            Message message = this.f47877a;
            message.getClass();
            message.sendToTarget();
            b();
        }

        public final void b() {
            this.f47877a = null;
            ArrayList arrayList = E.f47875b;
            synchronized (arrayList) {
                if (arrayList.size() < 50) {
                    arrayList.add(this);
                }
            }
        }
    }

    public E(Handler handler) {
        this.f47876a = handler;
    }

    public static b l() {
        b bVar;
        ArrayList arrayList = f47875b;
        synchronized (arrayList) {
            try {
                bVar = arrayList.isEmpty() ? new b() : (b) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    @Override // androidx.media3.common.util.InterfaceC23123n
    public final void a() {
        this.f47876a.removeCallbacksAndMessages(null);
    }

    @Override // androidx.media3.common.util.InterfaceC23123n
    public final InterfaceC23123n.a b(int i12, @P Object obj) {
        b bVarL = l();
        bVarL.f47877a = this.f47876a.obtainMessage(i12, obj);
        return bVarL;
    }

    @Override // androidx.media3.common.util.InterfaceC23123n
    public final InterfaceC23123n.a c(int i12, int i13, int i14) {
        b bVarL = l();
        bVarL.f47877a = this.f47876a.obtainMessage(i12, i13, i14);
        return bVarL;
    }

    @Override // androidx.media3.common.util.InterfaceC23123n
    public final boolean d(Runnable runnable) {
        return this.f47876a.post(runnable);
    }

    @Override // androidx.media3.common.util.InterfaceC23123n
    public final boolean e(long j12) {
        return this.f47876a.sendEmptyMessageAtTime(2, j12);
    }

    @Override // androidx.media3.common.util.InterfaceC23123n
    public final boolean f(int i12) {
        return this.f47876a.sendEmptyMessage(i12);
    }

    @Override // androidx.media3.common.util.InterfaceC23123n
    public final boolean g() {
        return this.f47876a.hasMessages(0);
    }

    @Override // androidx.media3.common.util.InterfaceC23123n
    public final Looper getLooper() {
        return this.f47876a.getLooper();
    }

    @Override // androidx.media3.common.util.InterfaceC23123n
    public final InterfaceC23123n.a h(int i12) {
        b bVarL = l();
        bVarL.f47877a = this.f47876a.obtainMessage(i12);
        return bVarL;
    }

    @Override // androidx.media3.common.util.InterfaceC23123n
    public final boolean i(InterfaceC23123n.a aVar) {
        b bVar = (b) aVar;
        Message message = bVar.f47877a;
        message.getClass();
        boolean zSendMessageAtFrontOfQueue = this.f47876a.sendMessageAtFrontOfQueue(message);
        bVar.b();
        return zSendMessageAtFrontOfQueue;
    }

    @Override // androidx.media3.common.util.InterfaceC23123n
    public final InterfaceC23123n.a j(@P Object obj, int i12, int i13, int i14) {
        b bVarL = l();
        bVarL.f47877a = this.f47876a.obtainMessage(i12, i13, i14, obj);
        return bVarL;
    }

    @Override // androidx.media3.common.util.InterfaceC23123n
    public final void k(int i12) {
        this.f47876a.removeMessages(i12);
    }
}
