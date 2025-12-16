package androidx.compose.material3;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: AlertDialog.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.material3.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21643j extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f36604l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f36605m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C22096n f36606n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21643j(float f12, float f13, C22096n c22096n, int i12) {
        super(2);
        this.f36604l = f12;
        this.f36605m = f13;
        this.f36606n = c22096n;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(439);
        C22096n c22096n = this.f36606n;
        float f12 = C21666k.f36690a;
        androidx.compose.runtime.B bE2 = a12.E(586821353);
        int i12 = iA2 & 147;
        float f13 = this.f36605m;
        float f14 = this.f36604l;
        if (i12 == 146 && bE2.c()) {
            bE2.f();
        } else {
            bE2.I(-1133133582);
            Object objT = bE2.t();
            androidx.compose.runtime.A.f37866a.getClass();
            if (objT == A.a.f37868b) {
                objT = new C21621i(f14, f13);
                bE2.H(objT);
            }
            InterfaceC22365i0 interfaceC22365i0 = (InterfaceC22365i0) objT;
            bE2.X(false);
            bE2.I(-1323940314);
            v.a aVar = androidx.compose.ui.v.f42878y1;
            int i13 = bE2.f37888Q;
            androidx.compose.runtime.O1 o1S = bE2.S();
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar2 = InterfaceC22413h.a.f40791b;
            C22096n c22096nC = androidx.compose.ui.layout.M.c(aVar);
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
            androidx.compose.runtime.R3.b(InterfaceC22413h.a.f40796g, bE2, interfaceC22365i0);
            androidx.compose.runtime.R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, kotlin.G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i13))) {
                AK.c.y(i13, bE2, i13, pVar);
            }
            androidx.compose.foundation.H.y(0, c22096nC, androidx.compose.runtime.J2.a(bE2), bE2, 2058660585);
            androidx.compose.foundation.H.w(6, c22096n, bE2, false, true);
            bE2.X(false);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C21643j(f14, f13, c22096n, iA2);
        }
        return kotlin.G0.f406611a;
    }
}
