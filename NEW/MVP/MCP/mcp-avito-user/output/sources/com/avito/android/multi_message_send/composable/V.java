package com.avito.android.multi_message_send.composable;

import F20.e;
import android.net.Uri;
import androidx.compose.foundation.C21086w0;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22078i;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.C22274n0;
import androidx.compose.ui.graphics.Y0;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.layout.InterfaceC22374n;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.Q0;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.R;
import com.avito.android.remote.model.Image;
import com.avito.android.util.C35829k2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MultiSendListItem.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_multi-message-send_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class V {

    /* compiled from: MultiSendListItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f206502l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ F20.f f206503m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, F20.f fVar, int i12) {
            super(2);
            this.f206502l = str;
            this.f206503m = fVar;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(1);
            V.d(this.f206502l, this.f206503m, a12, iA2);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(String str, v.a aVar, androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B b12;
        v.a aVar2;
        androidx.compose.runtime.B bE2 = a12.E(-847101579);
        int i13 = (bE2.B(str) ? 4 : 2) | i12 | 48;
        if ((i13 & 91) == 18 && bE2.c()) {
            bE2.f();
            aVar2 = aVar;
            b12 = bE2;
        } else {
            v.a aVar3 = androidx.compose.ui.v.f42878y1;
            C20585k.f28659a.getClass();
            C20585k.C1589k c1589k = C20585k.f28660b;
            InterfaceC22215f.f39074a.getClass();
            C20568f2 c20568f2A = C20563e2.a(c1589k, InterfaceC22215f.a.f39085k, bE2, 0);
            int i14 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, aVar3);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar4 = InterfaceC22413h.a.f40791b;
            if (bE2.f37890b == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar4);
            } else {
                bE2.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, bE2, c20568f2A);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            C20576h2 c20576h2 = C20576h2.f28641a;
            h.a aVar5 = androidx.compose.ui.unit.h.f42849c;
            androidx.compose.ui.v vVarM = R1.m(aVar3, 0.0f, 0.0f, 4, 0.0f, 11);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.foundation.r rVar = com.akita.compose.theme.re23.b.f63988f.f65245p;
            com.akita.compose.theme.re23.a aVar6 = com.akita.compose.theme.re23.b.f63984b;
            b12 = bE2;
            com.akita.compose.foundation.ui.p.b(str, rVar, vVarM, false, aVar6.f63918e0.c(bE2), null, 0, 0, false, null, bE2, (i13 & 14) | 384, 1000);
            aVar2 = aVar3;
            com.akita.compose.foundation.ui.e.a(u0.e.a(R.drawable.common_ic_delivery_outline_24, 0, b12), null, C20588k2.o(c20576h2.c(aVar2, InterfaceC22215f.a.f39087m), 14), aVar6.f63918e0, b12, 56, 0);
            b12.X(true);
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new N(str, aVar2, i12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v23 */
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void b(@Y61.k e.a aVar, @Y61.k Y41.l lVar, boolean z12, @Y61.l androidx.compose.runtime.A a12, int i12) {
        ?? r02;
        androidx.compose.runtime.B bE2 = a12.E(-1422138935);
        v.a aVar2 = androidx.compose.ui.v.f42878y1;
        androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) bE2.o(Q0.f41199h);
        Image image = aVar.f4514h;
        if (image == null) {
            M.f206485a.getClass();
            image = M.f206487c.getImage();
        }
        Image image2 = image;
        float f12 = 138;
        h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
        Uri uriC = C35829k2.b(image2, kotlin.math.b.b(dVar.M0(f12)), kotlin.math.b.b(dVar.M0(f12)), 0.0f, 2, 44).c(S.f206498b);
        bE2.C(-660046251);
        Object objT = bE2.t();
        androidx.compose.runtime.A.f37866a.getClass();
        if (objT == A.a.f37868b) {
            objT = androidx.compose.foundation.interaction.l.a();
            bE2.H(objT);
        }
        bE2.X(false);
        com.akita.compose.theme.re23.b.f63983a.getClass();
        com.akita.compose.theme.re23.a aVar4 = com.akita.compose.theme.re23.b.f63984b;
        float f13 = 16;
        androidx.compose.ui.v vVarA = C22274n0.a(androidx.compose.foundation.A.b(C20588k2.d(R1.j(C21086w0.b(aVar2, (androidx.compose.foundation.interaction.m) objT, com.akita.compose.foundation.n.d(0.0f, 3, aVar4.f63936k0.c(bE2), false), !z12, null, new O(lVar, aVar), 24), f13, 8), 1.0f), aVar4.f63851H1.c(bE2), Y0.f39346a), new P(aVar));
        InterfaceC22215f.f39074a.getClass();
        InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
        int i13 = bE2.f37888Q;
        O1 o1S = bE2.S();
        androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarA);
        InterfaceC22413h.f40789C1.getClass();
        Y41.a<InterfaceC22413h> aVar5 = InterfaceC22413h.a.f40791b;
        InterfaceC22078i<?> interfaceC22078i = bE2.f37890b;
        if (interfaceC22078i == null) {
            C22190v.b();
            throw null;
        }
        bE2.A();
        if (bE2.f37887P) {
            bE2.b(aVar5);
        } else {
            bE2.d();
        }
        Y41.p<InterfaceC22413h, InterfaceC22365i0, G0> pVar = InterfaceC22413h.a.f40796g;
        R3.b(pVar, bE2, interfaceC22365i0D);
        Y41.p<InterfaceC22413h, androidx.compose.runtime.U, G0> pVar2 = InterfaceC22413h.a.f40795f;
        R3.b(pVar2, bE2, o1S);
        Y41.p<InterfaceC22413h, Integer, G0> pVar3 = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i13))) {
            AK.c.y(i13, bE2, i13, pVar3);
        }
        Y41.p<InterfaceC22413h, androidx.compose.ui.v, G0> pVar4 = InterfaceC22413h.a.f40793d;
        R3.b(pVar4, bE2, vVarC);
        C20644z c20644z = C20644z.f28804a;
        C20585k.f28659a.getClass();
        C20568f2 c20568f2A = C20563e2.a(C20585k.f28660b, InterfaceC22215f.a.f39085k, bE2, 0);
        int i14 = bE2.f37888Q;
        O1 o1S2 = bE2.S();
        androidx.compose.ui.v vVarC2 = androidx.compose.ui.n.c(bE2, aVar2);
        if (interfaceC22078i == null) {
            C22190v.b();
            throw null;
        }
        bE2.A();
        if (bE2.f37887P) {
            bE2.b(aVar5);
        } else {
            bE2.d();
        }
        R3.b(pVar, bE2, c20568f2A);
        R3.b(pVar2, bE2, o1S2);
        if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i14))) {
            AK.c.y(i14, bE2, i14, pVar3);
        }
        R3.b(pVar4, bE2, vVarC2);
        C20576h2 c20576h2 = C20576h2.f28641a;
        androidx.compose.ui.v vVarA2 = androidx.compose.ui.draw.k.a(C20588k2.o(aVar2, f12), androidx.compose.foundation.shape.o.a(f13));
        InterfaceC22374n.f40491a.getClass();
        coil.compose.v.b(uriC, null, vVarA2, null, InterfaceC22374n.a.f40493b, null, bE2, 1572920, 4024);
        com.akita.compose.foundation.ui.g.b(12, null, bE2, 6, 2);
        androidx.compose.foundation.layout.I iA2 = androidx.compose.foundation.layout.H.a(C20585k.f28662d, InterfaceC22215f.a.f39088n, bE2, 0);
        int i15 = bE2.f37888Q;
        O1 o1S3 = bE2.S();
        androidx.compose.ui.v vVarC3 = androidx.compose.ui.n.c(bE2, aVar2);
        if (interfaceC22078i == null) {
            C22190v.b();
            throw null;
        }
        bE2.A();
        if (bE2.f37887P) {
            bE2.b(aVar5);
        } else {
            bE2.d();
        }
        R3.b(pVar, bE2, iA2);
        R3.b(pVar2, bE2, o1S3);
        if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i15))) {
            AK.c.y(i15, bE2, i15, pVar3);
        }
        R3.b(pVar4, bE2, vVarC3);
        androidx.compose.foundation.layout.K k12 = androidx.compose.foundation.layout.K.f28344a;
        c(aVar.f4511e, null, bE2, 0);
        float f14 = 22;
        androidx.compose.ui.v vVarM = R1.m(C20588k2.d(aVar2, 1.0f), 0.0f, 2, f14, 0.0f, 9);
        com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
        com.akita.compose.foundation.r rVar = iVar.f65241l;
        long jC2 = aVar4.f63938l.c(bE2);
        androidx.compose.ui.text.style.s.f42720b.getClass();
        int i16 = androidx.compose.ui.text.style.s.f42722d;
        com.akita.compose.foundation.ui.p.b(aVar.f4510d, rVar, vVarM, false, jC2, null, 2, i16, false, null, bE2, 14156160, 808);
        d(aVar.f4512f, aVar.f4515i, bE2, 0);
        bE2.C(-984927130);
        String str = aVar.f4513g;
        if (str == null) {
            r02 = 0;
        } else {
            androidx.compose.ui.v vVarM2 = R1.m(aVar2, 0.0f, 0.0f, f14, 0.0f, 11);
            androidx.compose.ui.text.style.i.f42675b.getClass();
            int i17 = androidx.compose.ui.text.style.i.f42680g;
            long jC3 = aVar4.f63918e0.c(bE2);
            androidx.compose.ui.text.style.i iVarA = androidx.compose.ui.text.style.i.a(i17);
            r02 = 0;
            com.akita.compose.foundation.ui.p.b(str, iVar.f65245p, vVarM2, false, jC3, iVarA, 2, i16, false, null, bE2, 14156160, 776);
            G0 g02 = G0.f406611a;
        }
        bE2.X(r02);
        bE2.C(-984912075);
        String str2 = aVar.f4516j;
        if (str2 != null) {
            a(str2, null, bE2, r02);
            G0 g03 = G0.f406611a;
        }
        androidx.compose.foundation.H.A(bE2, r02, true, true);
        com.akita.compose.component.toggle.j.b(aVar.f4517k, null, com.akita.compose.theme.re23.b.v(bE2).getF66823a(), R1.m(c20644z.d(aVar2, InterfaceC22215f.a.f39078d), 0.0f, 4, 0.0f, 0.0f, 13), null, null, bE2, 48, 112);
        bE2.X(true);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new Q(aVar, lVar, z12, aVar2, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void c(@Y61.k String str, @Y61.l v.a aVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B b12;
        v.a aVar2;
        androidx.compose.runtime.B bE2 = a12.E(-1560180580);
        int i13 = (bE2.B(str) ? 4 : 2) | i12 | 48;
        if ((i13 & 91) == 18 && bE2.c()) {
            bE2.f();
            aVar2 = aVar;
            b12 = bE2;
        } else {
            v.a aVar3 = androidx.compose.ui.v.f42878y1;
            h.a aVar4 = androidx.compose.ui.unit.h.f42849c;
            androidx.compose.ui.v vVarM = R1.m(aVar3, 0.0f, 2, 0.0f, 0.0f, 13);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            b12 = bE2;
            com.akita.compose.foundation.ui.p.b(str, com.akita.compose.theme.re23.b.f63988f.f65236g, vVarM, false, com.akita.compose.theme.re23.b.f63984b.f63938l.c(bE2), null, 0, 0, false, null, bE2, i13 & 14, 1000);
            aVar2 = aVar3;
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new U(str, aVar2, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void d(String str, F20.f fVar, androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B b12;
        boolean z12;
        androidx.compose.runtime.B bE2 = a12.E(351536121);
        int i13 = i12 | (bE2.B(str) ? 4 : 2) | (bE2.B(fVar) ? 32 : 16);
        if ((i13 & 91) == 18 && bE2.c()) {
            bE2.f();
            b12 = bE2;
        } else {
            v.a aVar = androidx.compose.ui.v.f42878y1;
            androidx.compose.ui.v vVarD = C20588k2.d(aVar, 1.0f);
            float f12 = 2;
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
            androidx.compose.ui.v vVarM = R1.m(vVarD, 0.0f, f12, 0.0f, 0.0f, 13);
            C20585k.f28659a.getClass();
            C20585k.C1589k c1589k = C20585k.f28660b;
            InterfaceC22215f.f39074a.getClass();
            C20568f2 c20568f2A = C20563e2.a(c1589k, InterfaceC22215f.a.f39085k, bE2, 0);
            int i14 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarM);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar3 = InterfaceC22413h.a.f40791b;
            if (bE2.f37890b == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar3);
            } else {
                bE2.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, bE2, c20568f2A);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            C20576h2 c20576h2 = C20576h2.f28641a;
            androidx.compose.ui.v vVarA = c20576h2.a(R1.m(aVar, 0.0f, 0.0f, 3, 0.0f, 11), 1.0f, false);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
            com.akita.compose.foundation.r rVar = iVar.f65245p;
            com.akita.compose.theme.re23.a aVar4 = com.akita.compose.theme.re23.b.f63984b;
            long jC2 = aVar4.f63938l.c(bE2);
            androidx.compose.ui.text.style.s.f42720b.getClass();
            b12 = bE2;
            com.akita.compose.foundation.ui.p.b(str, rVar, vVarA, false, jC2, null, 1, androidx.compose.ui.text.style.s.f42722d, false, null, bE2, (i13 & 14) | 14155776, 808);
            b12.C(-1857226717);
            if (fVar == null) {
                z12 = false;
            } else {
                androidx.compose.ui.v vVarO = C20588k2.o(R1.m(c20576h2.c(aVar, InterfaceC22215f.a.f39086l), 0.0f, 0.0f, f12, 0.0f, 11), 12);
                z12 = false;
                com.akita.compose.foundation.ui.e.a(u0.e.a(R.drawable.common_ic_rating_16, 0, b12), "", vVarO, aVar4.f63875P1, b12, 56, 0);
                com.akita.compose.foundation.ui.p.b(String.valueOf(fVar.f4523a), iVar.f65245p, R1.m(aVar, 0.0f, 0.0f, f12, 0.0f, 11), false, aVar4.f63938l.c(b12), null, 0, 0, false, null, b12, 384, 1000);
                com.akita.compose.foundation.ui.p.b(androidx.appcompat.app.r.u(new StringBuilder("("), fVar.f4524b, ')'), iVar.f65245p, R1.m(aVar, 0.0f, 0.0f, 22, 0.0f, 11), false, aVar4.f63918e0.c(b12), null, 0, 0, false, null, b12, 384, 1000);
            }
            b12.X(z12);
            b12.X(true);
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new a(str, fVar, i12);
        }
    }
}
