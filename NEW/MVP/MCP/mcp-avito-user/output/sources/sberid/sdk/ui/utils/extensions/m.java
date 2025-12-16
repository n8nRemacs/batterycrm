package sberid.sdk.ui.utils.extensions;

import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.layout.A;
import androidx.compose.ui.unit.u;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import sberid.sdk.ui.utils.extensions.n;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/layout/A;", ServiceTransportationWidget.LocationField.COORDINATES, "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/A;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes9.dex */
final class m extends N implements Y41.l<A, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<u> f437907l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(InterfaceC22204y1<u> interfaceC22204y1) {
        super(1);
        this.f437907l = interfaceC22204y1;
    }

    @Override // Y41.l
    public final G0 invoke(A a12) {
        long jA2 = a12.a();
        n.a aVar = n.a.f437908l;
        this.f437907l.setValue(u.a(jA2));
        return G0.f406611a;
    }
}
