package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class s6c extends dtf implements sm6 {
    public final /* synthetic */ l3b o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6c(l3b l3bVar, Continuation continuation) {
        super(2, continuation);
        this.o = l3bVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        s6c s6cVar = (s6c) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        s6cVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new s6c(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        this.o.invoke();
        return qqg.a;
    }
}
