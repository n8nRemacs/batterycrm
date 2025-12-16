package com.hcaptcha.sdk;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f363109b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f363110c;

    public /* synthetic */ l(t tVar, int i12) {
        this.f363109b = i12;
        this.f363110c = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f363109b) {
            case 0:
                this.f363110c.v4();
                break;
            default:
                this.f363110c.c3();
                break;
        }
    }
}
