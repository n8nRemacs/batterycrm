package com.avito.android.profile_settings_extended.deep_linking;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: ProfileDisableExtendedLink.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_settings_extended/deep_linking/ProfileDisableExtendedLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes16.dex */
public final class ProfileDisableExtendedLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<ProfileDisableExtendedLink> CREATOR = new a();

    /* compiled from: ProfileDisableExtendedLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ProfileDisableExtendedLink> {
        @Override // android.os.Parcelable.Creator
        public final ProfileDisableExtendedLink createFromParcel(Parcel parcel) {
            parcel.readInt();
            return new ProfileDisableExtendedLink();
        }

        @Override // android.os.Parcelable.Creator
        public final ProfileDisableExtendedLink[] newArray(int i12) {
            return new ProfileDisableExtendedLink[i12];
        }
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
