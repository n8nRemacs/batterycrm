package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class xqb extends dtf implements sm6 {
    public final /* synthetic */ yqb X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xqb(yqb yqbVar, Continuation continuation) {
        super(2, continuation);
        this.X = yqbVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        xqb xqbVar = (xqb) l((sqb) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        xqbVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        xqb xqbVar = new xqb(this.X, continuation);
        xqbVar.o = obj;
        return xqbVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        qqb qqbVar;
        g8j.b(obj);
        sqb sqbVar = (sqb) this.o;
        yqb yqbVar = this.X;
        String strA = sqbVar.a();
        String str = yqbVar.b;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                String strG = yqbVar.g();
                String strValueOf = String.valueOf(sqbVar);
                StringBuilder sbL = wy1.l("Metric(", strG, "-", strA, "): ");
                sbL.append((Object) strValueOf);
                l6bVar.c(lg8Var, str, sbL.toString(), null);
            }
        }
        c9a c9aVar = this.X.e;
        ceg cegVar = new ceg(sqbVar.a());
        Object objF = c9aVar.f(cegVar);
        if (objF == null) {
            long[] jArr = fzd.a;
            objF = new c9a();
            c9aVar.m(cegVar, objF);
        }
        ((c9a) objF).j(sqbVar.b());
        if (sqbVar instanceof rqb) {
            yqb yqbVar2 = this.X;
            rqb rqbVar = (rqb) sqbVar;
            yqbVar2.d(rqbVar.a);
            String str2 = rqbVar.a;
            yqbVar2.h(str2, new qqb(str2, "start_metric", -1, rqbVar.b, false, rqbVar.c));
            yqbVar2.m(rqbVar.a);
        } else if (sqbVar instanceof qqb) {
            yqb yqbVar3 = this.X;
            qqb qqbVar2 = (qqb) sqbVar;
            yqbVar3.d(qqbVar2.a);
            String str3 = qqbVar2.a;
            yqbVar3.h(str3, qqbVar2);
            if (qqbVar2.e) {
                yqbVar3.f(str3, null);
            } else {
                yqbVar3.m(str3);
            }
        } else if (sqbVar instanceof oqb) {
            yqb yqbVar4 = this.X;
            oqb oqbVar = (oqb) sqbVar;
            yqbVar4.d(oqbVar.a);
            yqbVar4.f(oqbVar.a, oqbVar.b);
        } else if (sqbVar instanceof nqb) {
            yqb yqbVar5 = this.X;
            nqb nqbVar = (nqb) sqbVar;
            yqbVar5.d(nqbVar.a);
            c9a c9aVar2 = yqbVar5.d;
            String str4 = nqbVar.a;
            w8a w8aVar = (w8a) c9aVar2.k(new ceg(str4));
            if (w8aVar != null) {
                w8aVar.d();
            }
            yqbVar5.e.k(new ceg(str4));
        } else if (sqbVar instanceof pqb) {
            yqb yqbVar6 = this.X;
            pqb pqbVar = (pqb) sqbVar;
            lg8 lg8Var2 = lg8.X;
            yqbVar6.d(pqbVar.a);
            if (pqbVar.c.h()) {
                String str5 = pqbVar.a;
                String str6 = yqbVar6.b;
                l6b l6bVar2 = wqi.a;
                if (l6bVar2 != null && l6bVar2.b(lg8Var2)) {
                    l6bVar2.c(lg8Var2, str6, wy1.j("Metric(", yqbVar6.g(), "-", str5, "): Empty spans in precomputed metric"), null);
                }
            } else {
                w8a w8aVar2 = (w8a) yqbVar6.d.f(new ceg(pqbVar.a));
                if (w8aVar2 != null) {
                    qqbVar = (qqb) (w8aVar2.h() ? null : w8aVar2.a[w8aVar2.b - 1]);
                } else {
                    qqbVar = null;
                }
                if (qqbVar == null) {
                    String str7 = pqbVar.a;
                    String str8 = yqbVar6.b;
                    l6b l6bVar3 = wqi.a;
                    if (l6bVar3 != null && l6bVar3.b(lg8Var2)) {
                        l6bVar3.c(lg8Var2, str8, wy1.j("Metric(", yqbVar6.g(), "-", str7, "): Unreachable state, even no start_metric span"), null);
                    }
                } else {
                    long j = qqbVar.d;
                    w8a w8aVar3 = pqbVar.c;
                    Object[] objArr = w8aVar3.a;
                    int i = w8aVar3.b;
                    int i2 = 0;
                    while (i2 < i) {
                        imb imbVar = (imb) objArr[i2];
                        String str9 = (String) imbVar.a;
                        long jLongValue = ((Number) imbVar.b).longValue();
                        String str10 = pqbVar.a;
                        int i3 = 1 + i2;
                        long j2 = j + jLongValue;
                        yqbVar6.h(str10, new qqb(str10, str9, i3, j2, false, fzd.b));
                        i2 = i3;
                        j = j2;
                    }
                    yqbVar6.m(pqbVar.a);
                }
            }
        } else if (!(sqbVar instanceof mqb)) {
            throw new NoWhenBranchMatchedException();
        }
        return qqg.a;
    }
}
