package androidx.compose.material3;

import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import kotlin.Metadata;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: Slider.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.material3.jf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21659jf extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C21589gd f36644l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f36645m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f36646n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Te f36647o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.interaction.m f36648p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.interaction.m f36649q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C22096n f36650r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C22096n f36651s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C22096n f36652t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f36653u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21659jf(C21589gd c21589gd, androidx.compose.ui.v vVar, boolean z12, Te te2, androidx.compose.foundation.interaction.m mVar, androidx.compose.foundation.interaction.m mVar2, C22096n c22096n, C22096n c22096n2, C22096n c22096n3, int i12) {
        super(2);
        this.f36644l = c21589gd;
        this.f36645m = vVar;
        this.f36646n = z12;
        this.f36647o = te2;
        this.f36648p = mVar;
        this.f36649q = mVar2;
        this.f36650r = c22096n;
        this.f36651s = c22096n2;
        this.f36652t = c22096n3;
        this.f36653u = i12;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        int i12;
        androidx.compose.foundation.interaction.m mVar;
        androidx.compose.foundation.interaction.m mVar2;
        boolean z12;
        androidx.compose.ui.v vVar;
        C22096n c22096n;
        Te te2;
        num.intValue();
        int iA2 = C22066f2.a(this.f36653u | 1);
        C22096n c22096n2 = this.f36651s;
        C22096n c22096n3 = this.f36652t;
        C21589gd c21589gd = this.f36644l;
        C22096n c22096n4 = this.f36650r;
        float f12 = Tf.f35500b;
        androidx.compose.runtime.B bE2 = a12.E(511405654);
        if ((iA2 & 6) == 0) {
            i12 = (bE2.B(c21589gd) ? 4 : 2) | iA2;
        } else {
            i12 = iA2;
        }
        int i13 = iA2 & 48;
        androidx.compose.ui.v vVar2 = this.f36645m;
        if (i13 == 0) {
            i12 |= bE2.B(vVar2) ? 32 : 16;
        }
        int i14 = iA2 & 384;
        boolean z13 = this.f36646n;
        if (i14 == 0) {
            i12 |= bE2.j(z13) ? 256 : 128;
        }
        if ((iA2 & 3072) == 0) {
            i12 |= 1024;
        }
        int i15 = iA2 & 24576;
        androidx.compose.foundation.interaction.m mVar3 = this.f36648p;
        if (i15 == 0) {
            i12 |= bE2.B(mVar3) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        int i16 = 196608 & iA2;
        androidx.compose.foundation.interaction.m mVar4 = this.f36649q;
        if (i16 == 0) {
            i12 |= bE2.B(mVar4) ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
        }
        if ((1572864 & iA2) == 0) {
            i12 |= bE2.u(c22096n4) ? 1048576 : 524288;
        }
        if ((12582912 & iA2) == 0) {
            i12 |= bE2.u(c22096n2) ? 8388608 : 4194304;
        }
        if ((100663296 & iA2) == 0) {
            i12 |= bE2.u(c22096n3) ? 67108864 : 33554432;
        }
        int i17 = 38347923 & i12;
        Te teE = this.f36647o;
        if (i17 == 38347922 && bE2.c()) {
            bE2.f();
            mVar = mVar4;
            mVar2 = mVar3;
            z12 = z13;
            vVar = vVar2;
            c22096n = c22096n4;
            te2 = teE;
        } else {
            bE2.y0();
            if ((iA2 & 1) == 0 || bE2.g0()) {
                C21522df.f36227a.getClass();
                teE = C21522df.e(bE2);
            } else {
                bE2.f();
            }
            int i18 = i12 & (-7169);
            Te te3 = teE;
            bE2.Y();
            if (c21589gd.f36428a < 0) {
                throw new IllegalArgumentException("steps should be >= 0");
            }
            int i19 = i18 >> 3;
            mVar = mVar4;
            mVar2 = mVar3;
            z12 = z13;
            vVar = vVar2;
            c22096n = c22096n4;
            Tf.a(vVar2, c21589gd, z13, mVar3, mVar4, c22096n4, c22096n2, c22096n3, bE2, (i18 & 896) | (i19 & 14) | ((i18 << 3) & 112) | (i19 & 7168) | (57344 & i19) | (458752 & i19) | (3670016 & i19) | (i19 & 29360128));
            te2 = te3;
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C21659jf(c21589gd, vVar, z12, te2, mVar2, mVar, c22096n, c22096n2, c22096n3, iA2);
        }
        return kotlin.G0.f406611a;
    }
}
