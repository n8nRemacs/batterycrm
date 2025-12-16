package defpackage;

/* loaded from: classes2.dex */
public final class zvh {
    public final String a;
    public final boolean b;
    public final vvh c;
    public final String d;
    public final boolean e;
    public final boolean f;

    public zvh(String str, boolean z, vvh vvhVar, String str2, boolean z2, boolean z3) {
        this.a = str;
        this.b = z;
        this.c = vvhVar;
        this.d = str2;
        this.e = z2;
        this.f = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zvh)) {
            return false;
        }
        zvh zvhVar = (zvh) obj;
        return fni.a(this.a, zvhVar.a) && this.b == zvhVar.b && fni.a(this.c, zvhVar.c) && fni.a(this.d, zvhVar.d) && this.e == zvhVar.e && this.f == zvhVar.f;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + a9h.b(this.a.hashCode() * 31, 31, this.b)) * 31;
        String str = this.d;
        return Boolean.hashCode(this.f) + a9h.b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
    }

    public final String toString() {
        return "WebAppRootViewState(title=" + this.a + ", isVerified=" + this.b + ", loadingState=" + this.c + ", url=" + this.d + ", needShowCloseConfirmationDialog=" + this.e + ", isBrightnessMaximized=" + this.f + ")";
    }
}
