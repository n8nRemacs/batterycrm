package androidx.compose.material.internal;

import android.view.View;
import androidx.compose.material.Z3;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22143q0;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.layout.C22392w0;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.Q0;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.v;
import java.util.UUID;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: ExposedDropdownMenuPopup.android.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class i extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Z3 f33673l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C22096n f33674m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f33675n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Z3 z32, C22096n c22096n, int i12) {
        super(2);
        this.f33673l = z32;
        this.f33674m = c22096n;
        this.f33675n = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        int i12;
        num.intValue();
        int iA2 = C22066f2.a(this.f33675n | 1);
        Z3 z32 = this.f33673l;
        C22096n c22096n = this.f33674m;
        C22143q0 c22143q0 = n.f33681a;
        B bE2 = a12.E(-707851182);
        if ((iA2 & 6) == 0) {
            i12 = (bE2.u(null) ? 4 : 2) | iA2;
        } else {
            i12 = iA2;
        }
        if ((iA2 & 48) == 0) {
            i12 |= bE2.B(z32) ? 32 : 16;
        }
        if ((iA2 & 384) == 0) {
            i12 |= bE2.u(c22096n) ? 256 : 128;
        }
        if (bE2.p(i12 & 1, (i12 & 147) != 146)) {
            View view = (View) bE2.o(AndroidCompositionLocals_androidKt.f41073f);
            androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) bE2.o(Q0.f41199h);
            String str = (String) bE2.o(n.f33681a);
            LayoutDirection layoutDirection = (LayoutDirection) bE2.o(Q0.f41205n);
            B.b bVarI = bE2.i();
            InterfaceC22204y1 interfaceC22204y1M = C22126m3.m(c22096n, bE2);
            UUID uuid = (UUID) androidx.compose.runtime.saveable.j.c(new Object[0], null, j.f33676l, bE2, 3072, 6);
            Object objT = bE2.t();
            A.f37866a.getClass();
            A.a.C1651a c1651a = A.a.f37868b;
            Object obj = objT;
            if (objT == c1651a) {
                s sVar = new s(view, dVar, z32, uuid);
                C22096n c22096n2 = new C22096n(580081703, new m(sVar, interfaceC22204y1M), true);
                sVar.setParentCompositionContext(bVarI);
                ((C22082i3) sVar.f33700u).setValue(c22096n2);
                sVar.f33701v = true;
                bE2.H(sVar);
                obj = sVar;
            }
            s sVar2 = (s) obj;
            int i13 = i12 & 14;
            boolean zU2 = bE2.u(sVar2) | (i13 == 4) | bE2.B(str) | bE2.B(layoutDirection);
            Object objT2 = bE2.t();
            if (zU2 || objT2 == c1651a) {
                objT2 = new c(sVar2, str, layoutDirection);
                bE2.H(objT2);
            }
            C22187u0.a(sVar2, (Y41.l) objT2, bE2);
            boolean zU3 = bE2.u(sVar2) | (i13 == 4) | bE2.B(str) | bE2.B(layoutDirection);
            Object objT3 = bE2.t();
            if (zU3 || objT3 == c1651a) {
                objT3 = new d(sVar2, str, layoutDirection);
                bE2.H(objT3);
            }
            bE2.w((Y41.a) objT3);
            boolean zU4 = bE2.u(sVar2) | ((i12 & 112) == 32);
            Object objT4 = bE2.t();
            if (zU4 || objT4 == c1651a) {
                objT4 = new f(sVar2, z32);
                bE2.H(objT4);
            }
            C22187u0.a(z32, (Y41.l) objT4, bE2);
            v.a aVar = v.f42878y1;
            boolean zU5 = bE2.u(sVar2);
            Object objT5 = bE2.t();
            if (zU5 || objT5 == c1651a) {
                objT5 = new g(sVar2);
                bE2.H(objT5);
            }
            v vVarA = C22392w0.a(aVar, (Y41.l) objT5);
            boolean zU6 = bE2.u(sVar2) | bE2.B(layoutDirection);
            Object objT6 = bE2.t();
            if (zU6 || objT6 == c1651a) {
                objT6 = new h(sVar2, layoutDirection);
                bE2.H(objT6);
            }
            InterfaceC22365i0 interfaceC22365i0 = (InterfaceC22365i0) objT6;
            int i14 = bE2.f37888Q;
            O1 o1S = bE2.S();
            v vVarC = androidx.compose.ui.n.c(bE2, vVarA);
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
            R3.b(InterfaceC22413h.a.f40796g, bE2, interfaceC22365i0);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            bE2.X(true);
        } else {
            bE2.f();
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new i(z32, c22096n, iA2);
        }
        return G0.f406611a;
    }
}
