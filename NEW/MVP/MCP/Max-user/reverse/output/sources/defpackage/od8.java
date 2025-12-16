package defpackage;

/* loaded from: classes2.dex */
public final class od8 {
    public final k18 a;
    public final k18 b;

    public od8(k18 k18Var, k18 k18Var2) {
        this.a = k18Var;
        this.b = k18Var2;
    }

    public final eh9 a(long j, boolean z) {
        si9 si9VarM = ((qi9) this.a.getValue()).m(j);
        eh9 eh9VarA = (si9VarM == null || (!z && si9VarM.t0 == jm9.DELETED)) ? null : pj9.a((pj9) this.b.getValue(), si9VarM);
        if (eh9VarA != null) {
            return eh9VarA;
        }
        throw new IllegalStateException("message not found or deleted");
    }
}
