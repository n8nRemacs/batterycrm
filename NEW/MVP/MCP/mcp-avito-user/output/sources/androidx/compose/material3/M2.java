package androidx.compose.material3;

import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import d0.C39455d;
import kotlin.Metadata;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: Checkbox.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class M2 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ToggleableState f35097l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<kotlin.G0> f35098m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f35099n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f35100o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ H2 f35101p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.interaction.m f35102q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f35103r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M2(ToggleableState toggleableState, Y41.a aVar, androidx.compose.ui.v vVar, boolean z12, H2 h22, androidx.compose.foundation.interaction.m mVar, int i12) {
        super(2);
        this.f35097l = toggleableState;
        this.f35098m = aVar;
        this.f35099n = vVar;
        this.f35100o = z12;
        this.f35101p = h22;
        this.f35102q = mVar;
        this.f35103r = i12;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        int i12;
        H2 h22;
        boolean z12;
        androidx.compose.ui.v vVar;
        Y41.a<kotlin.G0> aVar;
        androidx.compose.foundation.interaction.m mVar;
        androidx.compose.ui.v vVarC;
        androidx.compose.ui.v vVar2;
        num.intValue();
        int iA2 = C22066f2.a(this.f35103r | 1);
        ToggleableState toggleableState = this.f35097l;
        float f12 = L2.f35025a;
        androidx.compose.runtime.B bE2 = a12.E(-1608358065);
        if ((iA2 & 6) == 0) {
            i12 = (bE2.B(toggleableState) ? 4 : 2) | iA2;
        } else {
            i12 = iA2;
        }
        int i13 = iA2 & 48;
        Y41.a<kotlin.G0> aVar2 = this.f35098m;
        if (i13 == 0) {
            i12 |= bE2.u(aVar2) ? 32 : 16;
        }
        int i14 = iA2 & 384;
        androidx.compose.ui.v vVar3 = this.f35099n;
        if (i14 == 0) {
            i12 |= bE2.B(vVar3) ? 256 : 128;
        }
        int i15 = iA2 & 3072;
        boolean z13 = this.f35100o;
        if (i15 == 0) {
            i12 |= bE2.j(z13) ? 2048 : 1024;
        }
        int i16 = iA2 & 24576;
        H2 h23 = this.f35101p;
        if (i16 == 0) {
            i12 |= bE2.B(h23) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        int i17 = 196608 & iA2;
        androidx.compose.foundation.interaction.m mVar2 = this.f35102q;
        if (i17 == 0) {
            i12 |= bE2.B(mVar2) ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
        }
        int i18 = i12;
        if ((i18 & 74899) == 74898 && bE2.c()) {
            bE2.f();
            h22 = h23;
            z12 = z13;
            vVar = vVar3;
            aVar = aVar2;
            mVar = mVar2;
        } else {
            bE2.y0();
            if ((iA2 & 1) != 0 && !bE2.g0()) {
                bE2.f();
            }
            bE2.Y();
            bE2.I(1797978252);
            if (aVar2 != null) {
                v.a aVar3 = androidx.compose.ui.v.f42878y1;
                androidx.compose.ui.semantics.i.f41744b.getClass();
                int i19 = androidx.compose.ui.semantics.i.f41745c;
                C39455d.f393367a.getClass();
                float f13 = C39455d.f393368b / 2;
                h.a aVar4 = androidx.compose.ui.unit.h.f42849c;
                mVar = mVar2;
                h22 = h23;
                z12 = z13;
                vVar = vVar3;
                aVar = aVar2;
                vVarC = androidx.compose.foundation.selection.g.c(aVar3, toggleableState, mVar, androidx.compose.material.ripple.w.a(false, f13, 0L, bE2, 54, 4), z13, androidx.compose.ui.semantics.i.a(i19), aVar2);
            } else {
                h22 = h23;
                z12 = z13;
                vVar = vVar3;
                aVar = aVar2;
                mVar = mVar2;
                vVarC = androidx.compose.ui.v.f42878y1;
            }
            bE2.X(false);
            if (aVar != null) {
                v.a aVar5 = androidx.compose.ui.v.f42878y1;
                androidx.compose.runtime.J3 j32 = G8.f34785a;
                vVar2 = MinimumInteractiveModifier.f35155b;
                aVar5.getClass();
            } else {
                vVar2 = androidx.compose.ui.v.f42878y1;
            }
            L2.a(z12, toggleableState, androidx.compose.foundation.layout.R1.i(vVar.d0(vVar2).d0(vVarC), L2.f35025a), h22, bE2, ((i18 >> 9) & 14) | ((i18 << 3) & 112) | ((i18 >> 3) & 7168));
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new M2(toggleableState, aVar, vVar, z12, h22, mVar, iA2);
        }
        return kotlin.G0.f406611a;
    }
}
