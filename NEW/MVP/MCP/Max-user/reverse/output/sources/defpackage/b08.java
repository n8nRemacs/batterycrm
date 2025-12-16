package defpackage;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;
import one.me.keyboardmedia.stickers.KeyboardStickersWidget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* loaded from: classes2.dex */
public final class b08 extends dtf implements sm6 {
    public final /* synthetic */ KeyboardStickersWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b08(KeyboardStickersWidget keyboardStickersWidget, Continuation continuation) {
        super(2, continuation);
        this.X = keyboardStickersWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        b08 b08Var = (b08) l((qjf) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        b08Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        b08 b08Var = new b08(this.X, continuation);
        b08Var.o = obj;
        return b08Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        qjf qjfVar = (qjf) this.o;
        yy7[] yy7VarArr = KeyboardStickersWidget.s0;
        KeyboardStickersWidget keyboardStickersWidget = this.X;
        EndlessRecyclerView2 endlessRecyclerView2Y0 = keyboardStickersWidget.y0();
        int i = qjfVar.b;
        if (i >= 0) {
            endlessRecyclerView2Y0.E0();
            GridLayoutManager gridLayoutManagerD = x7j.d(endlessRecyclerView2Y0);
            if (gridLayoutManagerD != null) {
                gridLayoutManagerD.o1(i, 0);
            }
        }
        RecyclerView recyclerViewZ0 = keyboardStickersWidget.z0();
        int i2 = qjfVar.c;
        if (i2 >= 0) {
            recyclerViewZ0.E0();
            recyclerViewZ0.x0(i2);
        }
        return qqg.a;
    }
}
