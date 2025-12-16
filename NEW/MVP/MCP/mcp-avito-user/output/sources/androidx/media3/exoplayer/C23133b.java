package androidx.media3.exoplayer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import androidx.media3.exoplayer.A;

/* compiled from: AudioBecomingNoisyManager.java */
/* renamed from: androidx.media3.exoplayer.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C23133b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f49008a;

    /* renamed from: b, reason: collision with root package name */
    public final a f49009b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f49010c;

    /* compiled from: AudioBecomingNoisyManager.java */
    /* renamed from: androidx.media3.exoplayer.b$a */
    public final class a extends BroadcastReceiver implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC1826b f49011b;

        /* renamed from: c, reason: collision with root package name */
        public final Handler f49012c;

        public a(Handler handler, InterfaceC1826b interfaceC1826b) {
            this.f49012c = handler;
            this.f49011b = interfaceC1826b;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f49012c.post(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (C23133b.this.f49010c) {
                A.c cVar = (A.c) this.f49011b;
                cVar.getClass();
                int i12 = A.f48357h0;
                A.this.v0(-1, 3, false);
            }
        }
    }

    /* compiled from: AudioBecomingNoisyManager.java */
    /* renamed from: androidx.media3.exoplayer.b$b, reason: collision with other inner class name */
    public interface InterfaceC1826b {
    }

    public C23133b(Context context, Handler handler, InterfaceC1826b interfaceC1826b) {
        this.f49008a = context.getApplicationContext();
        this.f49009b = new a(handler, interfaceC1826b);
    }

    public final void a(boolean z12) {
        a aVar = this.f49009b;
        Context context = this.f49008a;
        if (z12 && !this.f49010c) {
            context.registerReceiver(aVar, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.f49010c = true;
        } else {
            if (z12 || !this.f49010c) {
                return;
            }
            context.unregisterReceiver(aVar);
            this.f49010c = false;
        }
    }
}
