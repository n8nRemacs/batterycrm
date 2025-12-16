package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class knc extends dtf implements sm6 {
    public final /* synthetic */ pnc X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ boolean Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public knc(pnc pncVar, long j, boolean z, Continuation continuation) {
        super(2, continuation);
        this.X = pncVar;
        this.Y = j;
        this.Z = z;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((knc) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new knc(this.X, this.Y, this.Z, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            yac yacVar = this.X.T0;
            this.o = 1;
            Object objV = yacVar.v(this.Y, this.Z, this);
            g84 g84Var = g84.a;
            if (objV == g84Var) {
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
