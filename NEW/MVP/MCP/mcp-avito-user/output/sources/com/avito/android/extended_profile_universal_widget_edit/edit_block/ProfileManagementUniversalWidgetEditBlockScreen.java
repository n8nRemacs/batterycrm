package com.avito.android.extended_profile_universal_widget_edit.edit_block;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: ProfileManagementUniversalWidgetEditBlockScreen.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_universal_widget_edit/edit_block/ProfileManagementUniversalWidgetEditBlockScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@I60.b
/* loaded from: classes13.dex */
public final class ProfileManagementUniversalWidgetEditBlockScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final ProfileManagementUniversalWidgetEditBlockScreen f153961d = new ProfileManagementUniversalWidgetEditBlockScreen();

    @Y61.k
    public static final Parcelable.Creator<ProfileManagementUniversalWidgetEditBlockScreen> CREATOR = new a();

    /* compiled from: ProfileManagementUniversalWidgetEditBlockScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ProfileManagementUniversalWidgetEditBlockScreen> {
        @Override // android.os.Parcelable.Creator
        public final ProfileManagementUniversalWidgetEditBlockScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return ProfileManagementUniversalWidgetEditBlockScreen.f153961d;
        }

        @Override // android.os.Parcelable.Creator
        public final ProfileManagementUniversalWidgetEditBlockScreen[] newArray(int i12) {
            return new ProfileManagementUniversalWidgetEditBlockScreen[i12];
        }
    }

    public ProfileManagementUniversalWidgetEditBlockScreen() {
        super("ProfileSettingsUniversalWidgetEditBlock", false);
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
