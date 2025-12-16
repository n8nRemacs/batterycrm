package com.yandex.metrica.impl.ob;

import android.webkit.WebView;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes7.dex */
class Gl implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Il f378193a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ WebView f378194b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ CountDownLatch f378195c;

    public Gl(Hl hl2, Il il2, WebView webView, CountDownLatch countDownLatch) {
        this.f378193a = il2;
        this.f378194b = webView;
        this.f378195c = countDownLatch;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f378193a.f378529h = this.f378194b.getUrl();
            this.f378193a.f378530i = this.f378194b.getOriginalUrl();
            this.f378195c.countDown();
        } catch (Throwable unused) {
        }
    }
}
