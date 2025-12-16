package com.my.tracker.obfuscated;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class K implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f365294b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e0 f365295c;

    public /* synthetic */ K(e0 e0Var, int i12) {
        this.f365294b = i12;
        this.f365295c = e0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f365294b) {
            case 0:
                this.f365295c.c();
                break;
            default:
                e0.a(this.f365295c);
                break;
        }
    }
}
