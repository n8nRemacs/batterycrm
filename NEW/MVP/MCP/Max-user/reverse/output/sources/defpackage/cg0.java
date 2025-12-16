package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.workmanager.BacklogWorker;

/* loaded from: classes2.dex */
public final class cg0 extends dtf implements sm6 {
    public final /* synthetic */ int X;
    public final /* synthetic */ BacklogWorker o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cg0(BacklogWorker backlogWorker, int i, Continuation continuation) {
        super(2, continuation);
        this.o = backlogWorker;
        this.X = i;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((cg0) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new cg0(this.o, this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        return this.o.g().g().getItemsForRunning(this.X);
    }
}
