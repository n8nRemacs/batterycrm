package com.avito.android.user_viewed.screen.ui.item.tracker;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: UserViewedTrackerItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_viewed/screen/ui/item/tracker/UserViewedTrackerItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_user-viewed_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UserViewedTrackerItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<UserViewedTrackerItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f318502b;

    /* compiled from: UserViewedTrackerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UserViewedTrackerItem> {
        @Override // android.os.Parcelable.Creator
        public final UserViewedTrackerItem createFromParcel(Parcel parcel) {
            return new UserViewedTrackerItem(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UserViewedTrackerItem[] newArray(int i12) {
            return new UserViewedTrackerItem[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UserViewedTrackerItem() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UserViewedTrackerItem) && L.f(this.f318502b, ((UserViewedTrackerItem) obj).f318502b);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF207369c() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF318100b() {
        return this.f318502b;
    }

    public final int hashCode() {
        return this.f318502b.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("UserViewedTrackerItem(stringId="), this.f318502b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f318502b);
    }

    public UserViewedTrackerItem(@k String str) {
        this.f318502b = str;
    }

    public /* synthetic */ UserViewedTrackerItem(String str, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "UserViewedTrackerItem" : str);
    }
}
