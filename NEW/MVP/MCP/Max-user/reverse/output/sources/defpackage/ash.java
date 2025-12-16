package defpackage;

/* loaded from: classes2.dex */
public final class ash extends csh {
    public final String a;

    public ash(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ash) && fni.a(this.a, ((ash) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho7.i("InternalNavigation(deeplink=", this.a, ")");
    }
}
