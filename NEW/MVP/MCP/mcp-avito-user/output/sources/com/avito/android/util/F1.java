package com.avito.android.util;

import com.google.android.gms.tasks.InterfaceC37021d;
import com.google.android.gms.tasks.InterfaceC37023f;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class F1 implements InterfaceC37021d, InterfaceC37023f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ io.reactivex.rxjava3.core.K f318601b;

    public /* synthetic */ F1(io.reactivex.rxjava3.core.K k12) {
        this.f318601b = k12;
    }

    @Override // com.google.android.gms.tasks.InterfaceC37021d
    public void onCanceled() {
        io.reactivex.rxjava3.core.K k12 = this.f318601b;
        if (k12.i()) {
            return;
        }
        arrow.core.Y0.f56266a.getClass();
        k12.onSuccess(arrow.core.X0.f56264b);
    }

    @Override // com.google.android.gms.tasks.InterfaceC37023f
    public void onFailure(Exception exc) {
        io.reactivex.rxjava3.core.K k12 = this.f318601b;
        if (k12.i()) {
            return;
        }
        k12.onError(exc);
    }
}
