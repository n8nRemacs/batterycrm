package com.my.tracker.obfuscated;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class M implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f365298b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n1 f365299c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f365300d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f365301e;

    public /* synthetic */ M(n1 n1Var, long j12, int i12, int i13) {
        this.f365298b = i13;
        this.f365299c = n1Var;
        this.f365300d = j12;
        this.f365301e = i12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f365298b) {
            case 0:
                this.f365299c.e(this.f365300d, this.f365301e);
                break;
            case 1:
                this.f365299c.f(this.f365300d, this.f365301e);
                break;
            case 2:
                this.f365299c.g(this.f365300d, this.f365301e);
                break;
            default:
                this.f365299c.h(this.f365300d, this.f365301e);
                break;
        }
    }
}
