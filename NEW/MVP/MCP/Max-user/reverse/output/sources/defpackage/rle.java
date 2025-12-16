package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class rle extends dtf implements sm6 {
    public final /* synthetic */ sle X;
    public final /* synthetic */ b2h Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rle(sle sleVar, b2h b2hVar, Continuation continuation) {
        super(2, continuation);
        this.X = sleVar;
        this.Y = b2hVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((rle) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new rle(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            yy7[] yy7VarArr = sle.A0;
            sle sleVar = this.X;
            sxg sxgVarU = sleVar.u();
            sxgVarU.getClass();
            sxgVarU.i("app.media.video.compress", this.Y.name());
            this.o = 1;
            Object objT = sle.t(sleVar, this);
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
