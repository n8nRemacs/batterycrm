package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class kn2 extends dtf implements sm6 {
    public final /* synthetic */ yb9 X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kn2(Object obj, Continuation continuation, yb9 yb9Var, long j, long j2) {
        super(2, continuation);
        this.o = obj;
        this.X = yb9Var;
        this.Y = j;
        this.Z = j2;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((kn2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new kn2(this.o, continuation, this.X, this.Y, this.Z);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        w10 w10Var = (w10) this.o;
        s10 s10Var = w10Var.a;
        int i = s10Var == null ? -1 : jn2.$EnumSwitchMapping$0[s10Var.ordinal()];
        long j = this.Z;
        long j2 = this.Y;
        yb9 yb9Var = this.X;
        if (i == 1) {
            k10 k10Var = w10Var.b;
            if (k10Var == null || k10Var.Z != yb9Var.i()) {
                return mni.C(w10Var, j2, j);
            }
            return null;
        }
        if (i == 2) {
            v10 v10Var = w10Var.d;
            if (v10Var == null || v10Var.a != yb9Var.i()) {
                return mni.C(w10Var, j2, j);
            }
            return null;
        }
        if (i == 3) {
            o10 o10Var = w10Var.g;
            if (o10Var == null || o10Var.a != yb9Var.i()) {
                return mni.C(w10Var, j2, j);
            }
            return null;
        }
        if (i != 4) {
            return mni.C(w10Var, j2, j);
        }
        f10 f10Var = w10Var.j;
        if (f10Var == null || f10Var.a != yb9Var.i()) {
            return mni.C(w10Var, j2, j);
        }
        return null;
    }
}
