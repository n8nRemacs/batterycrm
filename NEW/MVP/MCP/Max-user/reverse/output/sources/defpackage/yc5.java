package defpackage;

/* loaded from: classes.dex */
public final class yc5 implements jj7 {
    public final boolean a;

    public yc5(boolean z) {
        this.a = z;
    }

    @Override // defpackage.jj7
    public final xha b() {
        return null;
    }

    @Override // defpackage.jj7
    public final boolean isActive() {
        return this.a;
    }

    public final String toString() {
        return u45.l(new StringBuilder("Empty{"), this.a ? "Active" : "New", '}');
    }
}
