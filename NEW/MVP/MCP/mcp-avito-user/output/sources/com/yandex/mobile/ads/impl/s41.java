package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.TextView;

/* loaded from: classes8.dex */
public final class s41 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final l50 f389786a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final j50 f389787b = new j50();

    public s41(@Y61.k l50 l50Var) {
        this.f389786a = l50Var;
    }

    public final void a() {
        se1 se1VarA;
        se1 se1VarA2;
        lu luVarB;
        lu luVarB2;
        k50 k50VarA = this.f389786a.a();
        if (k50VarA == null || (luVarB2 = k50VarA.b()) == null) {
            se1VarA = null;
        } else {
            this.f389787b.getClass();
            se1VarA = j50.a(luVarB2);
        }
        TextView textViewK = se1VarA != null ? se1VarA.k() : null;
        if (textViewK != null) {
            textViewK.setVisibility(8);
        }
        k50 k50VarA2 = this.f389786a.a();
        if (k50VarA2 == null || (luVarB = k50VarA2.b()) == null) {
            se1VarA2 = null;
        } else {
            this.f389787b.getClass();
            se1VarA2 = j50.a(luVarB);
        }
        View viewL = se1VarA2 != null ? se1VarA2.l() : null;
        if (viewL != null) {
            viewL.setVisibility(0);
            viewL.setEnabled(true);
        }
    }

    public final void a(long j12, long j13) {
        se1 se1VarA;
        lu luVarB;
        k50 k50VarA = this.f389786a.a();
        if (k50VarA == null || (luVarB = k50VarA.b()) == null) {
            se1VarA = null;
        } else {
            this.f389787b.getClass();
            se1VarA = j50.a(luVarB);
        }
        TextView textViewK = se1VarA != null ? se1VarA.k() : null;
        int i12 = ((int) ((j12 - j13) / 1000)) + 1;
        if (textViewK != null) {
            textViewK.setText(String.valueOf(i12));
            textViewK.setVisibility(0);
        }
    }
}
