package com.avito.android.profile.user_profile.cards.service_booking.items.detailed_info;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.component.accordion.s;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.profile.user_profile.cards.service_booking.items.ServiceBookingItem;
import com.avito.conveyor_item.a;
import j.InterfaceC42150f;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ServiceBookingsDetailedInfoItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/service_booking/items/detailed_info/ServiceBookingsDetailedInfoItem;", "Lcom/avito/android/profile/user_profile/cards/service_booking/items/ServiceBookingItem;", "Icon", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ServiceBookingsDetailedInfoItem implements ServiceBookingItem {

    @k
    public static final Parcelable.Creator<ServiceBookingsDetailedInfoItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f225422b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f225423c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final DeepLink f225424d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Icon f225425e;

    /* compiled from: ServiceBookingsDetailedInfoItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/service_booking/items/detailed_info/ServiceBookingsDetailedInfoItem$Icon;", "Landroid/os/Parcelable;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Icon implements Parcelable {

        @k
        public static final Parcelable.Creator<Icon> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Integer f225426b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Integer f225427c;

        /* compiled from: ServiceBookingsDetailedInfoItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Icon> {
            @Override // android.os.Parcelable.Creator
            public final Icon createFromParcel(Parcel parcel) {
                return new Icon(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Icon[] newArray(int i12) {
                return new Icon[i12];
            }
        }

        public Icon(@InterfaceC42150f @l Integer num, @InterfaceC42150f @l Integer num2) {
            this.f225426b = num;
            this.f225427c = num2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Icon)) {
                return false;
            }
            Icon icon = (Icon) obj;
            return L.f(this.f225426b, icon.f225426b) && L.f(this.f225427c, icon.f225427c);
        }

        public final int hashCode() {
            Integer num = this.f225426b;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.f225427c;
            return iHashCode + (num2 != null ? num2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Icon(iconRes=");
            sb2.append(this.f225426b);
            sb2.append(", iconTint=");
            return s.j(sb2, this.f225427c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            Integer num = this.f225426b;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num);
            }
            Integer num2 = this.f225427c;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num2);
            }
        }
    }

    /* compiled from: ServiceBookingsDetailedInfoItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ServiceBookingsDetailedInfoItem> {
        @Override // android.os.Parcelable.Creator
        public final ServiceBookingsDetailedInfoItem createFromParcel(Parcel parcel) {
            return new ServiceBookingsDetailedInfoItem(parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(ServiceBookingsDetailedInfoItem.class.getClassLoader()), parcel.readInt() == 0 ? null : Icon.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ServiceBookingsDetailedInfoItem[] newArray(int i12) {
            return new ServiceBookingsDetailedInfoItem[i12];
        }
    }

    public ServiceBookingsDetailedInfoItem(@k String str, @l String str2, @l DeepLink deepLink, @l Icon icon) {
        this.f225422b = str;
        this.f225423c = str2;
        this.f225424d = deepLink;
        this.f225425e = icon;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceBookingsDetailedInfoItem)) {
            return false;
        }
        ServiceBookingsDetailedInfoItem serviceBookingsDetailedInfoItem = (ServiceBookingsDetailedInfoItem) obj;
        return L.f(this.f225422b, serviceBookingsDetailedInfoItem.f225422b) && L.f(this.f225423c, serviceBookingsDetailedInfoItem.f225423c) && L.f(this.f225424d, serviceBookingsDetailedInfoItem.f225424d) && L.f(this.f225425e, serviceBookingsDetailedInfoItem.f225425e);
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
        return this.f225422b;
    }

    public final int hashCode() {
        int iHashCode = this.f225422b.hashCode() * 31;
        String str = this.f225423c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        DeepLink deepLink = this.f225424d;
        int iHashCode3 = (iHashCode2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        Icon icon = this.f225425e;
        return iHashCode3 + (icon != null ? icon.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "ServiceBookingsDetailedInfoItem(stringId=" + this.f225422b + ", title=" + this.f225423c + ", deeplink=" + this.f225424d + ", icon=" + this.f225425e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f225422b);
        parcel.writeString(this.f225423c);
        parcel.writeParcelable(this.f225424d, i12);
        Icon icon = this.f225425e;
        if (icon == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            icon.writeToParcel(parcel, i12);
        }
    }
}
