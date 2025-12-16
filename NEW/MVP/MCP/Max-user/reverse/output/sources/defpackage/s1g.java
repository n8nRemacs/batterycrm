package defpackage;

import android.content.Context;
import android.view.View;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class s1g extends dtf implements sm6 {
    public final /* synthetic */ View o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1g(View view, Continuation continuation) {
        super(2, continuation);
        this.o = view;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        s1g s1gVar = (s1g) l((z26) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        s1gVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new s1g(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        View view = this.o;
        if (view.isInEditMode()) {
            bq4 bq4Var = bq4.e0;
        } else {
            Context context = view.getContext();
            bwf bwfVar = q1g.a0;
            nca.d(context);
        }
        return qqg.a;
    }
}
