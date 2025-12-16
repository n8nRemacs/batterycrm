package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class ynf extends q44 {
    public int X;
    public /* synthetic */ Object d;
    public final /* synthetic */ znf o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ynf(znf znfVar, Continuation continuation) {
        super(continuation);
        this.o = znfVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.d = obj;
        this.X |= Integer.MIN_VALUE;
        this.o.d(null, this);
        return g84.a;
    }
}
