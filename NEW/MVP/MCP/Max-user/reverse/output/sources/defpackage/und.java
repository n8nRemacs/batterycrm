package defpackage;

/* loaded from: classes2.dex */
public final class und implements tnd {
    public final cm6 a;
    public volatile Object b = kc3.A0;
    public final Object c = this;

    public und(cm6 cm6Var) {
        this.a = cm6Var;
    }

    @Override // defpackage.k18
    public final boolean e() {
        return this.b != kc3.A0;
    }

    @Override // defpackage.k18
    public final Object getValue() {
        Object objInvoke;
        Object obj = this.b;
        kc3 kc3Var = kc3.A0;
        if (obj != kc3Var) {
            return obj;
        }
        synchronized (this.c) {
            objInvoke = this.b;
            if (objInvoke == kc3Var) {
                objInvoke = this.a.invoke();
                this.b = objInvoke;
            }
        }
        return objInvoke;
    }

    @Override // defpackage.tnd
    public final void reset() {
        synchronized (this.c) {
            this.b = kc3.A0;
        }
    }

    public final String toString() {
        return e() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
