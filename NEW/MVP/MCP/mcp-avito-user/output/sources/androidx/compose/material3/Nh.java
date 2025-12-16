package androidx.compose.material3;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import kotlin.Metadata;

/* compiled from: TabRow.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class Nh extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Qh f35208l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f35209m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f35210n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f35211o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Nh(Qh qh2, androidx.compose.ui.v vVar, float f12, long j12, int i12) {
        super(2);
        this.f35208l = qh2;
        this.f35209m = vVar;
        this.f35210n = f12;
        this.f35211o = j12;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(3073);
        Qh qh2 = this.f35208l;
        qh2.getClass();
        androidx.compose.runtime.B bE2 = a12.E(-1498258020);
        androidx.compose.ui.v vVar = this.f35209m;
        int i12 = ((bE2.B(vVar) ? 4 : 2) | iA2 | 176) & 147;
        float f12 = this.f35210n;
        long jD2 = this.f35211o;
        if (i12 == 146 && bE2.c()) {
            bE2.f();
        } else {
            bE2.y0();
            if ((iA2 & 1) == 0 || bE2.g0()) {
                d0.T.f393315a.getClass();
                f12 = d0.T.f393317c;
                jD2 = C21964x3.d(d0.T.f393316b, bE2);
            } else {
                bE2.f();
            }
            bE2.Y();
            C20632w.a(androidx.compose.foundation.A.b(C20588k2.f(C20588k2.d(vVar, 1.0f), f12), jD2, androidx.compose.ui.graphics.Y0.f39346a), bE2, 0);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new Nh(qh2, vVar, f12, jD2, iA2);
        }
        return kotlin.G0.f406611a;
    }
}
