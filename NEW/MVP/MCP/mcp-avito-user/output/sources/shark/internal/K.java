package shark.internal;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import shark.AbstractC48368z1;
import shark.C48240c2;
import shark.N2;
import shark.g3;
import shark.h3;
import shark.i3;

/* compiled from: GcRootProvider.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lshark/internal/K;", "", "a", "shark"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f438383a;

    /* renamed from: b, reason: collision with root package name */
    public final C48240c2 f438384b;

    /* compiled from: GcRootProvider.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/internal/K$a;", "", "shark"}, k = 1, mv = {1, 4, 1})
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final AbstractC48368z1 f438385a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f438386b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final N2 f438387c;

        public a(@Y61.k AbstractC48368z1 abstractC48368z1, boolean z12, @Y61.l N2 n22) {
            this.f438385a = abstractC48368z1;
            this.f438386b = z12;
            this.f438387c = n22;
        }
    }

    public K(@Y61.k List list, @Y61.k C48240c2 c48240c2) {
        this.f438384b = c48240c2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = h3.a(list, c48240c2).iterator();
        while (it.hasNext()) {
            g3 g3Var = (g3) it.next();
            i3 f438839a = g3Var.getF438839a();
            if (f438839a instanceof i3.d) {
                linkedHashMap.put(((i3.d) f438839a).f438293b, g3Var);
            }
        }
        this.f438383a = linkedHashMap;
    }
}
