package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class pxd extends dtf implements sm6 {
    public final /* synthetic */ sxd X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ boolean Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pxd(sxd sxdVar, String str, boolean z, Continuation continuation) {
        super(2, continuation);
        this.X = sxdVar;
        this.Y = str;
        this.Z = z;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((pxd) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new pxd(this.X, this.Y, this.Z, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return obj;
        }
        g8j.b(obj);
        this.o = 1;
        Comparable comparableA = sxd.a(this.X, this.Y, this.Z, false, this);
        g84 g84Var = g84.a;
        return comparableA == g84Var ? g84Var : comparableA;
    }
}
