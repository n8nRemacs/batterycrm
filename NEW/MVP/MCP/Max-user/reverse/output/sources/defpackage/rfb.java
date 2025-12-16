package defpackage;

/* loaded from: classes2.dex */
public final class rfb implements ufb {
    public final int a;
    public final em6 b;

    public rfb(int i, em6 em6Var) {
        this.a = i;
        this.b = em6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rfb) {
            return this.a == ((rfb) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
