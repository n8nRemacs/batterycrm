package shark;

import kotlin.Metadata;
import shark.M1;
import shark.q3;

/* compiled from: KeyedWeakReferenceFinder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lshark/M1$c;", "it", "Lshark/internal/r0;", "invoke", "(Lshark/M1$c;)Lshark/internal/r0;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes9.dex */
final class B2 extends kotlin.jvm.internal.N implements Y41.l<M1.c, shark.internal.r0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Long f438003l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B2(Long l12) {
        super(1);
        this.f438003l = l12;
    }

    @Override // Y41.l
    public final shark.internal.r0 invoke(M1.c cVar) {
        Long lValueOf;
        Long lValueOf2;
        String strI;
        M1.c cVar2 = cVar;
        shark.internal.r0.f438588h.getClass();
        String strF = cVar2.f();
        Long l12 = this.f438003l;
        if (l12 != null) {
            long jLongValue = l12.longValue();
            K1 k1J = cVar2.j(strF, "watchUptimeMillis");
            if (k1J == null) {
                kotlin.jvm.internal.L.k();
                throw null;
            }
            Long lC2 = k1J.f438095c.c();
            if (lC2 == null) {
                kotlin.jvm.internal.L.k();
                throw null;
            }
            lValueOf = Long.valueOf(jLongValue - lC2.longValue());
        } else {
            lValueOf = null;
        }
        if (l12 != null) {
            K1 k1J2 = cVar2.j(strF, "retainedUptimeMillis");
            if (k1J2 == null) {
                kotlin.jvm.internal.L.k();
                throw null;
            }
            Long lC3 = k1J2.f438095c.c();
            if (lC3 == null) {
                kotlin.jvm.internal.L.k();
                throw null;
            }
            long jLongValue2 = lC3.longValue();
            lValueOf2 = Long.valueOf(jLongValue2 != -1 ? l12.longValue() - jLongValue2 : -1L);
        } else {
            lValueOf2 = null;
        }
        K1 k1J3 = cVar2.j(strF, "key");
        if (k1J3 == null) {
            kotlin.jvm.internal.L.k();
            throw null;
        }
        String strI2 = k1J3.f438095c.i();
        if (strI2 == null) {
            kotlin.jvm.internal.L.k();
            throw null;
        }
        K1 k1J4 = cVar2.j(strF, "description");
        if (k1J4 == null) {
            k1J4 = cVar2.j(strF, "name");
        }
        if (k1J4 == null || (strI = k1J4.f438095c.i()) == null) {
            strI = "Unknown (legacy)";
        }
        String str = strI;
        K1 k1J5 = cVar2.j("java.lang.ref.Reference", "referent");
        if (k1J5 != null) {
            return new shark.internal.r0((q3.i) k1J5.f438095c.f438228b, strI2, str, lValueOf, lValueOf2);
        }
        kotlin.jvm.internal.L.k();
        throw null;
    }
}
