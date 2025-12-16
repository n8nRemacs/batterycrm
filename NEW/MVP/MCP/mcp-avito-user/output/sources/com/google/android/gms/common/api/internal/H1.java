package com.google.android.gms.common.api.internal;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes6.dex */
final class H1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w1 f349008b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f349009c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ I1 f349010d;

    public H1(I1 i12, w1 w1Var, String str) {
        this.f349010d = i12;
        this.f349008b = w1Var;
        this.f349009c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        I1 i12 = this.f349010d;
        int i13 = i12.f349017c;
        w1 w1Var = this.f349008b;
        if (i13 > 0) {
            Bundle bundle = i12.f349018d;
            w1Var.e(bundle != null ? bundle.getBundle(this.f349009c) : null);
        }
        if (i12.f349017c >= 2) {
            w1Var.i();
        }
        if (i12.f349017c >= 3) {
            w1Var.g();
        }
        if (i12.f349017c >= 4) {
            w1Var.j();
        }
        if (i12.f349017c >= 5) {
            w1Var.f();
        }
    }
}
