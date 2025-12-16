package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.workmanager.BacklogWorker;

/* loaded from: classes2.dex */
public final class yf0 extends dtf implements sm6 {
    public final /* synthetic */ BacklogWorker o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yf0(BacklogWorker backlogWorker, Continuation continuation) {
        super(2, continuation);
        this.o = backlogWorker;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((yf0) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new yf0(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        return new Integer(this.o.g().g().count(0));
    }
}
