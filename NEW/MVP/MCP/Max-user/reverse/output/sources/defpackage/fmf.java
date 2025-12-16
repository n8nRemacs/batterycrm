package defpackage;

/* loaded from: classes2.dex */
public final class fmf {
    public final hmf a;
    public final boolean b;
    public final boolean c;

    public fmf(hmf hmfVar, boolean z, boolean z2) {
        this.a = hmfVar;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fmf)) {
            return false;
        }
        fmf fmfVar = (fmf) obj;
        fmfVar.getClass();
        return fni.a(this.a, fmfVar.a) && this.b == fmfVar.b && this.c == fmfVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + a9h.b((this.a.hashCode() + (Boolean.hashCode(false) * 31)) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StrictModeConfig(enabled=false, violationHandler=");
        sb.append(this.a);
        sb.append(", allowNetwork=");
        sb.append(this.b);
        sb.append(", allowDisk=");
        return az1.k(sb, this.c, ")");
    }
}
