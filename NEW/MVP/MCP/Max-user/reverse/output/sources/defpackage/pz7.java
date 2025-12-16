package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class pz7 extends dtf implements um6 {
    public /* synthetic */ RecyclerView X;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pz7(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.o = i2;
    }

    @Override // defpackage.um6
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        RecyclerView recyclerView = (RecyclerView) obj;
        Continuation continuation = (Continuation) obj3;
        switch (this.o) {
            case 0:
                pz7 pz7Var = new pz7(3, continuation, 0);
                pz7Var.X = recyclerView;
                qqg qqgVar = qqg.a;
                pz7Var.n(qqgVar);
                return qqgVar;
            case 1:
                pz7 pz7Var2 = new pz7(3, continuation, 1);
                pz7Var2.X = recyclerView;
                qqg qqgVar2 = qqg.a;
                pz7Var2.n(qqgVar2);
                return qqgVar2;
            default:
                pz7 pz7Var3 = new pz7(3, continuation, 2);
                pz7Var3.X = recyclerView;
                qqg qqgVar3 = qqg.a;
                pz7Var3.n(qqgVar3);
                return qqgVar3;
        }
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        switch (this.o) {
            case 0:
                g8j.b(obj);
                RecyclerView recyclerView = this.X;
                recyclerView.setBackgroundColor(a93.s0.y(recyclerView).b().m);
                break;
            case 1:
                g8j.b(obj);
                RecyclerView recyclerView2 = this.X;
                recyclerView2.setBackgroundColor(a93.s0.y(recyclerView2).b().n);
                break;
            default:
                g8j.b(obj);
                RecyclerView recyclerView3 = this.X;
                v1a v1aVar = a93.s0;
                recyclerView3.setBackgroundColor(v1aVar.y(recyclerView3).b().m);
                a93.h(v1aVar.x(recyclerView3.getContext()), recyclerView3);
                break;
        }
        return qqg.a;
    }
}
