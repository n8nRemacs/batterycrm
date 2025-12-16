package defpackage;

/* loaded from: classes.dex */
public final class eoc {
    public final int a;
    public final boolean b;

    public eoc(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || eoc.class != obj.getClass()) {
            return false;
        }
        eoc eocVar = (eoc) obj;
        return this.a == eocVar.a && this.b == eocVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + (this.b ? 1 : 0);
    }
}
