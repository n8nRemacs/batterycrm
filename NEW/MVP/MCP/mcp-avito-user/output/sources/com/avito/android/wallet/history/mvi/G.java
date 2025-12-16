package com.avito.android.wallet.history.mvi;

import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20608p2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22078i;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.U;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.i;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22543x1;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.wallet.history.mvi.entity.HistoryItemStatus;
import com.avito.android.wallet.history.mvi.entity.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: WalletHistoryScreen.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0004²\u0006\u0018\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function1;", "LGO0/a;", "Lkotlin/G0;", "action", "_avito_wallet-history_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class G {

    /* compiled from: WalletHistoryScreen.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.wallet.history.mvi.entity.a f327545l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<GO0.a, G0> f327546m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(com.avito.android.wallet.history.mvi.entity.a aVar, Y41.l<? super GO0.a, G0> lVar) {
            super(2);
            this.f327545l = aVar;
            this.f327546m = lVar;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                com.avito.android.wallet.history.mvi.entity.a aVar = this.f327545l;
                if (aVar instanceof a.c) {
                    a13.C(698633649);
                    G.f(a13, 0);
                    a13.h();
                } else {
                    boolean z12 = aVar instanceof a.b;
                    Y41.l<GO0.a, G0> lVar = this.f327546m;
                    if (z12) {
                        a13.C(698742738);
                        G.e(lVar, a13, 0);
                        a13.h();
                    } else if (aVar instanceof a.C10157a) {
                        a13.C(698856105);
                        a.C10157a c10157a = (a.C10157a) aVar;
                        com.avito.android.analytics.screens.mvi.r rVar = c10157a.f327678c;
                        a13.C(-976608008);
                        a13.C(2063036140);
                        if (((Boolean) a13.o(C22543x1.f41638a)).booleanValue()) {
                            a13.C(421109671);
                            G.c(c10157a, lVar, a13, 0);
                            a13.h();
                        } else {
                            a13.C(420357239);
                            com.avito.android.analytics.screens.compose.a aVar2 = (com.avito.android.analytics.screens.compose.a) a13.o(com.avito.android.analytics.screens.compose.c.f90576a);
                            if (rVar != null) {
                                aVar2.m(rVar.f90666a);
                            }
                            aVar2.l();
                            androidx.compose.ui.v vVarD = androidx.compose.ui.draw.o.d(androidx.compose.ui.v.f42878y1, new F(rVar, aVar2));
                            InterfaceC22215f.f39074a.getClass();
                            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
                            int f37888q = a13.getF37888Q();
                            O1 o1Y = a13.y();
                            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(a13, vVarD);
                            InterfaceC22413h.f40789C1.getClass();
                            Y41.a<InterfaceC22413h> aVar3 = InterfaceC22413h.a.f40791b;
                            if (a13.F() == null) {
                                C22190v.b();
                                throw null;
                            }
                            a13.A();
                            if (a13.getF37887P()) {
                                a13.b(aVar3);
                            } else {
                                a13.d();
                            }
                            R3.b(InterfaceC22413h.a.f40796g, a13, interfaceC22365i0D);
                            R3.b(InterfaceC22413h.a.f40795f, a13, o1Y);
                            Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
                            if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q))) {
                                androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar);
                            }
                            R3.b(InterfaceC22413h.a.f40793d, a13, vVarC);
                            C20644z c20644z = C20644z.f28804a;
                            G.c(c10157a, lVar, a13, 0);
                            a13.z();
                            a13.h();
                        }
                        com.avito.android.authorization.auto_recovery.phone_confirm.b.m(a13);
                    } else {
                        a13.C(699024590);
                        a13.h();
                    }
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: WalletHistoryScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.wallet.history.mvi.entity.a f327547l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<GO0.a, G0> f327548m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(com.avito.android.wallet.history.mvi.entity.a aVar, Y41.l<? super GO0.a, G0> lVar, int i12) {
            super(2);
            this.f327547l = aVar;
            this.f327548m = lVar;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(1);
            G.a(this.f327547l, this.f327548m, a12, iA2);
            return G0.f406611a;
        }
    }

    /* compiled from: WalletHistoryScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {
        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            G.b(a12, C22066f2.a(1));
            return G0.f406611a;
        }
    }

    /* compiled from: WalletHistoryScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d {
        static {
            int[] iArr = new int[HistoryItemStatus.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                HistoryItemStatus historyItemStatus = HistoryItemStatus.f327646b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                HistoryItemStatus historyItemStatus2 = HistoryItemStatus.f327646b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k com.avito.android.wallet.history.mvi.entity.a aVar, @Y61.k Y41.l<? super GO0.a, G0> lVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(979412542);
        if ((((bE2.B(aVar) ? 4 : 2) | i12 | (bE2.u(lVar) ? 32 : 16)) & 91) == 18 && bE2.c()) {
            bE2.f();
        } else {
            com.akita.compose.theme.re23.c.a(false, androidx.compose.runtime.internal.r.c(-911516797, new a(aVar, lVar), bE2), bE2, 48, 1);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new b(aVar, lVar, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void b(androidx.compose.runtime.A a12, int i12) {
        Y41.a<InterfaceC22413h> aVar;
        Y41.p<InterfaceC22413h, Integer, G0> pVar;
        Y41.p<InterfaceC22413h, androidx.compose.ui.v, G0> pVar2;
        androidx.compose.runtime.B bE2 = a12.E(945964076);
        if (i12 == 0 && bE2.c()) {
            bE2.f();
        } else {
            v.a aVar2 = androidx.compose.ui.v.f42878y1;
            androidx.compose.ui.v vVarD = C20588k2.d(aVar2, 1.0f);
            C20585k.f28659a.getClass();
            C20585k.h hVar = C20585k.f28666h;
            InterfaceC22215f.f39074a.getClass();
            C20568f2 c20568f2A = C20563e2.a(hVar, InterfaceC22215f.a.f39085k, bE2, 54);
            int i13 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarD);
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
            Y41.p<InterfaceC22413h, InterfaceC22365i0, G0> pVar3 = InterfaceC22413h.a.f40796g;
            R3.b(pVar3, bE2, c20568f2A);
            Y41.p<InterfaceC22413h, U, G0> pVar4 = InterfaceC22413h.a.f40795f;
            R3.b(pVar4, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar5 = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i13))) {
                AK.c.y(i13, bE2, i13, pVar5);
            }
            Y41.p<InterfaceC22413h, androidx.compose.ui.v, G0> pVar6 = InterfaceC22413h.a.f40793d;
            R3.b(pVar6, bE2, vVarC);
            C20576h2 c20576h2 = C20576h2.f28641a;
            float f12 = 11;
            h.a aVar4 = androidx.compose.ui.unit.h.f42849c;
            float f13 = 16;
            androidx.compose.ui.v vVarJ = R1.j(aVar2, f13, f12);
            C20568f2 c20568f2A2 = C20563e2.a(C20585k.f28660b, InterfaceC22215f.a.f39086l, bE2, 48);
            int i14 = bE2.f37888Q;
            O1 o1S2 = bE2.S();
            androidx.compose.ui.v vVarC2 = androidx.compose.ui.n.c(bE2, vVarJ);
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
            R3.b(pVar3, bE2, c20568f2A2);
            R3.b(pVar4, bE2, o1S2);
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar5);
            }
            R3.b(pVar6, bE2, vVarC2);
            float f14 = 48;
            androidx.compose.ui.v vVarA = androidx.compose.ui.draw.k.a(C20588k2.q(aVar2, f14, f14), androidx.compose.foundation.shape.o.b(f13, f13, f13, f13));
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
            int i15 = bE2.f37888Q;
            O1 o1S3 = bE2.S();
            androidx.compose.ui.v vVarC3 = androidx.compose.ui.n.c(bE2, vVarA);
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
            R3.b(pVar3, bE2, interfaceC22365i0D);
            R3.b(pVar4, bE2, o1S3);
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i15))) {
                AK.c.y(i15, bE2, i15, pVar5);
            }
            R3.b(pVar6, bE2, vVarC3);
            C20644z c20644z = C20644z.f28804a;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
            com.akita.compose.foundation.r rVar = iVar.f65241l;
            FillElement fillElement = C20588k2.f28682c;
            int i16 = com.google.accompanist.placeholder.c.f342887a;
            com.google.accompanist.placeholder.c cVarA = com.google.accompanist.placeholder.material.a.a(bE2);
            com.akita.compose.theme.re23.a aVar5 = com.akita.compose.theme.re23.b.f63984b;
            com.akita.compose.foundation.ui.p.b("", rVar, com.google.accompanist.placeholder.material.e.a(fillElement, aVar5.f63842E1.c(bE2), null, cVarA, 52), false, 0L, null, 1, 0, false, null, bE2, 1572870, 952);
            bE2.X(true);
            C20608p2.a(bE2, C20588k2.t(aVar2, 13));
            i.a aVar6 = InterfaceC22215f.a.f39088n;
            C20585k.l lVar = C20585k.f28662d;
            androidx.compose.foundation.layout.I iA2 = androidx.compose.foundation.layout.H.a(lVar, aVar6, bE2, 48);
            int i17 = bE2.f37888Q;
            O1 o1S4 = bE2.S();
            androidx.compose.ui.v vVarC4 = androidx.compose.ui.n.c(bE2, aVar2);
            if (interfaceC22078i == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                aVar = aVar3;
                bE2.b(aVar);
            } else {
                aVar = aVar3;
                bE2.d();
            }
            R3.b(pVar3, bE2, iA2);
            R3.b(pVar4, bE2, o1S4);
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i17))) {
                pVar = pVar5;
                AK.c.y(i17, bE2, i17, pVar);
                pVar2 = pVar6;
            } else {
                pVar2 = pVar6;
                pVar = pVar5;
            }
            R3.b(pVar2, bE2, vVarC4);
            K k12 = K.f28344a;
            float f15 = 6;
            float f16 = 4;
            androidx.compose.ui.v vVarT = C20588k2.t(R1.m(aVar2, 0.0f, f15, 0.0f, f16, 5), 145);
            float f17 = 12;
            androidx.compose.ui.v vVarF = C20588k2.f(vVarT, f17);
            com.google.accompanist.placeholder.c cVarA2 = com.google.accompanist.placeholder.material.a.a(bE2);
            com.akita.compose.foundation.p pVar7 = aVar5.f63842E1;
            Y41.p<InterfaceC22413h, androidx.compose.ui.v, G0> pVar8 = pVar2;
            Y41.p<InterfaceC22413h, Integer, G0> pVar9 = pVar;
            Y41.a<InterfaceC22413h> aVar7 = aVar;
            com.akita.compose.foundation.ui.p.b("", iVar.f65241l, com.google.accompanist.placeholder.material.e.a(vVarF, pVar7.c(bE2), null, cVarA2, 52), false, 0L, null, 1, 0, false, null, bE2, 1572870, 952);
            C20608p2.a(bE2, C20588k2.f(aVar2, 2));
            com.akita.compose.foundation.ui.p.b("", iVar.f65245p, com.google.accompanist.placeholder.material.e.a(C20588k2.f(C20588k2.t(R1.m(aVar2, 0.0f, 3, 0.0f, f16, 5), 80), 9), pVar7.c(bE2), null, com.google.accompanist.placeholder.material.a.a(bE2), 52), false, 0L, null, 1, 0, false, null, bE2, 1572870, 952);
            bE2.X(true);
            bE2.X(true);
            androidx.compose.ui.v vVarM = R1.m(aVar2, 0.0f, 15, f13, f12, 1);
            androidx.compose.foundation.layout.I iA3 = androidx.compose.foundation.layout.H.a(lVar, aVar6, bE2, 0);
            int i18 = bE2.f37888Q;
            O1 o1S5 = bE2.S();
            androidx.compose.ui.v vVarC5 = androidx.compose.ui.n.c(bE2, vVarM);
            if (interfaceC22078i == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar7);
            } else {
                bE2.d();
            }
            R3.b(pVar3, bE2, iA3);
            R3.b(pVar4, bE2, o1S5);
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i18))) {
                AK.c.y(i18, bE2, i18, pVar9);
            }
            R3.b(pVar8, bE2, vVarC5);
            com.akita.compose.foundation.ui.p.b("", iVar.f65241l, com.google.accompanist.placeholder.material.e.a(C20588k2.f(C20588k2.t(R1.m(aVar2, 0.0f, f15, 0.0f, f16, 5), 64), f17), pVar7.c(bE2), null, com.google.accompanist.placeholder.material.a.a(bE2), 52), false, 0L, null, 1, 0, false, null, bE2, 1572870, 952);
            bE2.X(true);
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new c(2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(com.avito.android.wallet.history.mvi.entity.a.C10157a r12, Y41.l r13, androidx.compose.runtime.A r14, int r15) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.wallet.history.mvi.G.c(com.avito.android.wallet.history.mvi.entity.a$a, Y41.l, androidx.compose.runtime.A, int):void");
    }

    public static final void d(String str, androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B b12;
        androidx.compose.runtime.B bE2 = a12.E(-1458981073);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(str) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i13 & 11) == 2 && bE2.c()) {
            bE2.f();
            b12 = bE2;
        } else {
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.foundation.r rVar = com.akita.compose.theme.re23.b.f63988f.f65241l;
            androidx.compose.ui.v vVarD = C20588k2.d(androidx.compose.ui.v.f42878y1, 1.0f);
            float f12 = 32;
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            float f13 = 28;
            androidx.compose.ui.v vVarL = R1.l(vVarD, f13, f12, f13, f12);
            long jC2 = com.akita.compose.theme.re23.b.f63984b.f63918e0.c(bE2);
            androidx.compose.ui.text.style.i.f42675b.getClass();
            b12 = bE2;
            com.akita.compose.foundation.ui.p.b(str, rVar, vVarL, false, jC2, androidx.compose.ui.text.style.i.a(androidx.compose.ui.text.style.i.f42678e), 0, 0, false, null, bE2, i13 & 14, 968);
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new t(str, i12);
        }
    }

    public static final void e(Y41.l lVar, androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(1583525661);
        if ((i12 & 14) == 0) {
            i13 = (bE2.u(lVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i13 & 11) == 2 && bE2.c()) {
            bE2.f();
        } else {
            androidx.view.compose.m.f21198a.getClass();
            androidx.view.C cA2 = androidx.view.compose.m.a(bE2);
            androidx.view.y f21241d = cA2 != null ? cA2.getF21241d() : null;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.component.scaffold.g.a(null, androidx.compose.runtime.internal.r.c(-1107335463, new v(f21241d), bE2), null, null, null, com.akita.compose.theme.re23.b.f63984b.f63851H1, null, androidx.compose.runtime.internal.r.c(-2053811664, new x(lVar), bE2), bE2, 12582960, 93);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new y(i12, lVar);
        }
    }

    public static final void f(androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(-160120812);
        if (i12 == 0 && bE2.c()) {
            bE2.f();
        } else {
            androidx.view.compose.m.f21198a.getClass();
            androidx.view.C cA2 = androidx.view.compose.m.a(bE2);
            androidx.view.y f21241d = cA2 != null ? cA2.getF21241d() : null;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.foundation.p pVar = com.akita.compose.theme.re23.b.f63984b.f63851H1;
            C22096n c22096nC = androidx.compose.runtime.internal.r.c(1443985360, new A(f21241d), bE2);
            C36136a.f327550a.getClass();
            com.akita.compose.component.scaffold.g.a(null, c22096nC, null, null, null, pVar, null, C36136a.f327552c, bE2, 12582960, 93);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new B(i12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0195  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(GO0.b.d r38, Y41.l r39, androidx.compose.ui.v r40, androidx.compose.runtime.A r41, int r42) {
        /*
            Method dump skipped, instructions count: 1079
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.wallet.history.mvi.G.g(GO0.b$d, Y41.l, androidx.compose.ui.v, androidx.compose.runtime.A, int):void");
    }

    public static final void h(androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(-1396522774);
        if (i12 == 0 && bE2.c()) {
            bE2.f();
        } else {
            v.a aVar = androidx.compose.ui.v.f42878y1;
            C20585k.f28659a.getClass();
            C20585k.l lVar = C20585k.f28662d;
            InterfaceC22215f.f39074a.getClass();
            androidx.compose.foundation.layout.I iA2 = androidx.compose.foundation.layout.H.a(lVar, InterfaceC22215f.a.f39088n, bE2, 0);
            int i13 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, aVar);
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
            R3.b(InterfaceC22413h.a.f40796g, bE2, iA2);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i13))) {
                AK.c.y(i13, bE2, i13, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            K k12 = K.f28344a;
            b(bE2, 0);
            b(bE2, 0);
            b(bE2, 0);
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new E(i12);
        }
    }
}
