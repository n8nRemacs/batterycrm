package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public final class gm1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final vg1 f385780a = new vg1();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final lm1 f385781b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final bm1 f385782c;

    public gm1(@j.N Context context, @j.N ne1 ne1Var) {
        this.f385781b = new lm1(ne1Var);
        this.f385782c = new bm1(context, ne1Var);
    }

    @j.N
    public final List<ne1> a(@j.N List<ne1> list) {
        jm1 jm1VarA = this.f385781b.a();
        if (jm1VarA == null) {
            return list;
        }
        if (!jm1VarA.b()) {
            this.f385780a.getClass();
            list = vg1.a(list).a();
        }
        if (!jm1VarA.a() && !list.isEmpty()) {
            list = Collections.singletonList(list.get(0));
        }
        return this.f385782c.a(list);
    }
}
