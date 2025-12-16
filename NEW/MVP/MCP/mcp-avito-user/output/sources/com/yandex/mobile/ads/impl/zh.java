package com.yandex.mobile.ads.impl;

import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes8.dex */
public final class zh implements n50 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    private final eb<?> f392269a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final wi f392270b;

    public zh(@Y61.l eb<?> ebVar, @Y61.k wi wiVar) {
        this.f392269a = ebVar;
        this.f392270b = wiVar;
    }

    @Override // com.yandex.mobile.ads.impl.n50
    public final void a(@Y61.k se1 se1Var) {
        TextView textViewE = se1Var.e();
        ImageView imageViewD = se1Var.d();
        if (textViewE != null) {
            eb<?> ebVar = this.f392269a;
            Object objD = ebVar != null ? ebVar.d() : null;
            if (objD instanceof String) {
                textViewE.setVisibility(0);
                textViewE.setText((CharSequence) objD);
            } else {
                textViewE.setVisibility(8);
            }
            this.f392270b.a(textViewE);
        }
        if (imageViewD != null) {
            this.f392270b.a(imageViewD);
        }
    }
}
