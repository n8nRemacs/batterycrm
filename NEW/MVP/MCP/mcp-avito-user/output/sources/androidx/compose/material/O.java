package androidx.compose.material;

import androidx.compose.foundation.layout.InterfaceC20572g2;
import androidx.compose.foundation.layout.InterfaceC20639x2;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import kotlin.Metadata;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: AppBar.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class O extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f32985l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f32986m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f32987n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.layout.T1 f32988o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.graphics.h1 f32989p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC20639x2 f32990q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f32991r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.q<InterfaceC20572g2, androidx.compose.runtime.A, Integer, kotlin.G0> f32992s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f32993t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(long j12, long j13, float f12, androidx.compose.foundation.layout.T1 t12, androidx.compose.ui.graphics.h1 h1Var, InterfaceC20639x2 interfaceC20639x2, androidx.compose.ui.v vVar, Y41.q qVar, int i12) {
        super(2);
        this.f32985l = j12;
        this.f32986m = j13;
        this.f32987n = f12;
        this.f32988o = t12;
        this.f32989p = h1Var;
        this.f32990q = interfaceC20639x2;
        this.f32991r = vVar;
        this.f32992s = qVar;
        this.f32993t = i12;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        int i12;
        Y41.q<InterfaceC20572g2, androidx.compose.runtime.A, Integer, kotlin.G0> qVar;
        InterfaceC20639x2 interfaceC20639x2;
        androidx.compose.ui.v vVar;
        androidx.compose.foundation.layout.T1 t12;
        androidx.compose.ui.graphics.h1 h1Var;
        float f12;
        long j12;
        long j13;
        num.intValue();
        int iA2 = C22066f2.a(this.f32993t | 1);
        float f13 = Z.f33378a;
        androidx.compose.runtime.B bE2 = a12.E(-712505634);
        int i13 = iA2 & 6;
        long j14 = this.f32985l;
        if (i13 == 0) {
            i12 = (bE2.n(j14) ? 4 : 2) | iA2;
        } else {
            i12 = iA2;
        }
        int i14 = iA2 & 48;
        long j15 = this.f32986m;
        if (i14 == 0) {
            i12 |= bE2.n(j15) ? 32 : 16;
        }
        int i15 = iA2 & 384;
        float f14 = this.f32987n;
        if (i15 == 0) {
            i12 |= bE2.k(f14) ? 256 : 128;
        }
        int i16 = iA2 & 3072;
        androidx.compose.foundation.layout.T1 t13 = this.f32988o;
        if (i16 == 0) {
            i12 |= bE2.B(t13) ? 2048 : 1024;
        }
        int i17 = iA2 & 24576;
        androidx.compose.ui.graphics.h1 h1Var2 = this.f32989p;
        if (i17 == 0) {
            i12 |= bE2.B(h1Var2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        int i18 = 196608 & iA2;
        InterfaceC20639x2 interfaceC20639x22 = this.f32990q;
        if (i18 == 0) {
            i12 |= bE2.B(interfaceC20639x22) ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
        }
        int i19 = iA2 & 1572864;
        androidx.compose.ui.v vVar2 = this.f32991r;
        if (i19 == 0) {
            i12 |= bE2.B(vVar2) ? 1048576 : 524288;
        }
        int i22 = 12582912 & iA2;
        Y41.q<InterfaceC20572g2, androidx.compose.runtime.A, Integer, kotlin.G0> qVar2 = this.f32992s;
        if (i22 == 0) {
            i12 |= bE2.u(qVar2) ? 8388608 : 4194304;
        }
        if (bE2.p(1 & i12, (4793491 & i12) != 4793490)) {
            int i23 = i12 << 6;
            qVar = qVar2;
            interfaceC20639x2 = interfaceC20639x22;
            vVar = vVar2;
            t12 = t13;
            h1Var = h1Var2;
            f12 = f14;
            j12 = j15;
            j13 = j14;
            M9.a(vVar2, h1Var2, j14, j15, f14, androidx.compose.runtime.internal.r.c(213273114, new N(interfaceC20639x22, t13, qVar2), bE2), bE2, (i23 & 7168) | (i23 & 896) | ((i12 >> 18) & 14) | 1572864 | ((i12 >> 9) & 112) | ((i12 << 9) & 458752), 16);
        } else {
            qVar = qVar2;
            interfaceC20639x2 = interfaceC20639x22;
            vVar = vVar2;
            t12 = t13;
            h1Var = h1Var2;
            f12 = f14;
            j12 = j15;
            j13 = j14;
            bE2.f();
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new O(j13, j12, f12, t12, h1Var, interfaceC20639x2, vVar, qVar, iA2);
        }
        return kotlin.G0.f406611a;
    }
}
