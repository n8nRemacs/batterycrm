package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.call.panels.CallEventsWidget;

/* loaded from: classes.dex */
public final class l81 extends dtf implements sm6 {
    public final /* synthetic */ View X;
    public final /* synthetic */ CallEventsWidget Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l81(Continuation continuation, View view, CallEventsWidget callEventsWidget) {
        super(2, continuation);
        this.X = view;
        this.Y = callEventsWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        l81 l81Var = (l81) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        l81Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        l81 l81Var = new l81(continuation, this.X, this.Y);
        l81Var.o = obj;
        return l81Var;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, k18] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        phd adapter;
        CallEventsWidget callEventsWidget = this.Y;
        ?? r1 = callEventsWidget.X;
        bbd bbdVar = callEventsWidget.Y;
        g8j.b(obj);
        List list = (List) this.o;
        if (((View) this.X.getParent()).getVisibility() == 0) {
            yy7[] yy7VarArr = CallEventsWidget.Z;
            yy7[] yy7VarArr2 = CallEventsWidget.Z;
            if (!fni.a(((RecyclerView) bbdVar.D(callEventsWidget, yy7VarArr2[0])).getItemAnimator(), (k81) r1.getValue())) {
                ((RecyclerView) bbdVar.D(callEventsWidget, yy7VarArr2[0])).setItemAnimator((k81) r1.getValue());
            }
            a3b a3bVar = callEventsWidget.o;
            int size = list.size();
            RecyclerView recyclerView = (RecyclerView) a3bVar.b;
            if (recyclerView != null && (adapter = recyclerView.getAdapter()) != null && adapter.j() > size) {
                int height = recyclerView.getHeight();
                RecyclerView recyclerView2 = (RecyclerView) a3bVar.b;
                if (recyclerView2 != null) {
                    ViewGroup.LayoutParams layoutParams = recyclerView2.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                    layoutParams.height = height;
                    recyclerView2.setLayoutParams(layoutParams);
                }
            }
        } else {
            yy7[] yy7VarArr3 = CallEventsWidget.Z;
            ((RecyclerView) bbdVar.D(callEventsWidget, CallEventsWidget.Z[0])).setItemAnimator(null);
        }
        callEventsWidget.b.E(list);
        return qqg.a;
    }
}
