package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class tea extends dtf implements sm6 {
    public final /* synthetic */ Rect X;
    public final /* synthetic */ RectF Y;
    public final /* synthetic */ f84 Z;
    public final /* synthetic */ vea o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tea(vea veaVar, Rect rect, RectF rectF, f84 f84Var, Continuation continuation) {
        super(2, continuation);
        this.o = veaVar;
        this.X = rect;
        this.Y = rectF;
        this.Z = f84Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        tea teaVar = (tea) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        teaVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new tea(this.o, this.X, this.Y, this.Z, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        String absolutePath = this.o.a().p(this.o.l).getAbsolutePath();
        vea veaVar = this.o;
        Rect rect = this.X;
        svi.e(this.Z, ((q2b) ((lzf) veaVar.g.getValue())).b(), null, new sea(absolutePath, veaVar, this.Y, 1, rect, null), 2);
        return qqg.a;
    }
}
