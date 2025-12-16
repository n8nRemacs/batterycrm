package com.avito.android.profile.pro.impl.screen.item.delivery_restriction;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ProfileProDeliveryRestrictionBannerItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/delivery_restriction/ProfileProDeliveryRestrictionBannerItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "DeliveryRestrictionAction", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ProfileProDeliveryRestrictionBannerItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<ProfileProDeliveryRestrictionBannerItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f223187b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f223188c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final DeliveryRestrictionAction f223189d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final UniversalImage f223190e;

    /* compiled from: ProfileProDeliveryRestrictionBannerItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/delivery_restriction/ProfileProDeliveryRestrictionBannerItem$DeliveryRestrictionAction;", "Landroid/os/Parcelable;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DeliveryRestrictionAction implements Parcelable {

        @k
        public static final Parcelable.Creator<DeliveryRestrictionAction> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f223191b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final DeepLink f223192c;

        /* compiled from: ProfileProDeliveryRestrictionBannerItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<DeliveryRestrictionAction> {
            @Override // android.os.Parcelable.Creator
            public final DeliveryRestrictionAction createFromParcel(Parcel parcel) {
                return new DeliveryRestrictionAction(parcel.readString(), (DeepLink) parcel.readParcelable(DeliveryRestrictionAction.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final DeliveryRestrictionAction[] newArray(int i12) {
                return new DeliveryRestrictionAction[i12];
            }
        }

        public DeliveryRestrictionAction(@k String str, @k DeepLink deepLink) {
            this.f223191b = str;
            this.f223192c = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DeliveryRestrictionAction)) {
                return false;
            }
            DeliveryRestrictionAction deliveryRestrictionAction = (DeliveryRestrictionAction) obj;
            return L.f(this.f223191b, deliveryRestrictionAction.f223191b) && L.f(this.f223192c, deliveryRestrictionAction.f223192c);
        }

        public final int hashCode() {
            return this.f223192c.hashCode() + (this.f223191b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DeliveryRestrictionAction(title=");
            sb2.append(this.f223191b);
            sb2.append(", deeplink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f223192c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f223191b);
            parcel.writeParcelable(this.f223192c, i12);
        }
    }

    /* compiled from: ProfileProDeliveryRestrictionBannerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ProfileProDeliveryRestrictionBannerItem> {
        @Override // android.os.Parcelable.Creator
        public final ProfileProDeliveryRestrictionBannerItem createFromParcel(Parcel parcel) {
            return new ProfileProDeliveryRestrictionBannerItem(parcel.readString(), (AttributedText) parcel.readParcelable(ProfileProDeliveryRestrictionBannerItem.class.getClassLoader()), DeliveryRestrictionAction.CREATOR.createFromParcel(parcel), (UniversalImage) parcel.readParcelable(ProfileProDeliveryRestrictionBannerItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ProfileProDeliveryRestrictionBannerItem[] newArray(int i12) {
            return new ProfileProDeliveryRestrictionBannerItem[i12];
        }
    }

    public ProfileProDeliveryRestrictionBannerItem(@k String str, @k AttributedText attributedText, @k DeliveryRestrictionAction deliveryRestrictionAction, @k UniversalImage universalImage) {
        this.f223187b = str;
        this.f223188c = attributedText;
        this.f223189d = deliveryRestrictionAction;
        this.f223190e = universalImage;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileProDeliveryRestrictionBannerItem)) {
            return false;
        }
        ProfileProDeliveryRestrictionBannerItem profileProDeliveryRestrictionBannerItem = (ProfileProDeliveryRestrictionBannerItem) obj;
        return L.f(this.f223187b, profileProDeliveryRestrictionBannerItem.f223187b) && L.f(this.f223188c, profileProDeliveryRestrictionBannerItem.f223188c) && L.f(this.f223189d, profileProDeliveryRestrictionBannerItem.f223189d) && L.f(this.f223190e, profileProDeliveryRestrictionBannerItem.f223190e);
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
        return this.f223187b;
    }

    public final int hashCode() {
        return this.f223190e.hashCode() + ((this.f223189d.hashCode() + com.avito.android.actions_sheet.a.b(this.f223187b.hashCode() * 31, 31, this.f223188c)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProfileProDeliveryRestrictionBannerItem(stringId=");
        sb2.append(this.f223187b);
        sb2.append(", title=");
        sb2.append(this.f223188c);
        sb2.append(", action=");
        sb2.append(this.f223189d);
        sb2.append(", image=");
        return com.avito.android.advert.item.delivery_suggests.l.s(sb2, this.f223190e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f223187b);
        parcel.writeParcelable(this.f223188c, i12);
        this.f223189d.writeToParcel(parcel, i12);
        parcel.writeParcelable(this.f223190e, i12);
    }
}
