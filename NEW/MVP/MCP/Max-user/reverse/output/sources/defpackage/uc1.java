package defpackage;

/* loaded from: classes.dex */
public final class uc1 extends id0 {
    public final String b;

    public uc1(String str) {
        super(2);
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uc1) && fni.a(this.b, ((uc1) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ho7.i("StartNewCall(link=", this.b, ")");
    }
}
