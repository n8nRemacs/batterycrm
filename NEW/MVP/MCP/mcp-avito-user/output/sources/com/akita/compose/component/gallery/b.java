package com.akita.compose.component.gallery;

import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.layout.InterfaceC22374n;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: GalleryImage.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"gallery_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final a f61591a = new a();

    /* compiled from: GalleryImage.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/akita/compose/component/gallery/b$a", "Landroidx/compose/ui/layout/n;", "gallery_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC22374n {
        @Override // androidx.compose.ui.layout.InterfaceC22374n
        public final long a(long j12, long j13) {
            InterfaceC22374n interfaceC22374n;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j12 >> 32)) / Float.intBitsToFloat((int) (4294967295L & j12));
            float f12 = fIntBitsToFloat <= 1.3333334f ? 0.75f : 1.3333334f;
            float f13 = f12 > fIntBitsToFloat ? fIntBitsToFloat / f12 : f12 / fIntBitsToFloat;
            InterfaceC22374n.a aVar = InterfaceC22374n.f40491a;
            if (f13 < 0.73f) {
                aVar.getClass();
                interfaceC22374n = InterfaceC22374n.a.f40494c;
            } else {
                aVar.getClass();
                interfaceC22374n = InterfaceC22374n.a.f40495d;
            }
            return interfaceC22374n.a(j12, j13);
        }
    }

    @InterfaceC22132o
    public static final void a(@Y61.k d dVar, @Y61.k Object obj, @Y61.l InterfaceC22374n interfaceC22374n, @Y61.l A a12, int i12) {
        B bE2 = a12.E(937493233);
        v.a aVar = androidx.compose.ui.v.f42878y1;
        androidx.compose.ui.v vVarD0 = dVar.b(aVar).d0(aVar);
        InterfaceC22215f.f39074a.getClass();
        InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39080f, false);
        int i13 = bE2.f37888Q;
        O1 o1S = bE2.S();
        androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarD0);
        InterfaceC22413h.f40789C1.getClass();
        Y41.a<InterfaceC22413h> aVar2 = InterfaceC22413h.a.f40791b;
        if (bE2.f37890b == null) {
            C22190v.b();
            throw null;
        }
        bE2.A();
        if (bE2.f37887P) {
            bE2.b(aVar2);
        } else {
            bE2.d();
        }
        R3.b(InterfaceC22413h.a.f40796g, bE2, interfaceC22365i0D);
        R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
        Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i13))) {
            AK.c.y(i13, bE2, i13, pVar);
        }
        R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
        C20644z c20644z = C20644z.f28804a;
        coil.compose.v.b(obj, null, dVar.a(aVar), null, interfaceC22374n, null, bE2, ((i12 << 9) & 3670016) | 56, 4024);
        bE2.X(true);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new com.akita.compose.component.gallery.a(dVar, obj, aVar, interfaceC22374n, i12);
        }
    }
}
