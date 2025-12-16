package com.yandex.mobile.ads.impl;

import android.widget.TextView;

/* loaded from: classes8.dex */
public final class nr implements n50 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    private final eb<?> f388348a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final ib f388349b;

    public nr(@Y61.l eb<?> ebVar, @Y61.k ib ibVar) {
        this.f388348a = ebVar;
        this.f388349b = ibVar;
    }

    @Override // com.yandex.mobile.ads.impl.n50
    public final void a(@Y61.k se1 se1Var) {
        TextView textViewF = se1Var.f();
        eb<?> ebVar = this.f388348a;
        Object objD = ebVar != null ? ebVar.d() : null;
        if (textViewF != null) {
            if (!(objD instanceof String)) {
                textViewF.setVisibility(8);
                return;
            }
            textViewF.setText((CharSequence) objD);
            textViewF.setVisibility(0);
            this.f388349b.a(textViewF, this.f388348a);
        }
    }
}
