package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class g30 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final d30 f385557a = new d30();

    public final void a(@Y61.k uj0 uj0Var, @Y61.k Map<String, Bitmap> map) {
        Iterator<nj0> it = uj0Var.c().e().iterator();
        while (it.hasNext()) {
            List<eb<?>> listB = it.next().b();
            if (listB != null && !listB.isEmpty()) {
                a(listB, map);
            }
        }
    }

    public final void a(@Y61.k List<? extends eb<?>> list, @Y61.k Map<String, Bitmap> map) {
        List<b30> listA;
        for (eb<?> ebVar : list) {
            Object objD = ebVar.d();
            if (ebVar.c().equals("media") && (objD instanceof rd0) && (listA = ((rd0) objD).a()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : listA) {
                    this.f385557a.getClass();
                    if (d30.a((b30) obj, map)) {
                        arrayList.add(obj);
                    }
                }
                listA.retainAll(arrayList);
            }
        }
    }
}
