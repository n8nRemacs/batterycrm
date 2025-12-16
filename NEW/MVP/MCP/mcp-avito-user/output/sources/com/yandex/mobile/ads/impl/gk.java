package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.bk;
import com.yandex.mobile.ads.impl.ik;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes8.dex */
public final class gk implements va1 {
    private static ik b(w90 w90Var, bk bkVar) {
        String strA = bkVar.a();
        try {
            int iOrdinal = bkVar.ordinal();
            if (iOrdinal == 0) {
                return new ik.b(w90Var.b(strA));
            }
            if (iOrdinal == 1) {
                return new ik.c(w90Var.b(strA));
            }
            if (iOrdinal == 2) {
                return new ik.a(w90Var.getBoolean(strA, false));
            }
            if (iOrdinal == 3) {
                return new ik.d(w90Var.b(strA));
            }
            if (iOrdinal == 4) {
                return new ik.e(w90Var.b(strA));
            }
            throw new NoWhenBranchMatchedException();
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
        bk bkVarA = str != null ? bk.a.a(str) : null;
        if (bkVarA != null) {
            return b(w90Var, bkVarA);
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.va1
    @Y61.l
    public final ik a(@Y61.k w90 w90Var, @Y61.k bk bkVar) {
        if (!w90Var.contains(bkVar.a())) {
            bkVar = null;
        }
        if (bkVar != null) {
            return b(w90Var, bkVar);
        }
        return null;
    }
}
