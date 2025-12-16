package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class v13 extends q44 {
    public final /* synthetic */ x13 X;
    public int Y;
    public x13 d;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v13(x13 x13Var, Continuation continuation) {
        super(continuation);
        this.X = x13Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        this.X.d(null, this);
        return g84.a;
    }
}
