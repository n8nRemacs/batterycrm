package com.avito.android.profile.pro.impl.screen.item.group.title;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ProfileProGroupTitleItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/group/title/ProfileProGroupTitleItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ProfileProGroupTitleItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<ProfileProGroupTitleItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f223320b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f223321c;

    /* compiled from: ProfileProGroupTitleItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ProfileProGroupTitleItem> {
        @Override // android.os.Parcelable.Creator
        public final ProfileProGroupTitleItem createFromParcel(Parcel parcel) {
            return new ProfileProGroupTitleItem(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ProfileProGroupTitleItem[] newArray(int i12) {
            return new ProfileProGroupTitleItem[i12];
        }
    }

    public ProfileProGroupTitleItem(@k String str, @k String str2) {
        this.f223320b = str;
        this.f223321c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileProGroupTitleItem)) {
            return false;
        }
        ProfileProGroupTitleItem profileProGroupTitleItem = (ProfileProGroupTitleItem) obj;
        return L.f(this.f223320b, profileProGroupTitleItem.f223320b) && L.f(this.f223321c, profileProGroupTitleItem.f223321c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF162211b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF3295b() {
        return this.f223320b;
    }

    public final int hashCode() {
        return this.f223321c.hashCode() + (this.f223320b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProfileProGroupTitleItem(stringId=");
        sb2.append(this.f223320b);
        sb2.append(", title=");
        return C22026a.c(sb2, this.f223321c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f223320b);
        parcel.writeString(this.f223321c);
    }
}
