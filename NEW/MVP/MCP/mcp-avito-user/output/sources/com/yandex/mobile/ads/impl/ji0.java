package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import android.view.View;

/* loaded from: classes8.dex */
public final class ji0 extends bj1<hi0, rb0> {
    public ji0(@j.N hi0 hi0Var) {
        super(hi0Var);
    }

    @Override // com.yandex.mobile.ads.impl.bj1
    public final void a(@j.N View view) {
        super.a((hi0) view);
    }

    @Override // com.yandex.mobile.ads.impl.bj1
    public final void b(@j.N View view, @j.N rb0 rb0Var) {
        hi0 hi0Var = (hi0) view;
        rb0 rb0Var2 = rb0Var;
        String strB = rb0Var2.b();
        if (TextUtils.isEmpty(strB)) {
            return;
        }
        hi0Var.setAspectRatio(rb0Var2.a());
        hi0Var.b(strB);
    }

    @Override // com.yandex.mobile.ads.impl.bj1
    public final void a(@j.N eb ebVar, @j.N ej1 ej1Var, @j.P rb0 rb0Var) {
        hi0 hi0VarB = b();
        if (hi0VarB != null) {
            ej1Var.a(hi0VarB, ebVar);
            ej1Var.a(ebVar, new rh0(hi0VarB));
        }
    }

    @Override // com.yandex.mobile.ads.impl.bj1
    public final /* bridge */ /* synthetic */ boolean a(@j.N View view, @j.N rb0 rb0Var) {
        return true;
    }
}
