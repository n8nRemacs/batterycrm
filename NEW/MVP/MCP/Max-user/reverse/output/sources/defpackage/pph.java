package defpackage;

/* loaded from: classes2.dex */
public final class pph extends qv7 {
    public final String c;

    public pph(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pph) && fni.a(this.c, ((pph) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return ho7.i("RequestDownloadFile(fileName=", this.c, ")");
    }
}
