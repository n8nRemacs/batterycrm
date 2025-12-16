package com.avito.android.comfortable_deal_invite.lead;

import androidx.compose.foundation.layout.InterfaceC20640y;
import com.akita.compose.component.chips.InterfaceC27333b;
import kotlin.G0;
import kotlin.Metadata;
import zq.C50611c;

/* compiled from: ComfortableDealInviteScreen.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u000b¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/foundation/layout/y;", "", "<anonymous parameter 0>", "Lcom/akita/compose/component/chips/b;", "<anonymous parameter 1>", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/y;ILcom/akita/compose/component/chips/b;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class C extends kotlin.jvm.internal.N implements Y41.s<InterfaceC20640y, Integer, InterfaceC27333b, androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C50611c f123522l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(C50611c c50611c) {
        super(5);
        this.f123522l = c50611c;
    }

    @Override // Y41.s
    public final G0 invoke(InterfaceC20640y interfaceC20640y, Integer num, InterfaceC27333b interfaceC27333b, androidx.compose.runtime.A a12, Integer num2) {
        InterfaceC20640y interfaceC20640y2 = interfaceC20640y;
        num.intValue();
        androidx.compose.runtime.A a13 = a12;
        int iIntValue = num2.intValue();
        if ((iIntValue & 14) == 0) {
            iIntValue |= a13.B(interfaceC20640y2) ? 4 : 2;
        }
        if ((iIntValue & 5131) == 1026 && a13.c()) {
            a13.f();
        } else if (this.f123522l.f444289k) {
            T.b(interfaceC20640y2, a13, iIntValue & 14);
        }
        return G0.f406611a;
    }
}
