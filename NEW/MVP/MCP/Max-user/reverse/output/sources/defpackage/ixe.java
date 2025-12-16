package defpackage;

/* loaded from: classes2.dex */
public final class ixe extends e13 {
    public final n5g a;
    public final em6 b;

    public ixe(n5g n5gVar, em6 em6Var) {
        this.a = n5gVar;
        this.b = em6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ixe)) {
            return false;
        }
        ixe ixeVar = (ixe) obj;
        return this.a.equals(ixeVar.a) && this.b.equals(ixeVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a.c) * 31);
    }

    public final String toString() {
        return "ShowCancelableSnackbar(text=" + this.a + ", cancelAction=" + this.b + ")";
    }
}
