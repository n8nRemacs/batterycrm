package defpackage;

/* loaded from: classes2.dex */
public final class kfb implements mfb {
    public final rfb a;

    public kfb(rfb rfbVar) {
        this.a = rfbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kfb) && this.a.equals(((kfb) obj).a);
    }

    public final int hashCode() {
        return Integer.hashCode(this.a.a);
    }

    public final String toString() {
        return "Icon(icon=" + this.a + ")";
    }
}
