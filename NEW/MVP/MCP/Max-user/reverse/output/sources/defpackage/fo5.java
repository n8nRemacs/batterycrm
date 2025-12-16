package defpackage;

/* loaded from: classes.dex */
public final class fo5 extends cda {
    public final String b;

    public fo5(String str) {
        super(qqg.a);
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fo5) && fni.a(this.b, ((fo5) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ho7.i("ExternalCallback(params=", this.b, ")");
    }
}
