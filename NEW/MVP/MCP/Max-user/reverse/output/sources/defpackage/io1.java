package defpackage;

import android.os.Bundle;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class io1 extends dtf implements sm6 {
    public final /* synthetic */ wo1 X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ Bundle Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public io1(wo1 wo1Var, int i, Bundle bundle, Continuation continuation) {
        super(2, continuation);
        this.X = wo1Var;
        this.Y = i;
        this.Z = bundle;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((io1) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new io1(this.X, this.Y, this.Z, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return obj;
        }
        g8j.b(obj);
        ks1 ks1Var = this.X.Z;
        this.o = 1;
        Object objC = ks1Var.c(this.Y, this.Z, this);
        g84 g84Var = g84.a;
        return objC == g84Var ? g84Var : objC;
    }
}
