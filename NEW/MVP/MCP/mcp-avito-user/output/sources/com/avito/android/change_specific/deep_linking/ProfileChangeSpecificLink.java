package com.avito.android.change_specific.deep_linking;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: ProfileChangeSpecificLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/change_specific/deep_linking/ProfileChangeSpecificLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_extended-profile-change-specific_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class ProfileChangeSpecificLink extends DeepLink {

    @k
    public static final Parcelable.Creator<ProfileChangeSpecificLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f117922b;

    /* compiled from: ProfileChangeSpecificLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ProfileChangeSpecificLink> {
        @Override // android.os.Parcelable.Creator
        public final ProfileChangeSpecificLink createFromParcel(Parcel parcel) {
            return new ProfileChangeSpecificLink(parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ProfileChangeSpecificLink[] newArray(int i12) {
            return new ProfileChangeSpecificLink[i12];
        }
    }

    public ProfileChangeSpecificLink(boolean z12) {
        this.f117922b = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f117922b ? 1 : 0);
    }
}
