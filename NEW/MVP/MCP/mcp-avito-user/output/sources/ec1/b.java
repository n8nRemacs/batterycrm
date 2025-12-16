package Ec1;

import androidx.compose.animation.core.C20278f0;
import androidx.compose.animation.core.C20293k0;
import androidx.compose.animation.core.C20310q;
import androidx.compose.animation.core.O;
import androidx.compose.animation.core.Q;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.foundation.C20806p1;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22082i3;
import androidx.compose.ui.draw.u;
import androidx.compose.ui.graphics.U;
import androidx.compose.ui.graphics.painter.e;
import androidx.compose.ui.v;
import com.avito.android.R;
import shark.AndroidResourceIdNames;
import u0.i;
import w2.AbstractC49426b;

/* loaded from: classes9.dex */
public abstract class b {
    public static final void a(v vVar, long j12, String str, e eVar, int i12, O o12, RepeatMode repeatMode, A a12, int i13) {
        int i14;
        String strC;
        e eVarA;
        O o13;
        RepeatMode repeatMode2;
        int i15;
        int i16;
        RepeatMode repeatMode3;
        O o14;
        e eVar2;
        B bE2 = a12.E(726719951);
        if ((i13 & 14) == 0) {
            i14 = (bE2.B(vVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 112) == 0) {
            i14 |= bE2.n(j12) ? 32 : 16;
        }
        if ((i13 & 896) == 0) {
            i14 |= 128;
        }
        int i17 = i14 | 1024;
        if ((57344 & i13) == 0) {
            i17 = i14 | 9216;
        }
        if ((458752 & i13) == 0) {
            i17 |= AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
        }
        if (((1572864 | i17) & 2995931) == 599186 && bE2.c()) {
            bE2.f();
            strC = str;
            eVar2 = eVar;
            i16 = i12;
            o14 = o12;
            repeatMode3 = repeatMode;
        } else {
            bE2.y0();
            if ((i13 & 1) == 0 || bE2.g0()) {
                strC = i.c(bE2, R.string.rotate_spinner_default_description);
                eVarA = u0.e.a(R.drawable.ic_spinner, 0, bE2);
                o13 = Q.f26124d;
                repeatMode2 = RepeatMode.f26133b;
                i15 = 1000;
            } else {
                bE2.f();
                strC = str;
                eVarA = eVar;
                i15 = i12;
                o13 = o12;
                repeatMode2 = repeatMode;
            }
            bE2.Y();
            C20806p1.a(eVarA, strC, u.a(C20588k2.o(vVar, AbstractC49426b.f441200i), ((Number) ((C22082i3) C20293k0.a(C20293k0.c("RotateSpinnerTransition", bE2, 0), 0.0f, 360.0f, new C20278f0(C20310q.e(i15, 0, o13, 2), repeatMode2, 0L, 4, null), i.c(bE2, R.string.rotate_spinner_label_animation), bE2, 4536, 0).f26280e).getF42167b()).floatValue()), null, null, 0.0f, U.a.a(U.f39332b, j12), bE2, 8, 56);
            i16 = i15;
            repeatMode3 = repeatMode2;
            e eVar3 = eVarA;
            o14 = o13;
            eVar2 = eVar3;
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new a(vVar, j12, strC, eVar2, i16, o14, repeatMode3, i13);
    }
}
