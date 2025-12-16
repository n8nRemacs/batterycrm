package com.avito.android.profile.pro.impl.screen.item.widget_group.title;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ProfileProWidgetGroupTitleItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/widget_group/title/ProfileProWidgetGroupTitleItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ProfileProWidgetGroupTitleItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<ProfileProWidgetGroupTitleItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f223572b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f223573c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final DeepLink f223574d;

    /* compiled from: ProfileProWidgetGroupTitleItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ProfileProWidgetGroupTitleItem> {
        @Override // android.os.Parcelable.Creator
        public final ProfileProWidgetGroupTitleItem createFromParcel(Parcel parcel) {
            return new ProfileProWidgetGroupTitleItem(parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(ProfileProWidgetGroupTitleItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ProfileProWidgetGroupTitleItem[] newArray(int i12) {
            return new ProfileProWidgetGroupTitleItem[i12];
        }
    }

    public ProfileProWidgetGroupTitleItem(@k String str, @l String str2, @l DeepLink deepLink) {
        this.f223572b = str;
        this.f223573c = str2;
        this.f223574d = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileProWidgetGroupTitleItem)) {
            return false;
        }
        ProfileProWidgetGroupTitleItem profileProWidgetGroupTitleItem = (ProfileProWidgetGroupTitleItem) obj;
        return L.f(this.f223572b, profileProWidgetGroupTitleItem.f223572b) && L.f(this.f223573c, profileProWidgetGroupTitleItem.f223573c) && L.f(this.f223574d, profileProWidgetGroupTitleItem.f223574d);
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF223441b() {
        return this.f223572b;
    }

    public final int hashCode() {
        int iHashCode = this.f223572b.hashCode() * 31;
        String str = this.f223573c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        DeepLink deepLink = this.f223574d;
        return iHashCode2 + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProfileProWidgetGroupTitleItem(stringId=");
        sb2.append(this.f223572b);
        sb2.append(", title=");
        sb2.append(this.f223573c);
        sb2.append(", uri=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f223574d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f223572b);
        parcel.writeString(this.f223573c);
        parcel.writeParcelable(this.f223574d, i12);
    }
}
