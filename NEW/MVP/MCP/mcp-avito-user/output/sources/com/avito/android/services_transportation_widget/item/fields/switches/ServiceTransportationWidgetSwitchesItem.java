package com.avito.android.services_transportation_widget.item.fields.switches;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.avito.android.services_transportation_widget.item.ServicesTransportationWidgetBlueprintItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ServiceTransportationWidgetSwitchesItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/services_transportation_widget/item/fields/switches/ServiceTransportationWidgetSwitchesItem;", "Lcom/avito/android/services_transportation_widget/item/ServicesTransportationWidgetBlueprintItem;", "_avito_service-transportation-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ServiceTransportationWidgetSwitchesItem implements ServicesTransportationWidgetBlueprintItem {

    @k
    public static final Parcelable.Creator<ServiceTransportationWidgetSwitchesItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ServiceTransportationWidget.SwitchGroupField f280603b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f280604c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f280605d;

    /* compiled from: ServiceTransportationWidgetSwitchesItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ServiceTransportationWidgetSwitchesItem> {
        @Override // android.os.Parcelable.Creator
        public final ServiceTransportationWidgetSwitchesItem createFromParcel(Parcel parcel) {
            return new ServiceTransportationWidgetSwitchesItem((ServiceTransportationWidget.SwitchGroupField) parcel.readParcelable(ServiceTransportationWidgetSwitchesItem.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ServiceTransportationWidgetSwitchesItem[] newArray(int i12) {
            return new ServiceTransportationWidgetSwitchesItem[i12];
        }
    }

    public ServiceTransportationWidgetSwitchesItem(@k ServiceTransportationWidget.SwitchGroupField switchGroupField, boolean z12, boolean z13) {
        this.f280603b = switchGroupField;
        this.f280604c = z12;
        this.f280605d = z13;
    }

    public static ServiceTransportationWidgetSwitchesItem a(ServiceTransportationWidgetSwitchesItem serviceTransportationWidgetSwitchesItem, ServiceTransportationWidget.SwitchGroupField switchGroupField, boolean z12, boolean z13, int i12) {
        if ((i12 & 1) != 0) {
            switchGroupField = serviceTransportationWidgetSwitchesItem.f280603b;
        }
        if ((i12 & 2) != 0) {
            z12 = serviceTransportationWidgetSwitchesItem.f280604c;
        }
        if ((i12 & 4) != 0) {
            z13 = serviceTransportationWidgetSwitchesItem.f280605d;
        }
        serviceTransportationWidgetSwitchesItem.getClass();
        return new ServiceTransportationWidgetSwitchesItem(switchGroupField, z12, z13);
    }

    @Override // com.avito.android.services_transportation_widget.item.ServicesTransportationWidgetBlueprintItem
    @k
    public final ServicesTransportationWidgetBlueprintItem D1(boolean z12) {
        return a(this, null, z12, false, 5);
    }

    @Override // com.avito.android.services_transportation_widget.item.ServicesTransportationWidgetBlueprintItem
    @k
    public final ServicesTransportationWidgetBlueprintItem L4(boolean z12) {
        return a(this, null, false, z12, 3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceTransportationWidgetSwitchesItem)) {
            return false;
        }
        ServiceTransportationWidgetSwitchesItem serviceTransportationWidgetSwitchesItem = (ServiceTransportationWidgetSwitchesItem) obj;
        return L.f(this.f280603b, serviceTransportationWidgetSwitchesItem.f280603b) && this.f280604c == serviceTransportationWidgetSwitchesItem.f280604c && this.f280605d == serviceTransportationWidgetSwitchesItem.f280605d;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF207369c() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF270463j() {
        return i2().getFieldId();
    }

    @Override // com.avito.android.services_transportation_widget.item.ServicesTransportationWidgetBlueprintItem
    public final boolean hasError() {
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f280605d) + r.i(this.f280603b.hashCode() * 31, 31, this.f280604c);
    }

    @Override // com.avito.android.services_transportation_widget.item.ServicesTransportationWidgetBlueprintItem
    public final ServiceTransportationWidget.Field i2() {
        return this.f280603b;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ServiceTransportationWidgetSwitchesItem(backedField=");
        sb2.append(this.f280603b);
        sb2.append(", isLoading=");
        sb2.append(this.f280604c);
        sb2.append(", showError=");
        return r.x(sb2, this.f280605d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f280603b, i12);
        parcel.writeInt(this.f280604c ? 1 : 0);
        parcel.writeInt(this.f280605d ? 1 : 0);
    }

    public /* synthetic */ ServiceTransportationWidgetSwitchesItem(ServiceTransportationWidget.SwitchGroupField switchGroupField, boolean z12, boolean z13, int i12, C42822w c42822w) {
        this(switchGroupField, (i12 & 2) != 0 ? false : z12, (i12 & 4) != 0 ? false : z13);
    }
}
