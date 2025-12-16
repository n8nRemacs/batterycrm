package com.avito.android.publish.slots.user_verification.banner;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UserVerificationBannerItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/user_verification/banner/UserVerificationBannerItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class UserVerificationBannerItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<UserVerificationBannerItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f245083b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final AttributedText f245084c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AttributedText f245085d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f245086e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f245087f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final UniversalColor f245088g;

    /* compiled from: UserVerificationBannerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UserVerificationBannerItem> {
        @Override // android.os.Parcelable.Creator
        public final UserVerificationBannerItem createFromParcel(Parcel parcel) {
            return new UserVerificationBannerItem(parcel.readString(), (AttributedText) parcel.readParcelable(UserVerificationBannerItem.class.getClassLoader()), (AttributedText) parcel.readParcelable(UserVerificationBannerItem.class.getClassLoader()), parcel.readString(), parcel.readString(), (UniversalColor) parcel.readParcelable(UserVerificationBannerItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final UserVerificationBannerItem[] newArray(int i12) {
            return new UserVerificationBannerItem[i12];
        }
    }

    public UserVerificationBannerItem(@k String str, @l AttributedText attributedText, @l AttributedText attributedText2, @l String str2, @l String str3, @l UniversalColor universalColor) {
        this.f245083b = str;
        this.f245084c = attributedText;
        this.f245085d = attributedText2;
        this.f245086e = str2;
        this.f245087f = str3;
        this.f245088g = universalColor;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserVerificationBannerItem)) {
            return false;
        }
        UserVerificationBannerItem userVerificationBannerItem = (UserVerificationBannerItem) obj;
        return L.f(this.f245083b, userVerificationBannerItem.f245083b) && L.f(this.f245084c, userVerificationBannerItem.f245084c) && L.f(this.f245085d, userVerificationBannerItem.f245085d) && L.f(this.f245086e, userVerificationBannerItem.f245086e) && L.f(this.f245087f, userVerificationBannerItem.f245087f) && L.f(this.f245088g, userVerificationBannerItem.f245088g);
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF244992b() {
        return this.f245083b;
    }

    public final int hashCode() {
        int iHashCode = this.f245083b.hashCode() * 31;
        AttributedText attributedText = this.f245084c;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        AttributedText attributedText2 = this.f245085d;
        int iHashCode3 = (iHashCode2 + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        String str = this.f245086e;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f245087f;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        UniversalColor universalColor = this.f245088g;
        return iHashCode5 + (universalColor != null ? universalColor.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UserVerificationBannerItem(stringId=");
        sb2.append(this.f245083b);
        sb2.append(", title=");
        sb2.append(this.f245084c);
        sb2.append(", text=");
        sb2.append(this.f245085d);
        sb2.append(", iconName=");
        sb2.append(this.f245086e);
        sb2.append(", iconColor=");
        sb2.append(this.f245087f);
        sb2.append(", backgroundColor=");
        return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.f245088g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f245083b);
        parcel.writeParcelable(this.f245084c, i12);
        parcel.writeParcelable(this.f245085d, i12);
        parcel.writeString(this.f245086e);
        parcel.writeString(this.f245087f);
        parcel.writeParcelable(this.f245088g, i12);
    }
}
