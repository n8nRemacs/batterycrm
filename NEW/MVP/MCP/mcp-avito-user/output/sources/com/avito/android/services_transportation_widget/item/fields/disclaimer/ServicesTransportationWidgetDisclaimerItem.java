package com.avito.android.services_transportation_widget.item.fields.disclaimer;

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

/* compiled from: ServicesTransportationWidgetDisclaimerItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/services_transportation_widget/item/fields/disclaimer/ServicesTransportationWidgetDisclaimerItem;", "Lcom/avito/android/services_transportation_widget/item/ServicesTransportationWidgetBlueprintItem;", "_avito_service-transportation-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ServicesTransportationWidgetDisclaimerItem implements ServicesTransportationWidgetBlueprintItem {

    @k
    public static final Parcelable.Creator<ServicesTransportationWidgetDisclaimerItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ServiceTransportationWidget.DisclaimerField f280554b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f280555c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f280556d;

    /* compiled from: ServicesTransportationWidgetDisclaimerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ServicesTransportationWidgetDisclaimerItem> {
        @Override // android.os.Parcelable.Creator
        public final ServicesTransportationWidgetDisclaimerItem createFromParcel(Parcel parcel) {
            return new ServicesTransportationWidgetDisclaimerItem((ServiceTransportationWidget.DisclaimerField) parcel.readParcelable(ServicesTransportationWidgetDisclaimerItem.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ServicesTransportationWidgetDisclaimerItem[] newArray(int i12) {
            return new ServicesTransportationWidgetDisclaimerItem[i12];
        }
    }

    public ServicesTransportationWidgetDisclaimerItem(@k ServiceTransportationWidget.DisclaimerField disclaimerField, boolean z12, boolean z13) {
        this.f280554b = disclaimerField;
        this.f280555c = z12;
        this.f280556d = z13;
    }

    public static ServicesTransportationWidgetDisclaimerItem a(ServicesTransportationWidgetDisclaimerItem servicesTransportationWidgetDisclaimerItem, boolean z12, boolean z13, int i12) {
        ServiceTransportationWidget.DisclaimerField disclaimerField = servicesTransportationWidgetDisclaimerItem.f280554b;
        if ((i12 & 2) != 0) {
            z12 = servicesTransportationWidgetDisclaimerItem.f280555c;
        }
        if ((i12 & 4) != 0) {
            z13 = servicesTransportationWidgetDisclaimerItem.f280556d;
        }
        servicesTransportationWidgetDisclaimerItem.getClass();
        return new ServicesTransportationWidgetDisclaimerItem(disclaimerField, z12, z13);
    }

    @Override // com.avito.android.services_transportation_widget.item.ServicesTransportationWidgetBlueprintItem
    @k
    public final ServicesTransportationWidgetBlueprintItem D1(boolean z12) {
        return a(this, z12, false, 5);
    }

    @Override // com.avito.android.services_transportation_widget.item.ServicesTransportationWidgetBlueprintItem
    @k
    public final ServicesTransportationWidgetBlueprintItem L4(boolean z12) {
        return a(this, false, z12, 3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServicesTransportationWidgetDisclaimerItem)) {
            return false;
        }
        ServicesTransportationWidgetDisclaimerItem servicesTransportationWidgetDisclaimerItem = (ServicesTransportationWidgetDisclaimerItem) obj;
        return L.f(this.f280554b, servicesTransportationWidgetDisclaimerItem.f280554b) && this.f280555c == servicesTransportationWidgetDisclaimerItem.f280555c && this.f280556d == servicesTransportationWidgetDisclaimerItem.f280556d;
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
        return Boolean.hashCode(this.f280556d) + r.i(this.f280554b.hashCode() * 31, 31, this.f280555c);
    }

    @Override // com.avito.android.services_transportation_widget.item.ServicesTransportationWidgetBlueprintItem
    public final ServiceTransportationWidget.Field i2() {
        return this.f280554b;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ServicesTransportationWidgetDisclaimerItem(backedField=");
        sb2.append(this.f280554b);
        sb2.append(", isLoading=");
        sb2.append(this.f280555c);
        sb2.append(", showError=");
        return r.x(sb2, this.f280556d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f280554b, i12);
        parcel.writeInt(this.f280555c ? 1 : 0);
        parcel.writeInt(this.f280556d ? 1 : 0);
    }

    public /* synthetic */ ServicesTransportationWidgetDisclaimerItem(ServiceTransportationWidget.DisclaimerField disclaimerField, boolean z12, boolean z13, int i12, C42822w c42822w) {
        this(disclaimerField, (i12 & 2) != 0 ? false : z12, (i12 & 4) != 0 ? false : z13);
    }
}
