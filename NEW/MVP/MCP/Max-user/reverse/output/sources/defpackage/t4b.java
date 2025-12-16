package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class t4b extends dtf implements em6 {
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t4b(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.o = i2;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.o) {
            case 0:
                t4b t4bVar = new t4b(1, continuation, 0);
                qqg qqgVar = qqg.a;
                t4bVar.n(qqgVar);
                return qqgVar;
            default:
                t4b t4bVar2 = new t4b(1, continuation, 1);
                qqg qqgVar2 = qqg.a;
                t4bVar2.n(qqgVar2);
                return qqgVar2;
        }
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        switch (this.o) {
            case 0:
                g8j.b(obj);
                break;
            default:
                g8j.b(obj);
                break;
        }
        return qqg.a;
    }
}
