package com.yandex.mobile.ads.impl;

import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes8.dex */
public final class p51 implements InterfaceC39347n<o51> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final r31 f388726a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final x51 f388727b;

    public p51(@j.N r31 r31Var, @j.N x51 x51Var) {
        this.f388726a = r31Var;
        this.f388727b = x51Var;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC39347n
    public final void a(@j.N View view, @j.N AbstractC39344m abstractC39344m) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        o51 o51Var = (o51) abstractC39344m;
        this.f388726a.a(o51Var.b());
        this.f388727b.a(view, o51Var);
    }
}
