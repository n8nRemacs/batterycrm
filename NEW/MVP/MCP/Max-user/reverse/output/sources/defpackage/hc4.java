package defpackage;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class hc4 implements Comparable, Serializable {
    public final Object a;

    public hc4(Comparable comparable) {
        this.a = comparable;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Comparable, java.lang.Object] */
    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(hc4 hc4Var) {
        if (hc4Var == fc4.d) {
            return 1;
        }
        if (hc4Var == fc4.c) {
            return -1;
        }
        Object obj = hc4Var.a;
        int i = o7d.c;
        int iCompareTo = this.a.compareTo(obj);
        return iCompareTo != 0 ? iCompareTo : Boolean.compare(this instanceof gc4, hc4Var instanceof gc4);
    }

    public abstract void c(StringBuilder sb);

    public abstract void d(StringBuilder sb);

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Comparable, java.lang.Object] */
    public Comparable e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hc4) {
            try {
                if (compareTo((hc4) obj) == 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    public abstract boolean g(Comparable comparable);

    public abstract int hashCode();
}
