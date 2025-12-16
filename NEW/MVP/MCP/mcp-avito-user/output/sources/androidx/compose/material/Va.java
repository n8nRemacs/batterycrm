package androidx.compose.material;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import kotlin.Metadata;

/* compiled from: TabRow.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class Va extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Za f33284l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f33285m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f33286n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f33287o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Va(Za za2, androidx.compose.ui.v vVar, float f12, long j12, int i12) {
        super(2);
        this.f33284l = za2;
        this.f33285m = vVar;
        this.f33286n = f12;
        this.f33287o = j12;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(3073);
        Za za2 = this.f33284l;
        za2.getClass();
        androidx.compose.runtime.B bE2 = a12.E(1499002201);
        androidx.compose.ui.v vVar = this.f33285m;
        int i12 = (bE2.B(vVar) ? 4 : 2) | iA2 | 144;
        boolean zP2 = bE2.p(i12 & 1, (i12 & 1171) != 1170);
        float f12 = this.f33286n;
        long j12 = this.f33287o;
        if (zP2) {
            bE2.y0();
            if ((iA2 & 1) == 0 || bE2.g0()) {
                j12 = ((androidx.compose.ui.graphics.T) bE2.o(A2.f32335a)).f39331a;
                f12 = Za.f33393c;
            } else {
                bE2.f();
            }
            bE2.Y();
            C20632w.a(androidx.compose.foundation.A.b(C20588k2.f(C20588k2.d(vVar, 1.0f), f12), j12, androidx.compose.ui.graphics.Y0.f39346a), bE2, 0);
        } else {
            bE2.f();
        }
        long j13 = j12;
        float f13 = f12;
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new Va(za2, vVar, f13, j13, iA2);
        }
        return kotlin.G0.f406611a;
    }
}
