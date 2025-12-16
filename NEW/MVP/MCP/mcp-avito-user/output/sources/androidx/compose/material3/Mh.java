package androidx.compose.material3;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20608p2;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import kotlin.Metadata;

/* compiled from: TabRow.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class Mh extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Qh f35148l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f35149m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f35150n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f35151o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f35152p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.shape.n f35153q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f35154r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Mh(Qh qh2, androidx.compose.ui.v vVar, float f12, float f13, long j12, androidx.compose.foundation.shape.n nVar, int i12) {
        super(2);
        this.f35148l = qh2;
        this.f35149m = vVar;
        this.f35150n = f12;
        this.f35151o = f13;
        this.f35152p = j12;
        this.f35153q = nVar;
        this.f35154r = i12;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f35154r | 1);
        Qh qh2 = this.f35148l;
        qh2.getClass();
        androidx.compose.runtime.B bE2 = a12.E(-1895596205);
        androidx.compose.ui.v vVar = this.f35149m;
        int i12 = (bE2.B(vVar) ? 4 : 2) | iA2;
        int i13 = iA2 & 48;
        float f12 = this.f35150n;
        if (i13 == 0) {
            i12 |= bE2.k(f12) ? 32 : 16;
        }
        int i14 = (i12 | 25984) & 9363;
        long jD2 = this.f35152p;
        androidx.compose.foundation.shape.n nVar = this.f35153q;
        float f13 = this.f35151o;
        if (i14 == 9362 && bE2.c()) {
            bE2.f();
        } else {
            bE2.y0();
            if ((iA2 & 1) == 0 || bE2.g0()) {
                d0.T.f393315a.getClass();
                f13 = d0.T.f393317c;
                jD2 = C21964x3.d(d0.T.f393316b, bE2);
                nVar = d0.T.f393318d;
            } else {
                bE2.f();
            }
            bE2.Y();
            C20608p2.a(bE2, androidx.compose.foundation.A.b(C20588k2.n(C20588k2.i(vVar, f13), f12), jD2, nVar));
        }
        float f14 = f13;
        androidx.compose.foundation.shape.n nVar2 = nVar;
        long j12 = jD2;
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new Mh(qh2, vVar, f12, f14, j12, nVar2, iA2);
        }
        return kotlin.G0.f406611a;
    }
}
