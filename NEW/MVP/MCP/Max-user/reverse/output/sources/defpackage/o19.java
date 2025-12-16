package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class o19 extends dtf implements sm6 {
    public final /* synthetic */ eh9 X;
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ boolean Z;
    public final /* synthetic */ Object o;
    public final /* synthetic */ p19 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o19(Object obj, Continuation continuation, eh9 eh9Var, boolean z, boolean z2, p19 p19Var) {
        super(2, continuation);
        this.o = obj;
        this.X = eh9Var;
        this.Y = z;
        this.Z = z2;
        this.s0 = p19Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((o19) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new o19(this.o, continuation, this.X, this.Y, this.Z, this.s0);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        p19 p19Var = this.s0;
        ck2 ck2Var = p19Var.c;
        si9 si9Var = this.X.a;
        g8j.b(obj);
        w10 w10Var = (w10) this.o;
        String str = w10Var.r;
        p10 p10Var = w10Var.o;
        long jHashCode = str.hashCode();
        v10 v10Var = w10Var.d;
        hl0 hl0Var = hl0.b;
        il0 il0Var = il0.b;
        if (v10Var != null) {
            return new wb9(jHashCode, si9Var.a, v10Var.a, iz5.q(xui.a(v10Var.d, il0Var, hl0Var)), 2, new Long(v10Var.c), str, this.Y, null, false, this.Z);
        }
        k10 k10Var = w10Var.b;
        if (k10Var != null && k10Var.o) {
            return new wb9(jHashCode, si9Var.a, k10Var.Z, iz5.q(xui.a(k10Var.u0, il0Var, hl0Var)), 3, null, str, this.Y, null, (ck2Var.b(true) || p10Var.d()) ? false : true, this.Z);
        }
        if (k10Var != null) {
            return new wb9(jHashCode, si9Var.a, k10Var.Z, iz5.q(xui.a(k10Var.a, il0Var, hl0Var)), 1, null, str, this.Y, ((z10) p19Var.f.getValue()).b(w10Var, false), (ck2Var.d() || p10Var.d()) ? false : true, this.Z);
        }
        throw new IllegalStateException((p19.class.getName() + ": Unknown type in PhotoVideoAttach with messageId = " + si9Var.a).toString());
    }
}
