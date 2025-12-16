package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;

/* loaded from: classes8.dex */
final class wc1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f391377a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final Handler f391378b = new Handler(Looper.getMainLooper());

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Toast.makeText(wc1.this.f391377a, "The Yandex Mobile Ads SDK needs to be updated to the latest version. Details in the logs", 1).show();
        }
    }

    public wc1(@j.N Context context) {
        this.f391377a = context.getApplicationContext();
    }

    public final void a() {
        this.f391378b.post(new a());
    }
}
