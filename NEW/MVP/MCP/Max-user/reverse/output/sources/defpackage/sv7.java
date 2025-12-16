package defpackage;

/* loaded from: classes2.dex */
public final class sv7 implements tv7 {
    public final vxh a;
    public final hxh b;

    public sv7(vxh vxhVar, hxh hxhVar) {
        this.a = vxhVar;
        this.b = hxhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sv7)) {
            return false;
        }
        sv7 sv7Var = (sv7) obj;
        return fni.a(this.a, sv7Var.a) && fni.a(this.b, sv7Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        hxh hxhVar = this.b;
        return iHashCode + (hxhVar == null ? 0 : hxhVar.hashCode());
    }

    public final String toString() {
        return "RequestShare(data=" + this.a + ", fileInfo=" + this.b + ")";
    }
}
