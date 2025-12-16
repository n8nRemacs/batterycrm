package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class b56 extends q44 {
    public int X;
    public final /* synthetic */ c56 Y;
    public c56 d;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b56(c56 c56Var, Continuation continuation) {
        super(continuation);
        this.Y = c56Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a(null, this);
    }
}
