package shark.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.sequences.C43025h;
import shark.C48240c2;
import shark.K1;
import shark.M1;
import shark.X1;

/* compiled from: AndroidNativeSizeMapper.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lshark/internal/a;", "", "a", "shark"}, k = 1, mv = {1, 4, 1})
/* renamed from: shark.internal.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48265a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C12633a f438485b = new C12633a(null);

    /* renamed from: a, reason: collision with root package name */
    public final C48240c2 f438486a;

    /* compiled from: AndroidNativeSizeMapper.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lshark/internal/a$a;", "", "<init>", "()V", "shark"}, k = 1, mv = {1, 4, 1})
    /* renamed from: shark.internal.a$a, reason: collision with other inner class name */
    public static final class C12633a {
        public C12633a() {
        }

        public /* synthetic */ C12633a(C42822w c42822w) {
            this();
        }
    }

    /* compiled from: AndroidNativeSizeMapper.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "", "", "invoke"}, k = 3, mv = {1, 4, 1})
    /* renamed from: shark.internal.a$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<Map<Long, ? extends Integer>> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final Map<Long, ? extends Integer> invoke() {
            K1 k1J;
            Long lC2;
            C12633a c12633a = C48265a.f438485b;
            C48265a c48265a = C48265a.this;
            c48265a.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            M1.b bVarC = c48265a.f438486a.c("sun.misc.Cleaner");
            if (bVarC != null) {
                C43025h.a aVar = new C43025h.a(bVarC.e());
                while (aVar.hasNext()) {
                    M1.c cVar = (M1.c) aVar.next();
                    K1 k1J2 = cVar.j("sun.misc.Cleaner", "thunk");
                    Long lD2 = k1J2 != null ? k1J2.f438095c.d() : null;
                    K1 k1J3 = cVar.j("java.lang.ref.Reference", "referent");
                    Long lD3 = k1J3 != null ? k1J3.f438095c.d() : null;
                    if (lD2 != null && lD3 != null) {
                        M1 m1E = k1J2.f438095c.e();
                        if (m1E instanceof M1.c) {
                            M1.c cVar2 = (M1.c) m1E;
                            if (cVar2.h("libcore.util.NativeAllocationRegistry$CleanerThunk") && (k1J = cVar2.j("libcore.util.NativeAllocationRegistry$CleanerThunk", "this$0")) != null) {
                                X1 x12 = k1J.f438095c;
                                if (x12.g()) {
                                    M1 m1E2 = x12.e();
                                    if (m1E2 instanceof M1.c) {
                                        M1.c cVar3 = (M1.c) m1E2;
                                        if (cVar3.h("libcore.util.NativeAllocationRegistry")) {
                                            Integer num = (Integer) linkedHashMap.get(lD3);
                                            int iLongValue = 0;
                                            int iIntValue = num != null ? num.intValue() : 0;
                                            K1 k1J4 = cVar3.j("libcore.util.NativeAllocationRegistry", "size");
                                            if (k1J4 != null && (lC2 = k1J4.f438095c.c()) != null) {
                                                iLongValue = (int) lC2.longValue();
                                            }
                                            linkedHashMap.put(lD3, Integer.valueOf(iIntValue + iLongValue));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return linkedHashMap;
        }
    }

    public C48265a(@Y61.k C48240c2 c48240c2) {
        this.f438486a = c48240c2;
    }

    @Y61.k
    public final Map<Long, Integer> a() {
        C48240c2 c48240c2 = this.f438486a;
        return (Map) c48240c2.f438253b.a("AndroidNativeSizeMapper", new b());
    }
}
