package com.avito.android.iac_problems.impl_module.problems_bottom_sheet.view;

import Y41.l;
import Y41.p;
import Y61.k;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
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
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.v;
import com.avito.android.iac_problems.impl_module.problems_bottom_sheet.view.items.C30928d;
import com.avito.android.iac_problems.impl_module.problems_bottom_sheet.view.items.C30932h;
import com.avito.android.iac_problems.impl_module.problems_bottom_sheet.view.items.D;
import com.avito.android.iac_problems.impl_module.problems_bottom_sheet.view.items.P;
import com.avito.android.iac_problems.impl_module.problems_bottom_sheet.view.items.U;
import com.avito.android.iac_problems.impl_module.problems_bottom_sheet.view.items.a0;
import com.avito.android.iac_problems.impl_module.problems_bottom_sheet.view.items.e0;
import eM.InterfaceC40021a;
import eM.c;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: IacProblemsBottomSheetContent.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_iac-problems_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c {

    /* compiled from: IacProblemsBottomSheetContent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ eM.c f168943l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ l<InterfaceC40021a, G0> f168944m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ v f168945n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f168946o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f168947p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(eM.c cVar, l<? super InterfaceC40021a, G0> lVar, v vVar, int i12, int i13) {
            super(2);
            this.f168943l = cVar;
            this.f168944m = lVar;
            this.f168945n = vVar;
            this.f168946o = i12;
            this.f168947p = i13;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f168946o | 1);
            eM.c cVar = this.f168943l;
            c.a(cVar, this.f168944m, this.f168945n, a12, iA2, this.f168947p);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@k eM.c cVar, @k l<? super InterfaceC40021a, G0> lVar, @Y61.l v vVar, @Y61.l A a12, int i12, int i13) {
        B bE2 = a12.E(1360390753);
        int i14 = (bE2.B(cVar) ? 4 : 2) | i12;
        if ((i12 & 112) == 0) {
            i14 |= bE2.u(lVar) ? 32 : 16;
        }
        int i15 = 4 & i13;
        int i16 = i15 != 0 ? i14 | 384 : i14 | (bE2.B(vVar) ? 256 : 128);
        if ((i16 & 731) == 146 && bE2.c()) {
            bE2.f();
        } else {
            if (i15 != 0) {
                vVar = v.f42878y1;
            }
            v vVarA = C22501m2.a(C20588k2.d(vVar, 1.0f), "IacProblemsBottomSheetContentTestTags.ROOT");
            C20585k.f28659a.getClass();
            C20585k.l lVar2 = C20585k.f28662d;
            InterfaceC22215f.f39074a.getClass();
            I iA2 = H.a(lVar2, InterfaceC22215f.a.f39088n, bE2, 0);
            int i17 = bE2.f37888Q;
            O1 o1S = bE2.S();
            v vVarC = n.c(bE2, vVarA);
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
            p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i17))) {
                AK.c.y(i17, bE2, i17, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            K k12 = K.f28344a;
            bE2.C(990394363);
            for (c.b bVar : cVar.f395131b) {
                if (bVar instanceof c.b.a) {
                    bE2.C(1521905376);
                    C30928d.a((c.b.a) bVar, lVar, null, bE2, i16 & 112);
                    bE2.X(false);
                } else if (bVar instanceof c.b.C11074b) {
                    bE2.C(1521910078);
                    C30932h.a((c.b.C11074b) bVar, lVar, null, bE2, i16 & 112);
                    bE2.X(false);
                } else if (bVar instanceof c.b.C11075c) {
                    bE2.C(1521914388);
                    D.a((c.b.C11075c) bVar, lVar, null, bE2, i16 & 112);
                    bE2.X(false);
                } else if (bVar instanceof c.b.d) {
                    bE2.C(1521918883);
                    com.avito.android.iac_problems.impl_module.problems_bottom_sheet.view.items.H.a((c.b.d) bVar, lVar, null, bE2, i16 & 112);
                    bE2.X(false);
                } else if (bVar instanceof c.b.e) {
                    bE2.C(1521923546);
                    com.avito.android.iac_problems.impl_module.problems_bottom_sheet.view.items.L.a((c.b.e) bVar, lVar, null, bE2, i16 & 112);
                    bE2.X(false);
                } else if (bVar instanceof c.b.f) {
                    bE2.C(1521927930);
                    P.a((c.b.f) bVar, lVar, null, bE2, i16 & 112);
                    bE2.X(false);
                } else if (bVar instanceof c.b.g) {
                    bE2.C(1521932275);
                    U.a(lVar, null, bE2, (i16 >> 3) & 14);
                    bE2.X(false);
                } else if (bVar instanceof c.b.h) {
                    bE2.C(1521936172);
                    a0.a(lVar, null, bE2, (i16 >> 3) & 14);
                    bE2.X(false);
                } else if (bVar instanceof c.b.i) {
                    bE2.C(1521940056);
                    e0.a((c.b.i) bVar, lVar, null, bE2, i16 & 112);
                    bE2.X(false);
                } else {
                    bE2.C(-64445229);
                    bE2.X(false);
                }
            }
            bE2.X(false);
            bE2.X(true);
        }
        v vVar2 = vVar;
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new a(cVar, lVar, vVar2, i12, i13);
        }
    }
}
