package com.my.tracker.obfuscated;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class N implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f365302b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n1 f365303c;

    public /* synthetic */ N(n1 n1Var, int i12) {
        this.f365302b = i12;
        this.f365303c = n1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f365302b) {
            case 0:
                this.f365303c.f();
                break;
            default:
                this.f365303c.c();
                break;
        }
    }
}
