package com.avito.android.virtual_deal_room_client_creation.create;

import com.adjust.sdk.network.ErrorCodes;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CreateScreen.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class m extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ RN0.c f326845l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(RN0.c cVar) {
        super(2);
        this.f326845l = cVar;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else if (this.f326845l.f14435j.f14437b) {
            a13.C(-883236247);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.component.spinner.b.a(com.akita.compose.theme.re23.b.r(a13).getF66696e(), null, a13, 0, 2);
            a13.h();
        } else {
            a13.C(-883053564);
            String strC = u0.i.c(a13, R.string.virtual_deal_room_client_creation_client_add);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.foundation.ui.p.b(strC, com.akita.compose.theme.re23.b.f63988f.f65241l, null, false, com.akita.compose.theme.re23.b.f63984b.f63851H1.c(a13), null, 0, 0, false, null, a13, 0, ErrorCodes.PROTOCOL_EXCEPTION);
            a13.h();
        }
        return G0.f406611a;
    }
}
