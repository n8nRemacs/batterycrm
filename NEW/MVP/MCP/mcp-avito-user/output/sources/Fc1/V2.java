package Fc1;

import androidx.compose.foundation.text.C20856d0;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.ui.text.C22602e;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

@kotlin.jvm.internal.s0
/* loaded from: classes9.dex */
public final class V2 {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k String str, @Y61.l androidx.compose.ui.v vVar, @Y61.k D2 d22, @Y61.k N7 n72, @Y61.k N7 n73, @Y61.l Y41.l lVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        J4 j42;
        androidx.compose.runtime.B bE2 = a12.E(223359947);
        int i13 = i12 | (bE2.B(str) ? 4 : 2);
        if ((i12 & 112) == 0) {
            i13 |= bE2.B(vVar) ? 32 : 16;
        }
        int i14 = i13 | (bE2.B(d22) ? 256 : 128) | (bE2.B(n72) ? 2048 : 1024) | (bE2.B(n73) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bE2.u(lVar) ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR);
        if ((374491 & i14) == 74898 && bE2.c()) {
            bE2.f();
        } else {
            InterfaceC13779y3 interfaceC13779y3 = (InterfaceC13779y3) bE2.o(C13707q2.f5762a);
            bE2.I(-492369756);
            Object objT = bE2.t();
            androidx.compose.runtime.A.f37866a.getClass();
            if (objT == A.a.f37868b) {
                objT = new J4();
                bE2.H(objT);
            }
            bE2.X(false);
            J4 j43 = (J4) objT;
            Object[] objArr = {d22, n72, n73, lVar};
            bE2.I(-568225417);
            boolean zB2 = false;
            for (int i15 = 0; i15 < 4; i15++) {
                zB2 |= bE2.B(objArr[i15]);
            }
            Object objT2 = bE2.t();
            if (zB2 || objT2 == A.a.f37868b) {
                j42 = j43;
                objT2 = new C13575b5(d22, n72, n73, interfaceC13779y3, lVar);
                bE2.H(objT2);
            } else {
                j42 = j43;
            }
            bE2.X(false);
            C13575b5 c13575b5 = (C13575b5) objT2;
            bE2.I(-1223269329);
            C22602e.b bVar = new C22602e.b(0, 1, null);
            C13716r3.a(str, new N3(bVar, c13575b5, j42), bE2, ((i14 & 14) | 560) & 14);
            C22602e c22602eM = bVar.m();
            bE2.X(false);
            C20856d0.a(c22602eM, vVar, null, false, 0, 0, null, c13575b5.f5420g, bE2, i14 & 112, 124);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new U2(str, vVar, d22, n72, n73, lVar, i12);
    }
}
