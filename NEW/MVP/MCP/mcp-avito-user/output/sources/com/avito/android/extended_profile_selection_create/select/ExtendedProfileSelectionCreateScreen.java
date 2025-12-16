package com.avito.android.extended_profile_selection_create.select;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: ExtendedProfileSelectionCreateScreen.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/select/ExtendedProfileSelectionCreateScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@I60.b
/* loaded from: classes13.dex */
public final class ExtendedProfileSelectionCreateScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final ExtendedProfileSelectionCreateScreen f151993d = new ExtendedProfileSelectionCreateScreen();

    @Y61.k
    public static final Parcelable.Creator<ExtendedProfileSelectionCreateScreen> CREATOR = new a();

    /* compiled from: ExtendedProfileSelectionCreateScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ExtendedProfileSelectionCreateScreen> {
        @Override // android.os.Parcelable.Creator
        public final ExtendedProfileSelectionCreateScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return ExtendedProfileSelectionCreateScreen.f151993d;
        }

        @Override // android.os.Parcelable.Creator
        public final ExtendedProfileSelectionCreateScreen[] newArray(int i12) {
            return new ExtendedProfileSelectionCreateScreen[i12];
        }
    }

    public ExtendedProfileSelectionCreateScreen() {
        super("ProfileSettingsExtendedSelectionCreate", false);
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
