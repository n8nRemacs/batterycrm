package com.avito.android.tariff.cpx.configure.advance.items.cards;

import androidx.compose.runtime.InterfaceC22196w1;
import androidx.compose.ui.layout.A;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: CpxConfigureAdvanceCardsItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/layout/A;", ServiceTransportationWidget.LocationField.COORDINATES, "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/A;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class l extends N implements Y41.l<A, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22196w1 f295672l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(InterfaceC22196w1 interfaceC22196w1) {
        super(1);
        this.f295672l = interfaceC22196w1;
    }

    @Override // Y41.l
    public final G0 invoke(A a12) {
        A a13 = a12;
        int iA2 = (int) (a13.a() & 4294967295L);
        InterfaceC22196w1 interfaceC22196w1 = this.f295672l;
        if (iA2 > interfaceC22196w1.e()) {
            interfaceC22196w1.L3((int) (4294967295L & a13.a()));
        }
        return G0.f406611a;
    }
}
