package defpackage;

import android.content.Context;
import android.view.View;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class t1g extends dtf implements sm6 {
    public final /* synthetic */ View X;
    public final /* synthetic */ i44 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1g(i44 i44Var, View view, Continuation continuation) {
        super(2, continuation);
        this.o = i44Var;
        this.X = view;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        t1g t1gVar = (t1g) l((q1g) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        t1gVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new t1g(this.o, this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        q1g q1gVarD;
        g8j.b(obj);
        View view = this.X;
        if (view.isInEditMode()) {
            q1gVarD = bq4.e0;
        } else {
            Context context = view.getContext();
            bwf bwfVar = q1g.a0;
            q1gVarD = nca.d(context);
        }
        this.o.k(q1gVarD);
        return qqg.a;
    }
}
