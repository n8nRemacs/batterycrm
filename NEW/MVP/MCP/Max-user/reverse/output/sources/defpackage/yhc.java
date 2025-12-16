package defpackage;

/* loaded from: classes2.dex */
public final class yhc extends id0 {
    public final String b;

    public yhc(String str) {
        super(15);
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yhc) && fni.a(this.b, ((yhc) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ho7.i("SendLink(link=", this.b, ")");
    }
}
