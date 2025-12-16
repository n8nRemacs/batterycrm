package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class png extends dtf implements sm6 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ sng Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public png(Object obj, Continuation continuation, sng sngVar) {
        super(2, continuation);
        this.X = obj;
        this.Y = sngVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((png) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new png(this.X, continuation, this.Y);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return obj;
        }
        g8j.b(obj);
        sng sngVar = this.Y;
        hwa hwaVar = (hwa) sngVar.d.getValue();
        wua wuaVar = new wua(sngVar.b);
        this.o = 1;
        Object objF = hwaVar.F(wuaVar, this);
        g84 g84Var = g84.a;
        return objF == g84Var ? g84Var : objF;
    }
}
