package com.avito.android.bbl.screens.limit_increase.ui.compose;

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
import com.akita.compose.component.toast_bar.J;
import com.avito.android.util.C35835l0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: LimitIncreaseScreen.kt */
@s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\b²\u0006\u0018\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u0018\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u0012\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function1;", "LEh/a;", "Lkotlin/G0;", "action", "Lcom/avito/android/deep_linking/links/DeepLink;", "deepLinkEvent", "Lkotlin/Function0;", "finishFlowEvent", "_avito_bbl_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class q {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k Eh.c cVar, @Y61.k InterfaceC43160i interfaceC43160i, @Y61.k Y41.a aVar, @Y61.k Y41.l lVar, @Y61.k Y41.l lVar2, @Y61.l A a12, int i12) {
        B bE2 = a12.E(-1849845099);
        v.a aVar2 = androidx.compose.ui.v.f42878y1;
        InterfaceC22204y1 interfaceC22204y1M = C22126m3.m(lVar, bE2);
        InterfaceC22204y1 interfaceC22204y1M2 = C22126m3.m(lVar2, bE2);
        InterfaceC22204y1 interfaceC22204y1M3 = C22126m3.m(aVar, bE2);
        androidx.appcompat.app.m mVarC = C35835l0.c((Context) bE2.o(AndroidCompositionLocals_androidKt.f41069b));
        com.akita.compose.component.toast_bar.u uVarA = com.akita.compose.component.toast_bar.w.a(bE2);
        J jP2 = com.avito.android.actions_sheet.a.p(com.akita.compose.theme.re23.b.f63983a, bE2);
        C22187u0.d(new f(mVarC, interfaceC22204y1M2, interfaceC22204y1M3, uVarA, jP2, null, interfaceC43160i), bE2, G0.f406611a);
        com.akita.compose.theme.re23.c.a(false, androidx.compose.runtime.internal.r.c(-52343824, new o(aVar2, uVarA, cVar, interfaceC22204y1M, interfaceC22204y1M2, lVar2, lVar), bE2), bE2, 48, 1);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new p(cVar, interfaceC43160i, aVar, lVar, lVar2, aVar2, i12);
        }
    }
}
