package com.avito.android.mandatory_verification.deeplink;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: MandatoryVerificationLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mandatory_verification/deeplink/MandatoryVerificationLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_mandatory-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes14.dex */
public final /* data */ class MandatoryVerificationLink extends DeepLink {

    @k
    public static final Parcelable.Creator<MandatoryVerificationLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f184469b;

    /* compiled from: MandatoryVerificationLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MandatoryVerificationLink> {
        @Override // android.os.Parcelable.Creator
        public final MandatoryVerificationLink createFromParcel(Parcel parcel) {
            return new MandatoryVerificationLink(parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final MandatoryVerificationLink[] newArray(int i12) {
            return new MandatoryVerificationLink[i12];
        }
    }

    public MandatoryVerificationLink(long j12) {
        this.f184469b = j12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MandatoryVerificationLink) && this.f184469b == ((MandatoryVerificationLink) obj).f184469b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f184469b);
    }

    @k
    public final String toString() {
        return r.u(new StringBuilder("MandatoryVerificationLink(itemId="), this.f184469b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f184469b);
    }
}
