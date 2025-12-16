package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public final class gu {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    private final List<eb<?>> f385840a;

    public gu(@j.P List<eb<?>> list) {
        this.f385840a = list;
    }

    @j.N
    public final ArrayList a(@j.N com.yandex.mobile.ads.nativeads.w wVar) {
        fb fbVarA;
        ArrayList arrayList = new ArrayList();
        for (eb<?> ebVar : this.f385840a) {
            if (!ebVar.f() && ((fbVarA = wVar.a(ebVar)) == null || !fbVarA.b())) {
                arrayList.add(ebVar.b());
            }
        }
        return arrayList;
    }
}
