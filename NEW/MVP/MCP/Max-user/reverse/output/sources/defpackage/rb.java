package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class rb extends dtf implements um6 {
    public /* synthetic */ RecyclerView X;
    public final /* synthetic */ okf Y;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rb(okf okfVar, Continuation continuation, int i) {
        super(3, continuation);
        this.o = i;
        this.Y = okfVar;
    }

    @Override // defpackage.um6
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        RecyclerView recyclerView = (RecyclerView) obj;
        Continuation continuation = (Continuation) obj3;
        switch (this.o) {
            case 0:
                rb rbVar = new rb(this.Y, continuation, 0);
                rbVar.X = recyclerView;
                qqg qqgVar = qqg.a;
                rbVar.n(qqgVar);
                return qqgVar;
            case 1:
                rb rbVar2 = new rb(this.Y, continuation, 1);
                rbVar2.X = recyclerView;
                qqg qqgVar2 = qqg.a;
                rbVar2.n(qqgVar2);
                return qqgVar2;
            case 2:
                rb rbVar3 = new rb(this.Y, continuation, 2);
                rbVar3.X = recyclerView;
                qqg qqgVar3 = qqg.a;
                rbVar3.n(qqgVar3);
                return qqgVar3;
            case 3:
                rb rbVar4 = new rb(this.Y, continuation, 3);
                rbVar4.X = recyclerView;
                qqg qqgVar4 = qqg.a;
                rbVar4.n(qqgVar4);
                return qqgVar4;
            default:
                rb rbVar5 = new rb(this.Y, continuation, 4);
                rbVar5.X = recyclerView;
                qqg qqgVar5 = qqg.a;
                rbVar5.n(qqgVar5);
                return qqgVar5;
        }
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        switch (this.o) {
            case 0:
                g8j.b(obj);
                RecyclerView recyclerView = this.X;
                this.Y.j();
                recyclerView.Y();
                break;
            case 1:
                g8j.b(obj);
                RecyclerView recyclerView2 = this.X;
                this.Y.j();
                recyclerView2.Y();
                break;
            case 2:
                g8j.b(obj);
                RecyclerView recyclerView3 = this.X;
                this.Y.j();
                recyclerView3.Y();
                break;
            case 3:
                g8j.b(obj);
                RecyclerView recyclerView4 = this.X;
                this.Y.j();
                recyclerView4.Y();
                break;
            default:
                g8j.b(obj);
                RecyclerView recyclerView5 = this.X;
                this.Y.j();
                recyclerView5.Y();
                break;
        }
        return qqg.a;
    }
}
