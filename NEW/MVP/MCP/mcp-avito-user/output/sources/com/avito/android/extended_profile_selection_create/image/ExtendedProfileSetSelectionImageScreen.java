package com.avito.android.extended_profile_selection_create.image;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: ExtendedProfileSetSelectionImageScreen.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/image/ExtendedProfileSetSelectionImageScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@I60.b
/* loaded from: classes13.dex */
public final class ExtendedProfileSetSelectionImageScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final ExtendedProfileSetSelectionImageScreen f151674d = new ExtendedProfileSetSelectionImageScreen();

    @Y61.k
    public static final Parcelable.Creator<ExtendedProfileSetSelectionImageScreen> CREATOR = new a();

    /* compiled from: ExtendedProfileSetSelectionImageScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ExtendedProfileSetSelectionImageScreen> {
        @Override // android.os.Parcelable.Creator
        public final ExtendedProfileSetSelectionImageScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return ExtendedProfileSetSelectionImageScreen.f151674d;
        }

        @Override // android.os.Parcelable.Creator
        public final ExtendedProfileSetSelectionImageScreen[] newArray(int i12) {
            return new ExtendedProfileSetSelectionImageScreen[i12];
        }
    }

    public ExtendedProfileSetSelectionImageScreen() {
        super("ProfileSettingsExtendedSelectionSetImage", false);
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
