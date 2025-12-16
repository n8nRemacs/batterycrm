package com.yandex.mobile.ads.impl;

import android.graphics.RectF;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class of {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final d51 f388504a = new d51();

    @Y61.l
    public final c51 a(@Y61.k RectF rectF, @Y61.k b30 b30Var) {
        List<c51> listC;
        RectF rectF2 = new RectF(0.0f, 0.0f, b30Var.e(), b30Var.a());
        k51 k51VarC = b30Var.c();
        Object next = null;
        if (k51VarC == null || (listC = k51VarC.c()) == null) {
            return null;
        }
        Iterator<T> it = listC.iterator();
        if (it.hasNext()) {
            next = it.next();
            while (it.hasNext()) {
                c51 c51Var = (c51) it.next();
                this.f388504a.getClass();
                next = d51.a((c51) next, c51Var, rectF2, rectF);
            }
        }
        return (c51) next;
    }
}
