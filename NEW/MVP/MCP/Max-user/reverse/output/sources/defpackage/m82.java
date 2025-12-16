package defpackage;

/* loaded from: classes2.dex */
public final class m82 extends n82 {
    public final n5g a;

    public m82(n5g n5gVar) {
        this.a = n5gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m82) && this.a.equals(((m82) obj).a);
    }

    public final int hashCode() {
        return Integer.hashCode(this.a.c);
    }

    public final String toString() {
        return "SomethingWentWrong(text=" + this.a + ")";
    }
}
