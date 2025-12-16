package com.avito.android.gig_apply.ui.common;

import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.layout.R1;
import androidx.compose.material.C21105a7;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22078i;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.U;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.m1;
import androidx.compose.ui.i;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SlotProgressWidget.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_gig_slot-screen_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class p {

    /* compiled from: SlotProgressWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ float f159965l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f12, int i12) {
            super(2);
            this.f159965l = f12;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(1);
            p.a(this.f159965l, a12, iA2);
            return G0.f406611a;
        }
    }

    /* compiled from: SlotProgressWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f159966l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f159967m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, int i12) {
            super(2);
            this.f159966l = str;
            this.f159967m = str2;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(1);
            p.b(this.f159966l, this.f159967m, a12, iA2);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(float f12, androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(1541715121);
        int i13 = (bE2.k(f12) ? 4 : 2) | i12;
        if ((i13 & 11) == 2 && bE2.c()) {
            bE2.f();
        } else {
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            androidx.compose.ui.v vVarA = androidx.compose.ui.draw.k.a(C20588k2.f(C20588k2.d(androidx.compose.ui.v.f42878y1, 1.0f), 8), androidx.compose.foundation.shape.o.a(6));
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.a aVar2 = com.akita.compose.theme.re23.b.f63984b;
            long jC2 = aVar2.f63942m0.c(bE2);
            long jC3 = aVar2.f63955q1.c(bE2);
            m1.f39698b.getClass();
            C21105a7.b(f12, vVarA, jC2, jC3, m1.f39700d, bE2, i13 & 14);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new a(f12, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void b(String str, String str2, androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B b12;
        androidx.compose.runtime.B bE2 = a12.E(-953523787);
        int i13 = i12 | (bE2.B(str) ? 4 : 2) | (bE2.B(str2) ? 32 : 16);
        if ((i13 & 91) == 18 && bE2.c()) {
            bE2.f();
            b12 = bE2;
        } else {
            v.a aVar = androidx.compose.ui.v.f42878y1;
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
            androidx.compose.ui.v vVarM = R1.m(C20588k2.d(aVar, 1.0f), 0.0f, 6, 0.0f, 0.0f, 13);
            C20585k.f28659a.getClass();
            C20585k.h hVar = C20585k.f28666h;
            InterfaceC22215f.f39074a.getClass();
            C20568f2 c20568f2A = C20563e2.a(hVar, InterfaceC22215f.a.f39085k, bE2, 6);
            int i14 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarM);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar3 = InterfaceC22413h.a.f40791b;
            InterfaceC22078i<?> interfaceC22078i = bE2.f37890b;
            if (interfaceC22078i == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar3);
            } else {
                bE2.d();
            }
            Y41.p<InterfaceC22413h, InterfaceC22365i0, G0> pVar = InterfaceC22413h.a.f40796g;
            R3.b(pVar, bE2, c20568f2A);
            Y41.p<InterfaceC22413h, U, G0> pVar2 = InterfaceC22413h.a.f40795f;
            R3.b(pVar2, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar3 = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar3);
            }
            Y41.p<InterfaceC22413h, androidx.compose.ui.v, G0> pVar4 = InterfaceC22413h.a.f40793d;
            R3.b(pVar4, bE2, vVarC);
            C20576h2 c20576h2 = C20576h2.f28641a;
            i.a aVar4 = InterfaceC22215f.a.f39088n;
            C20585k.l lVar = C20585k.f28662d;
            I iA2 = H.a(lVar, aVar4, bE2, 48);
            int i15 = bE2.f37888Q;
            O1 o1S2 = bE2.S();
            androidx.compose.ui.v vVarC2 = androidx.compose.ui.n.c(bE2, aVar);
            if (interfaceC22078i == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar3);
            } else {
                bE2.d();
            }
            R3.b(pVar, bE2, iA2);
            R3.b(pVar2, bE2, o1S2);
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i15))) {
                AK.c.y(i15, bE2, i15, pVar3);
            }
            R3.b(pVar4, bE2, vVarC2);
            K k12 = K.f28344a;
            String strC = u0.i.c(bE2, R.string.gig_slot_progress_indicator_start);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
            com.akita.compose.foundation.ui.p.b(strC, iVar.f65241l, null, false, 0L, null, 0, 0, false, null, bE2, 0, 1020);
            com.akita.compose.theme.re23.a aVar5 = com.akita.compose.theme.re23.b.f63984b;
            b12 = bE2;
            com.akita.compose.foundation.ui.p.b(str, com.akita.compose.foundation.r.a(iVar.f65245p, aVar5.f63918e0, 0L, 0L, null, 0L, 0L, 1022), null, false, 0L, null, 0, 0, false, null, bE2, i13 & 14, 1020);
            b12.X(true);
            I iA3 = H.a(lVar, InterfaceC22215f.a.f39090p, b12, 48);
            int i16 = b12.f37888Q;
            O1 o1S3 = b12.S();
            androidx.compose.ui.v vVarC3 = androidx.compose.ui.n.c(b12, aVar);
            if (interfaceC22078i == null) {
                C22190v.b();
                throw null;
            }
            b12.A();
            if (b12.f37887P) {
                b12.b(aVar3);
            } else {
                b12.d();
            }
            R3.b(pVar, b12, iA3);
            R3.b(pVar2, b12, o1S3);
            if (b12.f37887P || !L.f(b12.t(), Integer.valueOf(i16))) {
                AK.c.y(i16, b12, i16, pVar3);
            }
            R3.b(pVar4, b12, vVarC3);
            com.akita.compose.foundation.ui.p.b(u0.i.c(b12, R.string.gig_slot_progress_indicator_end), iVar.f65241l, null, false, 0L, null, 0, 0, false, null, b12, 0, 1020);
            com.akita.compose.foundation.ui.p.b(str2, com.akita.compose.foundation.r.a(iVar.f65245p, aVar5.f63918e0, 0L, 0L, null, 0L, 0L, 1022), null, false, 0L, null, 0, 0, false, null, b12, (i13 >> 3) & 14, 1020);
            b12.X(true);
            b12.X(true);
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new b(str, str2, i12);
        }
    }

    public static final void c(u uVar, androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(-277637054);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(uVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i13 & 11) == 2 && bE2.c()) {
            bE2.f();
        } else {
            androidx.compose.ui.v vVarD = C20588k2.d(androidx.compose.ui.v.f42878y1, 1.0f);
            C20585k.f28659a.getClass();
            C20585k.l lVar = C20585k.f28662d;
            InterfaceC22215f.f39074a.getClass();
            I iA2 = H.a(lVar, InterfaceC22215f.a.f39088n, bE2, 0);
            int i14 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarD);
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
            R3.b(InterfaceC22413h.a.f40796g, bE2, iA2);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            K k12 = K.f28344a;
            a(uVar.f159980c, bE2, 0);
            b(uVar.f159978a, uVar.f159979b, bE2, 0);
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new q(uVar, i12);
        }
    }
}
