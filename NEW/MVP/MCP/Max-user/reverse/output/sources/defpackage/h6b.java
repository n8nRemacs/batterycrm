package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class h6b extends dtf implements sm6 {
    public final /* synthetic */ l6b X;
    public /* synthetic */ boolean o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6b(l6b l6bVar, Continuation continuation) {
        super(2, continuation);
        this.X = l6bVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        h6b h6bVar = (h6b) l(bool, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        h6bVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        h6b h6bVar = new h6b(this.X, continuation);
        h6bVar.o = ((Boolean) obj).booleanValue();
        return h6bVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        boolean z = this.o;
        String str = this.X.b;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.o;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, xc0.f("allowSensitive=", z), null);
            }
        }
        return qqg.a;
    }
}
