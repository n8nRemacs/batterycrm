package defpackage;

/* loaded from: classes2.dex */
public final class qh extends sh {
    public final String a;

    public qh(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qh) && fni.a(this.a, ((qh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho7.i("Path(value=", this.a, ")");
    }
}
