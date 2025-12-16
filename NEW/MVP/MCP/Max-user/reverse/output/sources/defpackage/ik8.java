package defpackage;

import java.util.function.Predicate;

/* loaded from: classes3.dex */
public final /* synthetic */ class ik8 implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ lk8 b;

    public /* synthetic */ ik8(lk8 lk8Var, int i) {
        this.a = i;
        this.b = lk8Var;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        boolean z;
        switch (this.a) {
            case 0:
                lk8 lk8Var = this.b;
                lk8Var.getClass();
                return ((tlb) obj).b.m().longValue() <= lk8Var.i;
            default:
                lk8 lk8Var2 = this.b;
                Long l = (Long) obj;
                if (lk8Var2.g.containsKey(l)) {
                    tlb tlbVar = (tlb) lk8Var2.g.get(l);
                    synchronized (tlbVar) {
                        z = tlbVar.e;
                    }
                    if (!z) {
                        return true;
                    }
                }
                return false;
        }
    }
}
