package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class q5f extends dtf implements sm6 {
    public int X;
    public final /* synthetic */ ArrayList Y;
    public final /* synthetic */ cm6 Z;
    public cm6 o;
    public final /* synthetic */ em6 s0;
    public final /* synthetic */ long t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5f(ArrayList arrayList, cm6 cm6Var, em6 em6Var, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = arrayList;
        this.Z = cm6Var;
        this.s0 = em6Var;
        this.t0 = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((q5f) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new q5f(this.Y, this.Z, this.s0, this.t0, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        cm6 cm6Var;
        int i = this.X;
        if (i == 0) {
            g8j.b(obj);
            Iterator it = this.Y.iterator();
            while (it.hasNext()) {
                this.s0.invoke((lm7) it.next());
            }
            cm6Var = this.Z;
            this.o = cm6Var;
            this.X = 1;
            Object objC = s8j.c(this.t0, this);
            g84 g84Var = g84.a;
            if (objC == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cm6Var = this.o;
            g8j.b(obj);
        }
        cm6Var.invoke();
        return qqg.a;
    }
}
