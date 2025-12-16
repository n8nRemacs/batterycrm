package com.avito.android.installmentsblock.compose;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.InterfaceC20640y;
import androidx.compose.foundation.layout.M1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.akita.compose.component.chips.InterfaceC27333b;
import com.avito.android.installments_block.entity.InstallmentsLoanTerms;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: InstallmentsBlock.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final a f172890a = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C22096n f172891b = new C22096n(1464012105, C5094a.f172892l, false);

    /* compiled from: InstallmentsBlock.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u000b¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/foundation/layout/y;", "", "<anonymous parameter 0>", "Lcom/akita/compose/component/chips/b;", "chip", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/y;ILcom/akita/compose/component/chips/b;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.installmentsblock.compose.a$a, reason: collision with other inner class name */
    public static final class C5094a extends N implements Y41.s<InterfaceC20640y, Integer, InterfaceC27333b, A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final C5094a f172892l = new C5094a();

        public C5094a() {
            super(5);
        }

        @Override // Y41.s
        public final G0 invoke(InterfaceC20640y interfaceC20640y, Integer num, InterfaceC27333b interfaceC27333b, A a12, Integer num2) {
            int i12;
            InterfaceC20640y interfaceC20640y2 = interfaceC20640y;
            num.intValue();
            InterfaceC27333b interfaceC27333b2 = interfaceC27333b;
            A a13 = a12;
            int iIntValue = num2.intValue();
            if ((iIntValue & 14) == 0) {
                i12 = (a13.B(interfaceC20640y2) ? 4 : 2) | iIntValue;
            } else {
                i12 = iIntValue;
            }
            if ((iIntValue & 896) == 0) {
                i12 |= a13.B(interfaceC27333b2) ? 256 : 128;
            }
            if ((i12 & 5771) == 1154 && a13.c()) {
                a13.f();
            } else {
                dO.e eVar = interfaceC27333b2 instanceof dO.e ? (dO.e) interfaceC27333b2 : null;
                InstallmentsLoanTerms.Term.Badge badge = eVar != null ? eVar.f393849c : null;
                if (badge instanceof InstallmentsLoanTerms.Term.Badge.Text) {
                    a13.C(-1256357336);
                    v.a aVar = v.f42878y1;
                    InterfaceC22215f.f39074a.getClass();
                    androidx.compose.ui.i iVar = InterfaceC22215f.a.f39078d;
                    h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
                    v vVarB = M1.b(interfaceC20640y2.d(aVar, iVar), 5, -8);
                    InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
                    int f37888q = a13.getF37888Q();
                    O1 o1Y = a13.y();
                    v vVarC = androidx.compose.ui.n.c(a13, vVarB);
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
                    com.akita.compose.theme.re23.b.f63983a.getClass();
                    com.akita.compose.component.badge.a.a(com.akita.compose.theme.re23.b.a(a13).getF66853m(), c20644z.d(C20588k2.x(aVar, null, 3), iVar), ((InstallmentsLoanTerms.Term.Badge.Text) badge).f172864b, 0, false, false, a13, 0, 56);
                    a13.z();
                    a13.h();
                } else if (badge instanceof InstallmentsLoanTerms.Term.Badge.Ellipse) {
                    a13.C(-1255741769);
                    v.a aVar4 = v.f42878y1;
                    InterfaceC22215f.f39074a.getClass();
                    androidx.compose.ui.i iVar2 = InterfaceC22215f.a.f39078d;
                    v vVarD = interfaceC20640y2.d(aVar4, iVar2);
                    InterfaceC22365i0 interfaceC22365i0D2 = C20632w.d(InterfaceC22215f.a.f39076b, false);
                    int f37888q2 = a13.getF37888Q();
                    O1 o1Y2 = a13.y();
                    v vVarC2 = androidx.compose.ui.n.c(a13, vVarD);
                    InterfaceC22413h.f40789C1.getClass();
                    Y41.a<InterfaceC22413h> aVar5 = InterfaceC22413h.a.f40791b;
                    if (a13.F() == null) {
                        C22190v.b();
                        throw null;
                    }
                    a13.A();
                    if (a13.getF37887P()) {
                        a13.b(aVar5);
                    } else {
                        a13.d();
                    }
                    R3.b(InterfaceC22413h.a.f40796g, a13, interfaceC22365i0D2);
                    R3.b(InterfaceC22413h.a.f40795f, a13, o1Y2);
                    Y41.p<InterfaceC22413h, Integer, G0> pVar2 = InterfaceC22413h.a.f40799j;
                    if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q2))) {
                        androidx.appcompat.app.r.B(f37888q2, a13, f37888q2, pVar2);
                    }
                    R3.b(InterfaceC22413h.a.f40793d, a13, vVarC2);
                    C20644z c20644z2 = C20644z.f28804a;
                    com.akita.compose.theme.re23.b.f63983a.getClass();
                    com.akita.compose.component.badge.a.b(com.akita.compose.theme.re23.b.a(a13).getF66846f(), c20644z2.d(C20588k2.x(aVar4, null, 3), iVar2), false, false, null, a13, 0, 28);
                    a13.z();
                    a13.h();
                } else if (badge == null) {
                    a13.C(-1255344969);
                    a13.h();
                } else {
                    a13.C(-1255329159);
                    a13.h();
                }
            }
            return G0.f406611a;
        }
    }
}
