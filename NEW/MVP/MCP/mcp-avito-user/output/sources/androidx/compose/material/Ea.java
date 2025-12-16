package androidx.compose.material;

import androidx.compose.foundation.C20835r0;
import androidx.compose.foundation.C20839s1;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20608p2;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.v;
import kotlin.Metadata;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: Switch.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class Ea extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C20644z f32596l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f32597m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f32598n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC21344sa f32599o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.a<Float> f32600p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.interaction.m f32601q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f32602r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ea(C20644z c20644z, boolean z12, boolean z13, InterfaceC21344sa interfaceC21344sa, Y41.a aVar, androidx.compose.foundation.interaction.m mVar, int i12) {
        super(2);
        this.f32596l = c20644z;
        this.f32597m = z12;
        this.f32598n = z13;
        this.f32599o = interfaceC21344sa;
        this.f32600p = aVar;
        this.f32601q = mVar;
        this.f32602r = i12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        int i12;
        int i13;
        InterfaceC21344sa interfaceC21344sa;
        androidx.compose.foundation.interaction.m mVar;
        androidx.compose.foundation.interaction.m mVar2;
        Y41.a<Float> aVar;
        Object obj;
        v.a aVar2;
        int i14;
        long jA2;
        num.intValue();
        int iA2 = C22066f2.a(this.f32602r | 1);
        float f12 = Fa.f32641a;
        androidx.compose.runtime.B bE2 = a12.E(70908914);
        int i15 = iA2 & 6;
        C20644z c20644z = this.f32596l;
        if (i15 == 0) {
            i12 = (bE2.B(c20644z) ? 4 : 2) | iA2;
        } else {
            i12 = iA2;
        }
        int i16 = iA2 & 48;
        boolean z12 = this.f32597m;
        if (i16 == 0) {
            i12 |= bE2.j(z12) ? 32 : 16;
        }
        int i17 = iA2 & 384;
        boolean z13 = this.f32598n;
        if (i17 == 0) {
            i12 |= bE2.j(z13) ? 256 : 128;
        }
        int i18 = iA2 & 3072;
        InterfaceC21344sa interfaceC21344sa2 = this.f32599o;
        if (i18 == 0) {
            i12 |= bE2.B(interfaceC21344sa2) ? 2048 : 1024;
        }
        int i19 = iA2 & 24576;
        Y41.a<Float> aVar3 = this.f32600p;
        if (i19 == 0) {
            i12 |= bE2.u(aVar3) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        int i22 = 196608 & iA2;
        androidx.compose.foundation.interaction.m mVar3 = this.f32601q;
        if (i22 == 0) {
            i12 |= bE2.B(mVar3) ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
        }
        if (bE2.p(i12 & 1, (74899 & i12) != 74898)) {
            Object objT = bE2.t();
            androidx.compose.runtime.A.f37866a.getClass();
            Object obj2 = A.a.f37868b;
            if (objT == obj2) {
                objT = new androidx.compose.runtime.snapshots.D();
                bE2.H(objT);
            }
            androidx.compose.runtime.snapshots.D d12 = (androidx.compose.runtime.snapshots.D) objT;
            boolean z14 = (i12 & 458752) == 131072;
            Object objT2 = bE2.t();
            if (z14 || objT2 == obj2) {
                objT2 = new Ba(mVar3, d12, null);
                bE2.H(objT2);
            }
            C22187u0.d((Y41.p) objT2, bE2, mVar3);
            float f13 = !d12.isEmpty() ? Fa.f32646f : Fa.f32645e;
            InterfaceC22204y1 interfaceC22204y1A = interfaceC21344sa2.a(z13, z12, bE2);
            v.a aVar4 = androidx.compose.ui.v.f42878y1;
            InterfaceC22215f.f39074a.getClass();
            androidx.compose.ui.v vVarD0 = c20644z.d(aVar4, InterfaceC22215f.a.f39080f).d0(C20588k2.f28682c);
            boolean zB2 = bE2.B(interfaceC22204y1A);
            Object objT3 = bE2.t();
            if (zB2 || objT3 == obj2) {
                objT3 = new Ca(interfaceC22204y1A);
                bE2.H(objT3);
            }
            C20835r0.a(0, (Y41.l) objT3, bE2, vVarD0);
            InterfaceC22204y1 interfaceC22204y1B = interfaceC21344sa2.b(z13, z12, bE2);
            InterfaceC21128c4 interfaceC21128c4 = (InterfaceC21128c4) bE2.o(C21141d4.f33519a);
            float f14 = ((androidx.compose.ui.unit.h) bE2.o(C21141d4.f33520b)).f42852b + f13;
            long j12 = ((androidx.compose.ui.graphics.T) interfaceC22204y1B.getF42167b()).f39331a;
            C21365u5.f34242a.getClass();
            i13 = iA2;
            if (!androidx.compose.ui.graphics.T.d(j12, C21365u5.a(bE2).f()) || interfaceC21128c4 == null) {
                mVar2 = mVar3;
                aVar = aVar3;
                obj = obj2;
                aVar2 = aVar4;
                interfaceC21344sa = interfaceC21344sa2;
                i14 = Http2.INITIAL_MAX_FRAME_SIZE;
                bE2.C(1478584670);
                bE2.X(false);
                jA2 = ((androidx.compose.ui.graphics.T) interfaceC22204y1B.getF42167b()).f39331a;
            } else {
                bE2.C(1478495731);
                long j13 = ((androidx.compose.ui.graphics.T) interfaceC22204y1B.getF42167b()).f39331a;
                obj = obj2;
                aVar2 = aVar4;
                mVar2 = mVar3;
                interfaceC21344sa = interfaceC21344sa2;
                i14 = Http2.INITIAL_MAX_FRAME_SIZE;
                aVar = aVar3;
                jA2 = interfaceC21128c4.a(j13, f14, bE2, 0);
                bE2.X(false);
            }
            androidx.compose.runtime.I3 i3B = androidx.compose.animation.l2.b(jA2, null, bE2, 0, 14);
            androidx.compose.ui.v vVarD = c20644z.d(aVar2, InterfaceC22215f.a.f39079e);
            boolean z15 = (i12 & 57344) == i14;
            Object objT4 = bE2.t();
            if (z15 || objT4 == obj) {
                aVar3 = aVar;
                objT4 = new Da(aVar3);
                bE2.H(objT4);
            } else {
                aVar3 = aVar;
            }
            mVar = mVar2;
            androidx.compose.ui.v vVarK = C20588k2.k(C20839s1.a(androidx.compose.foundation.layout.M1.a(vVarD, (Y41.l) objT4), mVar, B7.a(Fa.f32644d, 4, 0L, false)), Fa.f32643c);
            androidx.compose.foundation.shape.n nVar = androidx.compose.foundation.shape.o.f30153a;
            C20608p2.a(bE2, androidx.compose.foundation.A.b(androidx.compose.ui.draw.y.a(vVarK, f13, nVar, false, 24), ((androidx.compose.ui.graphics.T) i3B.getF42167b()).f39331a, nVar));
        } else {
            i13 = iA2;
            interfaceC21344sa = interfaceC21344sa2;
            mVar = mVar3;
            bE2.f();
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new Ea(c20644z, z12, z13, interfaceC21344sa, aVar3, mVar, i13);
        }
        return kotlin.G0.f406611a;
    }
}
