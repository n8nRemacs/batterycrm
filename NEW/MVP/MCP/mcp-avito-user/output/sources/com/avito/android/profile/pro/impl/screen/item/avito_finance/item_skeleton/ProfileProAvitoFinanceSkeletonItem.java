package com.avito.android.profile.pro.impl.screen.item.avito_finance.item_skeleton;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;

/* compiled from: ProfileProAvitoFinanceSkeletonItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/avito_finance/item_skeleton/ProfileProAvitoFinanceSkeletonItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ProfileProAvitoFinanceSkeletonItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<ProfileProAvitoFinanceSkeletonItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f223026b;

    /* compiled from: ProfileProAvitoFinanceSkeletonItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ProfileProAvitoFinanceSkeletonItem> {
        @Override // android.os.Parcelable.Creator
        public final ProfileProAvitoFinanceSkeletonItem createFromParcel(Parcel parcel) {
            return new ProfileProAvitoFinanceSkeletonItem(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ProfileProAvitoFinanceSkeletonItem[] newArray(int i12) {
            return new ProfileProAvitoFinanceSkeletonItem[i12];
        }
    }

    public ProfileProAvitoFinanceSkeletonItem(@k String str) {
        this.f223026b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF162211b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF220855b() {
        return this.f223026b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f223026b);
    }
}
