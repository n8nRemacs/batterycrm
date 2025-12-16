package defpackage;

import java.util.concurrent.Callable;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class q84 extends dtf implements sm6 {
    public final /* synthetic */ Callable o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q84(Callable callable, Continuation continuation) {
        super(2, continuation);
        this.o = callable;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((q84) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new q84(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        return this.o.call();
    }
}
