package com.yandex.mobile.ads.impl;

import java.util.HashMap;
import java.util.List;

/* loaded from: classes8.dex */
public final class bc {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final List<eb> f383880a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    private com.yandex.mobile.ads.nativeads.w f383881b;

    /* JADX WARN: Multi-variable type inference failed */
    public bc(@Y61.k List<? extends eb> list) {
        this.f383880a = list;
    }

    public final void a(@Y61.l com.yandex.mobile.ads.nativeads.w wVar) {
        this.f383881b = wVar;
    }

    @Y61.k
    public final HashMap a() {
        fb fbVarA;
        int iF2;
        HashMap map = new HashMap();
        for (eb ebVar : this.f383880a) {
            String strB = ebVar.b();
            com.yandex.mobile.ads.nativeads.w wVar = this.f383881b;
            if (wVar != null && (fbVarA = wVar.a(ebVar)) != null && fbVarA.b()) {
                HashMap map2 = new HashMap();
                hj1 hj1VarC = fbVarA.c();
                if (hj1VarC != null) {
                    map2.put("width", Integer.valueOf(hj1VarC.b()));
                    map2.put("height", Integer.valueOf(hj1VarC.a()));
                }
                ub0 ub0Var = fbVarA instanceof ub0 ? (ub0) fbVarA : null;
                if (ub0Var != null && (iF2 = ub0Var.f()) != 0) {
                    map2.put("value_type", ud0.a(iF2));
                }
                map.put(strB, map2);
            }
        }
        return map;
    }
}
