package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* loaded from: classes2.dex */
public final class gt2 extends dtf implements um6 {
    public /* synthetic */ EndlessRecyclerView2 X;
    public final /* synthetic */ okf Y;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gt2(okf okfVar, Continuation continuation, int i) {
        super(3, continuation);
        this.o = i;
        this.Y = okfVar;
    }

    @Override // defpackage.um6
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        EndlessRecyclerView2 endlessRecyclerView2 = (EndlessRecyclerView2) obj;
        Continuation continuation = (Continuation) obj3;
        switch (this.o) {
            case 0:
                gt2 gt2Var = new gt2(this.Y, continuation, 0);
                gt2Var.X = endlessRecyclerView2;
                qqg qqgVar = qqg.a;
                gt2Var.n(qqgVar);
                return qqgVar;
            default:
                gt2 gt2Var2 = new gt2(this.Y, continuation, 1);
                gt2Var2.X = endlessRecyclerView2;
                qqg qqgVar2 = qqg.a;
                gt2Var2.n(qqgVar2);
                return qqgVar2;
        }
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        switch (this.o) {
            case 0:
                g8j.b(obj);
                EndlessRecyclerView2 endlessRecyclerView2 = this.X;
                this.Y.j();
                endlessRecyclerView2.Y();
                break;
            default:
                g8j.b(obj);
                EndlessRecyclerView2 endlessRecyclerView22 = this.X;
                this.Y.j();
                endlessRecyclerView22.Y();
                break;
        }
        return qqg.a;
    }
}
