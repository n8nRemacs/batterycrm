package com.avito.android.comfortable_deal.client_room.dialogs;

import Y41.q;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.lazy.InterfaceC20793y;
import androidx.compose.runtime.A;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.akita.compose.foundation.r;
import com.akita.compose.foundation.ui.p;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ContractDialog.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/y;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/y;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class e extends N implements q<InterfaceC20793y, A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ContractDialog f119845l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ContractDialog contractDialog) {
        super(3);
        this.f119845l = contractDialog;
    }

    @Override // Y41.q
    public final G0 invoke(InterfaceC20793y interfaceC20793y, A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 81) == 16 && a13.c()) {
            a13.f();
        } else {
            String strC = u0.i.c(a13, R.string.client_room_contract_dialog_pros_title);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            r rVar = com.akita.compose.theme.re23.b.f63988f.f65236g;
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            p.b(strC, rVar, R1.m(v.f42878y1, 0.0f, 24, 0.0f, 0.0f, 13), false, 0L, null, 0, 0, false, null, a13, 384, 1016);
            com.akita.compose.foundation.ui.g.a(12, null, a13, 6);
            String strC2 = u0.i.c(a13, R.string.client_room_contract_dialog_pros_item1);
            ContractDialog contractDialog = this.f119845l;
            ContractDialog.g5(contractDialog, strC2, a13, 0);
            float f12 = 8;
            com.akita.compose.foundation.ui.g.a(f12, null, a13, 6);
            ContractDialog.g5(contractDialog, u0.i.c(a13, R.string.client_room_contract_dialog_pros_item2), a13, 0);
            com.akita.compose.foundation.ui.g.a(f12, null, a13, 6);
            ContractDialog.g5(contractDialog, u0.i.c(a13, R.string.client_room_contract_dialog_pros_item3), a13, 0);
            com.akita.compose.foundation.ui.g.a(34, null, a13, 6);
        }
        return G0.f406611a;
    }
}
