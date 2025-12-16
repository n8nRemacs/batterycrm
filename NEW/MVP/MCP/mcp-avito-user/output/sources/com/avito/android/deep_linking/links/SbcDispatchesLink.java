package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: SbcDispatchesLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/SbcDispatchesLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class SbcDispatchesLink extends DeepLink {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final SbcDispatchesLink f133644b = new SbcDispatchesLink();

    @Y61.k
    public static final Parcelable.Creator<SbcDispatchesLink> CREATOR = new a();

    /* compiled from: SbcDispatchesLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SbcDispatchesLink> {
        @Override // android.os.Parcelable.Creator
        public final SbcDispatchesLink createFromParcel(Parcel parcel) {
            parcel.readInt();
            return SbcDispatchesLink.f133644b;
        }

        @Override // android.os.Parcelable.Creator
        public final SbcDispatchesLink[] newArray(int i12) {
            return new SbcDispatchesLink[i12];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        return this == obj || (obj instanceof SbcDispatchesLink);
    }

    public final int hashCode() {
        return 1226254355;
    }

    @Y61.k
    public final String toString() {
        return "SbcDispatchesLink";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeInt(1);
    }
}
