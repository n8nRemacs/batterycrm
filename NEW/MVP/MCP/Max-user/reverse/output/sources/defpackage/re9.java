package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class re9 extends dtf implements sm6 {
    public final /* synthetic */ myb X;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public re9(Object obj, Continuation continuation, myb mybVar) {
        super(2, continuation);
        this.o = obj;
        this.X = mybVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((re9) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new re9(this.o, continuation, this.X);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        return this.X.a((ku3) this.o);
    }
}
