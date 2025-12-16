package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class zqf {
    public static final zqf g = new zqf(null, 0, 0, hd5.a);
    public final String a;
    public final int b;
    public final int c;
    public final Object d;
    public final int e;
    public final boolean f;

    public zqf(String str, int i, int i2, List list) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = list;
        this.e = list.size();
        this.f = list.size() < i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zqf)) {
            return false;
        }
        zqf zqfVar = (zqf) obj;
        return fni.a(this.a, zqfVar.a) && this.b == zqfVar.b && this.c == zqfVar.c && this.d.equals(zqfVar.d);
    }

    public final int hashCode() {
        String str = this.a;
        return this.d.hashCode() + xrf.k(this.c, xrf.k(this.b, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbM = utb.m(this.b, "SuggestsResult(query=", this.a, ", cursorPosition=", ", totalCount=");
        sbM.append(this.c);
        sbM.append(", result=");
        sbM.append(this.d);
        sbM.append(")");
        return sbM.toString();
    }
}
