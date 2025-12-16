package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import java.util.List;

/* loaded from: classes8.dex */
public final class x80<V extends ViewGroup> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final List<u80<V>> f391576a;

    public x80(@j.N List<u80<V>> list) {
        this.f391576a = list;
    }

    @j.P
    public final u80<V> a(@j.N Context context) {
        for (u80<V> u80Var : this.f391576a) {
            if (u80Var.b().a(context)) {
                return u80Var;
            }
        }
        return null;
    }
}
