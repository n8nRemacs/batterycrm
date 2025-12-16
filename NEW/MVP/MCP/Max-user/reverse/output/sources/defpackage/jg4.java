package defpackage;

/* loaded from: classes2.dex */
public final class jg4 {
    public static final jg4 e = new jg4(null, null, 15);
    public static final jg4 f = new jg4(null, null, 7);
    public static final jg4 g = new jg4(null, null, 7);
    public final boolean a;
    public final n8a b;
    public final n8a c;
    public final boolean d;

    public jg4(n8a n8aVar, n8a n8aVar2, int i) {
        this(false, (i & 2) != 0 ? dk8.a : n8aVar, (i & 4) != 0 ? dk8.a : n8aVar2, (i & 8) == 0);
    }

    public final String toString() {
        String name = jg4.class.getName();
        if (this == e) {
            return name.concat(".None");
        }
        if (this == f) {
            return name.concat(".LocalChats");
        }
        if (this == g) {
            return name.concat(".AllChats");
        }
        StringBuilder sbP = ho7.p("DispatchParams(retry=", this.a, ", allChats=", this.d, ", serverChats=");
        sbP.append(this.b);
        sbP.append(", removedChats=");
        sbP.append(this.c);
        sbP.append(", )");
        return sbP.toString();
    }

    public jg4(boolean z, n8a n8aVar, n8a n8aVar2, boolean z2) {
        this.a = z;
        this.b = n8aVar;
        this.c = n8aVar2;
        this.d = z2;
    }
}
