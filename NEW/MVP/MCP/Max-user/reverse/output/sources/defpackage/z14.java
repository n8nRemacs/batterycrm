package defpackage;

/* loaded from: classes2.dex */
public final class z14 {
    public final b04 a;

    public z14(b04 b04Var) {
        this.a = b04Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z14) && fni.a(this.a, ((z14) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnResult(contactsResult=" + this.a + ")";
    }
}
