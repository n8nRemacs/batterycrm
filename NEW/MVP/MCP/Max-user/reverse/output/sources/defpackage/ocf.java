package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ocf extends q44 {
    public final /* synthetic */ pcf X;
    public int Y;
    public pcf d;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ocf(pcf pcfVar, Continuation continuation) {
        super(continuation);
        this.X = pcfVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.a(null, this);
    }
}
