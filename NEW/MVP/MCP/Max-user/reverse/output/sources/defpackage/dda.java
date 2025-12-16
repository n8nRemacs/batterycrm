package defpackage;

import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class dda extends dtf implements sm6 {
    public qmb X;
    public int Y;
    public final /* synthetic */ gda Z;
    public hg8 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dda(gda gdaVar, Continuation continuation) {
        super(2, continuation);
        this.Z = gdaVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((dda) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new dda(this.Z, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        hg8 hg8Var;
        qmb qmbVar;
        Map map;
        Map map2;
        gda gdaVar = this.Z;
        AtomicReference atomicReference = gdaVar.k;
        int i = this.Y;
        if (i == 0) {
            g8j.b(obj);
            hg8Var = (hg8) atomicReference.get();
            qmbVar = (qmb) gdaVar.j.get();
            this.o = hg8Var;
            this.X = qmbVar;
            this.Y = 1;
            Object objA = gda.a(gdaVar, this);
            g84 g84Var = g84.a;
            if (objA == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qmbVar = this.X;
            hg8Var = this.o;
            g8j.b(obj);
        }
        if (qmbVar == null) {
            qmbVar = qmb.g;
        }
        Object obj2 = (hg8Var == null || (map2 = hg8Var.e) == null) ? null : map2.get("screen_to");
        Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
        if (num != null && num.intValue() == 1) {
            Object obj3 = (hg8Var == null || (map = hg8Var.e) == null) ? null : map.get("screen_from");
            num = obj3 instanceof Integer ? (Integer) obj3 : null;
        }
        if (num == null) {
            wqi.q(gda.class.getName(), "Can't send WARM_START event because last screenTo is empty", new Object[0]);
        } else {
            hg8 hg8VarC = gdaVar.c(2, gdaVar.b(num.intValue(), hg8Var, qmbVar));
            atomicReference.updateAndGet(new k11(6, hg8VarC));
            ((dd) gdaVar.c.getValue()).h(hg8VarC);
        }
        return qqg.a;
    }
}
