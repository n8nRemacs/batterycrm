package defpackage;

/* loaded from: classes2.dex */
public final class vnd implements tnd {
    public cm6 a;
    public Object b;

    @Override // defpackage.k18
    public final boolean e() {
        return this.b != kk4.B0;
    }

    @Override // defpackage.k18
    public final Object getValue() {
        if (this.b == kk4.B0) {
            this.b = this.a.invoke();
        }
        return this.b;
    }

    @Override // defpackage.tnd
    public final void reset() {
        this.b = kk4.B0;
    }

    public final String toString() {
        return e() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
