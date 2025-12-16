package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class a66 extends q44 {
    public /* synthetic */ Object X;
    public final /* synthetic */ a40 Y;
    public int Z;
    public a40 d;
    public uid o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a66(a40 a40Var, Continuation continuation) {
        super(continuation);
        this.Y = a40Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.a(null, this);
    }
}
