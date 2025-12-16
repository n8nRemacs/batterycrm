package com.hcaptcha.sdk;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f363106b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f363107c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f363108d;

    public /* synthetic */ k(m mVar, Object obj, int i12) {
        this.f363106b = i12;
        this.f363107c = mVar;
        this.f363108d = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f363106b) {
            case 0:
                this.f363107c.f363113d.onSuccess((String) this.f363108d);
                break;
            default:
                m mVar = this.f363107c;
                mVar.f363113d.B3(new HCaptchaException((HCaptchaError) this.f363108d));
                break;
        }
    }
}
