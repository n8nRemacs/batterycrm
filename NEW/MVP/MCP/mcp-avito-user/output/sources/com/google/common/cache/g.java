package com.google.common.cache;

import com.google.common.base.D;
import java.util.Arrays;

/* compiled from: CacheStats.java */
@XY0.b
@h
/* loaded from: classes6.dex */
public final class g {
    public final boolean equals(@I41.a Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        ((g) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{0L, 0L, 0L, 0L, 0L, 0L});
    }

    public final String toString() {
        D.b bVarB = D.b(this);
        bVarB.a(0L, "hitCount");
        bVarB.a(0L, "missCount");
        bVarB.a(0L, "loadSuccessCount");
        bVarB.a(0L, "loadExceptionCount");
        bVarB.a(0L, "totalLoadTime");
        bVarB.a(0L, "evictionCount");
        return bVarB.toString();
    }
}
