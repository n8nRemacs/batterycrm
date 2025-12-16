package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class s5f extends dtf implements sm6 {
    public int X;
    public final /* synthetic */ ArrayList Y;
    public final /* synthetic */ lq3 Z;
    public lq3 o;
    public final /* synthetic */ v5f s0;
    public final /* synthetic */ o5f t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s5f(ArrayList arrayList, lq3 lq3Var, v5f v5fVar, o5f o5fVar, Continuation continuation) {
        super(2, continuation);
        this.Y = arrayList;
        this.Z = lq3Var;
        this.s0 = v5fVar;
        this.t0 = o5fVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((s5f) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new s5f(this.Y, this.Z, this.s0, this.t0, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        lq3 lq3Var;
        int i = this.X;
        if (i == 0) {
            g8j.b(obj);
            Iterator it = this.Y.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i3 = i2 + 1;
                if (i2 < 0) {
                    ve3.p();
                    throw null;
                }
                svi.e(this.s0.a, null, null, new r5f(i2, this.t0, (lm7) next, null), 3);
                i2 = i3;
            }
            lq3Var = this.Z;
            this.o = lq3Var;
            this.X = 1;
            Object objC = s8j.c(r10.size() * 100, this);
            g84 g84Var = g84.a;
            if (objC == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lq3Var = this.o;
            g8j.b(obj);
        }
        lq3Var.invoke();
        return qqg.a;
    }
}
