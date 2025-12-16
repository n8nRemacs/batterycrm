package kotlin;

import kotlin.jvm.internal.C42822w;

@Metadata(d1 = {"kotlin/E", "kotlin/F"}, d2 = {}, k = 4, mv = {1, 9, 0}, xi = 49)
/* renamed from: kotlin.D, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42727D extends F {
    @Y61.k
    public static InterfaceC42726C a(@Y61.k Y41.a aVar) {
        return new C42800j0(aVar, 0);
    }

    @Y61.k
    public static InterfaceC42726C b(@Y61.k LazyThreadSafetyMode lazyThreadSafetyMode, @Y61.k Y41.a aVar) {
        int iOrdinal = lazyThreadSafetyMode.ordinal();
        int i12 = 2;
        if (iOrdinal == 0) {
            C42822w c42822w = null;
            return new C42800j0(aVar, c42822w, i12, c42822w);
        }
        if (iOrdinal == 1) {
            C42731b0 c42731b0 = new C42731b0();
            c42731b0.f406634b = aVar;
            c42731b0._value = A0.f406601a;
            return c42731b0;
        }
        if (iOrdinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        H0 h02 = new H0();
        h02.f406612b = aVar;
        h02.f406613c = A0.f406601a;
        return h02;
    }

    @Y61.k
    public static InterfaceC42726C c(@Y61.k Y41.a aVar) {
        C42822w c42822w = null;
        return new C42800j0(aVar, c42822w, 2, c42822w);
    }
}
