package com.avito.android.profile.user_profile.cards.service_booking.items.order;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ServiceBookingItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/service_booking/items/order/ServiceBookingItem;", "Lcom/avito/android/profile/user_profile/cards/service_booking/items/ServiceBookingItem;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ServiceBookingItem implements com.avito.android.profile.user_profile.cards.service_booking.items.ServiceBookingItem {

    @k
    public static final Parcelable.Creator<ServiceBookingItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f225454b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f225455c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f225456d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final AttributedText f225457e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Image f225458f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final DeepLink f225459g;

    /* compiled from: ServiceBookingItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ServiceBookingItem> {
        @Override // android.os.Parcelable.Creator
        public final ServiceBookingItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            return new ServiceBookingItem((Image) parcel.readParcelable(ServiceBookingItem.class.getClassLoader()), (DeepLink) parcel.readParcelable(ServiceBookingItem.class.getClassLoader()), string, (AttributedText) parcel.readParcelable(ServiceBookingItem.class.getClassLoader()), string2, string3);
        }

        @Override // android.os.Parcelable.Creator
        public final ServiceBookingItem[] newArray(int i12) {
            return new ServiceBookingItem[i12];
        }
    }

    public ServiceBookingItem(@l Image image, @l DeepLink deepLink, @k String str, @l AttributedText attributedText, @l String str2, @l String str3) {
        this.f225454b = str;
        this.f225455c = str2;
        this.f225456d = str3;
        this.f225457e = attributedText;
        this.f225458f = image;
        this.f225459g = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceBookingItem)) {
            return false;
        }
        ServiceBookingItem serviceBookingItem = (ServiceBookingItem) obj;
        return L.f(this.f225454b, serviceBookingItem.f225454b) && L.f(this.f225455c, serviceBookingItem.f225455c) && L.f(this.f225456d, serviceBookingItem.f225456d) && L.f(this.f225457e, serviceBookingItem.f225457e) && L.f(this.f225458f, serviceBookingItem.f225458f) && L.f(this.f225459g, serviceBookingItem.f225459g);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85355b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF223187b() {
        return this.f225454b;
    }

    public final int hashCode() {
        int iHashCode = this.f225454b.hashCode() * 31;
        String str = this.f225455c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f225456d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        AttributedText attributedText = this.f225457e;
        int iHashCode4 = (iHashCode3 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        Image image = this.f225458f;
        int iHashCode5 = (iHashCode4 + (image == null ? 0 : image.hashCode())) * 31;
        DeepLink deepLink = this.f225459g;
        return iHashCode5 + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ServiceBookingItem(stringId=");
        sb2.append(this.f225454b);
        sb2.append(", title=");
        sb2.append(this.f225455c);
        sb2.append(", subtitle=");
        sb2.append(this.f225456d);
        sb2.append(", additionalText=");
        sb2.append(this.f225457e);
        sb2.append(", image=");
        sb2.append(this.f225458f);
        sb2.append(", deepLink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f225459g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f225454b);
        parcel.writeString(this.f225455c);
        parcel.writeString(this.f225456d);
        parcel.writeParcelable(this.f225457e, i12);
        parcel.writeParcelable(this.f225458f, i12);
        parcel.writeParcelable(this.f225459g, i12);
    }
}
