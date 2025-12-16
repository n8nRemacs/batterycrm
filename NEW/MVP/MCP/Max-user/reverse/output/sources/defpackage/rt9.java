package defpackage;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class rt9 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ vu9 Y;
    public final /* synthetic */ List Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rt9(vu9 vu9Var, List list, Continuation continuation) {
        super(2, continuation);
        this.Y = vu9Var;
        this.Z = list;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((rt9) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        rt9 rt9Var = new rt9(this.Y, this.Z, continuation);
        rt9Var.X = obj;
        return rt9Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        String[] strArr;
        Object ipdVar;
        int i = this.o;
        qqg qqgVar = qqg.a;
        if (i == 0) {
            g8j.b(obj);
            vu9 vu9Var = this.Y;
            gu5 gu5Var = (gu5) vu9Var.z0;
            gu5Var.getClass();
            if (gu5Var.j(PmsKey.f136serversidecomplainsenabled, false)) {
                ci5 ci5Var = vu9Var.J1;
                qr9 qr9Var = qr9.c;
                long j = vu9Var.b.a;
                long[] jArrE0 = ue3.e0(this.Z);
                qr9Var.getClass();
                xc0.l(":complaint?ids=" + ys.z(62, jArrE0) + "&parent_id=" + j, ci5Var);
                return qqgVar;
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet(qt9.a.getSize());
            l5c l5cVar = (l5c) ((age) vu9Var.F0.getValue());
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
            if (linkedHashSet.isEmpty()) {
                wl8 wl8VarC = ((q2b) vu9Var.X).c();
                pt9 pt9Var = new pt9(vu9Var, null);
                this.o = 1;
                Object objI = svi.i(wl8VarC, pt9Var, this);
                g84 g84Var = g84.a;
                if (objI == g84Var) {
                    return g84Var;
                }
            } else {
                ci5 ci5Var2 = vu9Var.I1;
                pq3 pq3Var = hh9.a;
                n5g n5gVar = new n5g(l7b.E);
                n5g n5gVar2 = new n5g(l7b.D);
                o98 o98VarD = ve3.d();
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    int iOrdinal = ((sj3) it.next()).ordinal();
                    if (iOrdinal == 0) {
                        o98VarD.add(new pq3(j7b.k, new n5g(mvd.y1), 3, 56));
                    } else if (iOrdinal == 1) {
                        o98VarD.add(new pq3(j7b.j, new n5g(mvd.x1), 3, 56));
                    } else if (iOrdinal == 2) {
                        o98VarD.add(new pq3(j7b.g, new n5g(mvd.u1), 3, 56));
                    } else if (iOrdinal == 3) {
                        o98VarD.add(new pq3(j7b.h, new n5g(mvd.v1), 3, 56));
                    } else if (iOrdinal == 4) {
                        o98VarD.add(new pq3(j7b.l, new n5g(mvd.z1), 3, 56));
                    } else {
                        if (iOrdinal != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        o98VarD.add(new pq3(j7b.i, new n5g(mvd.w1), 3, 56));
                    }
                }
                o98VarD.add(hh9.a);
                xfh.r(ci5Var2, new lxe(this.Z, n5gVar, n5gVar2, ve3.a(o98VarD), true));
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        return qqgVar;
    }
}
