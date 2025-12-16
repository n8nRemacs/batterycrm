package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class g04 extends dtf implements wm6 {
    public /* synthetic */ List X;
    public /* synthetic */ Object Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ int o = 1;

    public /* synthetic */ g04(int i, Continuation continuation) {
        super(i, continuation);
    }

    @Override // defpackage.wm6
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.o) {
            case 0:
                g04 g04Var = new g04((j04) this.Z, (Continuation) obj4);
                g04Var.Y = (ku3) obj;
                g04Var.X = (List) obj3;
                return g04Var.n(qqg.a);
            default:
                g04 g04Var2 = new g04(4, (Continuation) obj4);
                g04Var2.X = (List) obj;
                g04Var2.Y = (List) obj2;
                g04Var2.Z = (List) obj3;
                return g04Var2.n(qqg.a);
        }
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        switch (this.o) {
            case 0:
                g8j.b(obj);
                ku3 ku3Var = (ku3) this.Y;
                List list = this.X;
                imb imbVarD = ((j04) this.Z).D(ku3Var);
                return new vac((bbc) imbVarD.a, (List) imbVarD.b, list);
            default:
                g8j.b(obj);
                List list2 = this.X;
                List list3 = (List) this.Y;
                List list4 = (List) this.Z;
                xif xifVar = new xif();
                xifVar.a = list2;
                xifVar.b = list3;
                xifVar.c = list4;
                return xifVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g04(j04 j04Var, Continuation continuation) {
        super(4, continuation);
        this.Z = j04Var;
    }
}
