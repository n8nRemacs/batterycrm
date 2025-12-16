package defpackage;

/* loaded from: classes.dex */
public final class kld {
    public static final kld c = new kld(0, false);
    public final int a;
    public final boolean b;

    public kld(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && kld.class == obj.getClass()) {
            kld kldVar = (kld) obj;
            if (this.a == kldVar.a && this.b == kldVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a << 1) + (this.b ? 1 : 0);
    }
}
