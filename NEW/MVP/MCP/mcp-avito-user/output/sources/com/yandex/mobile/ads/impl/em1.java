package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.List;

/* loaded from: classes8.dex */
final class em1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final jf1 f385006a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final cd1 f385007b;

    public em1(@j.N Context context, @j.N cd1 cd1Var) {
        this.f385007b = cd1Var;
        this.f385006a = jf1.a(context);
    }

    public final void a(@j.N Context context, @j.N ne1 ne1Var, @j.N yy0<List<ne1>> yy0Var) {
        this.f385006a.a(context, ne1Var, this.f385007b, new fm1(context, ne1Var, yy0Var));
    }
}
