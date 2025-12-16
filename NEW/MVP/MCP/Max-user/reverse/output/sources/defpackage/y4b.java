package defpackage;

import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class y4b extends dtf implements sm6 {
    public final /* synthetic */ c5b X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4b(c5b c5bVar, Continuation continuation) {
        super(2, continuation);
        this.X = c5bVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        y4b y4bVar = (y4b) l((xs) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        y4bVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        y4b y4bVar = new y4b(this.X, continuation);
        y4bVar.o = obj;
        return y4bVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        xs xsVar = (xs) this.o;
        c5b c5bVar = this.X;
        x9f x9fVar = c5bVar.h;
        if (x9fVar != null) {
            x9fVar.cancel((CancellationException) null);
        }
        c5bVar.h = null;
        z74 z74VarLimitedParallelism = ((q2b) c5bVar.b).a().limitedParallelism(1, "folders-counters");
        ArrayList arrayList = new ArrayList(we3.q(xsVar, 10));
        qs qsVar = new qs(xsVar);
        while (qsVar.hasNext()) {
            String str = (String) qsVar.next();
            arrayList.add(fni.a(str, "all.chat.folder") ? new m11(13, new z4b(str, u84.b)) : new k78(new p86(str, c5bVar.c, c5bVar.a, c5bVar.d, z74VarLimitedParallelism).e, str, 1));
        }
        c5bVar.h = gw0.w(new g56(new ka4((x26[]) ue3.d0(arrayList).toArray(new x26[0]), 3), new ir9(2, c5bVar.f, f9a.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 4), 1), c5bVar.e);
        return qqg.a;
    }
}
