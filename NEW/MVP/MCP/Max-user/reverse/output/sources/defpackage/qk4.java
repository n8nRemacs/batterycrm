package defpackage;

/* loaded from: classes.dex */
public final class qk4 extends vc3 {
    public final void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (this.a) {
                    super.finalize();
                    return;
                }
                Object objA = this.b.a();
                op5.m("DefaultCloseableReference", "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.b)), objA == null ? null : objA.getClass().getName());
                uc3 uc3Var = this.c;
                if (uc3Var != null) {
                    uc3Var.o(this.b, this.d);
                }
                close();
                super.finalize();
            }
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    @Override // defpackage.vc3
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final vc3 clone() {
        l5j.f(h0());
        return new qk4(this.b, this.c, this.d != null ? new Throwable() : null);
    }
}
