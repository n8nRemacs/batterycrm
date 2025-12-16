package defpackage;

/* loaded from: classes2.dex */
public final class w58 extends y58 {
    public final String a;

    public w58(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w58) && fni.a(this.a, ((w58) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho7.i("ShowJoinCall(link=", this.a, ")");
    }
}
