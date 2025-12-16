package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ijf extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ njf Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ijf(njf njfVar, Continuation continuation) {
        super(2, continuation);
        this.Y = njfVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ijf) l((imb) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ijf ijfVar = new ijf(this.Y, continuation);
        ijfVar.X = obj;
        return ijfVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            imb imbVar = (imb) this.X;
            List list = (List) imbVar.a;
            hif hifVar = (hif) imbVar.b;
            this.o = 1;
            Object objT = njf.t(this.Y, list, hifVar, this);
            g84 g84Var = g84.a;
            if (objT == g84Var) {
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
