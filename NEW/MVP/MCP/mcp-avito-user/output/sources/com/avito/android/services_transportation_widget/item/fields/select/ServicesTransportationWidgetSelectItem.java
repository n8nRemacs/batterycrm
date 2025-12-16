package com.avito.android.services_transportation_widget.item.fields.select;

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

/* compiled from: ServicesTransportationWidgetSelectItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/services_transportation_widget/item/fields/select/ServicesTransportationWidgetSelectItem;", "Lcom/avito/android/services_transportation_widget/item/ServicesTransportationWidgetBlueprintItem;", "_avito_service-transportation-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ServicesTransportationWidgetSelectItem implements ServicesTransportationWidgetBlueprintItem {

    @k
    public static final Parcelable.Creator<ServicesTransportationWidgetSelectItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ServiceTransportationWidget.InputField<?> f280590b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f280591c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f280592d;

    /* compiled from: ServicesTransportationWidgetSelectItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ServicesTransportationWidgetSelectItem> {
        @Override // android.os.Parcelable.Creator
        public final ServicesTransportationWidgetSelectItem createFromParcel(Parcel parcel) {
            return new ServicesTransportationWidgetSelectItem((ServiceTransportationWidget.InputField) parcel.readParcelable(ServicesTransportationWidgetSelectItem.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ServicesTransportationWidgetSelectItem[] newArray(int i12) {
            return new ServicesTransportationWidgetSelectItem[i12];
        }
    }

    public ServicesTransportationWidgetSelectItem(@k ServiceTransportationWidget.InputField<?> inputField, boolean z12, boolean z13) {
        this.f280590b = inputField;
        this.f280591c = z12;
        this.f280592d = z13;
    }

    public static ServicesTransportationWidgetSelectItem a(ServicesTransportationWidgetSelectItem servicesTransportationWidgetSelectItem, boolean z12, boolean z13, int i12) {
        ServiceTransportationWidget.InputField<?> inputField = servicesTransportationWidgetSelectItem.f280590b;
        if ((i12 & 2) != 0) {
            z12 = servicesTransportationWidgetSelectItem.f280591c;
        }
        if ((i12 & 4) != 0) {
            z13 = servicesTransportationWidgetSelectItem.f280592d;
        }
        servicesTransportationWidgetSelectItem.getClass();
        return new ServicesTransportationWidgetSelectItem(inputField, z12, z13);
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
        if (!(obj instanceof ServicesTransportationWidgetSelectItem)) {
            return false;
        }
        ServicesTransportationWidgetSelectItem servicesTransportationWidgetSelectItem = (ServicesTransportationWidgetSelectItem) obj;
        return L.f(this.f280590b, servicesTransportationWidgetSelectItem.f280590b) && this.f280591c == servicesTransportationWidgetSelectItem.f280591c && this.f280592d == servicesTransportationWidgetSelectItem.f280592d;
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
        Boolean hasError = this.f280590b.getHasError();
        if (hasError != null) {
            return hasError.booleanValue();
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f280592d) + r.i(this.f280590b.hashCode() * 31, 31, this.f280591c);
    }

    @Override // com.avito.android.services_transportation_widget.item.ServicesTransportationWidgetBlueprintItem
    public final ServiceTransportationWidget.Field i2() {
        return this.f280590b;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ServicesTransportationWidgetSelectItem(backedField=");
        sb2.append(this.f280590b);
        sb2.append(", isLoading=");
        sb2.append(this.f280591c);
        sb2.append(", showError=");
        return r.x(sb2, this.f280592d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f280590b, i12);
        parcel.writeInt(this.f280591c ? 1 : 0);
        parcel.writeInt(this.f280592d ? 1 : 0);
    }

    public /* synthetic */ ServicesTransportationWidgetSelectItem(ServiceTransportationWidget.InputField inputField, boolean z12, boolean z13, int i12, C42822w c42822w) {
        this(inputField, (i12 & 2) != 0 ? false : z12, (i12 & 4) != 0 ? false : z13);
    }
}
