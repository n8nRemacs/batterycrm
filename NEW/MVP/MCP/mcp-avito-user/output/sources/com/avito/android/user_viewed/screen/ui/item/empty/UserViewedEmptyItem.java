package com.avito.android.user_viewed.screen.ui.item.empty;

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

/* compiled from: UserViewedEmptyItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_viewed/screen/ui/item/empty/UserViewedEmptyItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_user-viewed_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UserViewedEmptyItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<UserViewedEmptyItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f318488b;

    /* compiled from: UserViewedEmptyItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UserViewedEmptyItem> {
        @Override // android.os.Parcelable.Creator
        public final UserViewedEmptyItem createFromParcel(Parcel parcel) {
            return new UserViewedEmptyItem(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UserViewedEmptyItem[] newArray(int i12) {
            return new UserViewedEmptyItem[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UserViewedEmptyItem() {
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
        return (obj instanceof UserViewedEmptyItem) && L.f(this.f318488b, ((UserViewedEmptyItem) obj).f318488b);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF207369c() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF318488b() {
        return this.f318488b;
    }

    public final int hashCode() {
        return this.f318488b.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("UserViewedEmptyItem(stringId="), this.f318488b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f318488b);
    }

    public UserViewedEmptyItem(@k String str) {
        this.f318488b = str;
    }

    public /* synthetic */ UserViewedEmptyItem(String str, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "EmptyViewedItem" : str);
    }
}
