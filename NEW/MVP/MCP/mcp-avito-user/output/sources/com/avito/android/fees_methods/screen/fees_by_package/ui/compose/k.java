package com.avito.android.fees_methods.screen.fees_by_package.ui.compose;

import android.content.Context;
import androidx.compose.foundation.a2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.internal.r;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.fees_methods.screen.fees_by_package.mvi.entity.FeesByPackageState;
import com.avito.android.fees_methods.screen.fees_by_package.ui.compose.items.t;
import com.avito.android.util.C35835l0;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: FeesByPackageScreen.kt */
@s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\b²\u0006\u0018\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u0018\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u0012\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function1;", "LFE/a;", "Lkotlin/G0;", "onActionState", "Lcom/avito/android/deep_linking/links/DeepLink;", "deepLinkEvent", "Lkotlin/Function0;", "finishFlowEvent", "_avito_fees-methods_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class k {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k FeesByPackageState feesByPackageState, @Y61.k InterfaceC43160i interfaceC43160i, @Y61.k Y41.a aVar, @Y61.k Y41.l lVar, @Y61.k Y41.l lVar2, @Y61.l A a12, int i12) {
        B bE2 = a12.E(1470577373);
        v.a aVar2 = v.f42878y1;
        InterfaceC22204y1 interfaceC22204y1M = C22126m3.m(lVar, bE2);
        InterfaceC22204y1 interfaceC22204y1M2 = C22126m3.m(lVar2, bE2);
        InterfaceC22204y1 interfaceC22204y1M3 = C22126m3.m(aVar, bE2);
        androidx.appcompat.app.m mVarC = C35835l0.c((Context) bE2.o(AndroidCompositionLocals_androidKt.f41069b));
        C22187u0.d(new a(interfaceC43160i, mVarC, interfaceC22204y1M2, interfaceC22204y1M3, null), bE2, G0.f406611a);
        com.akita.compose.theme.re23.c.a(false, r.c(1630920674, new h(aVar2, feesByPackageState, interfaceC22204y1M, interfaceC22204y1M2), bE2), bE2, 48, 1);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new i(feesByPackageState, interfaceC43160i, aVar, lVar, lVar2, aVar2, i12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    public static final void b(FeesByPackageState feesByPackageState, Y41.l lVar, Y41.l lVar2, float f12, v.a aVar, A a12, int i12) {
        int i13;
        ?? r15;
        v.a aVar2;
        B bE2 = a12.E(-581975808);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(feesByPackageState) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.u(lVar) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i13 |= bE2.u(lVar2) ? 256 : 128;
        }
        if ((i12 & 7168) == 0) {
            i13 |= bE2.k(f12) ? 2048 : 1024;
        }
        int i14 = i13 | 24576;
        if ((46811 & i14) == 9362 && bE2.c()) {
            bE2.f();
            aVar2 = aVar;
        } else {
            v.a aVar3 = v.f42878y1;
            v vVarB = a2.b(aVar3, a2.a(bE2), true, true);
            C20585k.f28659a.getClass();
            C20585k.l lVar3 = C20585k.f28662d;
            InterfaceC22215f.f39074a.getClass();
            I iA2 = H.a(lVar3, InterfaceC22215f.a.f39088n, bE2, 0);
            int i15 = bE2.f37888Q;
            O1 o1S = bE2.S();
            v vVarC = androidx.compose.ui.n.c(bE2, vVarB);
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
            R3.b(InterfaceC22413h.a.f40796g, bE2, iA2);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i15))) {
                AK.c.y(i15, bE2, i15, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            K k12 = K.f28344a;
            String str = feesByPackageState.f158030f;
            bE2.C(566574663);
            if (str == null) {
                r15 = 0;
            } else {
                h.a aVar5 = androidx.compose.ui.unit.h.f42849c;
                float f13 = 16;
                r15 = 0;
                com.avito.android.fees_methods.screen.fees_by_package.ui.compose.items.o.a(str, R1.m(aVar3, f13, 12, f13, 0.0f, 8), bE2, 0);
            }
            bE2.X(r15);
            bE2.C(566582219);
            FeesByPackageState.e eVar = feesByPackageState.f158031g;
            if (eVar != null) {
                h.a aVar6 = androidx.compose.ui.unit.h.f42849c;
                float f14 = 10;
                t.a(eVar, R1.m(aVar3, f14, 20, f14, 0.0f, 8), bE2, r15);
            }
            bE2.X(r15);
            bE2.C(566589947);
            List<FeesByPackageState.b> list = feesByPackageState.f158032h;
            if (list != null) {
                h.a aVar7 = androidx.compose.ui.unit.h.f42849c;
                float f15 = 16;
                com.avito.android.fees_methods.screen.fees_by_package.ui.compose.items.f.a(((i14 >> 3) & 112) | 8, lVar2, bE2, R1.m(aVar3, f15, 24, f15, 0.0f, 8), list);
            }
            bE2.X(r15);
            bE2.C(566599133);
            FeesByPackageState.a aVar8 = feesByPackageState.f158033i;
            if (aVar8 != null) {
                h.a aVar9 = androidx.compose.ui.unit.h.f42849c;
                float f16 = 16;
                com.avito.android.fees_methods.screen.fees_by_package.ui.compose.items.c.a(aVar8, lVar, R1.m(aVar3, f16, 24, f16, 0.0f, 8), bE2, i14 & 112);
            }
            bE2.X(r15);
            com.akita.compose.foundation.ui.g.a(f12, null, bE2, (i14 >> 9) & 14);
            bE2.X(true);
            aVar2 = aVar3;
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new j(feesByPackageState, lVar, lVar2, f12, aVar2, i12);
        }
    }
}
