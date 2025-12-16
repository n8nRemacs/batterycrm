package com.avito.android.rubricator.list.service.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ServiceListItem.kt */
@d
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rubricator/list/service/model/ServiceListItem;", "Lcom/avito/conveyor_item/a;", "Landroid/os/Parcelable;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ServiceListItem implements com.avito.conveyor_item.a, Parcelable {

    @k
    public static final Parcelable.Creator<ServiceListItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f256010b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Uri f256011c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f256012d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f256013e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final DeepLink f256014f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final UniversalImage f256015g;

    /* compiled from: ServiceListItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ServiceListItem> {
        @Override // android.os.Parcelable.Creator
        public final ServiceListItem createFromParcel(Parcel parcel) {
            return new ServiceListItem(parcel.readString(), (Uri) parcel.readParcelable(ServiceListItem.class.getClassLoader()), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(ServiceListItem.class.getClassLoader()), (UniversalImage) parcel.readParcelable(ServiceListItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ServiceListItem[] newArray(int i12) {
            return new ServiceListItem[i12];
        }
    }

    public ServiceListItem(@k String str, @l Uri uri, @l String str2, @l String str3, @k DeepLink deepLink, @l UniversalImage universalImage) {
        this.f256010b = str;
        this.f256011c = uri;
        this.f256012d = str2;
        this.f256013e = str3;
        this.f256014f = deepLink;
        this.f256015g = universalImage;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceListItem)) {
            return false;
        }
        ServiceListItem serviceListItem = (ServiceListItem) obj;
        return L.f(this.f256010b, serviceListItem.f256010b) && L.f(this.f256011c, serviceListItem.f256011c) && L.f(this.f256012d, serviceListItem.f256012d) && L.f(this.f256013e, serviceListItem.f256013e) && L.f(this.f256014f, serviceListItem.f256014f) && L.f(this.f256015g, serviceListItem.f256015g);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF84801b() {
        return getF250019b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF250019b() {
        return this.f256010b;
    }

    public final int hashCode() {
        int iHashCode = this.f256010b.hashCode() * 31;
        Uri uri = this.f256011c;
        int iHashCode2 = (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31;
        String str = this.f256012d;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f256013e;
        int iE2 = com.avito.android.actions_sheet.a.e(this.f256014f, (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        UniversalImage universalImage = this.f256015g;
        return iE2 + (universalImage != null ? universalImage.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ServiceListItem(stringId=");
        sb2.append(this.f256010b);
        sb2.append(", iconUri=");
        sb2.append(this.f256011c);
        sb2.append(", title=");
        sb2.append(this.f256012d);
        sb2.append(", subtitle=");
        sb2.append(this.f256013e);
        sb2.append(", deepLink=");
        sb2.append(this.f256014f);
        sb2.append(", image=");
        return com.avito.android.advert.item.delivery_suggests.l.s(sb2, this.f256015g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f256010b);
        parcel.writeParcelable(this.f256011c, i12);
        parcel.writeString(this.f256012d);
        parcel.writeString(this.f256013e);
        parcel.writeParcelable(this.f256014f, i12);
        parcel.writeParcelable(this.f256015g, i12);
    }
}
