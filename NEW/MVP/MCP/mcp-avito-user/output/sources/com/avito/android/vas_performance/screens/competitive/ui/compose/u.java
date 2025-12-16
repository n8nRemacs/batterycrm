package com.avito.android.vas_performance.screens.competitive.ui.compose;

import android.content.Context;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.v;
import com.avito.android.util.C35835l0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: CompetitiveVasV2Screen.kt */
@s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\b²\u0006\u0018\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u0018\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u0012\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function1;", "LJL0/a;", "Lkotlin/G0;", "action", "Lcom/avito/android/deep_linking/links/DeepLink;", "deepLinkEvent", "Lkotlin/Function0;", "finishFlowEvent", "_avito_vas-performance_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class u {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k JL0.c cVar, @Y61.k InterfaceC43160i interfaceC43160i, @Y61.k Y41.a aVar, @Y61.k Y41.l lVar, @Y61.k Y41.l lVar2, @Y61.l A a12, int i12) {
        B bE2 = a12.E(-987157875);
        v.a aVar2 = androidx.compose.ui.v.f42878y1;
        InterfaceC22204y1 interfaceC22204y1M = C22126m3.m(lVar, bE2);
        InterfaceC22204y1 interfaceC22204y1M2 = C22126m3.m(lVar2, bE2);
        InterfaceC22204y1 interfaceC22204y1M3 = C22126m3.m(aVar, bE2);
        androidx.appcompat.app.m mVarC = C35835l0.c((Context) bE2.o(AndroidCompositionLocals_androidKt.f41069b));
        C22187u0.d(new a(interfaceC43160i, mVarC, interfaceC22204y1M2, interfaceC22204y1M3, null), bE2, G0.f406611a);
        com.akita.compose.theme.re23.c.a(false, androidx.compose.runtime.internal.r.c(-1229759704, new l(aVar2, cVar, lVar, interfaceC22204y1M2, interfaceC22204y1M), bE2), bE2, 48, 1);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new m(cVar, interfaceC43160i, aVar, lVar, lVar2, aVar2, i12);
        }
    }

    public static final void b(int i12, int i13, Y41.a aVar, A a12, androidx.compose.ui.v vVar) {
        int i14;
        B bE2 = a12.E(553205537);
        if ((i13 & 14) == 0) {
            i14 = (bE2.m(i12) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 112) == 0) {
            i14 |= bE2.u(aVar) ? 32 : 16;
        }
        if ((i13 & 896) == 0) {
            i14 |= bE2.B(vVar) ? 256 : 128;
        }
        if ((i14 & 731) == 146 && bE2.c()) {
            bE2.f();
        } else {
            com.akita.compose.component.navbar.t.b(vVar, com.akita.compose.component.navbar.u.a((com.akita.compose.component.navbar.u) bE2.o(com.akita.compose.component.navbar.v.f62301a), null, i12, 1791), 0, aVar, null, bE2, ((i14 >> 6) & 14) | ((i14 << 6) & 7168), 20);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new n(i12, i13, aVar, vVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0206  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(JL0.c r22, Y41.l r23, Y41.l r24, float r25, androidx.compose.ui.v.a r26, androidx.compose.runtime.A r27, int r28) {
        /*
            Method dump skipped, instructions count: 604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.vas_performance.screens.competitive.ui.compose.u.c(JL0.c, Y41.l, Y41.l, float, androidx.compose.ui.v$a, androidx.compose.runtime.A, int):void");
    }
}
