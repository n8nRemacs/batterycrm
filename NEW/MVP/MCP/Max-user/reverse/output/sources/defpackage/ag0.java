package defpackage;

import java.util.HashSet;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.workmanager.BacklogWorker;

/* loaded from: classes2.dex */
public final class ag0 extends dtf implements sm6 {
    public final /* synthetic */ HashSet X;
    public final /* synthetic */ BacklogWorker o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag0(BacklogWorker backlogWorker, HashSet hashSet, Continuation continuation) {
        super(2, continuation);
        this.o = backlogWorker;
        this.X = hashSet;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ag0 ag0Var = (ag0) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ag0Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ag0(this.o, this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        this.o.g().g().updateState(0, ue3.d0(this.X));
        return qqg.a;
    }
}
