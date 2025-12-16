package com.avito.android.iac_calls_history.impl_module.screen.ui;

import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.lazy.C20650b;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.R;
import com.avito.android.iac_calls_history.impl_module.models.CallsHistoryTabType;
import com.avito.android.iac_calls_history.impl_module.screen.mvi.entity.CallsHistoryScreenState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;

/* compiled from: CallsHistoryScreenUI.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_iac-calls-history_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class r {

    /* compiled from: CallsHistoryScreenUI.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[CallsHistoryTabType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CallsHistoryTabType callsHistoryTabType = CallsHistoryTabType.f164755b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x009d  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k com.avito.android.iac_calls_history.impl_module.screen.mvi.entity.CallsHistoryScreenState r17, @Y61.k Y41.a r18, @Y61.k Y41.l r19, @Y61.k Y41.l r20, @Y61.k Y41.a r21, @Y61.k Y41.a r22, @Y61.l androidx.compose.ui.v.a r23, @Y61.l androidx.compose.runtime.A r24, int r25) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.iac_calls_history.impl_module.screen.ui.r.a(com.avito.android.iac_calls_history.impl_module.screen.mvi.entity.CallsHistoryScreenState, Y41.a, Y41.l, Y41.l, Y41.a, Y41.a, androidx.compose.ui.v$a, androidx.compose.runtime.A, int):void");
    }

    public static final void b(CallsHistoryScreenState callsHistoryScreenState, v vVar, A a12, int i12) {
        int i13;
        String strJ;
        String strJ2;
        B bE2 = a12.E(852474127);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(callsHistoryScreenState) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.B(vVar) ? 32 : 16;
        }
        if ((i13 & 91) == 18 && bE2.c()) {
            bE2.f();
        } else {
            C20585k.f28659a.getClass();
            C20585k.l lVar = C20585k.f28662d;
            InterfaceC22215f.f39074a.getClass();
            I iA2 = H.a(lVar, InterfaceC22215f.a.f39088n, bE2, 0);
            int i14 = bE2.f37888Q;
            O1 o1S = bE2.S();
            v vVarC = androidx.compose.ui.n.c(bE2, vVar);
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
            v.a aVar2 = v.f42878y1;
            float f12 = 16;
            h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
            v vVarK = R1.k(f12, 0.0f, 2, aVar2);
            int iOrdinal = callsHistoryScreenState.c().ordinal();
            if (iOrdinal == 0) {
                strJ = com.avito.android.bxcontent.mvi.entity.f.j(bE2, 1137906030, R.string.iac_calls_history_page_empty_header_all, bE2, false);
            } else {
                if (iOrdinal != 1) {
                    throw com.avito.android.bxcontent.mvi.entity.f.q(1137733646, bE2, false);
                }
                strJ = com.avito.android.bxcontent.mvi.entity.f.j(bE2, 1137909585, R.string.iac_calls_history_page_empty_header_missed, bE2, false);
            }
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
            com.akita.compose.foundation.ui.p.b(strJ, iVar.f65236g, vVarK, false, 0L, null, 0, 0, false, null, bE2, 384, 1016);
            com.akita.compose.foundation.ui.g.a(12, null, bE2, 6);
            v vVarK2 = R1.k(f12, 0.0f, 2, aVar2);
            int iOrdinal2 = callsHistoryScreenState.c().ordinal();
            if (iOrdinal2 == 0) {
                strJ2 = com.avito.android.bxcontent.mvi.entity.f.j(bE2, 1137920364, R.string.iac_calls_history_page_empty_text_all, bE2, false);
            } else {
                if (iOrdinal2 != 1) {
                    throw com.avito.android.bxcontent.mvi.entity.f.q(1137733646, bE2, false);
                }
                strJ2 = com.avito.android.bxcontent.mvi.entity.f.j(bE2, 1137923855, R.string.iac_calls_history_page_empty_text_missed, bE2, false);
            }
            com.akita.compose.foundation.ui.p.b(strJ2, iVar.f65240k, vVarK2, false, 0L, null, 0, 0, false, null, bE2, 384, 1016);
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new f(callsHistoryScreenState, vVar, i12);
        }
    }

    public static final void c(CallsHistoryScreenState callsHistoryScreenState, boolean z12, Y41.a aVar, Y41.l lVar, A a12, int i12) {
        int i13;
        B bE2 = a12.E(-10227566);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(callsHistoryScreenState) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.j(z12) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i13 |= bE2.u(aVar) ? 256 : 128;
        }
        if ((i12 & 7168) == 0) {
            i13 |= bE2.u(lVar) ? 2048 : 1024;
        }
        if ((i13 & 5851) == 1170 && bE2.c()) {
            bE2.f();
        } else {
            l0.a aVar2 = new l0.a();
            aVar2.f406838b = z12;
            C20650b.a(C20588k2.d(v.f42878y1, 1.0f), null, null, false, null, null, null, false, null, new j(callsHistoryScreenState, aVar2, aVar, lVar), bE2, 6, 510);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new k(callsHistoryScreenState, z12, aVar, lVar, i12);
        }
    }
}
