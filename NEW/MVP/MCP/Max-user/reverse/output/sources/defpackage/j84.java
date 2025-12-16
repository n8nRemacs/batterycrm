package defpackage;

import androidx.work.CoroutineWorker;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class j84 extends dtf implements sm6 {
    public int X;
    public final /* synthetic */ cu7 Y;
    public final /* synthetic */ CoroutineWorker Z;
    public cu7 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j84(cu7 cu7Var, CoroutineWorker coroutineWorker, Continuation continuation) {
        super(2, continuation);
        this.Y = cu7Var;
        this.Z = coroutineWorker;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        j84 j84Var = (j84) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        j84Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new j84(this.Y, this.Z, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.X;
        if (i == 0) {
            g8j.b(obj);
            this.o = this.Y;
            this.X = 1;
            throw new IllegalStateException("Not implemented");
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        cu7 cu7Var = this.o;
        g8j.b(obj);
        cu7Var.a.i(obj);
        return qqg.a;
    }
}
