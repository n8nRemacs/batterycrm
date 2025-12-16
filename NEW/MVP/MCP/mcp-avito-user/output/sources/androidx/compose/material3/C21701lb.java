package androidx.compose.material3;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.InterfaceC20639x2;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import kotlin.Metadata;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: NavigationDrawer.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.material3.lb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21701lb extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC20639x2 f36802l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f36803m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.graphics.h1 f36804n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f36805o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f36806p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ float f36807q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Y41.q<androidx.compose.foundation.layout.J, androidx.compose.runtime.A, Integer, kotlin.G0> f36808r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f36809s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21701lb(InterfaceC20639x2 interfaceC20639x2, androidx.compose.ui.v vVar, androidx.compose.ui.graphics.h1 h1Var, long j12, long j13, float f12, Y41.q qVar, int i12) {
        super(2);
        this.f36802l = interfaceC20639x2;
        this.f36803m = vVar;
        this.f36804n = h1Var;
        this.f36805o = j12;
        this.f36806p = j13;
        this.f36807q = f12;
        this.f36808r = qVar;
        this.f36809s = i12;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        int i12;
        float f12;
        long j12;
        Y41.q<androidx.compose.foundation.layout.J, androidx.compose.runtime.A, Integer, kotlin.G0> qVar;
        long j13;
        num.intValue();
        int iA2 = C22066f2.a(this.f36809s | 1);
        float f13 = Kb.f35004a;
        androidx.compose.runtime.B bE2 = a12.E(175072821);
        int i13 = iA2 & 6;
        InterfaceC20639x2 interfaceC20639x2 = this.f36802l;
        if (i13 == 0) {
            i12 = (bE2.B(interfaceC20639x2) ? 4 : 2) | iA2;
        } else {
            i12 = iA2;
        }
        int i14 = iA2 & 48;
        androidx.compose.ui.v vVar = this.f36803m;
        if (i14 == 0) {
            i12 |= bE2.B(vVar) ? 32 : 16;
        }
        int i15 = iA2 & 384;
        androidx.compose.ui.graphics.h1 h1Var = this.f36804n;
        if (i15 == 0) {
            i12 |= bE2.B(h1Var) ? 256 : 128;
        }
        int i16 = iA2 & 3072;
        long j14 = this.f36805o;
        if (i16 == 0) {
            i12 |= bE2.n(j14) ? 2048 : 1024;
        }
        int i17 = iA2 & 24576;
        long j15 = this.f36806p;
        if (i17 == 0) {
            i12 |= bE2.n(j15) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        int i18 = 196608 & iA2;
        float f14 = this.f36807q;
        if (i18 == 0) {
            i12 |= bE2.k(f14) ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
        }
        int i19 = 1572864 & iA2;
        Y41.q<androidx.compose.foundation.layout.J, androidx.compose.runtime.A, Integer, kotlin.G0> qVar2 = this.f36808r;
        if (i19 == 0) {
            i12 |= bE2.u(qVar2) ? 1048576 : 524288;
        }
        if ((599187 & i12) == 599186 && bE2.c()) {
            bE2.f();
            f12 = f14;
            j12 = j15;
            qVar = qVar2;
            j13 = j14;
        } else {
            bE2.y0();
            if ((iA2 & 1) != 0 && !bE2.g0()) {
                bE2.f();
            }
            bE2.Y();
            P6.f35287a.getClass();
            f12 = f14;
            j12 = j15;
            qVar = qVar2;
            int i22 = i12 >> 3;
            j13 = j14;
            Qg.a(C20588k2.s(vVar, Kb.f35005b, 0.0f, P6.f35288b, 0.0f, 10).d0(C20588k2.f28681b), h1Var, j13, j12, f12, 0.0f, null, androidx.compose.runtime.internal.r.b(bE2, 959363152, new C21678kb(interfaceC20639x2, qVar)), bE2, (i22 & 112) | 12582912 | (i22 & 896) | (i22 & 7168) | (i22 & 57344), 96);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C21701lb(interfaceC20639x2, vVar, h1Var, j13, j12, f12, qVar, iA2);
        }
        return kotlin.G0.f406611a;
    }
}
