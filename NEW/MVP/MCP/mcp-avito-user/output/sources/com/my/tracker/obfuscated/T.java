package com.my.tracker.obfuscated;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class T implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f365322b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C37848w f365323c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f365324d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f365325e;

    public /* synthetic */ T(C37848w c37848w, long j12, float f12, int i12) {
        this.f365322b = i12;
        this.f365323c = c37848w;
        this.f365324d = j12;
        this.f365325e = f12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f365322b) {
            case 0:
                this.f365323c.b(this.f365324d, this.f365325e);
                break;
            case 1:
                this.f365323c.a(this.f365324d, this.f365325e);
                break;
            default:
                this.f365323c.c(this.f365324d, this.f365325e);
                break;
        }
    }
}
