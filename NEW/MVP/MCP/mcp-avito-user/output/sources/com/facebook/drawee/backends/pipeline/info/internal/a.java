package com.facebook.drawee.backends.pipeline.info.internal;

import DW0.j;
import DW0.l;
import QW0.c;
import QW0.h;
import YW0.f;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.facebook.common.internal.r;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.infer.annotation.Nullsafe;
import j.N;
import java.io.Closeable;

/* compiled from: ImagePerfControllerListener2.java */
@Nullsafe
/* loaded from: classes.dex */
public class a extends QW0.a<f> implements h<f>, Closeable {

    /* renamed from: g, reason: collision with root package name */
    @I41.h
    public static Handler f339939g;

    /* renamed from: b, reason: collision with root package name */
    public final AwakeTimeSinceBootClock f339940b;

    /* renamed from: c, reason: collision with root package name */
    public final l f339941c;

    /* renamed from: d, reason: collision with root package name */
    public final j f339942d;

    /* renamed from: e, reason: collision with root package name */
    public final r<Boolean> f339943e;

    /* renamed from: f, reason: collision with root package name */
    public final r<Boolean> f339944f;

    /* compiled from: ImagePerfControllerListener2.java */
    /* renamed from: com.facebook.drawee.backends.pipeline.info.internal.a$a, reason: collision with other inner class name */
    public static class HandlerC10529a extends Handler {

        /* renamed from: a, reason: collision with root package name */
        public final j f339945a;

        public HandlerC10529a(@N Looper looper, @N j jVar) {
            super(looper);
            this.f339945a = jVar;
        }

        @Override // android.os.Handler
        public final void handleMessage(@N Message message) {
            Object obj = message.obj;
            obj.getClass();
            l lVar = (l) obj;
            int i12 = message.what;
            j jVar = this.f339945a;
            if (i12 == 1) {
                jVar.b(lVar, message.arg1);
            } else {
                if (i12 != 2) {
                    return;
                }
                jVar.a(lVar, message.arg1);
            }
        }
    }

    public a(AwakeTimeSinceBootClock awakeTimeSinceBootClock, l lVar, j jVar, r rVar, r rVar2) {
        this.f339940b = awakeTimeSinceBootClock;
        this.f339941c = lVar;
        this.f339942d = jVar;
        this.f339943e = rVar;
        this.f339944f = rVar2;
    }

    @Override // QW0.a, QW0.c
    public final void a(String str, @I41.h c.a aVar) {
        this.f339940b.now();
        l lVarF = f();
        lVarF.getClass();
        int i12 = lVarF.f3233c;
        if (i12 != 3 && i12 != 5 && i12 != 6) {
            h(lVarF, 4);
        }
        i(lVarF, 2);
    }

    @Override // QW0.a, QW0.c
    public final void b(String str, @I41.h Object obj, @I41.h c.a aVar) {
        this.f339940b.now();
        l lVarF = f();
        lVarF.getClass();
        lVarF.f3232b = (f) obj;
        h(lVarF, 3);
    }

    @Override // QW0.a, QW0.c
    public final void c(String str, @I41.h Throwable th2, @I41.h c.a aVar) {
        this.f339940b.now();
        l lVarF = f();
        lVarF.getClass();
        h(lVarF, 5);
        i(lVarF, 2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        l lVarF = f();
        lVarF.getClass();
        lVarF.getClass();
        lVarF.f3233c = -1;
    }

    @Override // QW0.a, QW0.c
    public final void d(String str, @I41.h c.a aVar) {
        this.f339940b.now();
        l lVarF = f();
        lVarF.getClass();
        lVarF.f3231a = null;
        h(lVarF, 0);
        i(lVarF, 1);
    }

    public final l f() {
        return this.f339944f.get().booleanValue() ? new l() : this.f339941c;
    }

    public final boolean g() {
        boolean zBooleanValue = this.f339943e.get().booleanValue();
        if (zBooleanValue && f339939g == null) {
            synchronized (this) {
                if (f339939g == null) {
                    HandlerThread handlerThread = new HandlerThread("ImagePerfControllerListener2Thread");
                    handlerThread.start();
                    Looper looper = handlerThread.getLooper();
                    looper.getClass();
                    f339939g = new HandlerC10529a(looper, this.f339942d);
                }
            }
        }
        return zBooleanValue;
    }

    public final void h(l lVar, int i12) {
        if (!g()) {
            this.f339942d.b(lVar, i12);
            return;
        }
        Handler handler = f339939g;
        handler.getClass();
        Message messageObtainMessage = handler.obtainMessage();
        messageObtainMessage.what = 1;
        messageObtainMessage.arg1 = i12;
        messageObtainMessage.obj = lVar;
        f339939g.sendMessage(messageObtainMessage);
    }

    public final void i(l lVar, int i12) {
        if (!g()) {
            this.f339942d.a(lVar, i12);
            return;
        }
        Handler handler = f339939g;
        handler.getClass();
        Message messageObtainMessage = handler.obtainMessage();
        messageObtainMessage.what = 2;
        messageObtainMessage.arg1 = i12;
        messageObtainMessage.obj = lVar;
        f339939g.sendMessage(messageObtainMessage);
    }
}
