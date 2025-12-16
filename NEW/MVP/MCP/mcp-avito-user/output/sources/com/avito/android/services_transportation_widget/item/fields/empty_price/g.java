package com.avito.android.services_transportation_widget.item.fields.empty_price;

import Y61.k;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.skeleton.Skeleton;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.avito.android.util.I5;
import kotlin.Metadata;
import sK0.C48063a;

/* compiled from: ServicesTransportationWidgetEmptyPriceView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/services_transportation_widget/item/fields/empty_price/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/services_transportation_widget/item/fields/empty_price/f;", "_avito_service-transportation-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    public final TextView f280577b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f280578c;

    /* renamed from: d, reason: collision with root package name */
    public final Skeleton f280579d;

    public g(@k View view) {
        super(view);
        this.f280577b = (TextView) view.findViewById(R.id.startText);
        this.f280578c = (TextView) view.findViewById(R.id.endText);
        this.f280579d = (Skeleton) view.findViewById(R.id.pricePlaceholder);
    }

    @Override // com.avito.android.services_transportation_widget.item.fields.empty_price.f
    public final void jR(@k ServicesTransportationWidgetEmptyPriceItem servicesTransportationWidgetEmptyPriceItem) {
        ServiceTransportationWidget.EmptyPriceField emptyPriceField = servicesTransportationWidgetEmptyPriceItem.f280569b;
        I5.a(this.f280577b, emptyPriceField.getStartText(), false);
        I5.a(this.f280578c, emptyPriceField.getEndText(), false);
        Skeleton skeleton = this.f280579d;
        Context context = skeleton.getContext();
        String placeholderColor = emptyPriceField.getPlaceholderColor();
        C48063a.f437606a.getClass();
        ColorStateList colorStateListF = C48063a.f(context, placeholderColor, null, null);
        if (colorStateListF == null) {
            colorStateListF = ColorStateList.valueOf(16200612);
        }
        skeleton.setBackgroundTintList(colorStateListF);
    }
}
