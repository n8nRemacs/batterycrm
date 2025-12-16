package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class i5e extends q44 {
    public final /* synthetic */ i3e X;
    public /* synthetic */ Object d;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5e(i3e i3eVar, Continuation continuation) {
        super(continuation);
        this.X = i3eVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        this.d = obj;
        this.o |= Integer.MIN_VALUE;
        this.X.d(null, this);
        return g84.a;
    }
}
