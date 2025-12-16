package com.geetest.captcha;

import com.geetest.captcha.GTCaptcha4Client;

/* renamed from: com.geetest.captcha.r, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC36501r implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f342778a;

    public RunnableC36501r(p pVar) {
        this.f342778a = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        GTCaptcha4Client.OnWebViewShowListener onWebViewShowListener = this.f342778a.f342770f;
        if (onWebViewShowListener != null) {
            onWebViewShowListener.onWebViewShow();
        }
    }
}
