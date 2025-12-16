package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.ky0;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class y7 implements InterfaceC39347n<x7> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final f8 f391947a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final x6 f391948b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final oy0 f391949c;

    public y7(@j.N f8 f8Var, @j.N x6 x6Var, @j.N oy0 oy0Var) {
        this.f391947a = f8Var;
        this.f391948b = x6Var;
        this.f391949c = oy0Var;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC39347n
    public final void a(@j.N View view, @j.N AbstractC39344m abstractC39344m) {
        x7 x7Var = (x7) abstractC39344m;
        Iterator<String> it = x7Var.c().iterator();
        while (it.hasNext()) {
            this.f391948b.a(it.next());
        }
        this.f391947a.a(view, x7Var);
        ((dj) this.f391949c).a(ky0.b.f387308i);
    }
}
