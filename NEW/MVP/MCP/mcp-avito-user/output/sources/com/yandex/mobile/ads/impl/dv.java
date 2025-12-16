package com.yandex.mobile.ads.impl;

import android.widget.ImageView;

/* loaded from: classes8.dex */
public final class dv implements n50 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final w20 f384689a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    private final eb<?> f384690b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final ib f384691c;

    public dv(@Y61.k w20 w20Var, @Y61.l eb<?> ebVar, @Y61.k ib ibVar) {
        this.f384689a = w20Var;
        this.f384690b = ebVar;
        this.f384691c = ibVar;
    }

    @Override // com.yandex.mobile.ads.impl.n50
    public final void a(@Y61.k se1 se1Var) {
        ImageView imageViewG = se1Var.g();
        if (imageViewG != null) {
            eb<?> ebVar = this.f384690b;
            kotlin.G0 g02 = null;
            Object objD = ebVar != null ? ebVar.d() : null;
            b30 b30Var = objD instanceof b30 ? (b30) objD : null;
            if (b30Var != null) {
                imageViewG.setImageBitmap(this.f384689a.a(b30Var));
                imageViewG.setVisibility(0);
                g02 = kotlin.G0.f406611a;
            }
            if (g02 == null) {
                imageViewG.setVisibility(8);
            }
            this.f384691c.a(imageViewG, this.f384690b);
        }
    }
}
