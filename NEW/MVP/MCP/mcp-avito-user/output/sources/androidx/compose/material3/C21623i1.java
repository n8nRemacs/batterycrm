package androidx.compose.material3;

import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22137p;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.input.pointer.Z;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;

/* compiled from: BasicTooltip.android.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.material3.i1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21623i1 {
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a6  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22137p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(androidx.compose.material3.C21459al r21, androidx.compose.material3.Q0 r22, kotlinx.coroutines.T r23, boolean r24, androidx.compose.runtime.internal.C22096n r25, androidx.compose.runtime.A r26, int r27) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.C21623i1.a(androidx.compose.material3.al, androidx.compose.material3.Q0, kotlinx.coroutines.T, boolean, androidx.compose.runtime.internal.n, androidx.compose.runtime.A, int):void");
    }

    @InterfaceC22132o
    @InterfaceC22137p
    public static final void b(boolean z12, Q0 q02, androidx.compose.ui.v vVar, C22096n c22096n, androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(513239742);
        if ((i12 & 6) == 0) {
            i13 = (bE2.j(z12) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= bE2.B(q02) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= bE2.B(vVar) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i13 |= bE2.u(c22096n) ? 2048 : 1024;
        }
        if ((i13 & 1171) == 1170 && bE2.c()) {
            bE2.f();
        } else {
            bE2.I(773894976);
            bE2.I(-492369756);
            Object objT = bE2.t();
            androidx.compose.runtime.A.f37866a.getClass();
            if (objT == A.a.f37868b) {
                androidx.compose.runtime.X x12 = new androidx.compose.runtime.X(C22187u0.h(EmptyCoroutineContext.INSTANCE, bE2));
                bE2.H(x12);
                objT = x12;
            }
            bE2.X(false);
            kotlinx.coroutines.T t12 = ((androidx.compose.runtime.X) objT).f38164b;
            bE2.X(false);
            String strC = u0.i.c(bE2, R.string.tooltip_label);
            androidx.compose.ui.v vVarD0 = z12 ? vVar.d0(new SuspendPointerInputElement(q02, null, null, new Z.a(new C21577g1(q02, null)), 6, null)).d0(new SuspendPointerInputElement(q02, null, null, new Z.a(new C21600h1(q02, null)), 6, null)) : vVar;
            if (z12) {
                vVarD0 = androidx.compose.ui.semantics.r.b(vVarD0, true, new C21554f1(strC, t12, q02));
            }
            bE2.I(733328855);
            InterfaceC22215f.f39074a.getClass();
            InterfaceC22365i0 interfaceC22365i0E = C20632w.e(InterfaceC22215f.a.f39076b, false, bE2, 0);
            bE2.I(-1323940314);
            int i14 = bE2.f37888Q;
            androidx.compose.runtime.O1 o1S = bE2.S();
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar = InterfaceC22413h.a.f40791b;
            C22096n c22096nC = androidx.compose.ui.layout.M.c(vVarD0);
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
            androidx.compose.runtime.R3.b(InterfaceC22413h.a.f40796g, bE2, interfaceC22365i0E);
            androidx.compose.runtime.R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, kotlin.G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar);
            }
            androidx.compose.foundation.H.y(0, c22096nC, androidx.compose.runtime.J2.a(bE2), bE2, 2058660585);
            C20644z c20644z = C20644z.f28804a;
            androidx.compose.foundation.H.w((i13 >> 9) & 14, c22096n, bE2, false, true);
            bE2.X(false);
            bE2.X(false);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C21485c1(z12, q02, vVar, c22096n, i12);
        }
    }
}
