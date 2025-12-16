package Fc1;

import feedback.shared.sdk.api.network.entities.Transform;
import feedback.shared.sdk.api.network.entities.TransformAction;
import feedback.shared.sdk.api.network.entities.TransformCondition;
import feedback.shared.sdk.api.network.entities.TransformScenario;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C42745f0;

@kotlin.jvm.internal.s0
/* renamed from: Fc1.v, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13748v {
    @Y61.k
    public static final ArrayList a(@Y61.k Transform transform, @Y61.k List list) {
        List<TransformScenario> scenarios = transform.getScenarios();
        ArrayList arrayList = new ArrayList();
        for (Object obj : scenarios) {
            TransformScenario transformScenario = (TransformScenario) obj;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(((C13714r1) it.next()).f5776a);
            }
            List<TransformCondition> conditions = transformScenario.getConditions();
            ArrayList arrayList3 = new ArrayList(C42745f0.q(conditions, 10));
            Iterator<T> it2 = conditions.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((TransformCondition) it2.next()).getFrom().getField());
            }
            if (arrayList2.containsAll(arrayList3)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
    
        r0.add(new kotlin.Q(r3, r1.getTransformData()));
     */
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList b(@Y61.k feedback.shared.sdk.api.network.entities.TransformScenario r6, @Y61.k java.util.List r7) {
        /*
            java.util.List r6 = r6.getConditions()
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.C42745f0.q(r6, r1)
            r0.<init>(r1)
            java.util.Iterator r6 = r6.iterator()
        L13:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L55
            java.lang.Object r1 = r6.next()
            feedback.shared.sdk.api.network.entities.TransformCondition r1 = (feedback.shared.sdk.api.network.entities.TransformCondition) r1
            java.util.Iterator r2 = r7.iterator()
        L23:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L4d
            java.lang.Object r3 = r2.next()
            r4 = r3
            Fc1.r1 r4 = (Fc1.C13714r1) r4
            java.lang.String r4 = r4.f5776a
            feedback.shared.sdk.api.network.entities.TransformFrom r5 = r1.getFrom()
            java.lang.String r5 = r5.getField()
            boolean r4 = kotlin.jvm.internal.L.f(r4, r5)
            if (r4 == 0) goto L23
            feedback.shared.sdk.api.network.entities.TransformData r1 = r1.getTransformData()
            kotlin.Q r2 = new kotlin.Q
            r2.<init>(r3, r1)
            r0.add(r2)
            goto L13
        L4d:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException
            java.lang.String r7 = "Collection contains no element matching the predicate."
            r6.<init>(r7)
            throw r6
        L55:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Fc1.C13748v.b(feedback.shared.sdk.api.network.entities.TransformScenario, java.util.List):java.util.ArrayList");
    }

    @Y61.k
    public static final ArrayList c(@Y61.k ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((AbstractC13717r4) next).f5783a.d() != xyz.n.a.i4.f442741m) {
                arrayList3.add(next);
            }
        }
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((AbstractC13717r4) it2.next()).f5784b);
        }
        return arrayList2;
    }

    public static ArrayList d(Transform[] transformArr, AbstractC13717r4 abstractC13717r4) {
        TransformAction transformAction = TransformAction.SHOW;
        ArrayList arrayList = new ArrayList();
        for (Transform transform : transformArr) {
            if (kotlin.jvm.internal.L.f(transform.getTo().getValue(), abstractC13717r4.f5783a.getId())) {
                arrayList.add(transform);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((Transform) next).getTo().getAction() == transformAction) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }
}
