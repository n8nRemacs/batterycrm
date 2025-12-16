package com.my.tracker.obfuscated;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class B0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f365266b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C37848w f365267c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f365268d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f365269e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f365270f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f365271g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f365272h;

    public /* synthetic */ B0(C37848w c37848w, String str, String str2, long j12, long j13, long j14, int i12) {
        this.f365266b = i12;
        this.f365267c = c37848w;
        this.f365268d = str;
        this.f365269e = str2;
        this.f365270f = j12;
        this.f365271g = j13;
        this.f365272h = j14;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f365266b) {
            case 0:
                this.f365267c.b(this.f365268d, this.f365269e, this.f365270f, this.f365271g, this.f365272h);
                break;
            default:
                this.f365267c.a(this.f365268d, this.f365269e, this.f365270f, this.f365271g, this.f365272h);
                break;
        }
    }
}
