package com.google.common.base;

import java.io.Serializable;
import java.util.WeakHashMap;

/* compiled from: Enums.java */
@XY0.c
@InterfaceC37268l
@XY0.d
/* renamed from: com.google.common.base.m, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37269m {

    /* compiled from: Enums.java */
    @XY0.c
    /* renamed from: com.google.common.base.m$a */
    public static final class a<T extends Enum<T>> extends AbstractC37266j<String, T> implements Serializable {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.base.AbstractC37266j
        public final Object b(String str) {
            return Enum.valueOf(null, str);
        }

        @Override // com.google.common.base.InterfaceC37276u
        public final boolean equals(@I41.a Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            ((a) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    static {
        new WeakHashMap();
    }
}
