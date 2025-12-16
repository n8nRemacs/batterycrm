package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class nad extends dtf implements sm6 {
    public final /* synthetic */ vad o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nad(vad vadVar, Continuation continuation) {
        super(2, continuation);
        this.o = vadVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        nad nadVar = (nad) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        nadVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new nad(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        List listY = ue3.Y((Iterable) this.o.z0.getValue(), 8);
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, "sdk:ReactionsViewModel", ho7.i("Warmup reactions. defaultReactions = ", ue3.N(listY, ",", "[", "]", q8.Y, 24), "]"), null);
            }
        }
        pb2 pb2VarW = this.o.w();
        if (pb2VarW != null) {
            long j = pb2VarW.b.i0;
        }
        return qqg.a;
    }
}
