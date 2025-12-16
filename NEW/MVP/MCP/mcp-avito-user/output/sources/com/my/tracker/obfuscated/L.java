package com.my.tracker.obfuscated;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class L implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f365296b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f365297c;

    public /* synthetic */ L(g1 g1Var, int i12) {
        this.f365296b = i12;
        this.f365297c = g1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f365296b) {
            case 0:
                this.f365297c.a();
                break;
            default:
                this.f365297c.b();
                break;
        }
    }
}
