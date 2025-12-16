package com.yandex.mobile.ads.impl;

import android.view.View;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.C42745f0;

/* loaded from: classes8.dex */
public final class kb {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final LinkedHashMap f387095a;

    public kb(@Y61.k com.yandex.mobile.ads.nativeads.c cVar, @Y61.k List<? extends eb<?>> list, @Y61.k i2 i2Var, @Y61.k com.yandex.mobile.ads.nativeads.w wVar, @Y61.k tx0 tx0Var, @Y61.k n30 n30Var, @Y61.l h90 h90Var) {
        int iF2 = kotlin.collections.P0.f(C42745f0.q(list, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF2 < 16 ? 16 : iF2);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            eb ebVar = (eb) it.next();
            String strB = ebVar.b();
            h90 h90VarA = ebVar.a();
            linkedHashMap.put(strB, cVar.a(n30Var, tx0Var, i2Var, wVar, ebVar, h90VarA == null ? h90Var : h90VarA));
        }
        this.f387095a = linkedHashMap;
    }

    public final void a(@Y61.k View view, @Y61.k String str) {
        View.OnClickListener onClickListener = (View.OnClickListener) this.f387095a.get(str);
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }
}
