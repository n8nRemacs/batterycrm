package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class y3 extends q44 {
    public final /* synthetic */ a4 X;
    public int Y;
    public a4 d;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(a4 a4Var, Continuation continuation) {
        super(continuation);
        this.X = a4Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        this.X.d(null, this);
        return g84.a;
    }
}
