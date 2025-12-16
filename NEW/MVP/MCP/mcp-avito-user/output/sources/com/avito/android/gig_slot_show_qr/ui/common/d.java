package com.avito.android.gig_slot_show_qr.ui.common;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.C21086w0;
import androidx.compose.foundation.InterfaceC21084v1;
import androidx.compose.foundation.interaction.m;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.R1;
import androidx.compose.material.C21116b5;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.n;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: GigSlotHeaderWidget.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_gig_slot-show-qr_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d {

    /* compiled from: GigSlotHeaderWidget.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ N f160944l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.a<G0> aVar) {
            super(0);
            this.f160944l = (N) aVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // Y41.a
        public final G0 invoke() {
            this.f160944l.invoke();
            return G0.f406611a;
        }
    }

    /* compiled from: GigSlotHeaderWidget.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ N f160945l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Y41.a<G0> aVar) {
            super(0);
            this.f160945l = (N) aVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // Y41.a
        public final G0 invoke() {
            this.f160945l.invoke();
            return G0.f406611a;
        }
    }

    /* compiled from: GigSlotHeaderWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ N f160946l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ N f160947m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f160948n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(int i12, Y41.a aVar, Y41.a aVar2) {
            super(2);
            this.f160946l = (N) aVar;
            this.f160947m = (N) aVar2;
            this.f160948n = i12;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.a, kotlin.jvm.internal.N] */
        /* JADX WARN: Type inference failed for: r1v0, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f160948n | 1);
            d.a(this.f160946l, this.f160947m, a12, iA2);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@k Y41.a<G0> aVar, @l Y41.a<G0> aVar2, @l A a12, int i12) {
        int i13;
        boolean z12;
        B bE2 = a12.E(-1278175224);
        if ((i12 & 14) == 0) {
            i13 = (bE2.u(aVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.u(aVar2) ? 32 : 16;
        }
        int i14 = i13;
        if ((i14 & 91) == 18 && bE2.c()) {
            bE2.f();
        } else {
            C20585k.f28659a.getClass();
            C20585k.h hVar = C20585k.f28666h;
            v.a aVar3 = v.f42878y1;
            v vVarD = C20588k2.d(aVar3, 1.0f);
            h.a aVar4 = h.f42849c;
            v vVarK = R1.k(0.0f, 12, 1, R1.k(14, 0.0f, 2, vVarD));
            InterfaceC22215f.f39074a.getClass();
            C20568f2 c20568f2A = C20563e2.a(hVar, InterfaceC22215f.a.f39085k, bE2, 6);
            int i15 = bE2.f37888Q;
            O1 o1S = bE2.S();
            v vVarC = n.c(bE2, vVarK);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar5 = InterfaceC22413h.a.f40791b;
            if (bE2.f37890b == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar5);
            } else {
                bE2.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, bE2, c20568f2A);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i15))) {
                AK.c.y(i15, bE2, i15, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            C20576h2 c20576h2 = C20576h2.f28641a;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.b.f63985c.getClass();
            androidx.compose.ui.graphics.painter.e eVarA = u0.e.a(com.akita.compose.theme.re23.e.f64237O3, 0, bE2);
            bE2.C(155219882);
            Object objT = bE2.t();
            A.f37866a.getClass();
            A.a.C1651a c1651a = A.a.f37868b;
            if (objT == c1651a) {
                objT = androidx.compose.foundation.interaction.l.a();
                bE2.H(objT);
            }
            m mVar = (m) objT;
            bE2.X(false);
            float f12 = 24;
            com.akita.compose.theme.re23.a aVar6 = com.akita.compose.theme.re23.b.f63984b;
            InterfaceC21084v1 interfaceC21084v1C = com.akita.compose.foundation.n.c(false, f12, aVar6.f63936k0.c(bE2));
            bE2.C(155227640);
            boolean z13 = (14 & i14) == 4;
            Object objT2 = bE2.t();
            if (z13 || objT2 == c1651a) {
                objT2 = new a(aVar);
                bE2.H(objT2);
            }
            bE2.X(false);
            C21116b5.a(56, 8, 0L, bE2, C21086w0.b(aVar3, mVar, interfaceC21084v1C, false, null, (Y41.a) objT2, 28), eVarA, "");
            bE2.C(155230483);
            if (aVar2 != null) {
                androidx.compose.ui.graphics.painter.e eVarA2 = u0.e.a(com.akita.compose.theme.re23.e.f64354V1, 0, bE2);
                bE2.C(155237994);
                Object objT3 = bE2.t();
                if (objT3 == c1651a) {
                    objT3 = androidx.compose.foundation.interaction.l.a();
                    bE2.H(objT3);
                }
                m mVar2 = (m) objT3;
                bE2.X(false);
                InterfaceC21084v1 interfaceC21084v1C2 = com.akita.compose.foundation.n.c(false, f12, aVar6.f63936k0.c(bE2));
                bE2.C(155246530);
                boolean z14 = (i14 & 112) == 32;
                Object objT4 = bE2.t();
                if (z14 || objT4 == c1651a) {
                    objT4 = new b(aVar2);
                    bE2.H(objT4);
                }
                bE2.X(false);
                z12 = false;
                C21116b5.a(56, 8, 0L, bE2, C21086w0.b(aVar3, mVar2, interfaceC21084v1C2, false, null, (Y41.a) objT4, 28), eVarA2, "");
            } else {
                z12 = false;
            }
            bE2.X(z12);
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new c(i12, aVar, aVar2);
        }
    }
}
