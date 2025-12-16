package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class sqf extends q44 {
    public final /* synthetic */ xqf X;
    public int Y;
    public xqf d;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sqf(xqf xqfVar, Continuation continuation) {
        super(continuation);
        this.X = xqfVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return xqf.a(this.X, null, this);
    }
}
