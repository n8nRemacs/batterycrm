package defpackage;

/* loaded from: classes2.dex */
public final class uic extends ljc {
    public final int a;
    public final int b;
    public final int c;

    public uic(int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uic)) {
            return false;
        }
        uic uicVar = (uic) obj;
        return this.a == uicVar.a && this.b == uicVar.b;
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return 64;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    @Override // defpackage.t98
    public final int m() {
        return this.c;
    }

    public final String toString() {
        return "Admins(count=" + this.a + ", itemViewType=" + j6j.c(this.b) + ")";
    }
}
