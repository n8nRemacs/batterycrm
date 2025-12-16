package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class u36 extends q44 {
    public final /* synthetic */ v36 X;
    public int Y;
    public v36 d;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u36(v36 v36Var, Continuation continuation) {
        super(continuation);
        this.X = v36Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.a(null, this);
    }
}
