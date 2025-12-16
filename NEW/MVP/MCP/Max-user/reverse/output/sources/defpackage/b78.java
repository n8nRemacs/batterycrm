package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class b78 extends dtf implements sm6 {
    public final /* synthetic */ s78 X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ long o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b78(long j, s78 s78Var, long j2, long j3, Continuation continuation) {
        super(2, continuation);
        this.o = j;
        this.X = s78Var;
        this.Y = j2;
        this.Z = j3;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((b78) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new b78(this.o, this.X, this.Y, this.Z, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        k18 k18Var = this.X.c;
        g8j.b(obj);
        long j = this.o;
        long j2 = this.Y;
        if (j > 0) {
            return ((qi9) k18Var.getValue()).m(j2);
        }
        if (j2 > 0) {
            return ((qi9) k18Var.getValue()).i(this.Z, j2);
        }
        return null;
    }
}
