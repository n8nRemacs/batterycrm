package com.avito.android.mortgage_invite.participant;

import androidx.compose.foundation.layout.InterfaceC20640y;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.v;
import com.avito.android.mortgage_invite.participant.domain.model.ParticipantFieldId;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ParticipantScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/y;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/y;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class B extends kotlin.jvm.internal.N implements Y41.q<InterfaceC20640y, androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ o20.d f205972l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.p<ParticipantFieldId, String, G0> f205973m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(Y41.p pVar, o20.d dVar) {
        super(3);
        this.f205972l = dVar;
        this.f205973m = pVar;
    }

    @Override // Y41.q
    public final G0 invoke(InterfaceC20640y interfaceC20640y, androidx.compose.runtime.A a12, Integer num) {
        InterfaceC20640y interfaceC20640y2 = interfaceC20640y;
        androidx.compose.runtime.A a13 = a12;
        int iIntValue = num.intValue();
        if ((iIntValue & 14) == 0) {
            iIntValue |= a13.B(interfaceC20640y2) ? 4 : 2;
        }
        if ((iIntValue & 91) == 18 && a13.c()) {
            a13.f();
        } else {
            o20.d dVar = this.f205972l;
            if (dVar.f419334g.length() > 0) {
                A a14 = new A(this.f205973m, dVar);
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.component.close_button.c cVar = com.akita.compose.theme.re23.b.l(a13).getF66388c().f61849v;
                v.a aVar = androidx.compose.ui.v.f42878y1;
                InterfaceC22215f.f39074a.getClass();
                com.akita.compose.component.close_button.b.a(a14, cVar, interfaceC20640y2.d(aVar, InterfaceC22215f.a.f39080f), false, null, null, a13, 0, 56);
            }
        }
        return G0.f406611a;
    }
}
