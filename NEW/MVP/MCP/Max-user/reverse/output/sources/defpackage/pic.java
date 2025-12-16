package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class pic extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ d53 Y;
    public final /* synthetic */ qic Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pic(d53 d53Var, Continuation continuation, qic qicVar) {
        super(2, continuation);
        this.Y = d53Var;
        this.Z = qicVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((pic) l((z26) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        pic picVar = new pic(this.Y, continuation, this.Z);
        picVar.X = obj;
        return picVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            ld2 ld2Var = new ld2((z26) this.X, this.Z, 8);
            this.o = 1;
            Object objD = this.Y.d(ld2Var, this);
            g84 g84Var = g84.a;
            if (objD == g84Var) {
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
