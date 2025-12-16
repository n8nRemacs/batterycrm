package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class ck3 extends dtf implements sm6 {
    public int X;
    public final /* synthetic */ gk3 Y;
    public tcf o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ck3(gk3 gk3Var, Continuation continuation) {
        super(2, continuation);
        this.Y = gk3Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ck3) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ck3(this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        tcf tcfVar;
        String[] strArr;
        ArrayList arrayList;
        pq3 pq3Var;
        Object ipdVar;
        tcf tcfVar2;
        gk3 gk3Var = this.Y;
        long[] jArr = gk3Var.b;
        int i = this.X;
        if (i == 0) {
            g8j.b(obj);
            tcfVar = gk3Var.w0;
            if (!((Boolean) gk3Var.A0.getValue()).booleanValue()) {
                zr6 zr6Var = gk3Var.d;
                ys.u(jArr);
                zr6Var.getClass();
                LinkedHashSet<sj3> linkedHashSet = new LinkedHashSet(yr6.a.getSize());
                l5c l5cVar = (l5c) ((age) zr6Var.a.getValue());
                l5cVar.getClass();
                List listE = l5cVar.e(PmsKey.f6availablecomplaints.name(), null);
                if (listE == null || (strArr = (String[]) listE.toArray(new String[0])) == null) {
                    strArr = new String[0];
                }
                for (String str : strArr) {
                    try {
                        ipdVar = sj3.a(str);
                    } catch (Throwable th) {
                        ipdVar = new ipd(th);
                    }
                    if (ipdVar instanceof ipd) {
                        ipdVar = null;
                    }
                    sj3 sj3Var = (sj3) ipdVar;
                    if (sj3Var != null) {
                        linkedHashSet.add(sj3Var);
                    }
                }
                arrayList = new ArrayList(we3.q(linkedHashSet, 10));
                for (sj3 sj3Var2 : linkedHashSet) {
                    int iOrdinal = sj3Var2.ordinal();
                    int iOrdinal2 = sj3Var2.ordinal();
                    if (iOrdinal2 == 0) {
                        pq3Var = new pq3(iOrdinal, new n5g(mvd.y1), 2, 56);
                    } else if (iOrdinal2 == 1) {
                        pq3Var = new pq3(iOrdinal, new n5g(mvd.x1), 2, 56);
                    } else if (iOrdinal2 == 2) {
                        pq3Var = new pq3(iOrdinal, new n5g(mvd.u1), 2, 56);
                    } else if (iOrdinal2 == 3) {
                        pq3Var = new pq3(iOrdinal, new n5g(mvd.v1), 2, 56);
                    } else if (iOrdinal2 == 4) {
                        pq3Var = new pq3(iOrdinal, new n5g(mvd.z1), 2, 56);
                    } else {
                        if (iOrdinal2 != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        pq3Var = new pq3(iOrdinal, new n5g(mvd.w1), 2, 56);
                    }
                    arrayList.add(pq3Var);
                }
                tcfVar.setValue(arrayList);
                return qqg.a;
            }
            Long l = gk3Var.c;
            this.o = tcfVar;
            this.X = 1;
            Object objI = svi.i(((q2b) ((lzf) gk3Var.Y.getValue())).b(), new bk3(gk3Var, l, jArr, null), this);
            g84 g84Var = g84.a;
            if (objI == g84Var) {
                return g84Var;
            }
            tcfVar2 = tcfVar;
            obj = objI;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tcfVar2 = this.o;
            g8j.b(obj);
        }
        Iterable<jj3> iterable = (Iterable) obj;
        arrayList = new ArrayList(we3.q(iterable, 10));
        for (jj3 jj3Var : iterable) {
            arrayList.add(new pq3(jj3Var.a, new r5g(jj3Var.b), 2, 56));
        }
        if (arrayList.isEmpty()) {
            wqi.c(gk3Var.o, "We don't have server side reasons. Complain with default", new Object[0]);
            gk3Var.v(7);
        }
        tcfVar = tcfVar2;
        tcfVar.setValue(arrayList);
        return qqg.a;
    }
}
