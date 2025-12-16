package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.graphics.J0;
import androidx.compose.ui.graphics.m1;
import androidx.compose.ui.graphics.n1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: VectorCompose.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Q {
    @InterfaceC22132o
    @InterfaceC22304o
    public static final void a(@Y61.l String str, float f12, float f13, float f14, float f15, float f16, float f17, float f18, @Y61.l List list, @Y61.k C22096n c22096n, @Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(-213417674);
        int i13 = i12 | (bE2.B(str) ? 4 : 2) | (bE2.k(f12) ? 32 : 16) | (bE2.k(f13) ? 256 : 128) | (bE2.k(f14) ? 2048 : 1024) | (bE2.k(f15) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bE2.k(f16) ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) | (bE2.k(f17) ? 1048576 : 524288) | (bE2.k(f18) ? 8388608 : 4194304) | (bE2.u(list) ? 67108864 : 33554432);
        if (bE2.p(i13 & 1, (306783379 & i13) != 306783378)) {
            bE2.y0();
            if ((i12 & 1) != 0 && !bE2.g0()) {
                bE2.f();
            }
            bE2.Y();
            C22305p c22305p = C22305p.f40014l;
            if (!(bE2.f37890b instanceof C22302m)) {
                C22190v.b();
                throw null;
            }
            bE2.A0();
            if (bE2.f37887P) {
                bE2.b(c22305p);
            } else {
                bE2.d();
            }
            R3.b(C22306q.f40015l, bE2, str);
            R3.b(r.f40016l, bE2, Float.valueOf(f12));
            R3.b(C22307s.f40017l, bE2, Float.valueOf(f13));
            R3.b(C22308t.f40018l, bE2, Float.valueOf(f14));
            R3.b(C22309u.f40019l, bE2, Float.valueOf(f15));
            R3.b(C22310v.f40020l, bE2, Float.valueOf(f16));
            R3.b(C22311w.f40021l, bE2, Float.valueOf(f17));
            R3.b(C22312x.f40022l, bE2, Float.valueOf(f18));
            R3.b(C22313y.f40023l, bE2, list);
            androidx.compose.foundation.H.v(6, c22096n, bE2, true);
        } else {
            bE2.f();
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C22314z(str, f12, f13, f14, f15, f16, f17, f18, list, c22096n, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22304o
    public static final void b(@Y61.k List list, int i12, @Y61.l String str, @Y61.l androidx.compose.ui.graphics.J j12, float f12, @Y61.l androidx.compose.ui.graphics.J j13, float f13, float f14, int i13, int i14, float f15, float f16, float f17, float f18, @Y61.l androidx.compose.runtime.A a12, int i15) {
        androidx.compose.runtime.B bE2 = a12.E(-1478270750);
        int i16 = i15 | (bE2.u(list) ? 4 : 2) | (bE2.m(i12) ? 32 : 16) | (bE2.B(str) ? 256 : 128) | (bE2.B(j12) ? 2048 : 1024) | (bE2.k(f12) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bE2.B(j13) ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) | (bE2.k(f13) ? 1048576 : 524288) | (bE2.k(f14) ? 8388608 : 4194304) | (bE2.m(i13) ? 67108864 : 33554432) | (bE2.m(i14) ? 536870912 : 268435456);
        if (bE2.p(i16 & 1, ((i16 & 306783379) == 306783378 && (((((bE2.k(f15) ? (char) 4 : (char) 2) | (bE2.k(f16) ? ' ' : (char) 16)) | (bE2.k(f17) ? 256 : 128)) | (bE2.k(f18) ? 2048 : 1024)) & 1171) == 1170) ? false : true)) {
            A a13 = A.f39771l;
            if (!(bE2.f37890b instanceof C22302m)) {
                C22190v.b();
                throw null;
            }
            bE2.A0();
            if (bE2.f37887P) {
                bE2.b(a13);
            } else {
                bE2.d();
            }
            R3.b(G.f39777l, bE2, str);
            R3.b(H.f39778l, bE2, list);
            R3.b(I.f39779l, bE2, J0.a(i12));
            R3.b(J.f39780l, bE2, j12);
            R3.b(K.f39781l, bE2, Float.valueOf(f12));
            R3.b(L.f39782l, bE2, j13);
            R3.b(M.f39783l, bE2, Float.valueOf(f13));
            R3.b(N.f39784l, bE2, Float.valueOf(f14));
            R3.b(O.f39785l, bE2, n1.a(i14));
            R3.b(B.f39772l, bE2, m1.a(i13));
            R3.b(C.f39773l, bE2, Float.valueOf(f15));
            R3.b(D.f39774l, bE2, Float.valueOf(f16));
            R3.b(E.f39775l, bE2, Float.valueOf(f17));
            R3.b(F.f39776l, bE2, Float.valueOf(f18));
            bE2.X(true);
        } else {
            bE2.f();
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new P(list, i12, str, j12, f12, j13, f13, f14, i13, i14, f15, f16, f17, f18, i15);
        }
    }
}
