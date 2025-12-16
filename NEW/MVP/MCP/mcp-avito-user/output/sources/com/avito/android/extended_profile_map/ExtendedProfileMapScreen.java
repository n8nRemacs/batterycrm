package com.avito.android.extended_profile_map;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: ExtendedProfileMapScreen.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_map/ExtendedProfileMapScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_extended-profile-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@I60.b
/* loaded from: classes13.dex */
public final class ExtendedProfileMapScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final ExtendedProfileMapScreen f151172d = new ExtendedProfileMapScreen();

    @Y61.k
    public static final Parcelable.Creator<ExtendedProfileMapScreen> CREATOR = new a();

    /* compiled from: ExtendedProfileMapScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ExtendedProfileMapScreen> {
        @Override // android.os.Parcelable.Creator
        public final ExtendedProfileMapScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return ExtendedProfileMapScreen.f151172d;
        }

        @Override // android.os.Parcelable.Creator
        public final ExtendedProfileMapScreen[] newArray(int i12) {
            return new ExtendedProfileMapScreen[i12];
        }
    }

    public ExtendedProfileMapScreen() {
        super("ProfileMap", false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeInt(1);
    }
}
