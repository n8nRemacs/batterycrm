package defpackage;

/* loaded from: classes2.dex */
public final class nsh {
    public static final msh Companion = new msh();
    public static final zy7[] c = {null, ayh.Companion.serializer()};
    public final String a;
    public final ayh b;

    public /* synthetic */ nsh(int i, String str, ayh ayhVar) {
        if (3 != (i & 3)) {
            g5j.c(i, 3, lsh.a.d());
            throw null;
        }
        this.a = str;
        this.b = ayhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nsh)) {
            return false;
        }
        nsh nshVar = (nsh) obj;
        return fni.a(this.a, nshVar.a) && this.b == nshVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WebAppMaxShareResponse(requestId=" + this.a + ", status=" + this.b + ")";
    }

    public nsh(String str, ayh ayhVar) {
        this.a = str;
        this.b = ayhVar;
    }
}
