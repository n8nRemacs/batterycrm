package androidx.compose.material3;

import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.v;
import kotlin.Metadata;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: AlertDialog.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.material3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21598h extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C22096n f36450l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v.a f36451m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f36452n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f36453o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f36454p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.graphics.h1 f36455q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f36456r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ float f36457s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f36458t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f36459u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f36460v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ long f36461w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21598h(C22096n c22096n, v.a aVar, Y41.p pVar, Y41.p pVar2, Y41.p pVar3, androidx.compose.ui.graphics.h1 h1Var, long j12, float f12, long j13, long j14, long j15, long j16, int i12) {
        super(2);
        this.f36450l = c22096n;
        this.f36451m = aVar;
        this.f36452n = pVar;
        this.f36453o = pVar2;
        this.f36454p = pVar3;
        this.f36455q = h1Var;
        this.f36456r = j12;
        this.f36457s = f12;
        this.f36458t = j13;
        this.f36459u = j14;
        this.f36460v = j15;
        this.f36461w = j16;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> pVar;
        Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> pVar2;
        Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> pVar3;
        v.a aVar;
        num.intValue();
        int iA2 = C22066f2.a(7);
        C22096n c22096n = this.f36450l;
        float f12 = C21666k.f36690a;
        androidx.compose.runtime.B bE2 = a12.E(1522575799);
        int i12 = iA2 | 48;
        Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> pVar4 = this.f36452n;
        int i13 = i12 | (bE2.u(pVar4) ? 256 : 128);
        Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> pVar5 = this.f36453o;
        int i14 = i13 | (bE2.u(pVar5) ? 2048 : 1024);
        Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> pVar6 = this.f36454p;
        int i15 = i14 | (bE2.u(pVar6) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        androidx.compose.ui.graphics.h1 h1Var = this.f36455q;
        int i16 = i15 | (bE2.B(h1Var) ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR);
        long j17 = this.f36456r;
        int i17 = i16 | (bE2.n(j17) ? 1048576 : 524288);
        float f13 = this.f36457s;
        int i18 = i17 | (bE2.k(f13) ? 8388608 : 4194304);
        long j18 = this.f36458t;
        int i19 = i18 | (bE2.n(j18) ? 67108864 : 33554432);
        long j19 = this.f36459u;
        int i22 = i19 | (bE2.n(j19) ? 536870912 : 268435456);
        long j22 = this.f36460v;
        char c12 = bE2.n(j22) ? (char) 4 : (char) 2;
        long j23 = this.f36461w;
        int i23 = c12 | (bE2.n(j23) ? ' ' : (char) 16);
        if ((i22 & 306783379) == 306783378 && (i23 & 19) == 18 && bE2.c()) {
            bE2.f();
            j13 = j19;
            j14 = j18;
            j15 = j17;
            j16 = j23;
            pVar = pVar5;
            pVar2 = pVar6;
            pVar3 = pVar4;
            j12 = j22;
            aVar = this.f36451m;
        } else {
            v.a aVar2 = androidx.compose.ui.v.f42878y1;
            j12 = j22;
            j13 = j19;
            j14 = j18;
            j15 = j17;
            j16 = j23;
            pVar = pVar5;
            pVar2 = pVar6;
            pVar3 = pVar4;
            int i24 = i22 >> 12;
            Qg.a(aVar2, h1Var, j15, 0L, f13, 0.0f, null, androidx.compose.runtime.internal.r.b(bE2, -2126308228, new C21575g(pVar4, pVar5, pVar6, j13, j12, j23, j14, c22096n)), bE2, (i24 & 896) | (i24 & 112) | 12582918 | ((i22 >> 9) & 57344), 104);
            aVar = aVar2;
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C21598h(c22096n, aVar, pVar3, pVar, pVar2, h1Var, j15, f13, j14, j13, j12, j16, iA2);
        }
        return kotlin.G0.f406611a;
    }
}
