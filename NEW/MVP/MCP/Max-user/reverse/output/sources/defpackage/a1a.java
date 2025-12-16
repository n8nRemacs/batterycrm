package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class a1a extends dtf implements sm6 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ f84 Y;
    public final /* synthetic */ k1a Z;
    public int o;
    public long[] s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1a(Object obj, Continuation continuation, f84 f84Var, k1a k1aVar) {
        super(2, continuation);
        this.X = obj;
        this.Y = f84Var;
        this.Z = k1aVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((a1a) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new a1a(this.X, continuation, this.Y, this.Z);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        long[] jArrE0;
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            List list = (List) this.X;
            d7j.e(this.Y);
            jArrE0 = ue3.e0(list);
            this.s0 = jArrE0;
            this.o = 1;
            obj = d7j.d(new j1a(this.Z, null, jArrE0), this);
            g84 g84Var = g84.a;
            if (obj == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jArrE0 = this.s0;
            g8j.b(obj);
        }
        return new imb(jArrE0, obj);
    }
}
