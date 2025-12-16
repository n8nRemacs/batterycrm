package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class tec extends dtf implements um6 {
    public /* synthetic */ yfb X;
    public /* synthetic */ yeb Y;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tec(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.o = i2;
    }

    @Override // defpackage.um6
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        yfb yfbVar = (yfb) obj;
        yeb yebVar = (yeb) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.o) {
            case 0:
                tec tecVar = new tec(3, continuation, 0);
                tecVar.X = yfbVar;
                tecVar.Y = yebVar;
                qqg qqgVar = qqg.a;
                tecVar.n(qqgVar);
                return qqgVar;
            default:
                tec tecVar2 = new tec(3, continuation, 1);
                tecVar2.X = yfbVar;
                tecVar2.Y = yebVar;
                qqg qqgVar2 = qqg.a;
                tecVar2.n(qqgVar2);
                return qqgVar2;
        }
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        switch (this.o) {
            case 0:
                g8j.b(obj);
                this.X.setBackgroundColor(this.Y.b().k);
                break;
            default:
                g8j.b(obj);
                this.X.setBackgroundColor(this.Y.b().l);
                break;
        }
        return qqg.a;
    }
}
