package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.instream.InstreamAdBreakEventListener;

/* loaded from: classes8.dex */
public final class ya0 implements InstreamAdBreakEventListener {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Handler f391981a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private InstreamAdBreakEventListener f391982b;

    @Override // com.yandex.mobile.ads.instream.InstreamAdBreakEventListener
    public final void onInstreamAdBreakCompleted() {
        this.f391981a.post(new F2(this, 2));
    }

    @Override // com.yandex.mobile.ads.instream.InstreamAdBreakEventListener
    public final void onInstreamAdBreakError(@j.N String str) {
        this.f391981a.post(new A2(5, this, str));
    }

    @Override // com.yandex.mobile.ads.instream.InstreamAdBreakEventListener
    public final void onInstreamAdBreakPrepared() {
        this.f391981a.post(new F2(this, 1));
    }

    @Override // com.yandex.mobile.ads.instream.InstreamAdBreakEventListener
    public final void onInstreamAdBreakStarted() {
        this.f391981a.post(new F2(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        InstreamAdBreakEventListener instreamAdBreakEventListener = this.f391982b;
        if (instreamAdBreakEventListener != null) {
            instreamAdBreakEventListener.onInstreamAdBreakPrepared();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        InstreamAdBreakEventListener instreamAdBreakEventListener = this.f391982b;
        if (instreamAdBreakEventListener != null) {
            instreamAdBreakEventListener.onInstreamAdBreakStarted();
        }
    }

    public final void a(@j.P InstreamAdBreakEventListener instreamAdBreakEventListener) {
        this.f391982b = instreamAdBreakEventListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a() {
        InstreamAdBreakEventListener instreamAdBreakEventListener = this.f391982b;
        if (instreamAdBreakEventListener != null) {
            instreamAdBreakEventListener.onInstreamAdBreakCompleted();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        InstreamAdBreakEventListener instreamAdBreakEventListener = this.f391982b;
        if (instreamAdBreakEventListener != null) {
            instreamAdBreakEventListener.onInstreamAdBreakError(str);
        }
    }
}
