package defpackage;

/* loaded from: classes2.dex */
public final class sqh extends vqh {
    public final String c;
    public final nh7 d;
    public final boolean e;

    public sqh(String str, nh7 nh7Var, boolean z) {
        this.c = str;
        this.d = nh7Var;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sqh)) {
            return false;
        }
        sqh sqhVar = (sqh) obj;
        return fni.a(this.c, sqhVar.c) && this.d == sqhVar.d && this.e == sqhVar.e;
    }

    @Override // defpackage.vqh
    public final boolean f() {
        return this.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + (this.c.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Impact(queryId=");
        sb.append(this.c);
        sb.append(", impactStyle=");
        sb.append(this.d);
        sb.append(", disableVibrationFallback=");
        return az1.k(sb, this.e, ")");
    }
}
