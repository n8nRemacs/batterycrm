package com.my.tracker.obfuscated;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class S implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f365316b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C37848w f365317c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f365318d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f365319e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f365320f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f365321g;

    public /* synthetic */ S(C37848w c37848w, long j12, float f12, float f13, float f14, int i12) {
        this.f365316b = i12;
        this.f365317c = c37848w;
        this.f365318d = j12;
        this.f365319e = f12;
        this.f365320f = f13;
        this.f365321g = f14;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f365316b) {
            case 0:
                this.f365317c.a(this.f365318d, this.f365319e, this.f365320f, this.f365321g);
                break;
            default:
                this.f365317c.b(this.f365318d, this.f365319e, this.f365320f, this.f365321g);
                break;
        }
    }
}
