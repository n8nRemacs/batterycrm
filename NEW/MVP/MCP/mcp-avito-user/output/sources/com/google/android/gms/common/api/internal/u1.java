package com.google.android.gms.common.api.internal;

import android.app.AlertDialog;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
final class u1 extends C0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AlertDialog f349227a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v1 f349228b;

    public u1(v1 v1Var, AlertDialog alertDialog) {
        this.f349228b = v1Var;
        this.f349227a = alertDialog;
    }

    @Override // com.google.android.gms.common.api.internal.C0
    public final void a() {
        w1 w1Var = this.f349228b.f349231c;
        w1Var.f349246d.set(null);
        w1Var.l();
        AlertDialog alertDialog = this.f349227a;
        if (alertDialog.isShowing()) {
            alertDialog.dismiss();
        }
    }
}
