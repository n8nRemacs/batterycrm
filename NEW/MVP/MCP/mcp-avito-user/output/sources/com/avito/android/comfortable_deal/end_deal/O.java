package com.avito.android.comfortable_deal.end_deal;

import Hp.d;
import com.adjust.sdk.network.ErrorCodes;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: EndDealScreen.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class O extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Hp.c f122118l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(Hp.c cVar) {
        super(2);
        this.f122118l = cVar;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else if (((d.a) this.f122118l.f7741k).f7742a) {
            a13.C(1502505237);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.component.spinner.b.a(com.akita.compose.theme.re23.b.r(a13).getF66696e(), null, a13, 0, 2);
            a13.h();
        } else {
            a13.C(1502703637);
            String strC = u0.i.c(a13, R.string.comfortable_deal_accept_and_end);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.foundation.ui.p.b(strC, com.akita.compose.theme.re23.b.f63988f.f65241l, null, false, com.akita.compose.theme.re23.b.f63984b.f63851H1.c(a13), null, 0, 0, false, null, a13, 0, ErrorCodes.PROTOCOL_EXCEPTION);
            a13.h();
        }
        return G0.f406611a;
    }
}
