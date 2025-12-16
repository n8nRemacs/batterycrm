package androidx.compose.foundation;

import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22137p;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.v;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: BasicTooltip.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class X {
    @W0
    @InterfaceC22132o
    @InterfaceC22137p
    public static final void a(@Y61.k androidx.compose.ui.window.T t12, @Y61.k C22096n c22096n, @Y61.k Y y12, @Y61.l androidx.compose.ui.v vVar, boolean z12, boolean z13, @Y61.k C22096n c22096n2, @Y61.l androidx.compose.runtime.A a12, int i12) throws Throwable {
        int i13;
        A.a.C1651a c1651a;
        boolean z14;
        androidx.compose.runtime.B bE2 = a12.E(1841478228);
        if ((i12 & 6) == 0) {
            i13 = (bE2.B(t12) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= bE2.u(c22096n) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= bE2.B(y12) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i13 |= bE2.B(vVar) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            i13 |= bE2.j(z12) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i12) == 0) {
            i13 |= bE2.j(z13) ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
        }
        if ((1572864 & i12) == 0) {
            i13 |= bE2.u(c22096n2) ? 1048576 : 524288;
        }
        if (bE2.p(i13 & 1, (599187 & i13) != 599186)) {
            Object objT = bE2.t();
            androidx.compose.runtime.A.f37866a.getClass();
            A.a.C1651a c1651a2 = A.a.f37868b;
            if (objT == c1651a2) {
                objT = C22187u0.h(EmptyCoroutineContext.INSTANCE, bE2);
                bE2.H(objT);
            }
            kotlinx.coroutines.T t13 = (kotlinx.coroutines.T) objT;
            v.a aVar = androidx.compose.ui.v.f42878y1;
            InterfaceC22215f.f39074a.getClass();
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
            int i14 = bE2.f37888Q;
            androidx.compose.runtime.O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, aVar);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar2 = InterfaceC22413h.a.f40791b;
            if (bE2.f37890b == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar2);
            } else {
                bE2.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, bE2, interfaceC22365i0D);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, kotlin.G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            C20644z c20644z = C20644z.f28804a;
            C20411b0 c20411b0 = (C20411b0) y12;
            if (c20411b0.isVisible()) {
                bE2.C(137118168);
                int i15 = i13 >> 3;
                int i16 = (i13 & 14) | (i15 & 112) | (i15 & 7168) | ((i13 << 9) & 57344);
                c1651a = c1651a2;
                z14 = false;
                c(t12, c20411b0, t13, z12, c22096n, bE2, i16);
                bE2.X(false);
            } else {
                c1651a = c1651a2;
                z14 = false;
                bE2.C(137347847);
                bE2.X(false);
            }
            int i17 = i13 >> 3;
            d(z13, c20411b0, vVar, c22096n2, bE2, ((i13 >> 15) & 14) | (i17 & 112) | (i17 & 896) | ((i13 >> 9) & 7168));
            bE2.X(true);
            boolean z15 = (i13 & 896) != 256 ? z14 : true;
            Object objT2 = bE2.t();
            if (z15 || objT2 == c1651a) {
                objT2 = new J(c20411b0);
                bE2.H(objT2);
            }
            C22187u0.a(c20411b0, (Y41.l) objT2, bE2);
        } else {
            bE2.f();
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new K(t12, c22096n, y12, vVar, z12, z13, c22096n2, i12);
        }
    }

    public static Y b(boolean z12) {
        G.f26704a.getClass();
        return new C20411b0(z12, G.f26705b);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00a4  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22137p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(androidx.compose.ui.window.T r18, androidx.compose.foundation.Y r19, kotlinx.coroutines.T r20, boolean r21, androidx.compose.runtime.internal.C22096n r22, androidx.compose.runtime.A r23, int r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.X.c(androidx.compose.ui.window.T, androidx.compose.foundation.Y, kotlinx.coroutines.T, boolean, androidx.compose.runtime.internal.n, androidx.compose.runtime.A, int):void");
    }

    @InterfaceC22132o
    @InterfaceC22137p
    public static final void d(boolean z12, Y y12, androidx.compose.ui.v vVar, C22096n c22096n, androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(-111661630);
        if ((i12 & 6) == 0) {
            i13 = (bE2.j(z12) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= bE2.B(y12) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= bE2.B(vVar) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i13 |= bE2.u(c22096n) ? 2048 : 1024;
        }
        if (bE2.p(i13 & 1, (i13 & 1171) != 1170)) {
            Object objT = bE2.t();
            androidx.compose.runtime.A.f37866a.getClass();
            if (objT == A.a.f37868b) {
                objT = C22187u0.h(EmptyCoroutineContext.INSTANCE, bE2);
                bE2.H(objT);
            }
            kotlinx.coroutines.T t12 = (kotlinx.coroutines.T) objT;
            C20414c0.f26966a.getClass();
            String strC = u0.i.c(bE2, R.string.tooltip_label);
            androidx.compose.ui.v vVarE = z12 ? androidx.compose.ui.input.pointer.Z.e(androidx.compose.ui.input.pointer.Z.e(vVar, y12, new V(y12)), y12, new W(y12)) : vVar;
            if (z12) {
                vVarE = androidx.compose.ui.semantics.r.b(vVarE, true, new U(strC, t12, y12));
            }
            InterfaceC22215f.f39074a.getClass();
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
            int i14 = bE2.f37888Q;
            androidx.compose.runtime.O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarE);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar = InterfaceC22413h.a.f40791b;
            if (bE2.f37890b == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar);
            } else {
                bE2.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, bE2, interfaceC22365i0D);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, kotlin.G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            C20644z c20644z = C20644z.f28804a;
            H.v((i13 >> 9) & 14, c22096n, bE2, true);
        } else {
            bE2.f();
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new Q(z12, y12, vVar, c22096n, i12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0021  */
    @androidx.compose.foundation.W0
    @androidx.compose.runtime.InterfaceC22132o
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.foundation.Y e(@Y61.l androidx.compose.runtime.A r4) {
        /*
            androidx.compose.foundation.G r0 = androidx.compose.foundation.G.f26704a
            r0.getClass()
            androidx.compose.foundation.G1 r0 = androidx.compose.foundation.G.f26705b
            r1 = 1
            boolean r1 = r4.j(r1)
            r2 = 0
            boolean r3 = r4.B(r0)
            r1 = r1 | r3
            java.lang.Object r3 = r4.t()
            if (r1 != 0) goto L21
            androidx.compose.runtime.A$a r1 = androidx.compose.runtime.A.f37866a
            r1.getClass()
            androidx.compose.runtime.A$a$a r1 = androidx.compose.runtime.A.a.f37868b
            if (r3 != r1) goto L29
        L21:
            androidx.compose.foundation.b0 r3 = new androidx.compose.foundation.b0
            r3.<init>(r2, r0)
            r4.H(r3)
        L29:
            androidx.compose.foundation.b0 r3 = (androidx.compose.foundation.C20411b0) r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.X.e(androidx.compose.runtime.A):androidx.compose.foundation.Y");
    }
}
