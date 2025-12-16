package com.avito.android.seller_room.perf_screen_const;

import I60.b;
import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: SellerRoomConst.kt */
@d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/seller_room/perf_screen_const/SellerRoomBeduinV2Screen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_seller-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@b
/* loaded from: classes3.dex */
public final class SellerRoomBeduinV2Screen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final SellerRoomBeduinV2Screen f268215d = new SellerRoomBeduinV2Screen();

    @k
    public static final Parcelable.Creator<SellerRoomBeduinV2Screen> CREATOR = new a();

    /* compiled from: SellerRoomConst.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SellerRoomBeduinV2Screen> {
        @Override // android.os.Parcelable.Creator
        public final SellerRoomBeduinV2Screen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return SellerRoomBeduinV2Screen.f268215d;
        }

        @Override // android.os.Parcelable.Creator
        public final SellerRoomBeduinV2Screen[] newArray(int i12) {
            return new SellerRoomBeduinV2Screen[i12];
        }
    }

    public SellerRoomBeduinV2Screen() {
        super("SellerRoomBeduinV2ScreenName", false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(1);
    }
}
