package com.avito.android.realty_agency.checkerboard.ui;

import Y41.l;
import Y41.p;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
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
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.n;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.akita.compose.component.button.m;
import com.avito.android.R;
import com.avito.android.realty_agency.checkerboard.mvi.entity.MainContentTab;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ContentLoadingError.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_realty-agency_checkerboard_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e {

    /* compiled from: ContentLoadingError.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ MainContentTab f251405l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f251406m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ l<MainContentTab, G0> f251407n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(MainContentTab mainContentTab, Y41.a<G0> aVar, l<? super MainContentTab, G0> lVar, int i12) {
            super(2);
            this.f251405l = mainContentTab;
            this.f251406m = aVar;
            this.f251407n = lVar;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(7);
            e.a(this.f251405l, this.f251406m, this.f251407n, a12, iA2);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k MainContentTab mainContentTab, @Y61.k Y41.a<G0> aVar, @Y61.k l<? super MainContentTab, G0> lVar, @Y61.l A a12, int i12) {
        B b12;
        B bE2 = a12.E(1893582251);
        int i13 = i12 | (bE2.u(aVar) ? 32 : 16) | (bE2.u(lVar) ? 256 : 128);
        if ((i13 & 731) == 146 && bE2.c()) {
            bE2.f();
            b12 = bE2;
        } else {
            v.a aVar2 = v.f42878y1;
            C20585k.f28659a.getClass();
            C20585k.l lVar2 = C20585k.f28662d;
            InterfaceC22215f.f39074a.getClass();
            I iA2 = H.a(lVar2, InterfaceC22215f.a.f39088n, bE2, 0);
            int i14 = bE2.f37888Q;
            O1 o1S = bE2.S();
            v vVarC = n.c(bE2, aVar2);
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
            p<InterfaceC22413h, InterfaceC22365i0, G0> pVar = InterfaceC22413h.a.f40796g;
            R3.b(pVar, bE2, iA2);
            p<InterfaceC22413h, U, G0> pVar2 = InterfaceC22413h.a.f40795f;
            R3.b(pVar2, bE2, o1S);
            p<InterfaceC22413h, Integer, G0> pVar3 = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar3);
            }
            p<InterfaceC22413h, v, G0> pVar4 = InterfaceC22413h.a.f40793d;
            R3.b(pVar4, bE2, vVarC);
            K k12 = K.f28344a;
            g.a(mainContentTab, lVar, bE2, ((i13 >> 3) & 112) | 6);
            FillElement fillElement = C20588k2.f28682c;
            aVar2.getClass();
            I iA3 = H.a(C20585k.f28664f, InterfaceC22215f.a.f39089o, bE2, 54);
            int i15 = bE2.f37888Q;
            O1 o1S2 = bE2.S();
            v vVarC2 = n.c(bE2, fillElement);
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
            R3.b(pVar, bE2, iA3);
            R3.b(pVar2, bE2, o1S2);
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i15))) {
                AK.c.y(i15, bE2, i15, pVar3);
            }
            R3.b(pVar4, bE2, vVarC2);
            String strC = u0.i.c(bE2, R.string.realty_agency_checkerboard_lots_list_error_title);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
            com.akita.compose.foundation.ui.p.b(strC, iVar.f65232c, null, false, 0L, null, 0, 0, false, null, bE2, 0, 1020);
            h.a aVar4 = androidx.compose.ui.unit.h.f42849c;
            com.akita.compose.foundation.ui.g.a(6, null, bE2, 6);
            String strC2 = u0.i.c(bE2, R.string.realty_agency_checkerboard_lots_list_error_description);
            androidx.compose.ui.text.style.i.f42675b.getClass();
            com.akita.compose.foundation.ui.p.b(strC2, iVar.f65240k, R1.k(16, 0.0f, 2, aVar2), false, 0L, androidx.compose.ui.text.style.i.a(androidx.compose.ui.text.style.i.f42678e), 0, 0, false, null, bE2, 384, 984);
            com.akita.compose.foundation.ui.g.a(18, null, bE2, 6);
            b12 = bE2;
            m.c(u0.i.c(bE2, R.string.realty_agency_checkerboard_lots_list_error_button), aVar, com.akita.compose.theme.re23.b.c(bE2).X1(), null, null, null, null, false, false, null, bE2, (i13 & 112) | 512, 1016);
            b12.X(true);
            b12.X(true);
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new a(mainContentTab, aVar, lVar, i12);
        }
    }
}
