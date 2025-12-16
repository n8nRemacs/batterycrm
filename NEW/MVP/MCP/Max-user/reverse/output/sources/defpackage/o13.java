package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class o13 extends q44 {
    public final /* synthetic */ z13 X;
    public int Y;
    public z13 d;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o13(z13 z13Var, Continuation continuation) {
        super(continuation);
        this.X = z13Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.c(this);
    }
}
