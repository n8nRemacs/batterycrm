package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class qib extends q44 {
    public final /* synthetic */ f0a X;
    public /* synthetic */ Object d;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qib(f0a f0aVar, Continuation continuation) {
        super(continuation);
        this.X = f0aVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.d = obj;
        this.o |= Integer.MIN_VALUE;
        return this.X.a(null, this);
    }
}
