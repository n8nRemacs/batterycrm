package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class z0 extends q44 {
    public final /* synthetic */ mwd X;
    public int Y;
    public iwd d;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(mwd mwdVar, Continuation continuation) {
        super(continuation);
        this.X = mwdVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.d(null, this);
    }
}
