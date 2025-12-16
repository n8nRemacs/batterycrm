package defpackage;

/* loaded from: classes.dex */
public final class jo1 extends dtf implements ym6 {
    public /* synthetic */ boolean X;
    public /* synthetic */ boolean Y;
    public /* synthetic */ qa Z;
    public /* synthetic */ long o;

    @Override // defpackage.ym6
    public final Object b(Object obj, Object obj2, Object obj3, Object obj4, b66 b66Var) {
        long jLongValue = ((Number) obj).longValue();
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
        jo1 jo1Var = new jo1(5, b66Var);
        jo1Var.o = jLongValue;
        jo1Var.X = zBooleanValue;
        jo1Var.Y = zBooleanValue2;
        jo1Var.Z = (qa) obj4;
        return jo1Var.n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        long j = this.o;
        boolean z = this.X;
        boolean z2 = this.Y;
        qa qaVar = this.Z;
        return Boolean.valueOf((!z || z2 || qaVar.b.isEmpty() || j >= qaVar.c || qaVar.a.isEmpty()) ? false : true);
    }
}
