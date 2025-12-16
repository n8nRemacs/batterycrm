package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class o56 extends q44 {
    public int X;
    public final /* synthetic */ l56 Y;
    public Object Z;
    public l56 d;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o56(l56 l56Var, Continuation continuation) {
        super(continuation);
        this.Y = l56Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a(null, this);
    }
}
