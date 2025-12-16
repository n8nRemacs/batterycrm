package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class cob extends dtf implements sm6 {
    public final /* synthetic */ dob X;
    public final /* synthetic */ List Y;
    public final /* synthetic */ bj1 Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cob(dob dobVar, List list, bj1 bj1Var, Continuation continuation) {
        super(2, continuation);
        this.X = dobVar;
        this.Y = list;
        this.Z = bj1Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((cob) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new cob(this.X, this.Y, this.Z, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            dob dobVar = this.X;
            n9a n9aVar = dobVar.w0;
            bob bobVar = new bob(dobVar, this.Y, this.Z, null);
            this.o = 1;
            Object objB = oxi.b(n9aVar, null, bobVar, this);
            g84 g84Var = g84.a;
            if (objB == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        return qqg.a;
    }
}
