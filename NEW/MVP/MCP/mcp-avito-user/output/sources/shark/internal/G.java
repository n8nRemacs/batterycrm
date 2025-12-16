package shark.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import shark.internal.hppc.d;

/* compiled from: DominatorTree.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/internal/G;", "Lshark/internal/hppc/d$a;", "shark"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class G implements d.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C f438349a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LinkedHashMap f438350b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.l f438351c;

    public G(C c12, LinkedHashMap linkedHashMap, Y41.l lVar) {
        this.f438349a = c12;
        this.f438350b = linkedHashMap;
        this.f438351c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(long j12, long j13) {
        int iIntValue;
        C c12;
        Long lValueOf = Long.valueOf(j12);
        LinkedHashMap linkedHashMap = this.f438350b;
        kotlin.Q q12 = (kotlin.Q) linkedHashMap.get(lValueOf);
        Y41.l lVar = this.f438351c;
        if (q12 != null) {
            int iIntValue2 = ((Number) q12.f406619b).intValue();
            int iIntValue3 = ((Number) q12.f406620c).intValue();
            iIntValue = ((Number) lVar.invoke(Long.valueOf(j12))).intValue();
            linkedHashMap.put(Long.valueOf(j12), new kotlin.Q(Integer.valueOf(iIntValue2 + iIntValue), Integer.valueOf(iIntValue3 + 1)));
        } else {
            iIntValue = -1;
        }
        if (j13 != 0) {
            ArrayList arrayListE0 = C42745f0.e0(Long.valueOf(j12));
            int iIntValue4 = iIntValue;
            long jC2 = j13;
            while (true) {
                c12 = this.f438349a;
                if (jC2 == 0) {
                    break;
                }
                if (linkedHashMap.containsKey(Long.valueOf(jC2))) {
                    Iterator it = arrayListE0.iterator();
                    while (it.hasNext()) {
                        c12.f438334a.f(((Number) it.next()).longValue(), jC2);
                    }
                    if (iIntValue4 == -1) {
                        iIntValue4 = ((Number) lVar.invoke(Long.valueOf(j12))).intValue();
                    }
                    kotlin.Q q13 = (kotlin.Q) P0.d(linkedHashMap, Long.valueOf(jC2));
                    linkedHashMap.put(Long.valueOf(jC2), new kotlin.Q(Integer.valueOf(((Number) q13.f406619b).intValue() + iIntValue4), Integer.valueOf(((Number) q13.f406620c).intValue() + 1)));
                    arrayListE0.clear();
                } else {
                    arrayListE0.add(Long.valueOf(jC2));
                }
                jC2 = c12.f438334a.c(jC2);
            }
            Iterator it2 = arrayListE0.iterator();
            while (it2.hasNext()) {
                c12.f438334a.f(((Number) it2.next()).longValue(), 0L);
            }
        }
    }
}
