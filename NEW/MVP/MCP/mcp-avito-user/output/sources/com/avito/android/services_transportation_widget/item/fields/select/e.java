package com.avito.android.services_transportation_widget.item.fields.select;

import Fv0.C13843e;
import Y61.k;
import com.avito.android.services_transportation_widget.item.l;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ServicesTransportationWidgetSelectPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/services_transportation_widget/item/fields/select/e;", "Lcom/avito/android/services_transportation_widget/item/fields/select/d;", "_avito_service-transportation-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l f280600b;

    @Inject
    public e(@k l lVar) {
        this.f280600b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        ((g) eVar).nS((ServicesTransportationWidgetSelectItem) aVar, this.f280600b);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        g gVar = (g) eVar;
        ServicesTransportationWidgetSelectItem servicesTransportationWidgetSelectItem = (ServicesTransportationWidgetSelectItem) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof C13843e) {
                obj = obj2;
            }
        }
        C13843e c13843e = (C13843e) (obj instanceof C13843e ? obj : null);
        if (c13843e == null) {
            gVar.nS(servicesTransportationWidgetSelectItem, this.f280600b);
            return;
        }
        Boolean bool = c13843e.f6025a;
        if (bool != null) {
            gVar.setLoading(bool.booleanValue());
        }
        boolean z12 = false;
        Boolean bool2 = c13843e.f6026b;
        if (bool2 != null ? bool2.booleanValue() : false) {
            Boolean hasError = servicesTransportationWidgetSelectItem.f280590b.getHasError();
            if (hasError != null ? hasError.booleanValue() : false) {
                z12 = true;
            }
        }
        gVar.U3(z12);
    }
}
