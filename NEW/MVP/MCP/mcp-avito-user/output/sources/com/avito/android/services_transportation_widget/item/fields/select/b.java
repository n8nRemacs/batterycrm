package com.avito.android.services_transportation_widget.item.fields.select;

import Y61.k;
import android.graphics.drawable.Drawable;
import com.avito.android.R;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.util.q;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.avito.android.services_transportation_widget.item.l;
import com.avito.android.util.C35835l0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ServicesTransportationWidgetSelectView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/services_transportation_widget/item/fields/select/b;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/services_transportation_widget/item/fields/select/g;", "_avito_service-transportation-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f280596c = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Input f280597b;

    public b(@k Input input) {
        super(input);
        this.f280597b = input;
        input.setLeftIconColor(C35835l0.d(R.attr.gray54, input.getContext()));
    }

    public final void B80(String str, String str2, Drawable drawable, Drawable drawable2) {
        Input input = this.f280597b;
        input.setHint(str);
        Input.t(input, str2, false, 6);
        input.setRightIcon(drawable);
        input.setLeftIcon(drawable2);
    }

    @Override // com.avito.android.services_transportation_widget.item.fields.select.g
    public final void U3(boolean z12) {
        int[] iArr;
        if (z12) {
            Input.f179303W.getClass();
            iArr = Input.f179305b0;
        } else {
            Input.f179303W.getClass();
            iArr = Input.f179304a0;
        }
        this.f280597b.setState(iArr);
    }

    @Override // com.avito.android.services_transportation_widget.item.fields.select.g
    public final void nS(@k ServicesTransportationWidgetSelectItem servicesTransportationWidgetSelectItem, @k l lVar) {
        Integer numA;
        ServiceTransportationWidget.InputField<?> inputField = servicesTransportationWidgetSelectItem.f280590b;
        String icon = inputField.getIcon();
        Input input = this.f280597b;
        Drawable drawableH = (icon == null || (numA = q.a(icon)) == null) ? null : C35835l0.h(numA.intValue(), input.getContext());
        if (inputField instanceof ServiceTransportationWidget.LocationField) {
            ServiceTransportationWidget.LocationField locationField = (ServiceTransportationWidget.LocationField) inputField;
            B80(locationField.getHint(), locationField.getDisplayTitle(), null, drawableH);
        } else if (inputField instanceof ServiceTransportationWidget.SelectField) {
            ServiceTransportationWidget.SelectField selectField = (ServiceTransportationWidget.SelectField) inputField;
            B80(selectField.getHint(), selectField.getDisplayTitle(), C35835l0.h(R.attr.ic_arrowDown24, input.getContext()), drawableH);
        } else if (inputField instanceof ServiceTransportationWidget.CardSelectField) {
            ServiceTransportationWidget.CardSelectField cardSelectField = (ServiceTransportationWidget.CardSelectField) inputField;
            B80(cardSelectField.getHint(), cardSelectField.getDisplayTitle(), C35835l0.h(R.attr.ic_arrowDown24, input.getContext()), drawableH);
        }
        input.setOnClickListener(new com.avito.android.service_booking_calendar.flexible.header.toolbar.g(11, lVar, servicesTransportationWidgetSelectItem));
        input.setEnabled(!servicesTransportationWidgetSelectItem.f280591c);
    }

    @Override // com.avito.android.services_transportation_widget.item.fields.select.g
    public final void setLoading(boolean z12) {
        this.f280597b.setEnabled(!z12);
    }
}
