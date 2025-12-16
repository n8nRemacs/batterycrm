package defpackage;

import android.content.Context;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class m19 extends dtf implements sm6 {
    public final /* synthetic */ boolean X;
    public final /* synthetic */ p19 Y;
    public final /* synthetic */ eh9 Z;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m19(Object obj, Continuation continuation, boolean z, p19 p19Var, eh9 eh9Var) {
        super(2, continuation);
        this.o = obj;
        this.X = z;
        this.Y = p19Var;
        this.Z = eh9Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((m19) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new m19(this.o, continuation, this.X, this.Y, this.Z);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        p19 p19Var = this.Y;
        Context context = p19Var.a;
        g8j.b(obj);
        w10 w10Var = (w10) this.o;
        if ((w10Var != null ? w10Var.g : null) == null) {
            return null;
        }
        long jHashCode = w10Var.r.hashCode();
        o10 o10Var = w10Var.g;
        boolean z = this.X || (p19Var.e.p() && o10Var.i);
        return new ub9(jHashCode, this.Z.a.a, o10Var.a, jaj.e(w10Var), z ? context.getString(x8b.Q1) : o10Var.c, z ? context.getString(x8b.P1) : o10Var.d, z ? null : o10Var.b, z);
    }
}
