package com.avito.android.profile_settings;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: ProfileSettingsScreen.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_settings/ProfileSettingsScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@I60.b
@K51.d
/* loaded from: classes16.dex */
public final class ProfileSettingsScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final ProfileSettingsScreen f228382d = new ProfileSettingsScreen();

    @Y61.k
    public static final Parcelable.Creator<ProfileSettingsScreen> CREATOR = new a();

    /* compiled from: ProfileSettingsScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ProfileSettingsScreen> {
        @Override // android.os.Parcelable.Creator
        public final ProfileSettingsScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return ProfileSettingsScreen.f228382d;
        }

        @Override // android.os.Parcelable.Creator
        public final ProfileSettingsScreen[] newArray(int i12) {
            return new ProfileSettingsScreen[i12];
        }
    }

    public ProfileSettingsScreen() {
        super("ProfileManagement", false);
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
