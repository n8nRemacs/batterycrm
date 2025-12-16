package com.avito.android.comfortable_deal.common.view.client;

import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.layout.A;
import androidx.compose.ui.layout.B;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: RedesignAgentCard.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/layout/A;", ServiceTransportationWidget.LocationField.COORDINATES, "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/A;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class l extends N implements Y41.l<A, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<androidx.compose.ui.unit.u> f120684l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<l0.g> f120685m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(InterfaceC22204y1<androidx.compose.ui.unit.u> interfaceC22204y1, InterfaceC22204y1<l0.g> interfaceC22204y12) {
        super(1);
        this.f120684l = interfaceC22204y1;
        this.f120685m = interfaceC22204y12;
    }

    @Override // Y41.l
    public final G0 invoke(A a12) {
        A a13 = a12;
        this.f120684l.setValue(androidx.compose.ui.unit.u.a(a13.a()));
        this.f120685m.setValue(l0.g.a(B.e(a13)));
        return G0.f406611a;
    }
}
