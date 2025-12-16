package defpackage;

/* loaded from: classes2.dex */
public final class uqh extends vqh {
    public final String c;
    public final boolean d;

    public uqh(String str, boolean z) {
        this.c = str;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uqh)) {
            return false;
        }
        uqh uqhVar = (uqh) obj;
        return fni.a(this.c, uqhVar.c) && this.d == uqhVar.d;
    }

    @Override // defpackage.vqh
    public final boolean f() {
        return this.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + (this.c.hashCode() * 31);
    }

    public final String toString() {
        return "SelectionChange(queryId=" + this.c + ", disableVibrationFallback=" + this.d + ")";
    }
}
