package com.yandex.metrica.impl.ob;

import java.util.Comparator;

/* loaded from: classes7.dex */
public class pn implements Comparator<C39177uj> {
    @Override // java.util.Comparator
    public int compare(C39177uj c39177uj, C39177uj c39177uj2) {
        C39177uj c39177uj3 = c39177uj;
        C39177uj c39177uj4 = c39177uj2;
        if (c39177uj3 == c39177uj4) {
            return 0;
        }
        if (!((c39177uj4 == null) ^ (c39177uj3 == null)) && c39177uj3.q() == c39177uj4.q() && c39177uj3.c() == c39177uj4.c() && (c39177uj3.k() == null ? c39177uj4.k() == null : c39177uj3.k().equals(c39177uj4.k())) && (c39177uj3.l() == null ? c39177uj4.l() == null : c39177uj3.l().equals(c39177uj4.l())) && (c39177uj3.e() == null ? c39177uj4.e() == null : c39177uj3.e().equals(c39177uj4.e())) && (c39177uj3.b() == null ? c39177uj4.b() == null : c39177uj3.b().equals(c39177uj4.b())) && (c39177uj3.n() == null ? c39177uj4.n() == null : c39177uj3.n().equals(c39177uj4.n())) && (c39177uj3.m() == null ? c39177uj4.m() == null : c39177uj3.m().equals(c39177uj4.m()))) {
            if (c39177uj3.o() != null) {
                if (c39177uj3.o().equals(c39177uj4.o())) {
                    return 0;
                }
            } else if (c39177uj4.o() == null) {
                return 0;
            }
        }
        return 10;
    }
}
