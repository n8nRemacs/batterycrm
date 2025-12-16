package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class y0h extends dtf implements sm6 {
    public final /* synthetic */ f1h o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0h(f1h f1hVar, Continuation continuation) {
        super(2, continuation);
        this.o = f1hVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        y0h y0hVar = (y0h) l((qqg) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        y0hVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new y0h(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        qqg qqgVar = qqg.a;
        g8j.b(obj);
        f1h f1hVar = this.o;
        RecyclerView recyclerView = f1hVar.f;
        if (recyclerView != null) {
            String str = f1hVar.e;
            l6b l6bVar = wqi.a;
            if (l6bVar != null) {
                lg8 lg8Var = lg8.d;
                if (l6bVar.b(lg8Var)) {
                    l6bVar.c(lg8Var, str, "Player autoplay. Handle fetch event for video message, try start autoplay.", null);
                }
            }
            if (recyclerView.getScrollState() == 0) {
                this.o.f(recyclerView, false);
            }
        }
        return qqgVar;
    }
}
