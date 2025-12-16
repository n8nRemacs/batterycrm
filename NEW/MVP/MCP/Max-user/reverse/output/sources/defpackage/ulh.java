package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class ulh implements vlh {
    public final n5g a;
    public final List b;

    public ulh(n5g n5gVar, List list) {
        this.a = n5gVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ulh)) {
            return false;
        }
        ulh ulhVar = (ulh) obj;
        return this.a.equals(ulhVar.a) && this.b.equals(ulhVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a.c) * 31);
    }

    public final String toString() {
        return "RequestOpenSettings(title=" + this.a + ", buttons=" + this.b + ")";
    }
}
