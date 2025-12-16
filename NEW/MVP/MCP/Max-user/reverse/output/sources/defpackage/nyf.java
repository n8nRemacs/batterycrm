package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class nyf {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;

    public nyf(String str, String str2, String str3, List list, List list2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nyf)) {
            return false;
        }
        nyf nyfVar = (nyf) obj;
        if (fni.a(this.a, nyfVar.a) && fni.a(this.b, nyfVar.b) && fni.a(this.c, nyfVar.c) && fni.a(this.d, nyfVar.d)) {
            return fni.a(this.e, nyfVar.e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + xrf.l(this.d, u45.e(u45.e(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        return "ForeignKey{referenceTable='" + this.a + "', onDelete='" + this.b + " +', onUpdate='" + this.c + "', columnNames=" + this.d + ", referenceColumnNames=" + this.e + '}';
    }
}
