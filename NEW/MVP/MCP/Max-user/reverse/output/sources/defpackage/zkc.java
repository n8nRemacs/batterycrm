package defpackage;

/* loaded from: classes2.dex */
public final class zkc extends id0 {
    public final String b;

    public zkc(String str) {
        super(16);
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zkc) && fni.a(this.b, ((zkc) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ho7.i("ShowJoinCall(link=", this.b, ")");
    }
}
