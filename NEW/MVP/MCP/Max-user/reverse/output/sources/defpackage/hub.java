package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class hub extends dtf implements sm6 {
    public final /* synthetic */ List X;
    public final /* synthetic */ kub Y;
    public final /* synthetic */ List Z;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hub(List list, kub kubVar, List list2, Continuation continuation) {
        super(2, continuation);
        this.X = list;
        this.Y = kubVar;
        this.Z = list2;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((hub) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        hub hubVar = new hub(this.X, this.Y, this.Z, continuation);
        hubVar.o = obj;
        return hubVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        f84 f84Var = (f84) this.o;
        ArrayList arrayList = new ArrayList();
        for (ytb ytbVar : this.X) {
            if (!d7j.f(f84Var)) {
                return hd5.a;
            }
            if (kub.a(this.Y, ytbVar, this.Z) == null) {
                arrayList.add(ytbVar);
            }
        }
        return arrayList;
    }
}
