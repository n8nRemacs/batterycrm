package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.devmenu.threadsviewer.ThreadsStateViewerScreen;

/* loaded from: classes2.dex */
public final class d8g extends dtf implements sm6 {
    public final /* synthetic */ ThreadsStateViewerScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d8g(Continuation continuation, ThreadsStateViewerScreen threadsStateViewerScreen) {
        super(2, continuation);
        this.X = threadsStateViewerScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        d8g d8gVar = (d8g) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        d8gVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        d8g d8gVar = new d8g(continuation, this.X);
        d8gVar.o = obj;
        return d8gVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        this.X.d.E((List) this.o);
        return qqg.a;
    }
}
