package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class cj8 extends dtf implements um6 {
    public /* synthetic */ List X;
    public /* synthetic */ List Y;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cj8(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.o = i2;
    }

    @Override // defpackage.um6
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        List list = (List) obj;
        List list2 = (List) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.o) {
            case 0:
                cj8 cj8Var = new cj8(3, continuation, 0);
                cj8Var.X = list;
                cj8Var.Y = list2;
                return cj8Var.n(qqg.a);
            case 1:
                cj8 cj8Var2 = new cj8(3, continuation, 1);
                cj8Var2.X = list;
                cj8Var2.Y = list2;
                return cj8Var2.n(qqg.a);
            case 2:
                cj8 cj8Var3 = new cj8(3, continuation, 2);
                cj8Var3.X = list;
                cj8Var3.Y = list2;
                return cj8Var3.n(qqg.a);
            case 3:
                cj8 cj8Var4 = new cj8(3, continuation, 3);
                cj8Var4.X = list;
                cj8Var4.Y = list2;
                return cj8Var4.n(qqg.a);
            default:
                cj8 cj8Var5 = new cj8(3, continuation, 4);
                cj8Var5.X = list;
                cj8Var5.Y = list2;
                return cj8Var5.n(qqg.a);
        }
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        switch (this.o) {
            case 0:
                g8j.b(obj);
                List list = this.X;
                list.addAll(this.Y);
                break;
            case 1:
                g8j.b(obj);
                List list2 = this.X;
                list2.addAll(this.Y);
                break;
            case 2:
                g8j.b(obj);
                List list3 = this.X;
                List list4 = this.Y;
                if (list3.isEmpty()) {
                    break;
                }
                break;
            case 3:
                g8j.b(obj);
                break;
            default:
                g8j.b(obj);
                break;
        }
        return ue3.T(this.X, this.Y);
    }
}
