package defpackage;

/* loaded from: classes2.dex */
public final class pua {
    public final Object a;

    public pua(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pua) && fni.a(this.a, ((pua) obj).a);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "OkApiResponse(response=" + this.a + ")";
    }
}
