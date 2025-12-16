package defpackage;

/* loaded from: classes2.dex */
public final class ww3 implements xw3 {
    public final n8a a;

    public ww3(n8a n8aVar) {
        this.a = n8aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ww3) && fni.a(this.a, ((ww3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Update(contactIds=" + this.a + ")";
    }
}
