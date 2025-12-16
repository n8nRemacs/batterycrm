package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class yed extends dtf implements sm6 {
    public final /* synthetic */ zed X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ byte[] Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yed(zed zedVar, long j, byte[] bArr, Continuation continuation) {
        super(2, continuation);
        this.X = zedVar;
        this.Y = j;
        this.Z = bArr;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((yed) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new yed(this.X, this.Y, this.Z, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            zed zedVar = this.X;
            tdd tddVar = zedVar.b;
            this.o = 1;
            Object objT = zed.t(zedVar, tddVar, this.Y, this.Z, this);
            g84 g84Var = g84.a;
            if (objT == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        return qqg.a;
    }
}
