package defpackage;

/* loaded from: classes2.dex */
public final class vx1 implements xx1 {
    public final String a;

    public vx1(String str) {
        this.a = str;
    }

    @Override // defpackage.xx1
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vx1) && fni.a(this.a, ((vx1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho7.i("BlockReason(description=", this.a, ")");
    }
}
