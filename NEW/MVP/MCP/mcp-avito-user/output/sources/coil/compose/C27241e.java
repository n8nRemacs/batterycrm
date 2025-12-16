package coil.compose;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.U;
import androidx.compose.ui.layout.InterfaceC22374n;
import androidx.compose.ui.node.InterfaceC22413h;
import coil.view.C27251e;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: AsyncImage.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"coil-compose-base_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: coil.compose.e, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27241e {
    /* JADX WARN: Removed duplicated region for block: B:109:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011a  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(coil.compose.j r24, java.lang.String r25, androidx.compose.ui.v r26, Y41.l r27, Y41.l r28, androidx.compose.ui.InterfaceC22215f r29, androidx.compose.ui.layout.InterfaceC22374n r30, float r31, androidx.compose.ui.graphics.U r32, int r33, androidx.compose.runtime.A r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 613
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.compose.C27241e.a(coil.compose.j, java.lang.String, androidx.compose.ui.v, Y41.l, Y41.l, androidx.compose.ui.f, androidx.compose.ui.layout.n, float, androidx.compose.ui.graphics.U, int, androidx.compose.runtime.A, int, int):void");
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void b(androidx.compose.ui.v vVar, C27242f c27242f, String str, InterfaceC22215f interfaceC22215f, InterfaceC22374n interfaceC22374n, float f12, U u12, androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(777774312);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(vVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.B(c27242f) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i13 |= bE2.B(str) ? 256 : 128;
        }
        if ((i12 & 7168) == 0) {
            i13 |= bE2.B(interfaceC22215f) ? 2048 : 1024;
        }
        if ((57344 & i12) == 0) {
            i13 |= bE2.B(interfaceC22374n) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((458752 & i12) == 0) {
            i13 |= bE2.k(f12) ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
        }
        if ((3670016 & i12) == 0) {
            i13 |= bE2.B(u12) ? 1048576 : 524288;
        }
        if ((29360128 & i12) == 0) {
            i13 |= bE2.j(true) ? 8388608 : 4194304;
        }
        if ((i13 & 23967451) == 4793490 && bE2.c()) {
            bE2.f();
        } else {
            C27251e c27251e = G.f58164b;
            androidx.compose.ui.v vVarD0 = androidx.compose.ui.draw.k.b(str != null ? androidx.compose.ui.semantics.r.b(vVar, false, new F(str)) : vVar).d0(new ContentPainterElement(c27242f, interfaceC22215f, interfaceC22374n, f12, u12));
            C27239c c27239c = C27239c.f58184a;
            bE2.I(544976794);
            int i14 = bE2.f37888Q;
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarD0);
            O1 o1S = bE2.S();
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar = InterfaceC22413h.a.f40791b;
            bE2.I(1405779621);
            if (bE2.f37890b == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(new C27238b(aVar));
            } else {
                bE2.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, bE2, c27239c);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar);
            }
            H.A(bE2, true, false, false);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C27240d(vVar, c27242f, str, interfaceC22215f, interfaceC22374n, f12, u12, i12);
        }
    }
}
