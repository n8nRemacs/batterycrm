package com.avito.android.location_picker;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.geo_common.model.location_picker.LocationFlowType;
import com.avito.android.location_picker.analytics.LocationPickerScreenOpenEvent;
import com.avito.android.location_picker.view.LocationPickerChooseButtonLocation;
import com.avito.android.publish.PublishIntentFactory;
import com.avito.android.remote.model.Radius;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import okhttp3.internal.http2.Http2;

/* compiled from: LocationPickerArguments.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/location_picker/LocationPickerArguments;", "Landroid/os/Parcelable;", "_avito_location-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class LocationPickerArguments implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<LocationPickerArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final AddressParameter.Value f182142b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f182143c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Radius f182144d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f182145e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final LocationPickerChooseButtonLocation f182146f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final SearchParams f182147g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final PublishIntentFactory.JobAssistantParams f182148h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final AddressParameter.ValidationRules f182149i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f182150j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f182151k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f182152l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final LocationPickerScreenOpenEvent.EventSource f182153m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f182154n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public final String f182155o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f182156p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final LocationFlowType f182157q;

    /* compiled from: LocationPickerArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<LocationPickerArguments> {
        @Override // android.os.Parcelable.Creator
        public final LocationPickerArguments createFromParcel(Parcel parcel) {
            return new LocationPickerArguments((AddressParameter.Value) parcel.readParcelable(LocationPickerArguments.class.getClassLoader()), parcel.readString(), (Radius) parcel.readParcelable(LocationPickerArguments.class.getClassLoader()), parcel.readString(), LocationPickerChooseButtonLocation.valueOf(parcel.readString()), (SearchParams) parcel.readParcelable(LocationPickerArguments.class.getClassLoader()), (PublishIntentFactory.JobAssistantParams) parcel.readParcelable(LocationPickerArguments.class.getClassLoader()), (AddressParameter.ValidationRules) parcel.readParcelable(LocationPickerArguments.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : LocationPickerScreenOpenEvent.EventSource.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, (LocationFlowType) parcel.readParcelable(LocationPickerArguments.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final LocationPickerArguments[] newArray(int i12) {
            return new LocationPickerArguments[i12];
        }
    }

    public LocationPickerArguments(@Y61.l AddressParameter.Value value, @Y61.l String str, @Y61.l Radius radius, @Y61.l String str2, @Y61.k LocationPickerChooseButtonLocation locationPickerChooseButtonLocation, @Y61.l SearchParams searchParams, @Y61.l PublishIntentFactory.JobAssistantParams jobAssistantParams, @Y61.l AddressParameter.ValidationRules validationRules, boolean z12, boolean z13, boolean z14, @Y61.l LocationPickerScreenOpenEvent.EventSource eventSource, boolean z15, @Y61.l String str3, boolean z16, @Y61.k LocationFlowType locationFlowType) {
        this.f182142b = value;
        this.f182143c = str;
        this.f182144d = radius;
        this.f182145e = str2;
        this.f182146f = locationPickerChooseButtonLocation;
        this.f182147g = searchParams;
        this.f182148h = jobAssistantParams;
        this.f182149i = validationRules;
        this.f182150j = z12;
        this.f182151k = z13;
        this.f182152l = z14;
        this.f182153m = eventSource;
        this.f182154n = z15;
        this.f182155o = str3;
        this.f182156p = z16;
        this.f182157q = locationFlowType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationPickerArguments)) {
            return false;
        }
        LocationPickerArguments locationPickerArguments = (LocationPickerArguments) obj;
        return kotlin.jvm.internal.L.f(this.f182142b, locationPickerArguments.f182142b) && kotlin.jvm.internal.L.f(this.f182143c, locationPickerArguments.f182143c) && kotlin.jvm.internal.L.f(this.f182144d, locationPickerArguments.f182144d) && kotlin.jvm.internal.L.f(this.f182145e, locationPickerArguments.f182145e) && this.f182146f == locationPickerArguments.f182146f && kotlin.jvm.internal.L.f(this.f182147g, locationPickerArguments.f182147g) && kotlin.jvm.internal.L.f(this.f182148h, locationPickerArguments.f182148h) && kotlin.jvm.internal.L.f(this.f182149i, locationPickerArguments.f182149i) && this.f182150j == locationPickerArguments.f182150j && this.f182151k == locationPickerArguments.f182151k && this.f182152l == locationPickerArguments.f182152l && this.f182153m == locationPickerArguments.f182153m && this.f182154n == locationPickerArguments.f182154n && kotlin.jvm.internal.L.f(this.f182155o, locationPickerArguments.f182155o) && this.f182156p == locationPickerArguments.f182156p && this.f182157q == locationPickerArguments.f182157q;
    }

    public final int hashCode() {
        AddressParameter.Value value = this.f182142b;
        int iHashCode = (value == null ? 0 : value.hashCode()) * 31;
        String str = this.f182143c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Radius radius = this.f182144d;
        int iHashCode3 = (iHashCode2 + (radius == null ? 0 : radius.hashCode())) * 31;
        String str2 = this.f182145e;
        int iHashCode4 = (this.f182146f.hashCode() + ((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        SearchParams searchParams = this.f182147g;
        int iHashCode5 = (iHashCode4 + (searchParams == null ? 0 : searchParams.hashCode())) * 31;
        PublishIntentFactory.JobAssistantParams jobAssistantParams = this.f182148h;
        int iHashCode6 = (iHashCode5 + (jobAssistantParams == null ? 0 : jobAssistantParams.f231990b.hashCode())) * 31;
        AddressParameter.ValidationRules validationRules = this.f182149i;
        int i12 = androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i((iHashCode6 + (validationRules == null ? 0 : validationRules.hashCode())) * 31, 31, this.f182150j), 31, this.f182151k), 31, this.f182152l);
        LocationPickerScreenOpenEvent.EventSource eventSource = this.f182153m;
        int i13 = androidx.appcompat.app.r.i((i12 + (eventSource == null ? 0 : eventSource.hashCode())) * 31, 31, this.f182154n);
        String str3 = this.f182155o;
        return this.f182157q.hashCode() + androidx.appcompat.app.r.i((i13 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.f182156p);
    }

    @Y61.k
    public final String toString() {
        return "LocationPickerArguments(address=" + this.f182142b + ", itemId=" + this.f182143c + ", radius=" + this.f182144d + ", categoryId=" + this.f182145e + ", chooseButtonLocation=" + this.f182146f + ", parameters=" + this.f182147g + ", jobAssistantParams=" + this.f182148h + ", validationRules=" + this.f182149i + ", mapIsMovable=" + this.f182150j + ", withoutAppBar=" + this.f182151k + ", updateAdvertsCount=" + this.f182152l + ", openEventSource=" + this.f182153m + ", couldFragmentLiveAfterRadiusSelected=" + this.f182154n + ", paramId=" + this.f182155o + ", isPublishPicker=" + this.f182156p + ", flowType=" + this.f182157q + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f182142b, i12);
        parcel.writeString(this.f182143c);
        parcel.writeParcelable(this.f182144d, i12);
        parcel.writeString(this.f182145e);
        parcel.writeString(this.f182146f.name());
        parcel.writeParcelable(this.f182147g, i12);
        parcel.writeParcelable(this.f182148h, i12);
        parcel.writeParcelable(this.f182149i, i12);
        parcel.writeInt(this.f182150j ? 1 : 0);
        parcel.writeInt(this.f182151k ? 1 : 0);
        parcel.writeInt(this.f182152l ? 1 : 0);
        LocationPickerScreenOpenEvent.EventSource eventSource = this.f182153m;
        if (eventSource == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            eventSource.writeToParcel(parcel, i12);
        }
        parcel.writeInt(this.f182154n ? 1 : 0);
        parcel.writeString(this.f182155o);
        parcel.writeInt(this.f182156p ? 1 : 0);
        parcel.writeParcelable(this.f182157q, i12);
    }

    public /* synthetic */ LocationPickerArguments(AddressParameter.Value value, String str, Radius radius, String str2, LocationPickerChooseButtonLocation locationPickerChooseButtonLocation, SearchParams searchParams, PublishIntentFactory.JobAssistantParams jobAssistantParams, AddressParameter.ValidationRules validationRules, boolean z12, boolean z13, boolean z14, LocationPickerScreenOpenEvent.EventSource eventSource, boolean z15, String str3, boolean z16, LocationFlowType locationFlowType, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : value, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? null : radius, (i12 & 8) != 0 ? null : str2, (i12 & 16) != 0 ? LocationPickerChooseButtonLocation.f182519b : locationPickerChooseButtonLocation, (i12 & 32) != 0 ? null : searchParams, (i12 & 64) != 0 ? null : jobAssistantParams, (i12 & 128) != 0 ? null : validationRules, (i12 & 256) != 0 ? false : z12, (i12 & 512) != 0 ? false : z13, (i12 & 1024) != 0 ? true : z14, (i12 & 2048) != 0 ? null : eventSource, (i12 & 4096) != 0 ? false : z15, (i12 & 8192) != 0 ? null : str3, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? false : z16, locationFlowType);
    }
}
