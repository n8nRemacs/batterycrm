package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: PassportLinks.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/PassportMergeAccountsProfilesListLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class PassportMergeAccountsProfilesListLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<PassportMergeAccountsProfilesListLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f133545b;

    /* compiled from: PassportLinks.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PassportMergeAccountsProfilesListLink> {
        @Override // android.os.Parcelable.Creator
        public final PassportMergeAccountsProfilesListLink createFromParcel(Parcel parcel) {
            return new PassportMergeAccountsProfilesListLink(parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final PassportMergeAccountsProfilesListLink[] newArray(int i12) {
            return new PassportMergeAccountsProfilesListLink[i12];
        }
    }

    public PassportMergeAccountsProfilesListLink(boolean z12) {
        this.f133545b = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeInt(this.f133545b ? 1 : 0);
    }
}
