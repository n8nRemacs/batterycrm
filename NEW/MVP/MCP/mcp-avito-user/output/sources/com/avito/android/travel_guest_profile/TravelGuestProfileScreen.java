package com.avito.android.travel_guest_profile;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: TravelGuestProfileFragment.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/travel_guest_profile/TravelGuestProfileScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@I60.b
/* loaded from: classes4.dex */
public final class TravelGuestProfileScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final TravelGuestProfileScreen f301863d = new TravelGuestProfileScreen();

    @k
    public static final Parcelable.Creator<TravelGuestProfileScreen> CREATOR = new a();

    /* compiled from: TravelGuestProfileFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TravelGuestProfileScreen> {
        @Override // android.os.Parcelable.Creator
        public final TravelGuestProfileScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return TravelGuestProfileScreen.f301863d;
        }

        @Override // android.os.Parcelable.Creator
        public final TravelGuestProfileScreen[] newArray(int i12) {
            return new TravelGuestProfileScreen[i12];
        }
    }

    public TravelGuestProfileScreen() {
        super("TravelGuestProfile", false, 2, null);
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
