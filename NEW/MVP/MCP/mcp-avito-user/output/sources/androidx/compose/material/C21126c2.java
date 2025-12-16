package androidx.compose.material;

import androidx.compose.foundation.InterfaceC21084v1;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.v;
import kotlin.Metadata;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: Checkbox.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.material.c2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21126c2 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ToggleableState f33486l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<kotlin.G0> f33487m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f33488n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f33489o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.interaction.m f33490p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ X1 f33491q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f33492r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21126c2(ToggleableState toggleableState, Y41.a aVar, androidx.compose.ui.v vVar, boolean z12, androidx.compose.foundation.interaction.m mVar, X1 x12, int i12) {
        super(2);
        this.f33486l = toggleableState;
        this.f33487m = aVar;
        this.f33488n = vVar;
        this.f33489o = z12;
        this.f33490p = mVar;
        this.f33491q = x12;
        this.f33492r = i12;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        int i12;
        X1 x12;
        androidx.compose.ui.v vVarC;
        androidx.compose.ui.v vVar;
        num.intValue();
        int iA2 = C22066f2.a(this.f33492r | 1);
        ToggleableState toggleableState = this.f33486l;
        float f12 = C21113b2.f33446a;
        androidx.compose.runtime.B bE2 = a12.E(2031255194);
        if ((iA2 & 6) == 0) {
            i12 = (bE2.B(toggleableState) ? 4 : 2) | iA2;
        } else {
            i12 = iA2;
        }
        int i13 = iA2 & 48;
        Y41.a<kotlin.G0> aVar = this.f33487m;
        if (i13 == 0) {
            i12 |= bE2.u(aVar) ? 32 : 16;
        }
        int i14 = iA2 & 384;
        androidx.compose.ui.v vVar2 = this.f33488n;
        if (i14 == 0) {
            i12 |= bE2.B(vVar2) ? 256 : 128;
        }
        int i15 = iA2 & 3072;
        boolean z12 = this.f33489o;
        if (i15 == 0) {
            i12 |= bE2.j(z12) ? 2048 : 1024;
        }
        int i16 = iA2 & 24576;
        androidx.compose.foundation.interaction.m mVar = this.f33490p;
        if (i16 == 0) {
            i12 |= bE2.B(mVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        int i17 = 196608 & iA2;
        X1 x13 = this.f33491q;
        if (i17 == 0) {
            i12 |= bE2.B(x13) ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
        }
        int i18 = i12;
        if (bE2.p(i18 & 1, (i18 & 74899) != 74898)) {
            bE2.y0();
            if ((1 & iA2) != 0 && !bE2.g0()) {
                bE2.f();
            }
            bE2.Y();
            if (aVar != null) {
                v.a aVar2 = androidx.compose.ui.v.f42878y1;
                androidx.compose.ui.semantics.i.f41744b.getClass();
                int i19 = androidx.compose.ui.semantics.i.f41745c;
                InterfaceC21084v1 interfaceC21084v1A = B7.a(C21113b2.f33446a, 4, 0L, false);
                androidx.compose.ui.semantics.i iVarA = androidx.compose.ui.semantics.i.a(i19);
                x12 = x13;
                vVarC = androidx.compose.foundation.selection.g.c(aVar2, toggleableState, mVar, interfaceC21084v1A, z12, iVarA, aVar);
            } else {
                x12 = x13;
                vVarC = androidx.compose.ui.v.f42878y1;
            }
            if (aVar != null) {
                v.a aVar3 = androidx.compose.ui.v.f42878y1;
                androidx.compose.runtime.J3 j32 = C21142d5.f33523a;
                vVar = MinimumInteractiveModifier.f32952b;
                aVar3.getClass();
            } else {
                vVar = androidx.compose.ui.v.f42878y1;
            }
            C21113b2.a(z12, toggleableState, androidx.compose.foundation.layout.R1.i(vVar2.d0(vVar).d0(vVarC), C21113b2.f33447b), x12, bE2, ((i18 >> 9) & 14) | ((i18 << 3) & 112) | ((i18 >> 6) & 7168));
        } else {
            x12 = x13;
            bE2.f();
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C21126c2(toggleableState, aVar, vVar2, z12, mVar, x12, iA2);
        }
        return kotlin.G0.f406611a;
    }
}
