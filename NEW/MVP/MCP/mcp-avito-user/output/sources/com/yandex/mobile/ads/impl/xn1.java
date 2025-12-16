package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.ImageView;
import com.yandex.mobile.ads.nativeads.CustomizableMediaView;
import java.util.List;

/* loaded from: classes8.dex */
public final class xn1 extends vd0 {

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final cj1<ImageView, b30> f391785c;

    public xn1(@j.N CustomizableMediaView customizableMediaView, @j.N j30 j30Var, @j.N n2 n2Var) {
        super(customizableMediaView, n2Var);
        this.f391785c = new cj1<>(j30Var);
    }

    @Override // com.yandex.mobile.ads.impl.bj1
    public final void a(@j.N View view) {
        this.f391785c.a();
        super.a((xn1) view);
    }

    @Override // com.yandex.mobile.ads.impl.bj1
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final boolean a(@j.N CustomizableMediaView customizableMediaView, @j.N rd0 rd0Var) {
        List<b30> listA = rd0Var.a();
        b30 b30Var = (listA == null || listA.isEmpty()) ? null : listA.get(0);
        if (b30Var != null) {
            return this.f391785c.a(b30Var);
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.vd0
    @j.N
    public final int c() {
        return 4;
    }

    @Override // com.yandex.mobile.ads.impl.bj1
    public final void a(@j.N eb ebVar, @j.N ej1 ej1Var, @j.P rd0 rd0Var) {
        rd0 rd0Var2 = rd0Var;
        b30 b30Var = null;
        List<b30> listA = rd0Var2 != null ? rd0Var2.a() : null;
        if (listA != null && !listA.isEmpty()) {
            b30Var = listA.get(0);
        }
        this.f391785c.a(ebVar, ej1Var, b30Var);
    }

    @Override // com.yandex.mobile.ads.impl.vd0
    /* renamed from: a */
    public final void b(@j.N CustomizableMediaView customizableMediaView, @j.N rd0 rd0Var) {
        super.b(customizableMediaView, rd0Var);
        List<b30> listA = rd0Var.a();
        b30 b30Var = (listA == null || listA.isEmpty()) ? null : listA.get(0);
        if (b30Var != null) {
            this.f391785c.b(b30Var);
        }
    }

    @Override // com.yandex.mobile.ads.impl.vd0
    public final void a(@j.N rd0 rd0Var) {
        List<b30> listA = rd0Var.a();
        b30 b30Var = (listA == null || listA.isEmpty()) ? null : listA.get(0);
        if (b30Var != null) {
            this.f391785c.b(b30Var);
        }
    }
}
