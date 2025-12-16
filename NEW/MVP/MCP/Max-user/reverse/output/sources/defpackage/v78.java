package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class v78 extends dtf implements um6 {
    public int X;
    public /* synthetic */ z26 Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v78(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.o = i2;
    }

    @Override // defpackage.um6
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        z26 z26Var = (z26) obj;
        Continuation continuation = (Continuation) obj3;
        switch (this.o) {
            case 0:
                v78 v78Var = new v78(3, continuation, 0);
                v78Var.Y = z26Var;
                v78Var.Z = obj2;
                return v78Var.n(qqg.a);
            default:
                v78 v78Var2 = new v78(3, continuation, 1);
                v78Var2.Y = z26Var;
                v78Var2.Z = obj2;
                return v78Var2.n(qqg.a);
        }
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        switch (this.o) {
            case 0:
                int i = this.X;
                if (i == 0) {
                    g8j.b(obj);
                    z26 z26Var = this.Y;
                    w68 w68Var = (w68) this.Z;
                    x26 mwdVar = w68Var instanceof n68 ? new mwd(new w78(w68Var, null)) : new m11(13, w68Var);
                    this.X = 1;
                    Object objN = gw0.n(this, mwdVar, z26Var);
                    g84 g84Var = g84.a;
                    if (objN == g84Var) {
                        return g84Var;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    g8j.b(obj);
                }
                return qqg.a;
            default:
                int i2 = this.X;
                if (i2 == 0) {
                    g8j.b(obj);
                    z26 z26Var2 = this.Y;
                    hbd hbdVar = ((s3f) this.Z).d;
                    this.X = 1;
                    Object objN2 = gw0.n(this, hbdVar, z26Var2);
                    g84 g84Var2 = g84.a;
                    if (objN2 == g84Var2) {
                        return g84Var2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    g8j.b(obj);
                }
                return qqg.a;
        }
    }
}
