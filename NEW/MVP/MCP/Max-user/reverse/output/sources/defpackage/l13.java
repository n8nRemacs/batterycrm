package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class l13 extends q44 {
    public /* synthetic */ Object X;
    public final /* synthetic */ z13 Y;
    public int Z;
    public z13 d;
    public rid o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l13(z13 z13Var, Continuation continuation) {
        super(continuation);
        this.Y = z13Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return z13.b(this.Y, null, this);
    }
}
