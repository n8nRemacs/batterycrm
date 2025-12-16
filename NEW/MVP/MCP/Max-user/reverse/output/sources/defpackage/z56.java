package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class z56 extends q44 {
    public final /* synthetic */ z41 X;
    public z41 Y;
    public z26 Z;
    public /* synthetic */ Object d;
    public int o;
    public uid s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z56(z41 z41Var, Continuation continuation) {
        super(continuation);
        this.X = z41Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.d = obj;
        this.o |= Integer.MIN_VALUE;
        return this.X.d(null, this);
    }
}
