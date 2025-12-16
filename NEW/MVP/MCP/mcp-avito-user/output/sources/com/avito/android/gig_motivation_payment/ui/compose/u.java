package com.avito.android.gig_motivation_payment.ui.compose;

import androidx.compose.foundation.C21086w0;
import androidx.compose.material.C21116b5;
import androidx.compose.runtime.InterfaceC22204y1;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import sH.C48049a;
import vH.c;

/* compiled from: MotivationPaymentScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/akita/compose/component/navbar/i;", "Lkotlin/G0;", "invoke", "(Lcom/akita/compose/component/navbar/i;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class u extends N implements Y41.q<com.akita.compose.component.navbar.i, androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ vH.c f160181l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f160182m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(InterfaceC22204y1 interfaceC22204y1, vH.c cVar) {
        super(3);
        this.f160181l = cVar;
        this.f160182m = interfaceC22204y1;
    }

    @Override // Y41.q
    public final G0 invoke(com.akita.compose.component.navbar.i iVar, androidx.compose.runtime.A a12, Integer num) {
        C48049a c48049a;
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 81) == 16 && a13.c()) {
            a13.f();
        } else {
            vH.c cVar = this.f160181l;
            DeepLink deepLink = null;
            c.b bVar = cVar instanceof c.b ? (c.b) cVar : null;
            if (bVar != null && (c48049a = bVar.f440640c) != null) {
                deepLink = c48049a.f437572h;
            }
            if (deepLink != null) {
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.theme.re23.b.f63985c.getClass();
                C21116b5.a(56, 8, 0L, a13, C21086w0.c(androidx.compose.ui.v.f42878y1, false, null, null, new t(deepLink, this.f160182m), 7), u0.e.a(com.akita.compose.theme.re23.e.f64354V1, 0, a13), "");
            }
        }
        return G0.f406611a;
    }
}
