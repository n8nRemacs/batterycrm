package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class xy4 extends q44 {
    public int X;
    public /* synthetic */ Object d;
    public final /* synthetic */ a40 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xy4(a40 a40Var, Continuation continuation) {
        super(continuation);
        this.o = a40Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.d = obj;
        this.X |= Integer.MIN_VALUE;
        return this.o.a(null, this);
    }
}
