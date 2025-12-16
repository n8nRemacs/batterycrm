package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class qxd extends dtf implements sm6 {
    public final /* synthetic */ sxd X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ boolean Z;
    public int o;
    public final /* synthetic */ boolean s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qxd(sxd sxdVar, String str, boolean z, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.X = sxdVar;
        this.Y = str;
        this.Z = z;
        this.s0 = z2;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((qxd) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new qxd(this.X, this.Y, this.Z, this.s0, continuation);
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
        Comparable comparableA = sxd.a(this.X, this.Y, this.Z, this.s0, this);
        g84 g84Var = g84.a;
        return comparableA == g84Var ? g84Var : comparableA;
    }
}
