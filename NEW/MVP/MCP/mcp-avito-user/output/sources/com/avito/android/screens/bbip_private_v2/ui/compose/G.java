package com.avito.android.screens.bbip_private_v2.ui.compose;

import android.content.Context;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.v;
import com.avito.android.R;
import com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2State;
import com.avito.android.util.C35835l0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: BbipPrivateV2Screen.kt */
@s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002¨\u0006\b²\u0006\u0018\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u0018\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u0018\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function1;", "Ltp0/a;", "Lkotlin/G0;", "action", "Lcom/avito/android/deep_linking/links/DeepLink;", "deepLinkEvent", "", "uxFeedbackEvent", "_avito_bbip_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class G {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k BbipPrivateV2State bbipPrivateV2State, @Y61.k InterfaceC43160i interfaceC43160i, @Y61.k Y41.l lVar, @Y61.k Y41.l lVar2, @Y61.k Y41.l lVar3, @Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(-1944507507);
        v.a aVar = androidx.compose.ui.v.f42878y1;
        InterfaceC22204y1 interfaceC22204y1M = C22126m3.m(lVar, bE2);
        InterfaceC22204y1 interfaceC22204y1M2 = C22126m3.m(lVar2, bE2);
        InterfaceC22204y1 interfaceC22204y1M3 = C22126m3.m(lVar3, bE2);
        androidx.appcompat.app.m mVarC = C35835l0.c((Context) bE2.o(AndroidCompositionLocals_androidKt.f41069b));
        com.akita.compose.component.toast_bar.u uVarA = com.akita.compose.component.toast_bar.w.a(bE2);
        com.akita.compose.component.toast_bar.u uVarA2 = com.akita.compose.component.toast_bar.w.a(bE2);
        com.akita.compose.component.toast_bar.J jP2 = com.avito.android.actions_sheet.a.p(com.akita.compose.theme.re23.b.f63983a, bE2);
        String strC = u0.i.c(bE2, R.string.bbip_error_screen_button);
        C22187u0.d(new C34532n(interfaceC43160i, mVarC, interfaceC22204y1M2, interfaceC22204y1M3, interfaceC22204y1M, uVarA2, uVarA, jP2, strC, null), bE2, G0.f406611a);
        com.akita.compose.theme.re23.c.a(false, androidx.compose.runtime.internal.r.c(-254054382, new E(aVar, uVarA, interfaceC22204y1M, bbipPrivateV2State, interfaceC22204y1M2, uVarA2), bE2), bE2, 48, 1);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new F(bbipPrivateV2State, interfaceC43160i, lVar, lVar2, lVar3, aVar, i12);
        }
    }
}
