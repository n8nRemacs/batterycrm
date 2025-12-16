package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class h56 extends q44 {
    public int X;
    public /* synthetic */ Object d;
    public final /* synthetic */ a53 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h56(a53 a53Var, Continuation continuation) {
        super(continuation);
        this.o = a53Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.d = obj;
        this.X |= Integer.MIN_VALUE;
        return this.o.b(null, this);
    }
}
