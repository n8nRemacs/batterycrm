package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class nke extends q44 {
    public final /* synthetic */ tw X;
    public int Y;
    public tw d;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nke(tw twVar, Continuation continuation) {
        super(continuation);
        this.X = twVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.b(null, this);
    }
}
