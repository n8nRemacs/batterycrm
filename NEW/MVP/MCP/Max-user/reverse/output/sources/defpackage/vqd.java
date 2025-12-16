package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class vqd extends q44 {
    public final /* synthetic */ drd X;
    public int Y;
    public drd d;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vqd(drd drdVar, Continuation continuation) {
        super(continuation);
        this.X = drdVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return drd.b(this.X, this);
    }
}
