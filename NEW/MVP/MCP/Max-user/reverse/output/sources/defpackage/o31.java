package defpackage;

/* loaded from: classes.dex */
public final class o31 extends dtf implements ym6 {
    public /* synthetic */ boolean X;
    public /* synthetic */ boolean Y;
    public /* synthetic */ boolean Z;
    public /* synthetic */ boolean o;
    public final /* synthetic */ k18 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o31(k18 k18Var, b66 b66Var) {
        super(5, b66Var);
        this.s0 = k18Var;
    }

    @Override // defpackage.ym6
    public final Object b(Object obj, Object obj2, Object obj3, Object obj4, b66 b66Var) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
        boolean zBooleanValue4 = ((Boolean) obj4).booleanValue();
        o31 o31Var = new o31(this.s0, b66Var);
        o31Var.o = zBooleanValue;
        o31Var.X = zBooleanValue2;
        o31Var.Y = zBooleanValue3;
        o31Var.Z = zBooleanValue4;
        return o31Var.n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        boolean z = this.o;
        boolean z2 = this.X;
        boolean z3 = this.Y;
        boolean z4 = this.Z;
        boolean z5 = false;
        if (((gu5) ((rt5) this.s0.getValue())).t() && z4 && !z3 && z2 && z) {
            z5 = true;
        }
        return Boolean.valueOf(z5);
    }
}
