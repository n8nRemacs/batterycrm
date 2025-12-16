package androidx.compose.material;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22190v;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import java.util.List;
import kotlin.Metadata;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: Slider.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class F8 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f32625l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f32626m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ List<Float> f32627n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC21184g8 f32628o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f32629p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.interaction.m f32630q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f32631r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f32632s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F8(boolean z12, float f12, List<Float> list, InterfaceC21184g8 interfaceC21184g8, float f13, androidx.compose.foundation.interaction.m mVar, androidx.compose.ui.v vVar, int i12) {
        super(2);
        this.f32625l = z12;
        this.f32626m = f12;
        this.f32627n = list;
        this.f32628o = interfaceC21184g8;
        this.f32629p = f13;
        this.f32630q = mVar;
        this.f32631r = vVar;
        this.f32632s = i12;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        int i12;
        int i13;
        androidx.compose.ui.v vVar;
        num.intValue();
        int iA2 = C22066f2.a(this.f32632s | 1);
        float f12 = I8.f32762a;
        androidx.compose.runtime.B bE2 = a12.E(1679682785);
        int i14 = iA2 & 6;
        boolean z12 = this.f32625l;
        if (i14 == 0) {
            i12 = (bE2.j(z12) ? 4 : 2) | iA2;
        } else {
            i12 = iA2;
        }
        int i15 = iA2 & 48;
        float f13 = this.f32626m;
        if (i15 == 0) {
            i12 |= bE2.k(f13) ? 32 : 16;
        }
        int i16 = iA2 & 384;
        List<Float> list = this.f32627n;
        if (i16 == 0) {
            i12 |= bE2.u(list) ? 256 : 128;
        }
        int i17 = iA2 & 3072;
        InterfaceC21184g8 interfaceC21184g8 = this.f32628o;
        if (i17 == 0) {
            i12 |= bE2.B(interfaceC21184g8) ? 2048 : 1024;
        }
        int i18 = iA2 & 24576;
        float f14 = this.f32629p;
        if (i18 == 0) {
            i12 |= bE2.k(f14) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        int i19 = 196608 & iA2;
        androidx.compose.foundation.interaction.m mVar = this.f32630q;
        if (i19 == 0) {
            i12 |= bE2.B(mVar) ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
        }
        int i22 = 1572864 & iA2;
        androidx.compose.ui.v vVar2 = this.f32631r;
        if (i22 == 0) {
            i12 |= bE2.B(vVar2) ? 1048576 : 524288;
        }
        if (bE2.p(i12 & 1, (599187 & i12) != 599186)) {
            androidx.compose.ui.v vVarD0 = vVar2.d0(I8.f32767f);
            InterfaceC22215f.f39074a.getClass();
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
            int i23 = bE2.f37888Q;
            androidx.compose.runtime.O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarD0);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar = InterfaceC22413h.a.f40791b;
            if (bE2.f37890b == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar);
            } else {
                bE2.d();
            }
            androidx.compose.runtime.R3.b(InterfaceC22413h.a.f40796g, bE2, interfaceC22365i0D);
            androidx.compose.runtime.R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, kotlin.G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i23))) {
                AK.c.y(i23, bE2, i23, pVar);
            }
            androidx.compose.runtime.R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            C20644z c20644z = C20644z.f28804a;
            androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) bE2.o(androidx.compose.ui.platform.Q0.f41199h);
            float fM02 = dVar.M0(I8.f32766e);
            float f15 = I8.f32762a;
            float fM03 = dVar.M0(f15);
            float fK2 = dVar.K(f14);
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
            v.a aVar3 = androidx.compose.ui.v.f42878y1;
            FillElement fillElement = C20588k2.f28682c;
            aVar3.getClass();
            int i24 = i12 >> 6;
            int i25 = i12 << 9;
            i13 = iA2;
            vVar = vVar2;
            I8.b(fillElement, interfaceC21184g8, z12, 0.0f, f13, list, fM03, fM02, bE2, ((i12 << 6) & 896) | (i24 & 112) | 3078 | (i25 & 57344) | (i25 & 458752));
            I8.a(c20644z, aVar3, fK2 * f13, mVar, interfaceC21184g8, z12, f15 * 2, bE2, (i24 & 7168) | 1572918 | ((i12 << 3) & 57344) | ((i12 << 15) & 458752));
            bE2.X(true);
        } else {
            i13 = iA2;
            vVar = vVar2;
            bE2.f();
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new F8(z12, f13, list, interfaceC21184g8, f14, mVar, vVar, i13);
        }
        return kotlin.G0.f406611a;
    }
}
