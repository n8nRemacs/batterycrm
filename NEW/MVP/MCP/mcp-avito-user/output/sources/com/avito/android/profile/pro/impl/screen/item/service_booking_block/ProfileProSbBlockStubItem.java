package com.avito.android.profile.pro.impl.screen.item.service_booking_block;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ProfileProSbBlockStubItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/service_booking_block/ProfileProSbBlockStubItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ProfileProSbBlockStubItem implements ParcelableItem {

    @Y61.k
    public static final Parcelable.Creator<ProfileProSbBlockStubItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f223480b;

    /* compiled from: ProfileProSbBlockStubItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ProfileProSbBlockStubItem> {
        @Override // android.os.Parcelable.Creator
        public final ProfileProSbBlockStubItem createFromParcel(Parcel parcel) {
            return new ProfileProSbBlockStubItem(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ProfileProSbBlockStubItem[] newArray(int i12) {
            return new ProfileProSbBlockStubItem[i12];
        }
    }

    public ProfileProSbBlockStubItem(@Y61.k String str) {
        this.f223480b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProfileProSbBlockStubItem) && L.f(this.f223480b, ((ProfileProSbBlockStubItem) obj).f223480b);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF222262b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF215037b() {
        return this.f223480b;
    }

    public final int hashCode() {
        return this.f223480b.hashCode();
    }

    @Y61.k
    public final String toString() {
        return C22026a.c(new StringBuilder("ProfileProSbBlockStubItem(stringId="), this.f223480b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f223480b);
    }
}
