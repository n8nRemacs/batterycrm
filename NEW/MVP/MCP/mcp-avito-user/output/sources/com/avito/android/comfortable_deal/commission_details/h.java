package com.avito.android.comfortable_deal.commission_details;

import Y41.p;
import androidx.compose.foundation.layout.K;
import androidx.compose.runtime.A;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.v;
import com.akita.compose.foundation.r;
import com.avito.android.comfortable_deal.commission_details.model.CommissionDetailsDialogArguments;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CommissionDetailsDialogScreen.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class h extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ CommissionDetailsDialogArguments f120580l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ K f120581m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(CommissionDetailsDialogArguments commissionDetailsDialogArguments, K k12) {
        super(2);
        this.f120580l = commissionDetailsDialogArguments;
        this.f120581m = k12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            String str = this.f120580l.f120588d;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            r rVar = com.akita.compose.theme.re23.b.f63988f.f65241l;
            v.a aVar = v.f42878y1;
            InterfaceC22215f.f39074a.getClass();
            com.akita.compose.foundation.ui.p.b(str, rVar, this.f120581m.c(aVar, InterfaceC22215f.a.f39089o), false, 0L, null, 0, 0, false, null, a13, 0, 1016);
        }
        return G0.f406611a;
    }
}
