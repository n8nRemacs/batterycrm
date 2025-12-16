package com.avito.android.developments_agency_search.screen.deal_room_development;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: DealRoomDevelopmentScreen.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room_development/DealRoomDevelopmentScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@I60.b
@K51.d
/* loaded from: classes13.dex */
public final class DealRoomDevelopmentScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final DealRoomDevelopmentScreen f137845d = new DealRoomDevelopmentScreen();

    @k
    public static final Parcelable.Creator<DealRoomDevelopmentScreen> CREATOR = new a();

    /* compiled from: DealRoomDevelopmentScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DealRoomDevelopmentScreen> {
        @Override // android.os.Parcelable.Creator
        public final DealRoomDevelopmentScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return DealRoomDevelopmentScreen.f137845d;
        }

        @Override // android.os.Parcelable.Creator
        public final DealRoomDevelopmentScreen[] newArray(int i12) {
            return new DealRoomDevelopmentScreen[i12];
        }
    }

    public DealRoomDevelopmentScreen() {
        super("RealtyAgencyDealDevelopment", false, 2, null);
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
