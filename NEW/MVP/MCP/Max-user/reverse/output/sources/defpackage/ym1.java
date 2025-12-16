package defpackage;

/* loaded from: classes.dex */
public final class ym1 extends en1 {
    public final String D;

    public ym1(String str) {
        this.D = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ym1) && fni.a(this.D, ((ym1) obj).D);
    }

    public final int hashCode() {
        return this.D.hashCode();
    }

    public final String toString() {
        return ho7.i("ShareLinkToChat(link=", this.D, ")");
    }
}
