package defpackage;

/* loaded from: classes2.dex */
public final class bdc extends ddc {
    public final long b;
    public final int c;

    public bdc(long j, int i) {
        this.b = j;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bdc)) {
            return false;
        }
        bdc bdcVar = (bdc) obj;
        return this.b == bdcVar.b && this.c == bdcVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + (((Long.hashCode(this.b) * 31) + 3052376) * 31);
    }

    public final String toString() {
        return "ShowQrCode(id=" + this.b + ", type=chat, qrCodeHeight=" + this.c + ")";
    }
}
