package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class da2 extends q44 {
    public /* synthetic */ Object X;
    public final /* synthetic */ x92 Y;
    public int Z;
    public x92 d;
    public Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da2(x92 x92Var, Continuation continuation) {
        super(continuation);
        this.Y = x92Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.a(null, this);
    }
}
