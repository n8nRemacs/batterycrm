package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class at9 extends q44 {
    public /* synthetic */ Object X;
    public final /* synthetic */ bt9 Y;
    public int Z;
    public bt9 d;
    public w68 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public at9(bt9 bt9Var, Continuation continuation) {
        super(continuation);
        this.Y = bt9Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.b(null, this);
    }
}
