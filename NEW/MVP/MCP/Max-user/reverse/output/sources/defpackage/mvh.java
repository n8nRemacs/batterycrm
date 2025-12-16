package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class mvh extends q44 {
    public final /* synthetic */ uvh X;
    public int Y;
    public qv7 d;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mvh(uvh uvhVar, Continuation continuation) {
        super(continuation);
        this.X = uvhVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return uvh.t(this.X, null, this);
    }
}
