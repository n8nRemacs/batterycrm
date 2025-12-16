package com.avito.android.code_confirmation.code_confirmation;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import l41.InterfaceC43543a;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.code_confirmation.code_confirmation.u, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class C29407u implements InterfaceC43543a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f119639b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ T f119640c;

    public /* synthetic */ C29407u(T t12, int i12) {
        this.f119639b = i12;
        this.f119640c = t12;
    }

    @Override // l41.InterfaceC43543a
    public final void run() {
        switch (this.f119639b) {
            case 0:
                f0 f0Var = this.f119640c.f119452m;
                if (f0Var != null) {
                    f0Var.c();
                    break;
                }
                break;
            case 1:
                T t12 = this.f119640c;
                t12.f119461v = null;
                f0 f0Var2 = t12.f119452m;
                if (f0Var2 != null) {
                    f0Var2.i();
                    break;
                }
                break;
            case 2:
                f0 f0Var3 = this.f119640c.f119452m;
                if (f0Var3 != null) {
                    f0Var3.c();
                    break;
                }
                break;
            case 3:
                f0 f0Var4 = this.f119640c.f119452m;
                if (f0Var4 != null) {
                    f0Var4.c();
                    break;
                }
                break;
            default:
                ScreenPerformanceTracker.a.d(this.f119640c.f119451l, "requestCode", null, null, null, 14);
                break;
        }
    }
}
