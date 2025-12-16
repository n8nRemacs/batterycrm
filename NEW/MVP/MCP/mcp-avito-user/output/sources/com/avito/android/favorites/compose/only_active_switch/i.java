package com.avito.android.favorites.compose.only_active_switch;

import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.akita.compose.component.toggle.r;
import com.akita.compose.component.toggle.s;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ShowOnlyActiveFavoritesSwitch.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_favorites_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i {
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k com.avito.android.favorites.InterfaceC30683q0 r19, @Y61.l androidx.compose.ui.v.a r20, @Y61.l androidx.compose.runtime.A r21, int r22) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.favorites.compose.only_active_switch.i.a(com.avito.android.favorites.q0, androidx.compose.ui.v$a, androidx.compose.runtime.A, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(InterfaceC22204y1 interfaceC22204y1, Y41.a aVar, v vVar, A a12, int i12) {
        int i13;
        B b12;
        B bE2 = a12.E(-919811209);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(interfaceC22204y1) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.u(aVar) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i13 |= bE2.B(vVar) ? 256 : 128;
        }
        if ((i13 & 731) == 146 && bE2.c()) {
            bE2.f();
            b12 = bE2;
        } else {
            boolean zBooleanValue = ((Boolean) interfaceC22204y1.getF42167b()).booleanValue();
            float f12 = 32;
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
            float f13 = 16;
            float f14 = 12;
            bE2.C(-479126783);
            Object objT = bE2.t();
            A.f37866a.getClass();
            if (objT == A.a.f37868b) {
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.theme.re23.a aVar3 = com.akita.compose.theme.re23.b.f63984b;
                com.akita.compose.foundation.c cVar = new com.akita.compose.foundation.c(aVar3.f63851H1, null, null, null, 14, null);
                s sVar = new s(0, null, new com.akita.compose.foundation.c(aVar3.f63952p1, null, null, null, 14, null), new com.akita.compose.foundation.c(aVar3.f63938l, null, null, null, 14, null), null, null, cVar, cVar, 51, null);
                bE2.H(sVar);
                objT = sVar;
            }
            bE2.X(false);
            b12 = bE2;
            r.b(zBooleanValue, aVar, vVar, null, null, f12, f13, f14, 0.0f, 0.0f, (s) objT, false, b12, 14352384 | (i13 & 112) | (i13 & 896), 6, 2840);
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new h(interfaceC22204y1, aVar, vVar, i12);
        }
    }
}
