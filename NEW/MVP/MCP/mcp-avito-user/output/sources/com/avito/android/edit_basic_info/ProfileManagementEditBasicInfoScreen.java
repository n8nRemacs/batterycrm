package com.avito.android.edit_basic_info;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: ProfileManagementEditBasicInfoScreen.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/edit_basic_info/ProfileManagementEditBasicInfoScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@I60.b
@K51.d
/* loaded from: classes13.dex */
public final class ProfileManagementEditBasicInfoScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final ProfileManagementEditBasicInfoScreen f146033d = new ProfileManagementEditBasicInfoScreen();

    @Y61.k
    public static final Parcelable.Creator<ProfileManagementEditBasicInfoScreen> CREATOR = new a();

    /* compiled from: ProfileManagementEditBasicInfoScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ProfileManagementEditBasicInfoScreen> {
        @Override // android.os.Parcelable.Creator
        public final ProfileManagementEditBasicInfoScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return ProfileManagementEditBasicInfoScreen.f146033d;
        }

        @Override // android.os.Parcelable.Creator
        public final ProfileManagementEditBasicInfoScreen[] newArray(int i12) {
            return new ProfileManagementEditBasicInfoScreen[i12];
        }
    }

    public ProfileManagementEditBasicInfoScreen() {
        super("ProfileSettingsBasicInfoEdit", false);
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
