package com.avito.android.seller_room.ui;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.util.OpenParams;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SellerRoomActivity.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/seller_room/ui/SellerRoomOpenParams;", "Lcom/avito/android/util/OpenParams;", "_avito_seller-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SellerRoomOpenParams implements OpenParams {

    @k
    public static final Parcelable.Creator<SellerRoomOpenParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f268237b;

    /* compiled from: SellerRoomActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SellerRoomOpenParams> {
        @Override // android.os.Parcelable.Creator
        public final SellerRoomOpenParams createFromParcel(Parcel parcel) {
            return new SellerRoomOpenParams(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SellerRoomOpenParams[] newArray(int i12) {
            return new SellerRoomOpenParams[i12];
        }
    }

    public SellerRoomOpenParams(@l String str) {
        this.f268237b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SellerRoomOpenParams) && L.f(this.f268237b, ((SellerRoomOpenParams) obj).f268237b);
    }

    public final int hashCode() {
        String str = this.f268237b;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("SellerRoomOpenParams(source="), this.f268237b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f268237b);
    }
}
