package defpackage;

/* loaded from: classes.dex */
public final class oc4 {
    public final fsc a;
    public final boolean b;

    public oc4(fsc fscVar, boolean z) {
        this.a = fscVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof oc4) {
            oc4 oc4Var = (oc4) obj;
            if (oc4Var.a.equals(this.a) && oc4Var.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.b).hashCode();
    }
}
