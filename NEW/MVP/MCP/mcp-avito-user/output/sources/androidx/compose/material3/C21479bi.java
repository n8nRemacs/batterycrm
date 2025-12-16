package androidx.compose.material3;

import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import java.util.List;
import kotlin.Metadata;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: TabRow.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.material3.bi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21479bi extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f36108l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.q<List<Jh>, androidx.compose.runtime.A, Integer, kotlin.G0> f36109m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f36110n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f36111o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f36112p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ float f36113q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f36114r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f36115s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.d2 f36116t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f36117u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21479bi(int i12, Y41.q qVar, androidx.compose.ui.v vVar, long j12, long j13, float f12, Y41.p pVar, Y41.p pVar2, androidx.compose.foundation.d2 d2Var, int i13) {
        super(2);
        this.f36108l = i12;
        this.f36109m = qVar;
        this.f36110n = vVar;
        this.f36111o = j12;
        this.f36112p = j13;
        this.f36113q = f12;
        this.f36114r = pVar;
        this.f36115s = pVar2;
        this.f36116t = d2Var;
        this.f36117u = i13;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        int i12;
        androidx.compose.foundation.d2 d2Var;
        Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> pVar;
        Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> pVar2;
        float f12;
        long j12;
        num.intValue();
        int iA2 = C22066f2.a(this.f36117u | 1);
        float f13 = C21891ti.f37349a;
        androidx.compose.runtime.B bE2 = a12.E(-1696166011);
        int i13 = iA2 & 6;
        int i14 = this.f36108l;
        if (i13 == 0) {
            i12 = (bE2.m(i14) ? 4 : 2) | iA2;
        } else {
            i12 = iA2;
        }
        int i15 = iA2 & 48;
        Y41.q<List<Jh>, androidx.compose.runtime.A, Integer, kotlin.G0> qVar = this.f36109m;
        if (i15 == 0) {
            i12 |= bE2.u(qVar) ? 32 : 16;
        }
        int i16 = iA2 & 384;
        androidx.compose.ui.v vVar = this.f36110n;
        if (i16 == 0) {
            i12 |= bE2.B(vVar) ? 256 : 128;
        }
        int i17 = iA2 & 3072;
        long j13 = this.f36111o;
        if (i17 == 0) {
            i12 |= bE2.n(j13) ? 2048 : 1024;
        }
        int i18 = iA2 & 24576;
        long j14 = this.f36112p;
        if (i18 == 0) {
            i12 |= bE2.n(j14) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        int i19 = 196608 & iA2;
        float f14 = this.f36113q;
        if (i19 == 0) {
            i12 |= bE2.k(f14) ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
        }
        int i22 = 1572864 & iA2;
        Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> pVar3 = this.f36114r;
        if (i22 == 0) {
            i12 |= bE2.u(pVar3) ? 1048576 : 524288;
        }
        int i23 = iA2 & 12582912;
        Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> pVar4 = this.f36115s;
        if (i23 == 0) {
            i12 |= bE2.u(pVar4) ? 8388608 : 4194304;
        }
        int i24 = 100663296 & iA2;
        androidx.compose.foundation.d2 d2Var2 = this.f36116t;
        if (i24 == 0) {
            i12 |= bE2.B(d2Var2) ? 67108864 : 33554432;
        }
        if ((38347923 & i12) == 38347922 && bE2.c()) {
            bE2.f();
            d2Var = d2Var2;
            pVar = pVar4;
            pVar2 = pVar3;
            f12 = f14;
            j12 = j14;
        } else {
            bE2.y0();
            if ((iA2 & 1) != 0 && !bE2.g0()) {
                bE2.f();
            }
            bE2.Y();
            d2Var = d2Var2;
            pVar = pVar4;
            pVar2 = pVar3;
            f12 = f14;
            j12 = j14;
            int i25 = ((i12 >> 6) & 14) | 12582912;
            int i26 = i12 >> 3;
            Qg.a(vVar, null, j13, j12, 0.0f, 0.0f, null, androidx.compose.runtime.internal.r.b(bE2, -1178901494, new C21456ai(d2Var2, f14, pVar, pVar2, qVar, i14)), bE2, i25 | (i26 & 896) | (i26 & 7168), 114);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C21479bi(i14, qVar, vVar, j13, j12, f12, pVar2, pVar, d2Var, iA2);
        }
        return kotlin.G0.f406611a;
    }
}
