package defpackage;

/* loaded from: classes2.dex */
public final class eo5 extends cda {
    public final String b;

    public eo5(String str) {
        super(qqg.a);
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eo5) && fni.a(this.b, ((eo5) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ho7.i("ExternalCallback(params=", this.b, ")");
    }
}
