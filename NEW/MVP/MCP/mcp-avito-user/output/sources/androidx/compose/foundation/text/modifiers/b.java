package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.V1;
import androidx.compose.ui.text.style.s;
import androidx.compose.ui.unit.C22712b;
import kotlin.Metadata;

/* compiled from: LayoutUtils.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b {
    public static final long a(float f12, int i12, long j12, boolean z12) {
        C22712b.a aVar = C22712b.f42842b;
        int iJ2 = ((z12 || b(i12)) && C22712b.f(j12)) ? C22712b.j(j12) : Integer.MAX_VALUE;
        if (C22712b.l(j12) != iJ2) {
            iJ2 = kotlin.ranges.s.g(V1.a(f12), C22712b.l(j12), iJ2);
        }
        int i13 = C22712b.i(j12);
        aVar.getClass();
        return C22712b.a.b(0, iJ2, 0, i13);
    }

    public static final boolean b(int i12) {
        s.a aVar = androidx.compose.ui.text.style.s.f42720b;
        aVar.getClass();
        if (!androidx.compose.ui.text.style.s.a(i12, androidx.compose.ui.text.style.s.f42722d)) {
            aVar.getClass();
            if (!androidx.compose.ui.text.style.s.a(i12, androidx.compose.ui.text.style.s.f42724f)) {
                aVar.getClass();
                if (!androidx.compose.ui.text.style.s.a(i12, androidx.compose.ui.text.style.s.f42725g)) {
                    return false;
                }
            }
        }
        return true;
    }
}
