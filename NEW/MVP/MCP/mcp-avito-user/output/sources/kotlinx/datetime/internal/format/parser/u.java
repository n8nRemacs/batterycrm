package kotlinx.datetime.internal.format.parser;

import java.util.Collections;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: ParserOperation.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-datetime"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class u {
    @Y61.k
    public static final <Target> v<Target> a(@Y61.l Integer num, @Y61.l Integer num2, @Y61.l Integer num3, @Y61.k InterfaceC43375a<? super Target, Integer> interfaceC43375a, @Y61.k String str, boolean z12) {
        int iIntValue;
        int iIntValue2 = num.intValue() + (z12 ? 1 : 0);
        if (num2 != null) {
            iIntValue = num2.intValue();
            if (z12) {
                iIntValue++;
            }
        } else {
            iIntValue = Integer.MAX_VALUE;
        }
        int iIntValue3 = num3 != null ? num3.intValue() : 0;
        int iMin = Math.min(iIntValue, iIntValue3);
        if (iIntValue2 >= iMin) {
            return b(z12, interfaceC43375a, str, iIntValue2, iIntValue);
        }
        v<Target> vVarB = b(z12, interfaceC43375a, str, iIntValue2, iIntValue2);
        while (iIntValue2 < iMin) {
            C42784z0 c42784z0 = C42784z0.f406748b;
            iIntValue2++;
            vVarB = new v<>(c42784z0, C42745f0.U(b(z12, interfaceC43375a, str, iIntValue2, iIntValue2), r.a(C42745f0.U(new v(Collections.singletonList(new y(" ")), c42784z0), vVarB))));
        }
        return iIntValue3 > iIntValue ? r.a(C42745f0.U(new v(Collections.singletonList(new y(C43066x.Z(iIntValue3 - iIntValue, " "))), C42784z0.f406748b), vVarB)) : iIntValue3 == iIntValue ? vVarB : new v<>(C42784z0.f406748b, C42745f0.U(b(z12, interfaceC43375a, str, iIntValue3 + 1, iIntValue), vVarB));
    }

    public static final <Target> v<Target> b(boolean z12, InterfaceC43375a<? super Target, Integer> interfaceC43375a, String str, int i12, int i13) {
        if (i13 < (z12 ? 1 : 0) + 1) {
            throw new IllegalStateException("Check failed.");
        }
        kotlin.collections.builders.b bVarT = C42745f0.t();
        if (z12) {
            bVarT.add(new y("-"));
        }
        bVarT.add(new k(Collections.singletonList(new F(Integer.valueOf(i12 - (z12 ? 1 : 0)), Integer.valueOf(i13 - (z12 ? 1 : 0)), interfaceC43375a, str, z12))));
        return new v<>(C42745f0.p(bVarT), C42784z0.f406748b);
    }
}
