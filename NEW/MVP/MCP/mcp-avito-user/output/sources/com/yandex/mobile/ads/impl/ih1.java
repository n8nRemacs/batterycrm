package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.common.VideoEventListener;

/* loaded from: classes8.dex */
public final class ih1 implements nh1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Handler f386494a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private VideoEventListener f386495b;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        VideoEventListener videoEventListener = this.f386495b;
        if (videoEventListener != null) {
            videoEventListener.onVideoComplete();
        }
    }

    public final void a(@j.P VideoEventListener videoEventListener) {
        this.f386495b = videoEventListener;
    }

    @Override // com.yandex.mobile.ads.impl.nh1
    public final void a() {
        this.f386494a.post(new J(this, 7));
    }
}
