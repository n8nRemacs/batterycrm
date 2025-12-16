package com.avito.android.profile.pro.impl.screen.item.rating;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ProfileProRatingItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/rating/ProfileProRatingItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ProfileProRatingItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<ProfileProRatingItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f223392b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final AttributedText f223393c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final DeepLink f223394d;

    /* compiled from: ProfileProRatingItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ProfileProRatingItem> {
        @Override // android.os.Parcelable.Creator
        public final ProfileProRatingItem createFromParcel(Parcel parcel) {
            return new ProfileProRatingItem((DeepLink) parcel.readParcelable(ProfileProRatingItem.class.getClassLoader()), parcel.readString(), (AttributedText) parcel.readParcelable(ProfileProRatingItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ProfileProRatingItem[] newArray(int i12) {
            return new ProfileProRatingItem[i12];
        }
    }

    public ProfileProRatingItem(@l DeepLink deepLink, @k String str, @l AttributedText attributedText) {
        this.f223392b = str;
        this.f223393c = attributedText;
        this.f223394d = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileProRatingItem)) {
            return false;
        }
        ProfileProRatingItem profileProRatingItem = (ProfileProRatingItem) obj;
        return L.f(this.f223392b, profileProRatingItem.f223392b) && L.f(this.f223393c, profileProRatingItem.f223393c) && L.f(this.f223394d, profileProRatingItem.f223394d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF121506b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF223348b() {
        return this.f223392b;
    }

    public final int hashCode() {
        int iHashCode = this.f223392b.hashCode() * 31;
        AttributedText attributedText = this.f223393c;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        DeepLink deepLink = this.f223394d;
        return iHashCode2 + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProfileProRatingItem(stringId=");
        sb2.append(this.f223392b);
        sb2.append(", value=");
        sb2.append(this.f223393c);
        sb2.append(", uri=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f223394d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f223392b);
        parcel.writeParcelable(this.f223393c, i12);
        parcel.writeParcelable(this.f223394d, i12);
    }
}
