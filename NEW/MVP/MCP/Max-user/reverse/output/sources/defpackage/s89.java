package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class s89 implements y89 {
    public final /* synthetic */ int a;
    public final /* synthetic */ y89 b;

    public /* synthetic */ s89(y89 y89Var, int i) {
        this.a = i;
        this.b = y89Var;
    }

    @Override // defpackage.y89
    public final Object n(o79 o79Var, u69 u69Var, int i) {
        switch (this.a) {
            case 0:
                if (o79Var != null) {
                    throw new ClassCastException();
                }
                z89.T(null, u69Var, i, this.b, new ad0(u69Var, i, 11));
                throw null;
            default:
                return z89.T(o79Var, u69Var, i, this.b, new pz1(o79Var, u69Var, i, 7));
        }
    }
}
