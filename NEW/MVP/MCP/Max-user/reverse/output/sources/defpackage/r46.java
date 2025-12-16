package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class r46 extends q44 {
    public final /* synthetic */ s46 X;
    public int Y;
    public s46 d;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r46(s46 s46Var, Continuation continuation) {
        super(continuation);
        this.X = s46Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.a(null, this);
    }
}
