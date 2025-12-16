package com.avito.android.verification.links.sber_finish;

import Y61.l;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.deep_linking.links.PublicDeeplink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: VerificationSberFinishLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/links/sber_finish/VerificationSberFinishLink;", "Lcom/avito/android/deep_linking/links/PublicDeeplink;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes5.dex */
public final /* data */ class VerificationSberFinishLink extends PublicDeeplink {

    @Y61.k
    public static final Parcelable.Creator<VerificationSberFinishLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Intent f324439b;

    /* compiled from: VerificationSberFinishLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VerificationSberFinishLink> {
        @Override // android.os.Parcelable.Creator
        public final VerificationSberFinishLink createFromParcel(Parcel parcel) {
            return new VerificationSberFinishLink((Intent) parcel.readParcelable(VerificationSberFinishLink.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final VerificationSberFinishLink[] newArray(int i12) {
            return new VerificationSberFinishLink[i12];
        }
    }

    public VerificationSberFinishLink(@Y61.k Intent intent) {
        this.f324439b = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VerificationSberFinishLink) && L.f(this.f324439b, ((VerificationSberFinishLink) obj).f324439b);
    }

    public final int hashCode() {
        return this.f324439b.hashCode();
    }

    @Y61.k
    public final String toString() {
        return String.valueOf(this.f324439b.getData());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f324439b, i12);
    }
}
