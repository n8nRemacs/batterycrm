package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ny5 extends dtf implements um6 {
    public int X;
    public /* synthetic */ Object Y;
    public /* synthetic */ hvg Z;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ny5(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.o = i2;
    }

    @Override // defpackage.um6
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        z26 z26Var = (z26) obj;
        hvg hvgVar = (hvg) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.o) {
            case 0:
                ny5 ny5Var = new ny5(3, continuation, 0);
                ny5Var.Y = z26Var;
                ny5Var.Z = hvgVar;
                return ny5Var.n(qqg.a);
            default:
                ny5 ny5Var2 = new ny5(3, continuation, 1);
                ny5Var2.Y = z26Var;
                ny5Var2.Z = hvgVar;
                return ny5Var2.n(qqg.a);
        }
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        hvg hvgVar;
        hvg hvgVar2;
        switch (this.o) {
            case 0:
                int i = this.X;
                if (i == 0) {
                    g8j.b(obj);
                    z26 z26Var = (z26) this.Y;
                    hvgVar = this.Z;
                    this.Y = hvgVar;
                    this.X = 1;
                    Object objA = z26Var.a(hvgVar, this);
                    g84 g84Var = g84.a;
                    if (objA == g84Var) {
                        return g84Var;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    hvgVar = (hvg) this.Y;
                    g8j.b(obj);
                }
                return Boolean.valueOf(!(hvgVar.a == 100.0f));
            default:
                int i2 = this.X;
                if (i2 == 0) {
                    g8j.b(obj);
                    z26 z26Var2 = (z26) this.Y;
                    hvgVar2 = this.Z;
                    this.Y = hvgVar2;
                    this.X = 1;
                    Object objA2 = z26Var2.a(hvgVar2, this);
                    g84 g84Var2 = g84.a;
                    if (objA2 == g84Var2) {
                        return g84Var2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    hvgVar2 = (hvg) this.Y;
                    g8j.b(obj);
                }
                return Boolean.valueOf(!(hvgVar2.a == 100.0f));
        }
    }
}
