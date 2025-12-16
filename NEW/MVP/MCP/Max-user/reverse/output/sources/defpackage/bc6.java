package defpackage;

/* loaded from: classes2.dex */
public final class bc6 extends n2 {
    public final long d;

    public bc6(long j) {
        super(xhb.L2);
        this.d = j;
        t(j, "folderSync");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bc6) && this.d == ((bc6) obj).d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d);
    }
}
