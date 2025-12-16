package com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.ui.compose;

import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.G0;
import kotlin.Metadata;
import ts.C48709c;

/* compiled from: CpxPromoGeoScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/akita/compose/component/navbar/i;", "Lkotlin/G0;", "invoke", "(Lcom/akita/compose/component/navbar/i;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.ui.compose.p, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29603p extends kotlin.jvm.internal.N implements Y41.q<com.akita.compose.component.navbar.i, androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C48709c f128228l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f128229m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29603p(C48709c c48709c, InterfaceC22204y1 interfaceC22204y1) {
        super(3);
        this.f128228l = c48709c;
        this.f128229m = interfaceC22204y1;
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
            C48709c c48709c = this.f128228l;
            if (c48709c.f439496e != null && c48709c.f439495d == null && !c48709c.f439493b) {
                com.akita.compose.component.navbar.h.b(iVar2, C29600m.f128223l, null, androidx.compose.runtime.internal.r.c(1107263945, new C29602o(c48709c, this.f128229m), a13), a13, (iIntValue & 14) | 3120, 2);
            }
        }
        return G0.f406611a;
    }
}
