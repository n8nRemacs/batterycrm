package com.google.android.gms.common.api.internal;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes6.dex */
final class J1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w1 f349019b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f349020c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzd f349021d;

    public J1(zzd zzdVar, w1 w1Var, String str) {
        this.f349021d = zzdVar;
        this.f349019b = w1Var;
        this.f349020c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzd zzdVar = this.f349021d;
        int i12 = zzdVar.f349257g0;
        w1 w1Var = this.f349019b;
        if (i12 > 0) {
            Bundle bundle = zzdVar.f349258h0;
            w1Var.e(bundle != null ? bundle.getBundle(this.f349020c) : null);
        }
        if (zzdVar.f349257g0 >= 2) {
            w1Var.i();
        }
        if (zzdVar.f349257g0 >= 3) {
            w1Var.g();
        }
        if (zzdVar.f349257g0 >= 4) {
            w1Var.j();
        }
        if (zzdVar.f349257g0 >= 5) {
            w1Var.f();
        }
    }
}
