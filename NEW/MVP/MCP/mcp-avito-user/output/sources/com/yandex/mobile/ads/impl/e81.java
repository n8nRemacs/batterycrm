package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Message;
import com.yandex.mobile.ads.impl.bz;
import java.util.ArrayList;

/* loaded from: classes8.dex */
final class e81 implements bz {

    /* renamed from: b, reason: collision with root package name */
    @j.B
    private static final ArrayList f384815b = new ArrayList(50);

    /* renamed from: a, reason: collision with root package name */
    private final Handler f384816a;

    public static final class a implements bz.a {

        /* renamed from: a, reason: collision with root package name */
        @j.P
        private Message f384817a;

        private a() {
        }

        public final a a(Message message) {
            this.f384817a = message;
            return this;
        }

        public /* synthetic */ a(int i12) {
            this();
        }

        public final boolean a(Handler handler) {
            Message message = this.f384817a;
            message.getClass();
            boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
            this.f384817a = null;
            e81.a(this);
            return zSendMessageAtFrontOfQueue;
        }

        @Override // com.yandex.mobile.ads.impl.bz.a
        public final void a() {
            Message message = this.f384817a;
            message.getClass();
            message.sendToTarget();
            this.f384817a = null;
            e81.a(this);
        }
    }

    public e81(Handler handler) {
        this.f384816a = handler;
    }

    private static a d() {
        a aVar;
        ArrayList arrayList = f384815b;
        synchronized (arrayList) {
            try {
                aVar = arrayList.isEmpty() ? new a(0) : (a) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    @Override // com.yandex.mobile.ads.impl.bz
    public final bz.a a(int i12, @j.P Object obj) {
        return d().a(this.f384816a.obtainMessage(i12, obj));
    }

    @Override // com.yandex.mobile.ads.impl.bz
    public final boolean b() {
        return this.f384816a.hasMessages(0);
    }

    @Override // com.yandex.mobile.ads.impl.bz
    public final void c() {
        this.f384816a.removeMessages(2);
    }

    @Override // com.yandex.mobile.ads.impl.bz
    public final bz.a a(int i12, int i13) {
        return d().a(this.f384816a.obtainMessage(1, i12, i13));
    }

    @Override // com.yandex.mobile.ads.impl.bz
    public final bz.a b(int i12) {
        return d().a(this.f384816a.obtainMessage(i12));
    }

    @Override // com.yandex.mobile.ads.impl.bz
    public final boolean a(bz.a aVar) {
        return ((a) aVar).a(this.f384816a);
    }

    @Override // com.yandex.mobile.ads.impl.bz
    public final boolean a(int i12) {
        return this.f384816a.sendEmptyMessage(i12);
    }

    @Override // com.yandex.mobile.ads.impl.bz
    public final boolean a(long j12) {
        return this.f384816a.sendEmptyMessageAtTime(2, j12);
    }

    @Override // com.yandex.mobile.ads.impl.bz
    public final void a() {
        this.f384816a.removeCallbacksAndMessages(null);
    }

    @Override // com.yandex.mobile.ads.impl.bz
    public final boolean a(Runnable runnable) {
        return this.f384816a.post(runnable);
    }

    public static void a(a aVar) {
        ArrayList arrayList = f384815b;
        synchronized (arrayList) {
            try {
                if (arrayList.size() < 50) {
                    arrayList.add(aVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
