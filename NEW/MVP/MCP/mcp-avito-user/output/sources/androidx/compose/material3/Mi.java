package androidx.compose.material3;

import androidx.compose.animation.core.C20283h;
import androidx.compose.animation.core.C20310q;
import androidx.compose.foundation.C20805p0;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.Metadata;

/* compiled from: TextFieldDefaults.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"", "focused", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Mi {
    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC22204y1 a(boolean z12, boolean z13, androidx.compose.foundation.interaction.k kVar, C21935vi c21935vi, float f12, float f13, androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.I3 i3M;
        androidx.compose.runtime.I3 i3M2;
        a12.I(-1633063017);
        InterfaceC22204y1 interfaceC22204y1A = androidx.compose.foundation.interaction.f.a(kVar, a12, (i12 >> 6) & 14);
        c21935vi.getClass();
        a12.I(-1877482635);
        long j12 = !z12 ? c21935vi.f37614n : z13 ? c21935vi.f37615o : ((Boolean) androidx.compose.foundation.interaction.f.a(kVar, a12, ((i12 & 8190) >> 6) & 14).getF42167b()).booleanValue() ? c21935vi.f37612l : c21935vi.f37613m;
        if (z12) {
            a12.I(715804770);
            i3M = androidx.compose.animation.l2.b(j12, C20310q.e(150, 0, null, 6), a12, 48, 12);
            a12.O();
        } else {
            a12.I(715804875);
            i3M = C22126m3.m(androidx.compose.ui.graphics.T.a(j12), a12);
            a12.O();
        }
        a12.O();
        if (!((Boolean) interfaceC22204y1A.getF42167b()).booleanValue()) {
            f12 = f13;
        }
        if (z12) {
            a12.I(-1927721478);
            i3M2 = C20283h.a(f12, C20310q.e(150, 0, null, 6), a12, 48, 12);
            a12.O();
        } else {
            a12.I(-1927721380);
            i3M2 = C22126m3.m(androidx.compose.ui.unit.h.a(f13), a12);
            a12.O();
        }
        InterfaceC22204y1 interfaceC22204y1M = C22126m3.m(new C20805p0(((androidx.compose.ui.unit.h) i3M2.getF42167b()).f42852b, new androidx.compose.ui.graphics.k1(((androidx.compose.ui.graphics.T) i3M.getF42167b()).f39331a, null), null), a12);
        a12.O();
        return interfaceC22204y1M;
    }
}
