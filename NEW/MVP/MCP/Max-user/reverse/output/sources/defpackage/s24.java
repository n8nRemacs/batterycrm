package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class s24 extends dtf implements sm6 {
    public final /* synthetic */ v6d X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ int Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s24(v6d v6dVar, String str, int i, Continuation continuation) {
        super(2, continuation);
        this.X = v6dVar;
        this.Y = str;
        this.Z = i;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((s24) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new s24(this.X, this.Y, this.Z, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            v6d v6dVar = this.X;
            spf spfVar = (spf) v6dVar.d;
            lz9 lz9Var = (lz9) v6dVar.X;
            this.o = 1;
            pf2 pf2Var = spfVar.a;
            String str = this.Y;
            int i2 = this.Z;
            obj = spfVar.b(io5.a(str, i2, pf2Var), str, i2, hd5.a, lz9Var, this);
            g84 g84Var = g84.a;
            if (obj == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        return (List) obj;
    }
}
