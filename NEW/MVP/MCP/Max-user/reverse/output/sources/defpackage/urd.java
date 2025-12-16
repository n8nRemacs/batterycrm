package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class urd extends q44 {
    public final /* synthetic */ bsd X;
    public int Y;
    public bsd d;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public urd(bsd bsdVar, Continuation continuation) {
        super(continuation);
        this.X = bsdVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.j(0L, this);
    }
}
