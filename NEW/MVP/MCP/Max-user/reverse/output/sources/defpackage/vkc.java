package defpackage;

/* loaded from: classes2.dex */
public final class vkc extends id0 {
    public final long b;
    public final pdc c;

    public vkc(long j, pdc pdcVar) {
        super(16);
        this.b = j;
        this.c = pdcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vkc)) {
            return false;
        }
        vkc vkcVar = (vkc) obj;
        return this.b == vkcVar.b && this.c == vkcVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "OpenChat(chatId=" + this.b + ", type=" + this.c + ")";
    }
}
