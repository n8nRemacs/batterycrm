package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class rfa extends dtf implements um6 {
    public /* synthetic */ in X;
    public /* synthetic */ yeb Y;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rfa(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.o = i2;
    }

    @Override // defpackage.um6
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        in inVar = (in) obj;
        yeb yebVar = (yeb) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.o) {
            case 0:
                rfa rfaVar = new rfa(3, continuation, 0);
                rfaVar.X = inVar;
                rfaVar.Y = yebVar;
                qqg qqgVar = qqg.a;
                rfaVar.n(qqgVar);
                return qqgVar;
            default:
                rfa rfaVar2 = new rfa(3, continuation, 1);
                rfaVar2.X = inVar;
                rfaVar2.Y = yebVar;
                qqg qqgVar2 = qqg.a;
                rfaVar2.n(qqgVar2);
                return qqgVar2;
        }
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        switch (this.o) {
            case 0:
                g8j.b(obj);
                this.X.setBackgroundColor(this.Y.b().l);
                break;
            default:
                g8j.b(obj);
                this.X.setBackgroundColor(this.Y.b().k);
                break;
        }
        return qqg.a;
    }
}
