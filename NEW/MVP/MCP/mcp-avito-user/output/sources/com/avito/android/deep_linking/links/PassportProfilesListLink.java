package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: PassportLinks.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/PassportProfilesListLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class PassportProfilesListLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<PassportProfilesListLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f133546b;

    /* compiled from: PassportLinks.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PassportProfilesListLink> {
        @Override // android.os.Parcelable.Creator
        public final PassportProfilesListLink createFromParcel(Parcel parcel) {
            return new PassportProfilesListLink(parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final PassportProfilesListLink[] newArray(int i12) {
            return new PassportProfilesListLink[i12];
        }
    }

    public PassportProfilesListLink() {
        this(false, 1, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeInt(this.f133546b ? 1 : 0);
    }

    public PassportProfilesListLink(boolean z12) {
        this.f133546b = z12;
    }

    public /* synthetic */ PassportProfilesListLink(boolean z12, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? false : z12);
    }
}
