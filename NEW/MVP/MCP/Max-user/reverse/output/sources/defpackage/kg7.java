package defpackage;

/* loaded from: classes2.dex */
public final class kg7 extends a2 implements lh7, lyg {
    public static final kg7 b = new kg7(true);
    public static final kg7 c = new kg7(false);
    public final boolean a;

    public kg7(boolean z) {
        this.a = z;
    }

    @Override // defpackage.lyg
    public final String a() {
        return Boolean.toString(this.a);
    }

    @Override // defpackage.lyg
    public final int d() {
        return 2;
    }

    @Override // defpackage.lyg
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lyg)) {
            return false;
        }
        lyg lygVar = (lyg) obj;
        int iD = ((a2) lygVar).d();
        if (iD == 0) {
            throw null;
        }
        if (iD == 2) {
            return this.a == lygVar.q().a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a ? 1231 : 1237;
    }

    @Override // defpackage.a2, defpackage.lyg
    public final kg7 q() {
        return this;
    }

    @Override // defpackage.a2
    /* renamed from: t */
    public final kg7 q() {
        return this;
    }

    public final String toString() {
        return Boolean.toString(this.a);
    }
}
