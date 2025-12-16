package defpackage;

import java.io.File;
import java.security.NoSuchAlgorithmException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class uk2 extends dtf implements sm6 {
    public final /* synthetic */ yk2 X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ File Z;
    public int o;
    public final /* synthetic */ String s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uk2(yk2 yk2Var, String str, File file, String str2, Continuation continuation) {
        super(2, continuation);
        this.X = yk2Var;
        this.Y = str;
        this.Z = file;
        this.s0 = str2;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((uk2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new uk2(this.X, this.Y, this.Z, this.s0, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws NoSuchAlgorithmException {
        int i = this.o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return obj;
        }
        g8j.b(obj);
        yk2 yk2Var = this.X;
        ctf ctfVar = (ctf) yk2Var.X.getValue();
        wk2 wk2Var = yk2Var.A0;
        this.o = 1;
        Object objB = ctfVar.a.b(this.Y, this.Z, wk2Var, this.s0, false, "", this);
        g84 g84Var = g84.a;
        return objB == g84Var ? g84Var : objB;
    }
}
