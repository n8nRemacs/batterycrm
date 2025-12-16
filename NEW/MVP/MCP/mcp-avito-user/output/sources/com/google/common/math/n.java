package com.google.common.math;

import com.google.common.base.D;
import java.io.Serializable;
import java.util.Arrays;

/* compiled from: Stats.java */
@XY0.c
@e
@XY0.d
/* loaded from: classes6.dex */
public final class n implements Serializable {
    private static final long serialVersionUID = 0;

    public final boolean equals(@I41.a Object obj) {
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        return Double.doubleToLongBits(0.0d) == Double.doubleToLongBits(0.0d) && Double.doubleToLongBits(0.0d) == Double.doubleToLongBits(0.0d) && Double.doubleToLongBits(0.0d) == Double.doubleToLongBits(0.0d) && Double.doubleToLongBits(0.0d) == Double.doubleToLongBits(0.0d);
    }

    public final int hashCode() {
        Double dValueOf = Double.valueOf(0.0d);
        return Arrays.hashCode(new Object[]{0L, dValueOf, dValueOf, dValueOf, dValueOf});
    }

    public final String toString() {
        D.b bVarB = D.b(this);
        bVarB.a(0L, "count");
        return bVarB.toString();
    }
}
