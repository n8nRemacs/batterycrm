package defpackage;

/* loaded from: classes2.dex */
public final class tzf implements uzf {
    public final String a;

    public tzf(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tzf) && fni.a(this.a, ((tzf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho7.i("Text(text=", this.a, ")");
    }
}
