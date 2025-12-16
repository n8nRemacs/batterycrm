package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C42745f0;

/* loaded from: classes8.dex */
public final class sx0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final List<eb> f390042a;

    /* JADX WARN: Multi-variable type inference failed */
    public sx0(@Y61.k List<? extends eb> list) {
        this.f390042a = list;
    }

    @Y61.k
    public final ArrayList a(@Y61.k com.yandex.mobile.ads.nativeads.w wVar) {
        List<eb> list = this.f390042a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            fb fbVarA = wVar.a((eb) obj);
            if (fbVarA != null ? fbVarA.b() : false) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((eb) it.next()).b());
        }
        return arrayList2;
    }
}
