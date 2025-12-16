package defpackage;

import java.util.Iterator;
import java.util.List;
import one.me.sdk.statistics.perf.utils.InvalidEventSchemaException;

/* loaded from: classes2.dex */
public final class uh3 implements ui5 {
    @Override // defpackage.ui5
    public final lqb a(yqb yqbVar, c9a c9aVar, List list, lqb lqbVar) {
        tqb tqbVar = tqb.INVALID_SCHEMA;
        lg8 lg8Var = lg8.X;
        if (vmf.F(yqbVar.g())) {
            String name = yqbVar.getClass().getName();
            l6b l6bVar = wqi.a;
            if (l6bVar != null && l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, name, ho7.i("Event schema violation for metric=", yqbVar.g(), ": EMPTY_METRIC_NAME"), null);
            }
            yqbVar.a.a(new InvalidEventSchemaException(yqbVar.g(), "EMPTY_METRIC_NAME"));
            return tqbVar;
        }
        if (list.isEmpty() && lqbVar == null) {
            String name2 = yqbVar.getClass().getName();
            l6b l6bVar2 = wqi.a;
            if (l6bVar2 != null && l6bVar2.b(lg8Var)) {
                l6bVar2.c(lg8Var, name2, ho7.i("Event schema violation for metric=", yqbVar.g(), ": NO_SPANS_AND_ERROR"), null);
            }
            yqbVar.a.a(new InvalidEventSchemaException(yqbVar.g(), "NO_SPANS_AND_ERROR"));
            return tqbVar;
        }
        if (list.size() == 1) {
            String name3 = yqbVar.getClass().getName();
            l6b l6bVar3 = wqi.a;
            if (l6bVar3 != null && l6bVar3.b(lg8Var)) {
                l6bVar3.c(lg8Var, name3, ho7.i("Event schema violation for metric=", yqbVar.g(), ": SINGLE_ROOT_SPAN"), null);
            }
            yqbVar.a.a(new InvalidEventSchemaException(yqbVar.g(), "SINGLE_ROOT_SPAN"));
            return tqbVar;
        }
        if (!list.isEmpty()) {
            imb imbVar = (imb) ue3.I(list);
            if (!fni.a(imbVar != null ? (String) imbVar.a : null, yqbVar.g())) {
                String name4 = yqbVar.getClass().getName();
                l6b l6bVar4 = wqi.a;
                if (l6bVar4 != null && l6bVar4.b(lg8Var)) {
                    l6bVar4.c(lg8Var, name4, ho7.i("Event schema violation for metric=", yqbVar.g(), ": INVALID_ROOT_SPAN"), null);
                }
                yqbVar.a.a(new InvalidEventSchemaException(yqbVar.g(), "INVALID_ROOT_SPAN"));
                return tqbVar;
            }
            long jLongValue = ((Number) imbVar.b).longValue();
            Iterator it = lee.f(new at(2, list), 1).iterator();
            long jLongValue2 = 0;
            while (it.hasNext()) {
                jLongValue2 += ((Number) ((imb) it.next()).b).longValue();
            }
            if (jLongValue != jLongValue2) {
                String name5 = yqbVar.getClass().getName();
                l6b l6bVar5 = wqi.a;
                if (l6bVar5 != null && l6bVar5.b(lg8Var)) {
                    l6bVar5.c(lg8Var, name5, ho7.i("Event schema violation for metric=", yqbVar.g(), ": ROOT_SPAN_NOT_EQUALS"), null);
                }
                yqbVar.a.a(new InvalidEventSchemaException(yqbVar.g(), "ROOT_SPAN_NOT_EQUALS"));
                return tqb.ROOT_SPAN_INVALID_DURATION;
            }
            if (((Number) imbVar.b).longValue() > s65.g(yqbVar.k(c9aVar)) * (list.size() - 1)) {
                String name6 = yqbVar.getClass().getName();
                l6b l6bVar6 = wqi.a;
                if (l6bVar6 != null && l6bVar6.b(lg8Var)) {
                    l6bVar6.c(lg8Var, name6, ho7.i("Event schema violation for metric=", yqbVar.g(), ": SHOULD_BE_TIMEOUT"), null);
                }
                yqbVar.a.a(new InvalidEventSchemaException(yqbVar.g(), "SHOULD_BE_TIMEOUT"));
                return tqb.SHOULD_BE_TIMEOUT;
            }
            Iterator it2 = lee.f(new at(2, list), 1).iterator();
            while (it2.hasNext()) {
                if (((Number) ((imb) it2.next()).b).longValue() <= 0) {
                    String name7 = yqbVar.getClass().getName();
                    l6b l6bVar7 = wqi.a;
                    if (l6bVar7 != null && l6bVar7.b(lg8Var)) {
                        l6bVar7.c(lg8Var, name7, ho7.i("Event schema violation for metric=", yqbVar.g(), ": INVALID_DURATION"), null);
                    }
                    yqbVar.a.a(new InvalidEventSchemaException(yqbVar.g(), "INVALID_DURATION"));
                    return tqb.INVALID_DURATIONS;
                }
            }
        }
        return lqbVar;
    }
}
