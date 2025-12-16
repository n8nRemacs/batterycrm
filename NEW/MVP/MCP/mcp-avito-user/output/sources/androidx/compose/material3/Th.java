package androidx.compose.material3;

import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: TabRow.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class Th extends kotlin.jvm.internal.N implements Y41.q<InterfaceC21956wh, androidx.compose.runtime.A, Integer, kotlin.G0> {
    @Override // Y41.q
    public final kotlin.G0 invoke(InterfaceC21956wh interfaceC21956wh, androidx.compose.runtime.A a12, Integer num) {
        InterfaceC21956wh interfaceC21956wh2 = interfaceC21956wh;
        androidx.compose.runtime.A a13 = a12;
        int iIntValue = num.intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= (iIntValue & 8) == 0 ? a13.B(interfaceC21956wh2) : a13.u(interfaceC21956wh2) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18 && a13.c()) {
            a13.f();
            return kotlin.G0.f406611a;
        }
        int i12 = Qh.f35357a;
        v.a aVar = androidx.compose.ui.v.f42878y1;
        throw null;
    }
}
