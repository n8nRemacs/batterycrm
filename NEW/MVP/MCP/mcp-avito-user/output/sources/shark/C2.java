package shark;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.sequences.C43033p;
import shark.M1;

/* compiled from: KeyedWeakReferenceFinder.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lshark/C2;", "Lshark/L2;", "<init>", "()V", "shark"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class C2 implements L2 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C2 f438011a = new C2();

    /* compiled from: KeyedWeakReferenceFinder.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Lshark/internal/r0;", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<List<? extends shark.internal.r0>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ L1 f438012l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(L1 l12) {
            super(0);
            this.f438012l = l12;
        }

        @Override // Y41.a
        public final List<? extends shark.internal.r0> invoke() {
            L1 l12 = this.f438012l;
            M1.b bVarC = l12.c("leakcanary.KeyedWeakReference");
            long j12 = bVarC != null ? bVarC.f438147e : 0L;
            M1.b bVarC2 = l12.c("com.squareup.leakcanary.KeyedWeakReference");
            long j13 = bVarC2 != null ? bVarC2.f438147e : 0L;
            C2.f438011a.getClass();
            List<? extends shark.internal.r0> listD = C43033p.D(new kotlin.sequences.o0(C43033p.i(l12.d(), new A2(j12, j13)), new B2((Long) l12.getF438253b().a("heapDumpUptimeMillis", new D2(l12)))));
            l12.getF438253b().f437944a.put(ObjectInspectors.f438172b.name(), listD);
            return listD;
        }
    }

    @Y61.k
    public static List b(@Y61.k L1 l12) {
        return (List) l12.getF438253b().a(ObjectInspectors.f438172b.name(), new a(l12));
    }

    @Override // shark.L2
    @Y61.k
    public final Set a(@Y61.k C48240c2 c48240c2) {
        List listB = b(c48240c2);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listB) {
            shark.internal.r0 r0Var = (shark.internal.r0) obj;
            if (r0Var.f438589a && r0Var.f438590b) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Long.valueOf(((shark.internal.r0) it.next()).f438591c.f438688a));
        }
        return C42745f0.P0(arrayList2);
    }
}
