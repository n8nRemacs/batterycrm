package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class zg3 extends dtf implements sm6 {
    public final /* synthetic */ bh3 X;
    public final /* synthetic */ gj7 Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zg3(bh3 bh3Var, gj7 gj7Var, Continuation continuation) {
        super(2, continuation);
        this.X = bh3Var;
        this.Y = gj7Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((zg3) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        zg3 zg3Var = new zg3(this.X, this.Y, continuation);
        zg3Var.o = obj;
        return zg3Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object ipdVar;
        g8j.b(obj);
        try {
            ipdVar = ((od8) this.X.d.getValue()).a(this.Y.c, false);
        } catch (Throwable th) {
            ipdVar = new ipd(th);
        }
        if (ipdVar instanceof ipd) {
            return null;
        }
        return ipdVar;
    }
}
