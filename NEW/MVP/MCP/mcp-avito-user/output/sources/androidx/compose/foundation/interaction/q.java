package androidx.compose.foundation.interaction;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PressInteraction.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class q {
    @InterfaceC22132o
    @Y61.k
    public static final InterfaceC22204y1 a(@Y61.k m mVar, @Y61.l A a12, int i12) {
        Object objT = a12.t();
        A.f37866a.getClass();
        A.a.C1651a c1651a = A.a.f37868b;
        if (objT == c1651a) {
            objT = C22126m3.g(Boolean.FALSE);
            a12.H(objT);
        }
        InterfaceC22204y1 interfaceC22204y1 = (InterfaceC22204y1) objT;
        boolean z12 = (((i12 & 14) ^ 6) > 4 && a12.B(mVar)) || (i12 & 6) == 4;
        Object objT2 = a12.t();
        if (z12 || objT2 == c1651a) {
            objT2 = new p(mVar, interfaceC22204y1, null);
            a12.H(objT2);
        }
        C22187u0.d((Y41.p) objT2, a12, mVar);
        return interfaceC22204y1;
    }
}
