package com.avito.android.bbl.screens.configure.v4.ui.compose;

import Bh.C13148c;
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

/* compiled from: BblConfigureV4Screen.kt */
@s0
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\n²\u0006\u0018\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u0018\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u00008\nX\u008a\u0084\u0002²\u0006(\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function1;", "LBh/a;", "Lkotlin/G0;", "action", "Lcom/avito/android/deep_linking/links/DeepLink;", "deepLinkEvent", "Lkotlin/Function3;", "", "Landroid/os/Bundle;", "deepLinkEventBundle", "_avito_bbl_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class p {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k C13148c c13148c, @Y61.k InterfaceC43160i interfaceC43160i, @Y61.k Y41.l lVar, @Y61.k Y41.l lVar2, @Y61.k Y41.q qVar, @Y61.l A a12, int i12) {
        B bE2 = a12.E(876947979);
        v.a aVar = v.f42878y1;
        InterfaceC22204y1 interfaceC22204y1M = C22126m3.m(lVar, bE2);
        InterfaceC22204y1 interfaceC22204y1M2 = C22126m3.m(lVar2, bE2);
        InterfaceC22204y1 interfaceC22204y1M3 = C22126m3.m(qVar, bE2);
        androidx.appcompat.app.m mVarC = C35835l0.c((Context) bE2.o(AndroidCompositionLocals_androidKt.f41069b));
        C22187u0.d(new e(interfaceC43160i, mVarC, interfaceC22204y1M3, null), bE2, G0.f406611a);
        com.akita.compose.theme.re23.c.a(false, androidx.compose.runtime.internal.r.c(764912656, new n(aVar, c13148c, interfaceC22204y1M, interfaceC22204y1M2, lVar), bE2), bE2, 48, 1);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new o(c13148c, interfaceC43160i, lVar, lVar2, qVar, aVar, i12);
        }
    }
}
