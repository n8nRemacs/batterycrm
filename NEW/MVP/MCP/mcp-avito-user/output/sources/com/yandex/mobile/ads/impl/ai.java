package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes8.dex */
public final class ai implements n50 {
    @Override // com.yandex.mobile.ads.impl.n50
    public final void a(@Y61.k se1 se1Var) {
        View viewC = se1Var.c();
        TextView textViewF = se1Var.f();
        ImageView imageViewG = se1Var.g();
        if (textViewF == null || textViewF.getVisibility() != 8 || imageViewG == null || imageViewG.getVisibility() != 8 || viewC == null) {
            return;
        }
        viewC.setBackground(null);
    }
}
