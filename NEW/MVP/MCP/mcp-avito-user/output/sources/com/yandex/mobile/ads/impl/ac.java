package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.ll0;
import com.yandex.mobile.ads.nativeads.Rating;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes8.dex */
public final class ac {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final List<String> f383457a;

    public ac() {
        this(new ArrayList());
    }

    @j.N
    public final ll0 a(@j.N View view, @j.N qj0 qj0Var) {
        ll0.a aVar = new ll0.a(view, new HashMap());
        ll0.a aVarE = aVar.a(qj0Var.g(view)).b(qj0Var.a(view)).c(qj0Var.d(view)).d(qj0Var.l(view)).a(qj0Var.f(view)).b(qj0Var.j(view)).c(qj0Var.m(view)).a(qj0Var.b(view)).e(qj0Var.c(view));
        View viewH = qj0Var.h(view);
        if (!(viewH instanceof Rating)) {
            viewH = null;
        }
        aVarE.a(viewH).f(qj0Var.n(view)).g(qj0Var.k(view)).h(qj0Var.i(view)).i(qj0Var.e(view));
        for (String str : this.f383457a) {
            View viewA = qj0Var.a(view, str);
            if (viewA != null) {
                aVar.a(viewA, str);
            }
        }
        return new ll0(aVar, 0);
    }

    public ac(@j.N List<String> list) {
        this.f383457a = list;
    }
}
