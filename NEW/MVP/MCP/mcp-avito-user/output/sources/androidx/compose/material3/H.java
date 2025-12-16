package androidx.compose.material3;

import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.window.C22724k;
import kotlin.Metadata;

/* compiled from: AndroidAlertDialog.android.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class H extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.a<kotlin.G0> f34807l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f34808m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.window.H f34809n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C22096n f34810o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f34811p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(Y41.a aVar, androidx.compose.ui.v vVar, androidx.compose.ui.window.H h12, C22096n c22096n, int i12) {
        super(2);
        this.f34807l = aVar;
        this.f34808m = vVar;
        this.f34809n = h12;
        this.f34810o = c22096n;
        this.f34811p = i12;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        int i12;
        num.intValue();
        int iA2 = C22066f2.a(this.f34811p | 1);
        C22096n c22096n = this.f34810o;
        int i13 = I.f34861a;
        androidx.compose.runtime.B bE2 = a12.E(-543157267);
        int i14 = iA2 & 6;
        Y41.a<kotlin.G0> aVar = this.f34807l;
        if (i14 == 0) {
            i12 = (bE2.u(aVar) ? 4 : 2) | iA2;
        } else {
            i12 = iA2;
        }
        int i15 = iA2 & 48;
        androidx.compose.ui.v vVar = this.f34808m;
        if (i15 == 0) {
            i12 |= bE2.B(vVar) ? 32 : 16;
        }
        int i16 = iA2 & 384;
        androidx.compose.ui.window.H h12 = this.f34809n;
        if (i16 == 0) {
            i12 |= bE2.B(h12) ? 256 : 128;
        }
        if ((iA2 & 3072) == 0) {
            i12 |= bE2.u(c22096n) ? 2048 : 1024;
        }
        if ((i12 & 1171) == 1170 && bE2.c()) {
            bE2.f();
        } else {
            C22724k.a(aVar, h12, androidx.compose.runtime.internal.r.b(bE2, -777289724, new G(vVar, c22096n)), bE2, ((i12 >> 3) & 112) | (i12 & 14) | 384);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new H(aVar, vVar, h12, c22096n, iA2);
        }
        return kotlin.G0.f406611a;
    }
}
