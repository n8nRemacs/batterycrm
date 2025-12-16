package shark;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.sequences.C43033p;
import shark.M1;

/* compiled from: AppSingletonInspector.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/p1;", "Lshark/R2;", "shark"}, k = 1, mv = {1, 4, 1})
/* renamed from: shark.p1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48329p1 implements R2 {
    @Override // shark.R2
    public final void a(@Y61.k U2 u22) {
        M1 m12 = u22.f438218d;
        if (m12 instanceof M1.c) {
            Iterator it = C43033p.u(N1.f438163l, ((M1.c) m12).e()).iterator();
            if (it.hasNext()) {
                C42756l.h(((M1.b) it.next()).g(), null);
                throw null;
            }
        }
    }
}
