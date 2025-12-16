package com.geetest.captcha;

/* loaded from: classes4.dex */
public final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f342704a;

    public c(h hVar) {
        this.f342704a = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f342704a.dismiss();
    }
}
