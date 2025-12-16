package defpackage;

/* loaded from: classes2.dex */
public final class zya {
    public final int a;
    public final yya b;
    public final int c;
    public final String d;
    public final int e;

    public zya(int i, yya yyaVar, int i2, String str, int i3) {
        this.a = i;
        this.b = yyaVar;
        this.c = i2;
        this.d = str;
        this.e = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zya)) {
            return false;
        }
        zya zyaVar = (zya) obj;
        return this.a == zyaVar.a && fni.a(this.b, zyaVar.b) && this.c == zyaVar.c && fni.a(this.d, zyaVar.d) && this.e == zyaVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + u45.e(xrf.k(this.c, (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Item(title=");
        sb.append(this.a);
        sb.append(", icon=");
        sb.append(this.b);
        sb.append(", screenId=");
        sb.append(this.c);
        sb.append(", tag=");
        sb.append(this.d);
        sb.append(", bottomBarItemId=");
        return ho7.j(sb, this.e, ")");
    }
}
