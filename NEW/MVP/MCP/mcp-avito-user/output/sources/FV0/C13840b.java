package Fv0;

import Y61.l;
import com.avito.android.services_transportation_widget.item.fields.select.ServicesTransportationWidgetSelectItem;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ServiceTransportationsWidgetFieldsPayloadCreator.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LFv0/b;", "Lcom/avito/android/recycler/data_aware/a;", "<init>", "()V", "_avito_service-transportation-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Fv0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13840b implements com.avito.android.recycler.data_aware.a {
    @Inject
    public C13840b() {
    }

    @Override // com.avito.android.recycler.data_aware.a
    @l
    public final Object a(@l TV0.a aVar, @l TV0.a aVar2) {
        if (!L.f(aVar != null ? Long.valueOf(aVar.getF222258b()) : null, aVar2 != null ? Long.valueOf(aVar2.getF222258b()) : null) || !(aVar2 instanceof ServicesTransportationWidgetSelectItem) || !(aVar instanceof ServicesTransportationWidgetSelectItem)) {
            return null;
        }
        ServicesTransportationWidgetSelectItem servicesTransportationWidgetSelectItem = (ServicesTransportationWidgetSelectItem) aVar2;
        ServicesTransportationWidgetSelectItem servicesTransportationWidgetSelectItem2 = (ServicesTransportationWidgetSelectItem) aVar;
        if (!L.f(servicesTransportationWidgetSelectItem.f280590b, servicesTransportationWidgetSelectItem2.f280590b)) {
            return null;
        }
        boolean z12 = servicesTransportationWidgetSelectItem.f280591c;
        Boolean boolValueOf = Boolean.valueOf(z12);
        if (z12 == servicesTransportationWidgetSelectItem2.f280591c) {
            boolValueOf = null;
        }
        boolean z13 = servicesTransportationWidgetSelectItem.f280592d;
        return new C13843e(boolValueOf, z13 != servicesTransportationWidgetSelectItem2.f280592d ? Boolean.valueOf(z13) : null);
    }
}
