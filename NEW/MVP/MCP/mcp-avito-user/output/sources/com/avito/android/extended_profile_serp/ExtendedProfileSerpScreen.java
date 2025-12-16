package com.avito.android.extended_profile_serp;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: ExtendedProfileSerpScreen.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_serp/ExtendedProfileSerpScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_extended-profile-serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@I60.b
/* loaded from: classes13.dex */
public final class ExtendedProfileSerpScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final ExtendedProfileSerpScreen f152515d = new ExtendedProfileSerpScreen();

    @Y61.k
    public static final Parcelable.Creator<ExtendedProfileSerpScreen> CREATOR = new a();

    /* compiled from: ExtendedProfileSerpScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ExtendedProfileSerpScreen> {
        @Override // android.os.Parcelable.Creator
        public final ExtendedProfileSerpScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return ExtendedProfileSerpScreen.f152515d;
        }

        @Override // android.os.Parcelable.Creator
        public final ExtendedProfileSerpScreen[] newArray(int i12) {
            return new ExtendedProfileSerpScreen[i12];
        }
    }

    public ExtendedProfileSerpScreen() {
        super("ProfileSettingsExtendedProfileSearch", false);
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
