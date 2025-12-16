package defpackage;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class k6a extends dtf implements sm6 {
    public int X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ p6a Z;
    public Set o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6a(long j, p6a p6aVar, Continuation continuation) {
        super(2, continuation);
        this.Y = j;
        this.Z = p6aVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((k6a) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new k6a(this.Y, this.Z, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Set setF;
        Set set;
        p6a p6aVar = this.Z;
        tcf tcfVar = p6aVar.f;
        int i = this.X;
        qqg qqgVar = qqg.a;
        if (i == 0) {
            g8j.b(obj);
            long j = this.Y;
            if (j == -1) {
                return qqgVar;
            }
            Set set2 = ((g6a) tcfVar.getValue()).a;
            if (set2.isEmpty()) {
                setF = Collections.singleton(new Long(j));
            } else if (set2.contains(new Long(j))) {
                setF = ue3.g0(set2);
                setF.remove(new Long(j));
            } else {
                setF = gke.f(set2, new Long(j));
            }
            this.o = setF;
            this.X = 1;
            Serializable serializableD = p6aVar.d(setF, this);
            g84 g84Var = g84.a;
            if (serializableD == g84Var) {
                return g84Var;
            }
            set = setF;
            obj = serializableD;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            set = this.o;
            g8j.b(obj);
        }
        tcfVar.m(null, new g6a(set, (List) obj));
        return qqgVar;
    }
}
