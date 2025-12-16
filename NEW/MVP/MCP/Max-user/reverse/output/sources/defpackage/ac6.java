package defpackage;

/* loaded from: classes2.dex */
public final class ac6 extends l0g {
    public final w8a c;

    public ac6(w8a w8aVar) {
        this.c = w8aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ac6) && fni.a(this.c, ((ac6) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // defpackage.pj0
    public final String toString() {
        return "Response(folders=" + this.c + ")";
    }
}
