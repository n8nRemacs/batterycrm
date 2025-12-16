package com.avito.android.services_transportation_widget.item.fields.switches;

import Y41.l;
import Y61.k;
import android.view.ContextThemeWrapper;
import android.view.View;
import com.avito.android.R;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.google.android.flexbox.FlexboxLayout;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ServiceTransportationWidgetSwitchesView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/services_transportation_widget/item/fields/switches/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/services_transportation_widget/item/fields/switches/f;", "_avito_service-transportation-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f280613b;

    /* renamed from: c, reason: collision with root package name */
    public final FlexboxLayout f280614c;

    /* compiled from: ServiceTransportationWidgetSwitchesView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<Boolean, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ i f280615l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ ServiceTransportationWidget.SwitchGroupField.SwitchValue f280616m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ ServiceTransportationWidgetSwitchesItem f280617n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.services_transportation_widget.item.l f280618o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i iVar, ServiceTransportationWidget.SwitchGroupField.SwitchValue switchValue, ServiceTransportationWidgetSwitchesItem serviceTransportationWidgetSwitchesItem, com.avito.android.services_transportation_widget.item.l lVar) {
            super(1);
            this.f280615l = iVar;
            this.f280616m = switchValue;
            this.f280617n = serviceTransportationWidgetSwitchesItem;
            this.f280618o = lVar;
        }

        @Override // Y41.l
        public final G0 invoke(Boolean bool) {
            bool.getClass();
            ServiceTransportationWidget.SwitchGroupField.SwitchValue switchValue = this.f280616m;
            String title = switchValue.getTitle();
            ServiceTransportationWidgetSwitchesItem serviceTransportationWidgetSwitchesItem = this.f280617n;
            this.f280615l.a(title, !serviceTransportationWidgetSwitchesItem.f280604c, switchValue.getSize(), !switchValue.isSelected());
            this.f280618o.i1(serviceTransportationWidgetSwitchesItem.f280603b, switchValue, !switchValue.isSelected());
            return G0.f406611a;
        }
    }

    public g(@k View view) {
        super(view);
        this.f280613b = view;
        this.f280614c = (FlexboxLayout) view.findViewById(R.id.switchesContainer);
    }

    @Override // com.avito.android.services_transportation_widget.item.fields.switches.f
    public final void dS(@k ServiceTransportationWidgetSwitchesItem serviceTransportationWidgetSwitchesItem, @k com.avito.android.services_transportation_widget.item.l lVar) {
        FlexboxLayout flexboxLayout = this.f280614c;
        flexboxLayout.removeAllViews();
        for (ServiceTransportationWidget.SwitchGroupField.SwitchValue switchValue : serviceTransportationWidgetSwitchesItem.f280603b.getSwitches()) {
            i iVar = new i(new ContextThemeWrapper(this.f280613b.getContext(), R.style.Theme_DesignSystem_Re23), null, 0, 6, null);
            iVar.a(switchValue.getTitle(), !serviceTransportationWidgetSwitchesItem.f280604c, switchValue.getSize(), switchValue.isSelected());
            iVar.f280622d = new a(iVar, switchValue, serviceTransportationWidgetSwitchesItem, lVar);
            flexboxLayout.addView(iVar);
        }
    }
}
