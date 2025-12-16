package com.avito.android.mortgage_invite.lead;

import androidx.compose.runtime.A;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ApplicationLeadScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/akita/compose/component/navbar/i;", "Lkotlin/G0;", "invoke", "(Lcom/akita/compose/component/navbar/i;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class m extends N implements Y41.q<com.akita.compose.component.navbar.i, A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f205893l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Y41.a<G0> aVar) {
        super(3);
        this.f205893l = aVar;
    }

    @Override // Y41.q
    public final G0 invoke(com.akita.compose.component.navbar.i iVar, A a12, Integer num) {
        com.akita.compose.component.navbar.i iVar2 = iVar;
        A a13 = a12;
        int iIntValue = num.intValue();
        if ((iIntValue & 14) == 0) {
            iIntValue |= a13.B(iVar2) ? 4 : 2;
        }
        if ((iIntValue & 91) == 18 && a13.c()) {
            a13.f();
        } else {
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.b.f63985c.getClass();
            com.akita.compose.component.navbar.h.a(iVar2, com.akita.compose.theme.re23.e.f64237O3, this.f205893l, null, null, a13, iIntValue & 14, 12);
        }
        return G0.f406611a;
    }
}
