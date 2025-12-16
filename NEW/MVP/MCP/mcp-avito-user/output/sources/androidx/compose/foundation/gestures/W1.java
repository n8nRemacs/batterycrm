package androidx.compose.foundation.gestures;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.Metadata;

/* compiled from: ScrollableState.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class W1 {
    @Y61.k
    public static final U1 a(@Y61.k Y41.l<? super Float, Float> lVar) {
        return new U(lVar);
    }

    @InterfaceC22132o
    @Y61.k
    public static final U1 b(@Y61.k Y41.l lVar, @Y61.l androidx.compose.runtime.A a12) {
        InterfaceC22204y1 interfaceC22204y1M = C22126m3.m(lVar, a12);
        Object objT = a12.t();
        androidx.compose.runtime.A.f37866a.getClass();
        if (objT == A.a.f37868b) {
            U u12 = new U(new V1(interfaceC22204y1M));
            a12.H(u12);
            objT = u12;
        }
        return (U1) objT;
    }
}
