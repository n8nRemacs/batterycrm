package com.google.android.exoplayer2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* compiled from: AudioBecomingNoisyManager.java */
/* renamed from: com.google.android.exoplayer2.b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C36507b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f344151a;

    /* renamed from: b, reason: collision with root package name */
    public final a f344152b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f344153c;

    /* compiled from: AudioBecomingNoisyManager.java */
    /* renamed from: com.google.android.exoplayer2.b$a */
    public final class a extends BroadcastReceiver implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC10572b f344154b;

        /* renamed from: c, reason: collision with root package name */
        public final Handler f344155c;

        public a(Handler handler, InterfaceC10572b interfaceC10572b) {
            this.f344155c = handler;
            this.f344154b = interfaceC10572b;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f344155c.post(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (C36507b.this.f344153c) {
                this.f344154b.e();
            }
        }
    }

    /* compiled from: AudioBecomingNoisyManager.java */
    /* renamed from: com.google.android.exoplayer2.b$b, reason: collision with other inner class name */
    public interface InterfaceC10572b {
        void e();
    }

    public C36507b(Context context, Handler handler, InterfaceC10572b interfaceC10572b) {
        this.f344151a = context.getApplicationContext();
        this.f344152b = new a(handler, interfaceC10572b);
    }

    public final void a() {
        if (this.f344153c) {
            this.f344151a.unregisterReceiver(this.f344152b);
            this.f344153c = false;
        }
    }
}
