package com.avito.android.mortgage_invite.common.presentation;

import Y41.p;
import Y41.q;
import androidx.compose.foundation.layout.InterfaceC20640y;
import androidx.compose.runtime.A;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.v;
import com.avito.android.mortgage_invite.common.domain.model.ContactInfoFieldId;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ApplicationContactInfoFormBlock.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/y;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/y;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class e extends N implements q<InterfaceC20640y, A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y10.b f205553l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p<ContactInfoFieldId, String, G0> f205554m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(Y10.b bVar, p<? super ContactInfoFieldId, ? super String, G0> pVar) {
        super(3);
        this.f205553l = bVar;
        this.f205554m = pVar;
    }

    @Override // Y41.q
    public final G0 invoke(InterfaceC20640y interfaceC20640y, A a12, Integer num) {
        InterfaceC20640y interfaceC20640y2 = interfaceC20640y;
        A a13 = a12;
        int iIntValue = num.intValue();
        if ((iIntValue & 14) == 0) {
            iIntValue |= a13.B(interfaceC20640y2) ? 4 : 2;
        }
        if ((iIntValue & 91) == 18 && a13.c()) {
            a13.f();
        } else {
            Y10.b bVar = this.f205553l;
            if (bVar.f19268h && bVar.f19269i.length() > 0) {
                d dVar = new d(bVar, this.f205554m);
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.component.close_button.c cVar = com.akita.compose.theme.re23.b.l(a13).getF66388c().f61849v;
                v.a aVar = v.f42878y1;
                InterfaceC22215f.f39074a.getClass();
                com.akita.compose.component.close_button.b.a(dVar, cVar, interfaceC20640y2.d(aVar, InterfaceC22215f.a.f39080f), false, null, null, a13, 0, 56);
            }
        }
        return G0.f406611a;
    }
}
