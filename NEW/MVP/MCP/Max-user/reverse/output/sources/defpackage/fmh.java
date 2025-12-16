package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class fmh extends q44 {
    public final /* synthetic */ tmh X;
    public int Y;
    public no0 d;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fmh(tmh tmhVar, Continuation continuation) {
        super(continuation);
        this.X = tmhVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.h(null, null, this);
    }
}
