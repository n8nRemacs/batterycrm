package com.hcaptcha.sdk;

import java.util.Iterator;

/* loaded from: classes7.dex */
class HCaptcha$1 extends HCaptchaStateListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f363036b;

    public HCaptcha$1(b bVar) {
        this.f363036b = bVar;
    }

    @Override // com.hcaptcha.sdk.HCaptchaStateListener
    public final void a(HCaptchaException hCaptchaException) {
        b bVar = this.f363036b;
        bVar.f363123b = hCaptchaException;
        bVar.b();
    }

    @Override // com.hcaptcha.sdk.HCaptchaStateListener
    public final void c() {
        Iterator it = this.f363036b.f363126e.iterator();
        while (it.hasNext()) {
            ((com.hcaptcha.sdk.tasks.c) it.next()).v4();
        }
    }

    @Override // com.hcaptcha.sdk.HCaptchaStateListener
    public final void d(String str) {
        b bVar = this.f363036b;
        bVar.a(bVar.f363094i.getTokenExpiration());
        bVar.f363122a = new o(str);
        bVar.b();
    }
}
