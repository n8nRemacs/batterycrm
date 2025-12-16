package com.geetest.captcha;

import com.geetest.captcha.GTCaptcha4Client;

/* loaded from: classes4.dex */
public final class q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f342775a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f342776b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f342777c;

    public q(p pVar, boolean z12, String str) {
        this.f342775a = pVar;
        this.f342776b = z12;
        this.f342777c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        GTCaptcha4Client.OnSuccessListener onSuccessListener = this.f342775a.f342768d;
        if (onSuccessListener != null) {
            onSuccessListener.onSuccess(this.f342776b, this.f342777c);
        }
    }
}
