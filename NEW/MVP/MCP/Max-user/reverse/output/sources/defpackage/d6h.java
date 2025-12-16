package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class d6h extends dtf implements sm6 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ i6h Y;
    public final /* synthetic */ long Z;
    public int o;
    public long s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6h(Object obj, Continuation continuation, i6h i6hVar, long j) {
        super(2, continuation);
        this.X = obj;
        this.Y = i6hVar;
        this.Z = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((d6h) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new d6h(this.X, continuation, this.Y, this.Z);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        d6h d6hVar;
        long j;
        int i = this.o;
        i6h i6hVar = this.Y;
        if (i == 0) {
            g8j.b(obj);
            long jLongValue = ((Number) this.X).longValue();
            this.s0 = jLongValue;
            this.o = 1;
            d6hVar = this;
            obj = i6hVar.b(this.Z, jLongValue, d6hVar);
            g84 g84Var = g84.a;
            if (obj == g84Var) {
                return g84Var;
            }
            j = jLongValue;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = this.s0;
            g8j.b(obj);
            d6hVar = this;
        }
        ((Boolean) obj).getClass();
        i6hVar.k.remove(i6h.c(d6hVar.Z, j));
        return obj;
    }
}
