package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.instream.InstreamAdListener;

/* loaded from: classes8.dex */
public final class g60 implements z60 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Handler f385599a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private InstreamAdListener f385600b;

    public final void d() {
        this.f385599a.post(new F0(this, 1));
    }

    public final void e() {
        this.f385599a.post(new F0(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        InstreamAdListener instreamAdListener = this.f385600b;
        if (instreamAdListener != null) {
            instreamAdListener.onInstreamAdCompleted();
        }
    }

    public final void a(@j.P InstreamAdListener instreamAdListener) {
        this.f385600b = instreamAdListener;
    }

    public final void c() {
        this.f385599a.post(new F0(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a() {
        InstreamAdListener instreamAdListener = this.f385600b;
        if (instreamAdListener != null) {
            instreamAdListener.onInstreamAdPrepared();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        InstreamAdListener instreamAdListener = this.f385600b;
        if (instreamAdListener != null) {
            instreamAdListener.onError(str);
        }
    }
}
