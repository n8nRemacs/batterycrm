package com.avito.android.services_transportation_widget.item.fields.empty_price;

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

/* compiled from: ServicesTransportationWidgetEmptyPriceItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/services_transportation_widget/item/fields/empty_price/ServicesTransportationWidgetEmptyPriceItem;", "Lcom/avito/android/services_transportation_widget/item/ServicesTransportationWidgetBlueprintItem;", "_avito_service-transportation-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ServicesTransportationWidgetEmptyPriceItem implements ServicesTransportationWidgetBlueprintItem {

    @k
    public static final Parcelable.Creator<ServicesTransportationWidgetEmptyPriceItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ServiceTransportationWidget.EmptyPriceField f280569b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f280570c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f280571d;

    /* compiled from: ServicesTransportationWidgetEmptyPriceItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ServicesTransportationWidgetEmptyPriceItem> {
        @Override // android.os.Parcelable.Creator
        public final ServicesTransportationWidgetEmptyPriceItem createFromParcel(Parcel parcel) {
            return new ServicesTransportationWidgetEmptyPriceItem((ServiceTransportationWidget.EmptyPriceField) parcel.readParcelable(ServicesTransportationWidgetEmptyPriceItem.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ServicesTransportationWidgetEmptyPriceItem[] newArray(int i12) {
            return new ServicesTransportationWidgetEmptyPriceItem[i12];
        }
    }

    public ServicesTransportationWidgetEmptyPriceItem(@k ServiceTransportationWidget.EmptyPriceField emptyPriceField, boolean z12, boolean z13) {
        this.f280569b = emptyPriceField;
        this.f280570c = z12;
        this.f280571d = z13;
    }

    public static ServicesTransportationWidgetEmptyPriceItem a(ServicesTransportationWidgetEmptyPriceItem servicesTransportationWidgetEmptyPriceItem, boolean z12, boolean z13, int i12) {
        ServiceTransportationWidget.EmptyPriceField emptyPriceField = servicesTransportationWidgetEmptyPriceItem.f280569b;
        if ((i12 & 2) != 0) {
            z12 = servicesTransportationWidgetEmptyPriceItem.f280570c;
        }
        if ((i12 & 4) != 0) {
            z13 = servicesTransportationWidgetEmptyPriceItem.f280571d;
        }
        servicesTransportationWidgetEmptyPriceItem.getClass();
        return new ServicesTransportationWidgetEmptyPriceItem(emptyPriceField, z12, z13);
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
        if (!(obj instanceof ServicesTransportationWidgetEmptyPriceItem)) {
            return false;
        }
        ServicesTransportationWidgetEmptyPriceItem servicesTransportationWidgetEmptyPriceItem = (ServicesTransportationWidgetEmptyPriceItem) obj;
        return L.f(this.f280569b, servicesTransportationWidgetEmptyPriceItem.f280569b) && this.f280570c == servicesTransportationWidgetEmptyPriceItem.f280570c && this.f280571d == servicesTransportationWidgetEmptyPriceItem.f280571d;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF222246b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF279212b() {
        return i2().getFieldId();
    }

    @Override // com.avito.android.services_transportation_widget.item.ServicesTransportationWidgetBlueprintItem
    public final boolean hasError() {
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f280571d) + r.i(this.f280569b.hashCode() * 31, 31, this.f280570c);
    }

    @Override // com.avito.android.services_transportation_widget.item.ServicesTransportationWidgetBlueprintItem
    public final ServiceTransportationWidget.Field i2() {
        return this.f280569b;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ServicesTransportationWidgetEmptyPriceItem(backedField=");
        sb2.append(this.f280569b);
        sb2.append(", isLoading=");
        sb2.append(this.f280570c);
        sb2.append(", showError=");
        return r.x(sb2, this.f280571d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f280569b, i12);
        parcel.writeInt(this.f280570c ? 1 : 0);
        parcel.writeInt(this.f280571d ? 1 : 0);
    }

    public /* synthetic */ ServicesTransportationWidgetEmptyPriceItem(ServiceTransportationWidget.EmptyPriceField emptyPriceField, boolean z12, boolean z13, int i12, C42822w c42822w) {
        this(emptyPriceField, (i12 & 2) != 0 ? false : z12, (i12 & 4) != 0 ? false : z13);
    }
}
