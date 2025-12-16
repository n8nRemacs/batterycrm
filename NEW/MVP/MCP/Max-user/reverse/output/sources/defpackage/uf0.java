package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.workmanager.BacklogWorker;

/* loaded from: classes2.dex */
public final class uf0 extends dtf implements sm6 {
    public final /* synthetic */ List X;
    public final /* synthetic */ uid o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uf0(uid uidVar, List list, Continuation continuation) {
        super(2, continuation);
        this.o = uidVar;
        this.X = list;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((uf0) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new uf0(this.o, this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        return Boolean.valueOf(((BacklogWorker) this.o.a).g().g().contains(this.X));
    }
}
