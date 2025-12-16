package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.statistics.perf.utils.LazyModeEventLimitException;

/* loaded from: classes2.dex */
public final class wqb extends dtf implements sm6 {
    public final /* synthetic */ yqb o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wqb(yqb yqbVar, Continuation continuation) {
        super(2, continuation);
        this.o = yqbVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        wqb wqbVar = (wqb) l((z26) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        wqbVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new wqb(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        yqb yqbVar = this.o;
        String str = yqbVar.b;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, wy1.e(yqbVar.f.b().size(), "Started collecting, already have ", " events"), null);
            }
        }
        if (this.o.f.b().size() == 10) {
            this.o.a.a(new LazyModeEventLimitException(ho7.i("Limit 10 for ", this.o.g(), " was achieved")));
        }
        return qqg.a;
    }
}
