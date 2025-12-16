package com.yandex.mobile.ads.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* loaded from: classes8.dex */
final class kc {

    /* renamed from: a, reason: collision with root package name */
    private final Context f387099a;

    /* renamed from: b, reason: collision with root package name */
    private final a f387100b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f387101c;

    public final class a extends BroadcastReceiver implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private final b f387102b;

        /* renamed from: c, reason: collision with root package name */
        private final Handler f387103c;

        public a(Handler handler, b bVar) {
            this.f387103c = handler;
            this.f387102b = bVar;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f387103c.post(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (kc.this.f387101c) {
                pt.this.a(-1, 3, false);
            }
        }
    }

    public interface b {
    }

    public kc(Context context, Handler handler, b bVar) {
        this.f387099a = context.getApplicationContext();
        this.f387100b = new a(handler, bVar);
    }

    public final void a() {
        if (this.f387101c) {
            this.f387099a.unregisterReceiver(this.f387100b);
            this.f387101c = false;
        }
    }
}
