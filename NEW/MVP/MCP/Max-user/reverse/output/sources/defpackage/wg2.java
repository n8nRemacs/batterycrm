package defpackage;

import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class wg2 extends dtf implements sm6 {
    public final /* synthetic */ tb9 X;
    public final /* synthetic */ xg2 Y;
    public final /* synthetic */ il2 Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wg2(tb9 tb9Var, xg2 xg2Var, il2 il2Var, Continuation continuation) {
        super(2, continuation);
        this.X = tb9Var;
        this.Y = xg2Var;
        this.Z = il2Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ((wg2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
        return g84.a;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new wg2(this.X, this.Y, this.Z, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            tb9 tb9Var = this.X;
            hbd hbdVar = tb9Var.w0;
            a40 a40Var = new a40(this.Y, this.Z, tb9Var, 2);
            this.o = 1;
            Object objD = hbdVar.a.d(a40Var, this);
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
        throw new KotlinNothingValueException();
    }
}
