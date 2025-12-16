package defpackage;

/* loaded from: classes.dex */
public final class ff implements ty0 {
    public final hg a;
    public final int b;

    public ff(hg hgVar, int i) {
        this.a = hgVar;
        this.b = i;
    }

    @Override // defpackage.ty0
    public final boolean a() {
        return false;
    }

    @Override // defpackage.ty0
    public final String b() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ff)) {
            return false;
        }
        ff ffVar = (ff) obj;
        return this.b == ffVar.b && this.a.equals(ffVar.a);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 1013) + this.b;
    }

    public final String toString() {
        hc8 hc8VarC = yyi.c(this);
        hc8VarC.r(this.a, "imageCacheKey");
        hc8VarC.c(this.b, "frameIndex");
        return hc8VarC.toString();
    }
}
