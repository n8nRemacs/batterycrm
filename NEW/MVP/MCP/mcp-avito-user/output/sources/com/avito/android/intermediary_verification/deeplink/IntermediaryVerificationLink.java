package com.avito.android.intermediary_verification.deeplink;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: IntermediaryVerificationLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/intermediary_verification/deeplink/IntermediaryVerificationLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "<init>", "()V", "_avito_intermediary-verification_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes14.dex */
public final /* data */ class IntermediaryVerificationLink extends DeepLink {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final IntermediaryVerificationLink f173113b = new IntermediaryVerificationLink();

    @k
    public static final Parcelable.Creator<IntermediaryVerificationLink> CREATOR = new a();

    /* compiled from: IntermediaryVerificationLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<IntermediaryVerificationLink> {
        @Override // android.os.Parcelable.Creator
        public final IntermediaryVerificationLink createFromParcel(Parcel parcel) {
            parcel.readInt();
            return IntermediaryVerificationLink.f173113b;
        }

        @Override // android.os.Parcelable.Creator
        public final IntermediaryVerificationLink[] newArray(int i12) {
            return new IntermediaryVerificationLink[i12];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        return this == obj || (obj instanceof IntermediaryVerificationLink);
    }

    public final int hashCode() {
        return -972377634;
    }

    @k
    public final String toString() {
        return "IntermediaryVerificationLink";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(1);
    }
}
