package com.avito.android.remote.notification;

import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class N implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f253959b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ S f253960c;

    public /* synthetic */ N(S s5, int i12) {
        this.f253959b = i12;
        this.f253960c = s5;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f253959b) {
            case 0:
                return Integer.valueOf(this.f253960c.f253980b.a());
            case 1:
                return Integer.valueOf(this.f253960c.f253979a.q());
            default:
                return Integer.valueOf(this.f253960c.f253981c.b());
        }
    }
}
