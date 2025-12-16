package com.yandex.mobile.ads.impl;

import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes8.dex */
public final class ta1 implements n50 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final w20 f390144a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    private final eb<?> f390145b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final ib f390146c;

    public ta1(@Y61.k w20 w20Var, @Y61.l eb<?> ebVar, @Y61.k ib ibVar) {
        this.f390144a = w20Var;
        this.f390145b = ebVar;
        this.f390146c = ibVar;
    }

    @Override // com.yandex.mobile.ads.impl.n50
    public final void a(@Y61.k se1 se1Var) {
        ImageView imageViewP = se1Var.p();
        TextView textViewO = se1Var.o();
        if (imageViewP != null) {
            eb<?> ebVar = this.f390145b;
            Object objD = ebVar != null ? ebVar.d() : null;
            b30 b30Var = objD instanceof b30 ? (b30) objD : null;
            if (b30Var != null) {
                imageViewP.setImageBitmap(this.f390144a.a(b30Var));
                imageViewP.setVisibility(0);
                if (textViewO != null) {
                    textViewO.setVisibility(0);
                }
            }
            this.f390146c.a(imageViewP, this.f390145b);
        }
    }
}
