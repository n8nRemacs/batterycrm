package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.bk;
import com.yandex.mobile.ads.impl.ik;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes8.dex */
public final class hk implements va1 {
    private static ik b(w90 w90Var, bk bkVar) {
        ik bVar;
        String strB = bkVar.b();
        try {
            int iOrdinal = bkVar.ordinal();
            if (iOrdinal != 0) {
                boolean z12 = true;
                if (iOrdinal == 1) {
                    int iB2 = w90Var.b(-1, strB);
                    Integer numValueOf = Integer.valueOf(iB2);
                    if (iB2 == -1) {
                        numValueOf = null;
                    }
                    bVar = new ik.c(numValueOf != null ? String.valueOf(numValueOf.intValue()) : null);
                } else if (iOrdinal == 2) {
                    if (w90Var.b(-1, strB) == -1) {
                        z12 = false;
                    }
                    bVar = new ik.a(z12);
                } else if (iOrdinal == 3) {
                    bVar = new ik.d(w90Var.b(strB));
                } else {
                    if (iOrdinal != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar = new ik.e(w90Var.b(strB));
                }
            } else {
                bVar = new ik.b(w90Var.b(strB));
            }
            return bVar;
        } catch (ClassCastException unused) {
            return null;
        }
    }

    @Override // com.yandex.mobile.ads.impl.va1
    @Y61.l
    public final ik a(@Y61.k w90 w90Var, @Y61.k String str) {
        if (!w90Var.contains(str)) {
            str = null;
        }
        bk bkVarB = str != null ? bk.a.b(str) : null;
        if (bkVarB != null) {
            return b(w90Var, bkVarB);
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.va1
    @Y61.l
    public final ik a(@Y61.k w90 w90Var, @Y61.k bk bkVar) {
        if (!w90Var.contains(bkVar.b())) {
            bkVar = null;
        }
        if (bkVar != null) {
            return b(w90Var, bkVar);
        }
        return null;
    }
}
