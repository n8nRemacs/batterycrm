package com.avito.android.user_viewed.screen.ui.item.error;

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

/* compiled from: UserViewedErrorItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_viewed/screen/ui/item/error/UserViewedErrorItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_user-viewed_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UserViewedErrorItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<UserViewedErrorItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f318492b;

    /* compiled from: UserViewedErrorItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UserViewedErrorItem> {
        @Override // android.os.Parcelable.Creator
        public final UserViewedErrorItem createFromParcel(Parcel parcel) {
            return new UserViewedErrorItem(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UserViewedErrorItem[] newArray(int i12) {
            return new UserViewedErrorItem[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UserViewedErrorItem() {
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
        return (obj instanceof UserViewedErrorItem) && L.f(this.f318492b, ((UserViewedErrorItem) obj).f318492b);
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
        return this.f318492b;
    }

    public final int hashCode() {
        return this.f318492b.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("UserViewedErrorItem(stringId="), this.f318492b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f318492b);
    }

    public UserViewedErrorItem(@k String str) {
        this.f318492b = str;
    }

    public /* synthetic */ UserViewedErrorItem(String str, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "ErrorViewedItem" : str);
    }
}
