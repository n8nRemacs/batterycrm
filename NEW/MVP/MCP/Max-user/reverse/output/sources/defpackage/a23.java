package defpackage;

import java.util.Comparator;

/* loaded from: classes2.dex */
public final class a23 implements c23 {
    public static final a23 a = new a23();
    public static final o00 b = ve2.J;

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof a23);
    }

    @Override // defpackage.c23
    public final Comparator getComparator() {
        return b;
    }

    public final int hashCode() {
        return -234206347;
    }

    public final String toString() {
        return "All";
    }
}
