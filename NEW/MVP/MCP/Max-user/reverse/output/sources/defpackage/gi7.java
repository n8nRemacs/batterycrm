package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class gi7 extends dtf implements sm6 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ bj7 Z;
    public ConcurrentHashMap o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gi7(bj7 bj7Var, Continuation continuation) {
        super(2, continuation);
        this.Z = bj7Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((gi7) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        gi7 gi7Var = new gi7(this.Z, continuation);
        gi7Var.Y = obj;
        return gi7Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        x1g x1gVar;
        ConcurrentHashMap concurrentHashMap;
        int i = this.X;
        if (i == 0) {
            g8j.b(obj);
            f84 f84Var = (f84) this.Y;
            String str = bj7.D0;
            x1g x1gVar2 = new x1g("fetchAlbums");
            ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
            List<oo6> list = oo6.d;
            ArrayList arrayList = new ArrayList(we3.q(list, 10));
            for (oo6 oo6Var : list) {
                bj7 bj7Var = this.Z;
                arrayList.add(svi.e(f84Var, ((q2b) bj7Var.c).b(), null, new fi7(oo6Var, bj7Var, x1gVar2, concurrentHashMap2, null), 2));
            }
            this.Y = x1gVar2;
            this.o = concurrentHashMap2;
            this.X = 1;
            Object objC = hui.c(arrayList, this);
            g84 g84Var = g84.a;
            if (objC == g84Var) {
                return g84Var;
            }
            x1gVar = x1gVar2;
            concurrentHashMap = concurrentHashMap2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            concurrentHashMap = this.o;
            x1gVar = (x1g) this.Y;
            g8j.b(obj);
        }
        x1gVar.getClass();
        return ue3.d0(concurrentHashMap.values());
    }
}
