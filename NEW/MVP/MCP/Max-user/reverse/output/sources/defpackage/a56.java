package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class a56 extends q44 {
    public int X;
    public final /* synthetic */ w3 Y;
    public Object Z;
    public w3 d;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a56(w3 w3Var, Continuation continuation) {
        super(continuation);
        this.Y = w3Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a(null, this);
    }
}
