package androidx.compose.material3;

import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.v;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: BasicTooltip.android.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class W0 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C21459al f35708l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C22096n f35709m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Q0 f35710n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f35711o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f35712p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f35713q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C22096n f35714r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f35715s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W0(C21459al c21459al, C22096n c22096n, Q0 q02, androidx.compose.ui.v vVar, boolean z12, boolean z13, C22096n c22096n2, int i12) {
        super(2);
        this.f35708l = c21459al;
        this.f35709m = c22096n;
        this.f35710n = q02;
        this.f35711o = vVar;
        this.f35712p = z12;
        this.f35713q = z13;
        this.f35714r = c22096n2;
        this.f35715s = i12;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        int i12;
        boolean z12;
        int i13;
        boolean z13;
        boolean z14;
        A.a.C1651a c1651a;
        androidx.compose.ui.v vVar;
        num.intValue();
        int iA2 = C22066f2.a(this.f35715s | 1);
        C22096n c22096n = this.f35714r;
        C22096n c22096n2 = this.f35709m;
        androidx.compose.runtime.B bE2 = a12.E(568522220);
        int i14 = iA2 & 6;
        C21459al c21459al = this.f35708l;
        if (i14 == 0) {
            i12 = (bE2.B(c21459al) ? 4 : 2) | iA2;
        } else {
            i12 = iA2;
        }
        if ((iA2 & 48) == 0) {
            i12 |= bE2.u(c22096n2) ? 32 : 16;
        }
        int i15 = iA2 & 384;
        Q0 q02 = this.f35710n;
        if (i15 == 0) {
            i12 |= bE2.B(q02) ? 256 : 128;
        }
        int i16 = iA2 & 3072;
        androidx.compose.ui.v vVar2 = this.f35711o;
        if (i16 == 0) {
            i12 |= bE2.B(vVar2) ? 2048 : 1024;
        }
        int i17 = iA2 & 24576;
        boolean z15 = this.f35712p;
        if (i17 == 0) {
            i12 |= bE2.j(z15) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        int i18 = 196608 & iA2;
        boolean z16 = this.f35713q;
        if (i18 == 0) {
            i12 |= bE2.j(z16) ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
        }
        if ((1572864 & iA2) == 0) {
            i12 |= bE2.u(c22096n) ? 1048576 : 524288;
        }
        int i19 = i12;
        if ((599187 & i19) == 599186 && bE2.c()) {
            bE2.f();
            z13 = z16;
            z14 = z15;
            vVar = vVar2;
        } else {
            bE2.I(773894976);
            bE2.I(-492369756);
            Object objT = bE2.t();
            androidx.compose.runtime.A.f37866a.getClass();
            A.a.C1651a c1651a2 = A.a.f37868b;
            if (objT == c1651a2) {
                androidx.compose.runtime.X x12 = new androidx.compose.runtime.X(C22187u0.h(EmptyCoroutineContext.INSTANCE, bE2));
                bE2.H(x12);
                objT = x12;
            }
            bE2.X(false);
            kotlinx.coroutines.T t12 = ((androidx.compose.runtime.X) objT).f38164b;
            bE2.X(false);
            bE2.I(733328855);
            v.a aVar = androidx.compose.ui.v.f42878y1;
            InterfaceC22215f.f39074a.getClass();
            InterfaceC22365i0 interfaceC22365i0E = C20632w.e(InterfaceC22215f.a.f39076b, false, bE2, 0);
            bE2.I(-1323940314);
            int i22 = bE2.f37888Q;
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
            androidx.compose.runtime.R3.b(InterfaceC22413h.a.f40796g, bE2, interfaceC22365i0E);
            androidx.compose.runtime.R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, kotlin.G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i22))) {
                AK.c.y(i22, bE2, i22, pVar);
            }
            androidx.compose.foundation.H.y(0, c22096nC, androidx.compose.runtime.J2.a(bE2), bE2, 2058660585);
            C20644z c20644z = C20644z.f28804a;
            bE2.I(-1071913438);
            if (q02.getF35483a()) {
                int i23 = i19 >> 3;
                int i24 = (i19 & 14) | (i23 & 112) | (i23 & 7168) | ((i19 << 9) & 57344);
                z12 = false;
                c1651a = c1651a2;
                i13 = i19;
                z13 = z16;
                z14 = z15;
                vVar = vVar2;
                C21623i1.a(c21459al, q02, t12, z15, c22096n2, bE2, i24);
            } else {
                z12 = false;
                i13 = i19;
                z13 = z16;
                z14 = z15;
                c1651a = c1651a2;
                vVar = vVar2;
            }
            bE2.X(z12);
            int i25 = i13 >> 3;
            C21623i1.b(z13, q02, vVar, c22096n, bE2, ((i13 >> 15) & 14) | (i25 & 112) | (i25 & 896) | ((i13 >> 9) & 7168));
            androidx.compose.foundation.H.B(bE2, z12, true, z12, z12);
            bE2.I(-1577643692);
            boolean z17 = (i13 & 896) == 256 ? true : z12;
            Object objT2 = bE2.t();
            if (z17 || objT2 == c1651a) {
                objT2 = new V0(q02);
                bE2.H(objT2);
            }
            bE2.X(z12);
            C22187u0.a(q02, (Y41.l) objT2, bE2);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new W0(c21459al, c22096n2, q02, vVar, z14, z13, c22096n, iA2);
        }
        return kotlin.G0.f406611a;
    }
}
