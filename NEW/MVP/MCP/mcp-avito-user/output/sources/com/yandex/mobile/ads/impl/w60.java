package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;

/* loaded from: classes8.dex */
public final class w60 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final jm f391296a;

    public w60(@Y61.k jm jmVar) {
        this.f391296a = jmVar;
    }

    @Y61.k
    public final ch1 a(@Y61.k im imVar, @Y61.l String str) {
        Object next;
        this.f391296a.getClass();
        Iterator it = jm.a(imVar).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (kotlin.jvm.internal.L.f(((eb) next).b(), str)) {
                break;
            }
        }
        eb ebVar = (eb) next;
        h90 h90VarA = ebVar != null ? ebVar.a() : null;
        if (h90VarA != null) {
            return new ch1(h90VarA.e(), C42745f0.V(h90VarA.d()));
        }
        String strB = imVar.b();
        List<String> list = imVar.a().get("clickTracking");
        return new ch1(strB, list != null ? C42745f0.C(list) : C42784z0.f406748b);
    }
}
