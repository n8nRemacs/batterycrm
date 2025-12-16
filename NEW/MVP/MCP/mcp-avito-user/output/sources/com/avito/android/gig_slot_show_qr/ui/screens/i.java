package com.avito.android.gig_slot_show_qr.ui.screens;

import Y41.p;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
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
import androidx.compose.ui.i;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.akita.compose.component.button.t;
import com.akita.compose.foundation.r;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: GIgSlotShowQrErrorScreen.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_gig_slot-show-qr_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i {

    /* compiled from: GIgSlotShowQrErrorScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ N f160970l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ N f160971m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f160972n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(int i12, Y41.a aVar, Y41.a aVar2) {
            super(2);
            this.f160970l = (N) aVar;
            this.f160971m = (N) aVar2;
            this.f160972n = i12;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.a, kotlin.jvm.internal.N] */
        /* JADX WARN: Type inference failed for: r1v0, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f160972n | 1);
            i.a(this.f160970l, this.f160971m, a12, iA2);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k Y41.a<G0> aVar, @Y61.k Y41.a<G0> aVar2, @Y61.l A a12, int i12) {
        int i13;
        B b12;
        B bE2 = a12.E(938711212);
        if ((i12 & 14) == 0) {
            i13 = (bE2.u(aVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.u(aVar2) ? 32 : 16;
        }
        if ((i13 & 91) == 18 && bE2.c()) {
            bE2.f();
            b12 = bE2;
        } else {
            v.a aVar3 = v.f42878y1;
            FillElement fillElement = C20588k2.f28682c;
            aVar3.getClass();
            InterfaceC22215f.f39074a.getClass();
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
            int i14 = bE2.f37888Q;
            O1 o1S = bE2.S();
            v vVarC = androidx.compose.ui.n.c(bE2, fillElement);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar4 = InterfaceC22413h.a.f40791b;
            InterfaceC22078i<?> interfaceC22078i = bE2.f37890b;
            if (interfaceC22078i == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar4);
            } else {
                bE2.d();
            }
            p<InterfaceC22413h, InterfaceC22365i0, G0> pVar = InterfaceC22413h.a.f40796g;
            R3.b(pVar, bE2, interfaceC22365i0D);
            p<InterfaceC22413h, U, G0> pVar2 = InterfaceC22413h.a.f40795f;
            R3.b(pVar2, bE2, o1S);
            p<InterfaceC22413h, Integer, G0> pVar3 = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar3);
            }
            p<InterfaceC22413h, v, G0> pVar4 = InterfaceC22413h.a.f40793d;
            R3.b(pVar4, bE2, vVarC);
            C20644z c20644z = C20644z.f28804a;
            com.avito.android.gig_slot_show_qr.ui.common.d.a(aVar, null, bE2, (i13 & 14) | 48);
            v vVarD = c20644z.d(C20588k2.d(aVar3, 1.0f), InterfaceC22215f.a.f39080f);
            i.a aVar5 = InterfaceC22215f.a.f39089o;
            C20585k.f28659a.getClass();
            I iA2 = H.a(C20585k.f28662d, aVar5, bE2, 48);
            int i15 = bE2.f37888Q;
            O1 o1S2 = bE2.S();
            v vVarC2 = androidx.compose.ui.n.c(bE2, vVarD);
            if (interfaceC22078i == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar4);
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
            String strC = u0.i.c(bE2, R.string.job_gig_slot_show_qr_common_error);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            r rVar = com.akita.compose.theme.re23.b.f63988f.f65232c;
            androidx.compose.ui.text.style.i.f42675b.getClass();
            com.akita.compose.foundation.ui.p.b(strC, rVar, null, false, 0L, androidx.compose.ui.text.style.i.a(androidx.compose.ui.text.style.i.f42678e), 0, 0, false, null, bE2, 0, 988);
            String strC2 = u0.i.c(bE2, R.string.job_gig_slot_show_qr_retry);
            t tVarX1 = com.akita.compose.theme.re23.b.c(bE2).X1();
            h.a aVar6 = androidx.compose.ui.unit.h.f42849c;
            b12 = bE2;
            com.akita.compose.component.button.m.c(strC2, aVar2, tVarX1, R1.m(aVar3, 0.0f, 24, 0.0f, 0.0f, 13), null, null, null, false, false, null, bE2, (i13 & 112) | 3584, 1008);
            b12.X(true);
            b12.X(true);
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new a(i12, aVar, aVar2);
        }
    }
}
