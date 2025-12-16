package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class rj8 extends dtf implements sm6 {
    public final /* synthetic */ sj8 X;
    public final /* synthetic */ CharSequence Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rj8(sj8 sj8Var, CharSequence charSequence, Continuation continuation) {
        super(2, continuation);
        this.X = sj8Var;
        this.Y = charSequence;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((rj8) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new rj8(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws InterruptedException {
        sj8 sj8Var = this.X;
        LinkedBlockingQueue linkedBlockingQueue = sj8Var.Y;
        int i = this.o;
        qqg qqgVar = qqg.a;
        CharSequence charSequence = this.Y;
        if (i == 0) {
            g8j.b(obj);
            yy7[] yy7VarArr = sj8.u0;
            z41 z41Var = new z41(new ArrayList(), new d53(new jj8(gw0.s(sj8Var.t(), new oj8(charSequence, null)), 1), 11), new cj8(3, null, 1));
            ej8 ej8Var = new ej8(sj8Var, 1);
            this.o = 1;
            Object objD = z41Var.d(new h28(ej8Var, 6), this);
            g84 g84Var = g84.a;
            if (objD != g84Var) {
                objD = qqgVar;
            }
            if (objD == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        if (linkedBlockingQueue.isEmpty()) {
            linkedBlockingQueue.put(Collections.singletonList("По запросу \"" + ((Object) charSequence) + "\" ничего не найдено!"));
        }
        return qqgVar;
    }
}
