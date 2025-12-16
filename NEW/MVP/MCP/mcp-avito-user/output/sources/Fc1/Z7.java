package Fc1;

import feedback.shared.sdk.api.network.entities.Transform;
import feedback.shared.sdk.api.network.entities.TransformCondition;
import feedback.shared.sdk.api.network.entities.TransformScenario;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

@kotlin.jvm.internal.s0
/* loaded from: classes9.dex */
public final class Z7<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t12, T t13) {
        int i12;
        List<TransformScenario> scenarios = ((Transform) t12).getScenarios();
        int i13 = 0;
        if ((scenarios instanceof Collection) && scenarios.isEmpty()) {
            i12 = 0;
        } else {
            Iterator<T> it = scenarios.iterator();
            loop2: while (it.hasNext()) {
                List<TransformCondition> conditions = ((TransformScenario) it.next()).getConditions();
                if (!(conditions instanceof Collection) || !conditions.isEmpty()) {
                    Iterator<T> it2 = conditions.iterator();
                    while (it2.hasNext()) {
                        if (((TransformCondition) it2.next()).getFrom().getField() == null) {
                            i12 = 1;
                            break loop2;
                        }
                    }
                }
            }
            i12 = 0;
        }
        Integer numValueOf = Integer.valueOf(i12);
        List<TransformScenario> scenarios2 = ((Transform) t13).getScenarios();
        if (!(scenarios2 instanceof Collection) || !scenarios2.isEmpty()) {
            Iterator<T> it3 = scenarios2.iterator();
            loop0: while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                List<TransformCondition> conditions2 = ((TransformScenario) it3.next()).getConditions();
                if (!(conditions2 instanceof Collection) || !conditions2.isEmpty()) {
                    Iterator<T> it4 = conditions2.iterator();
                    while (it4.hasNext()) {
                        if (((TransformCondition) it4.next()).getFrom().getField() == null) {
                            i13 = 1;
                            break loop0;
                        }
                    }
                }
            }
        }
        return kotlin.comparisons.a.b(numValueOf, Integer.valueOf(i13));
    }
}
