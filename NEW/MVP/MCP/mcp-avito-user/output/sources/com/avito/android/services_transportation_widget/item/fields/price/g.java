package com.avito.android.services_transportation_widget.item.fields.price;

import Y61.k;
import android.widget.TextView;
import com.avito.android.util.I5;
import kotlin.Metadata;

/* compiled from: ServicesTransportationWidgetPriceView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/services_transportation_widget/item/fields/price/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/services_transportation_widget/item/fields/price/f;", "_avito_service-transportation-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f280589b;

    public g(@k TextView textView) {
        super(textView);
        this.f280589b = textView;
    }

    @Override // com.avito.android.services_transportation_widget.item.fields.price.f
    public final void es(@k ServicesTransportationWidgetPriceItem servicesTransportationWidgetPriceItem) {
        I5.a(this.f280589b, servicesTransportationWidgetPriceItem.f280580b.getDisplayTitle(), false);
    }
}
