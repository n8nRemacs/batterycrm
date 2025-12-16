package com.bumptech.glide.load.engine;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: ResourceRecycler.java */
/* loaded from: classes5.dex */
class z {

    /* renamed from: a, reason: collision with root package name */
    public boolean f339189a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f339190b = new Handler(Looper.getMainLooper(), new a());

    /* compiled from: ResourceRecycler.java */
    public static final class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((w) message.obj).c();
            return true;
        }
    }

    public final synchronized void a(w<?> wVar, boolean z12) {
        try {
            if (this.f339189a || z12) {
                this.f339190b.obtainMessage(1, wVar).sendToTarget();
            } else {
                this.f339189a = true;
                wVar.c();
                this.f339189a = false;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
