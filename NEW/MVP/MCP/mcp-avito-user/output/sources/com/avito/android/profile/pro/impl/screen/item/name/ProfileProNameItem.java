package com.avito.android.profile.pro.impl.screen.item.name;

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

/* compiled from: ProfileProNameItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/name/ProfileProNameItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ProfileProNameItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<ProfileProNameItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f223348b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final AttributedText f223349c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final DeepLink f223350d;

    /* compiled from: ProfileProNameItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ProfileProNameItem> {
        @Override // android.os.Parcelable.Creator
        public final ProfileProNameItem createFromParcel(Parcel parcel) {
            return new ProfileProNameItem((DeepLink) parcel.readParcelable(ProfileProNameItem.class.getClassLoader()), parcel.readString(), (AttributedText) parcel.readParcelable(ProfileProNameItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ProfileProNameItem[] newArray(int i12) {
            return new ProfileProNameItem[i12];
        }
    }

    public ProfileProNameItem(@l DeepLink deepLink, @k String str, @l AttributedText attributedText) {
        this.f223348b = str;
        this.f223349c = attributedText;
        this.f223350d = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileProNameItem)) {
            return false;
        }
        ProfileProNameItem profileProNameItem = (ProfileProNameItem) obj;
        return L.f(this.f223348b, profileProNameItem.f223348b) && L.f(this.f223349c, profileProNameItem.f223349c) && L.f(this.f223350d, profileProNameItem.f223350d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF121506b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF223150b() {
        return this.f223348b;
    }

    public final int hashCode() {
        int iHashCode = this.f223348b.hashCode() * 31;
        AttributedText attributedText = this.f223349c;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        DeepLink deepLink = this.f223350d;
        return iHashCode2 + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProfileProNameItem(stringId=");
        sb2.append(this.f223348b);
        sb2.append(", value=");
        sb2.append(this.f223349c);
        sb2.append(", uri=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f223350d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f223348b);
        parcel.writeParcelable(this.f223349c, i12);
        parcel.writeParcelable(this.f223350d, i12);
    }
}
