package com.google.common.base;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: FunctionalEquivalence.java */
@InterfaceC37268l
@XY0.b
/* renamed from: com.google.common.base.v, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C37277v<F, T> extends AbstractC37270n<F> implements Serializable {
    private static final long serialVersionUID = 0;

    @Override // com.google.common.base.AbstractC37270n
    public final boolean a(F f12, F f13) {
        throw null;
    }

    @Override // com.google.common.base.AbstractC37270n
    public final int b(F f12) {
        throw null;
    }

    public final boolean equals(@I41.a Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C37277v)) {
            return false;
        }
        ((C37277v) obj).getClass();
        throw null;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, null});
    }

    public final String toString() {
        return "null.onResultOf(null)";
    }
}
