package defpackage;

import kotlin.coroutines.Continuation;
import one.me.android.OneMeApplication;

/* loaded from: classes.dex */
public final class swa extends dtf implements sm6 {
    public final /* synthetic */ OneMeApplication X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public swa(OneMeApplication oneMeApplication, Continuation continuation) {
        super(2, continuation);
        this.X = oneMeApplication;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((swa) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new swa(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        qqg qqgVar = qqg.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return qqgVar;
        }
        g8j.b(obj);
        k18 k18Var = s1b.a;
        t1b t1bVar = t1b.a;
        bwf bwfVarD = t1bVar.getAccessor().d(8);
        bwf bwfVarD2 = t1bVar.getAccessor().d(595);
        w7c w7cVar = new w7c();
        w7cVar.a = bwfVarD2;
        this.o = 1;
        wqi.c("PrefetchThemeBackgroundUseCase", "Prefetch chat themes.", new Object[0]);
        v1a v1aVar = a93.s0;
        OneMeApplication oneMeApplication = this.X;
        String str = v1aVar.x(oneMeApplication).j().a;
        o98 o98VarD = ve3.d();
        o98VarD.add(new of0(str.concat("Light")));
        o98VarD.add(new of0(str.concat("Dark")));
        Object objI = svi.i(((q2b) ((lzf) bwfVarD.getValue())).b(), new v7c(w7cVar, oneMeApplication, ve3.a(o98VarD), null), this);
        g84 g84Var = g84.a;
        if (objI != g84Var) {
            objI = qqgVar;
        }
        return objI == g84Var ? g84Var : qqgVar;
    }
}
