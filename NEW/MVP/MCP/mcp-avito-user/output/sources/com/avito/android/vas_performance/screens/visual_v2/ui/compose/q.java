package com.avito.android.vas_performance.screens.visual_v2.ui.compose;

import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: VisualVasV2Screen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/akita/compose/component/navbar/i;", "Lkotlin/G0;", "invoke", "(Lcom/akita/compose/component/navbar/i;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class q extends N implements Y41.q<com.akita.compose.component.navbar.i, androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ RL0.c f321367l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f321368m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(RL0.c cVar, InterfaceC22204y1 interfaceC22204y1) {
        super(3);
        this.f321367l = cVar;
        this.f321368m = interfaceC22204y1;
    }

    @Override // Y41.q
    public final G0 invoke(com.akita.compose.component.navbar.i iVar, androidx.compose.runtime.A a12, Integer num) {
        com.akita.compose.component.navbar.i iVar2 = iVar;
        androidx.compose.runtime.A a13 = a12;
        int iIntValue = num.intValue();
        if ((iIntValue & 14) == 0) {
            iIntValue |= a13.B(iVar2) ? 4 : 2;
        }
        if ((iIntValue & 91) == 18 && a13.c()) {
            a13.f();
        } else {
            RL0.c cVar = this.f321367l;
            if (cVar.f14359g != null && cVar.f14355c == null && !cVar.f14354b) {
                com.akita.compose.component.navbar.h.b(iVar2, n.f321363l, null, androidx.compose.runtime.internal.r.c(880086844, new p(cVar, this.f321368m), a13), a13, (iIntValue & 14) | 3120, 2);
            }
        }
        return G0.f406611a;
    }
}
