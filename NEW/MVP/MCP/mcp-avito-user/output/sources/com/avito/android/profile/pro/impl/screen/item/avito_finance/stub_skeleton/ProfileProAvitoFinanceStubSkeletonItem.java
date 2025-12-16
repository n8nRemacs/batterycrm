package com.avito.android.profile.pro.impl.screen.item.avito_finance.stub_skeleton;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;

/* compiled from: ProfileProAvitoFinanceStubSkeletonItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/avito_finance/stub_skeleton/ProfileProAvitoFinanceStubSkeletonItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ProfileProAvitoFinanceStubSkeletonItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<ProfileProAvitoFinanceStubSkeletonItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f223057b;

    /* compiled from: ProfileProAvitoFinanceStubSkeletonItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ProfileProAvitoFinanceStubSkeletonItem> {
        @Override // android.os.Parcelable.Creator
        public final ProfileProAvitoFinanceStubSkeletonItem createFromParcel(Parcel parcel) {
            return new ProfileProAvitoFinanceStubSkeletonItem(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ProfileProAvitoFinanceStubSkeletonItem[] newArray(int i12) {
            return new ProfileProAvitoFinanceStubSkeletonItem[i12];
        }
    }

    public ProfileProAvitoFinanceStubSkeletonItem(@k String str) {
        this.f223057b = str;
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
    public final String getF223334b() {
        return this.f223057b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f223057b);
    }
}
