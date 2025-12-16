package defpackage;

/* loaded from: classes.dex */
public final class hg implements ty0 {
    public final boolean a;
    public final String b;

    public hg(int i, boolean z) {
        this.a = z;
        this.b = ho7.f(i, "anim://");
    }

    @Override // defpackage.ty0
    public final boolean a() {
        return false;
    }

    @Override // defpackage.ty0
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!this.a) {
            return super.equals(obj);
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || !hg.class.equals(obj.getClass())) {
            return false;
        }
        return fni.a(this.b, ((hg) obj).b);
    }

    public final int hashCode() {
        return !this.a ? super.hashCode() : this.b.hashCode();
    }
}
