package com.yandex.mobile.ads.impl;

import android.widget.TextView;

/* loaded from: classes8.dex */
public final class n61 implements n50 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    private final eb<?> f388174a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final ib f388175b;

    public n61(@Y61.l eb<?> ebVar, @Y61.k ib ibVar) {
        this.f388174a = ebVar;
        this.f388175b = ibVar;
    }

    @Override // com.yandex.mobile.ads.impl.n50
    public final void a(@Y61.k se1 se1Var) {
        TextView textViewN = se1Var.n();
        if (textViewN != null) {
            eb<?> ebVar = this.f388174a;
            Object objD = ebVar != null ? ebVar.d() : null;
            if (objD instanceof String) {
                textViewN.setText((CharSequence) objD);
                textViewN.setVisibility(0);
            }
            this.f388175b.a(textViewN, this.f388174a);
        }
    }
}
