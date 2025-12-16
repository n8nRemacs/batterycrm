package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class sr6 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ f84 Y;
    public final /* synthetic */ long Z;
    public int o;
    public final /* synthetic */ vr6 s0;
    public final /* synthetic */ long t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sr6(f84 f84Var, long j, vr6 vr6Var, long j2, Continuation continuation) {
        super(2, continuation);
        this.Y = f84Var;
        this.Z = j;
        this.s0 = vr6Var;
        this.t0 = j2;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((sr6) l((ku3) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        sr6 sr6Var = new sr6(this.Y, this.Z, this.s0, this.t0, continuation);
        sr6Var.X = obj;
        return sr6Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        f84 f84Var = this.Y;
        vr6 vr6Var = this.s0;
        long j = this.Z;
        try {
            if (i == 0) {
                g8j.b(obj);
                if (u5j.h((ku3) this.X)) {
                    wqi.c(f84Var.getClass().getName(), "try to request info for #" + j, new Object[0]);
                    k1a k1aVar = (k1a) vr6Var.b.getValue();
                    long j2 = this.Z;
                    long j3 = this.t0;
                    this.o = 1;
                    Object objS = k1aVar.s(j2, j3, this);
                    g84 g84Var = g84.a;
                    if (objS == g84Var) {
                        return g84Var;
                    }
                }
                return ((l24) vr6Var.a.getValue()).c(j);
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return ((l24) vr6Var.a.getValue()).c(j);
        } catch (Throwable th) {
            wqi.e(f84Var.getClass().getName(), "fail to fetch noncontact #" + j, th);
            return new m11(13, ((l24) vr6Var.a.getValue()).a(j));
        }
    }
}
