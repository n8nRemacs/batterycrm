package shark.internal;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import shark.C48240c2;
import shark.K1;
import shark.M1;

/* compiled from: ShallowSizeCalculator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/internal/F0;", "", "shark"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class F0 {

    /* renamed from: a, reason: collision with root package name */
    public final C48240c2 f438348a;

    public F0(@Y61.k C48240c2 c48240c2) {
        this.f438348a = c48240c2;
    }

    public final int a(long j12) {
        int i12;
        int i13;
        C48240c2 c48240c2 = this.f438348a;
        M1 m1F = c48240c2.f(j12);
        if (m1F instanceof M1.c) {
            M1.c cVar = (M1.c) m1F;
            if (!kotlin.jvm.internal.L.f(cVar.f(), "java.lang.String")) {
                return cVar.e().f438146d.f438470c;
            }
            K1 k1J = cVar.j("java.lang.String", "value");
            lValueOf = k1J != null ? k1J.f438095c.d() : null;
            return cVar.e().f438146d.f438470c + (lValueOf != null ? a(lValueOf.longValue()) : 0);
        }
        if (m1F instanceof M1.d) {
            M1.d dVar = (M1.d) m1F;
            t0.f438607b.getClass();
            if (t0.f438606a.contains(dVar.e())) {
                long[] jArr = dVar.d().f438732d;
                int length = jArr.length * c48240c2.f438258g.f438248d;
                int length2 = jArr.length;
                int i14 = 0;
                while (true) {
                    if (i14 >= length2) {
                        break;
                    }
                    long j13 = jArr[i14];
                    if (j13 != 0) {
                        lValueOf = Long.valueOf(j13);
                        break;
                    }
                    i14++;
                }
                if (lValueOf == null) {
                    return length;
                }
                int iA2 = a(lValueOf.longValue());
                int length3 = jArr.length;
                int i15 = 0;
                while (i < length3) {
                    if (jArr[i] != 0) {
                        i15++;
                    }
                    i++;
                }
                return (iA2 * i15) + length;
            }
            i12 = (int) dVar.f438153d.f438478c;
            i13 = dVar.f438152c.f438256e;
        } else {
            if (!(m1F instanceof M1.e)) {
                if (m1F instanceof M1.b) {
                    return (int) ((M1.b) m1F).f438146d.f438471d;
                }
                throw new NoWhenBranchMatchedException();
            }
            M1.e eVar = (M1.e) m1F;
            i12 = (int) eVar.f438156d.f438481c;
            i13 = eVar.f438155c.f438257f;
        }
        return i12 - i13;
    }
}
