package com.google.common.math;

import com.google.common.base.M;

/* compiled from: Quantiles.java */
@XY0.c
@e
@XY0.d
/* loaded from: classes6.dex */
public final class m {

    /* compiled from: Quantiles.java */
    public static final class b {
        public b(int i12, a aVar) {
            M.d("Quantile scale must be positive", i12 > 0);
        }
    }

    /* compiled from: Quantiles.java */
    public static final class c {
        public c(int i12, int i13, a aVar) {
            if (i13 < 0 || i13 > i12) {
                throw new IllegalArgumentException(AK.c.g(i12, "Quantile indexes must be between 0 and the scale, which is "));
            }
        }
    }

    /* compiled from: Quantiles.java */
    public static final class d {
        public d(int i12, int[] iArr, a aVar) {
            for (int i13 : iArr) {
                if (i13 < 0 || i13 > i12) {
                    throw new IllegalArgumentException(AK.c.g(i12, "Quantile indexes must be between 0 and the scale, which is "));
                }
            }
            M.d("Indexes must be a non empty array", iArr.length > 0);
        }
    }
}
