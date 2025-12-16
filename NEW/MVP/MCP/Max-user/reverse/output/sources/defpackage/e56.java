package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class e56 extends q44 {
    public z26 X;
    public final /* synthetic */ f56 Y;
    public /* synthetic */ Object d;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e56(f56 f56Var, Continuation continuation) {
        super(continuation);
        this.Y = f56Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.d = obj;
        this.o |= Integer.MIN_VALUE;
        return this.Y.a(null, this);
    }
}
