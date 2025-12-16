package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import java.util.List;
import kotlin.Metadata;

/* compiled from: LazyGridLayoutInfo.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.lazy.grid.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20677i0 {
    public static final int a(@Y61.k InterfaceC20675h0 interfaceC20675h0) {
        boolean z12 = interfaceC20675h0.b() == Orientation.f27425b;
        List<O> listH = interfaceC20675h0.h();
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i12 < listH.size()) {
            O o12 = interfaceC20675h0.h().get(i12);
            int iM2 = z12 ? o12.m() : o12.i();
            if (iM2 == -1) {
                i12++;
            } else {
                int iMax = 0;
                while (i12 < listH.size()) {
                    O o13 = interfaceC20675h0.h().get(i12);
                    if ((z12 ? o13.m() : o13.i()) != iM2) {
                        break;
                    }
                    iMax = Math.max(iMax, (int) (z12 ? listH.get(i12).a() & 4294967295L : listH.get(i12).a() >> 32));
                    i12++;
                }
                i13 += iMax;
                i14++;
            }
        }
        return interfaceC20675h0.g() + (i13 / i14);
    }
}
