package com.avito.android.document_verification_status_screen;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.deep_linking.links.PublicDeeplink;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: VerificationStatusDeeplink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/document_verification_status_screen/VerificationStatusDeeplink;", "Lcom/avito/android/deep_linking/links/PublicDeeplink;", "<init>", "()V", "_avito_gig_document-verification-status-screen_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes13.dex */
public final class VerificationStatusDeeplink extends PublicDeeplink {

    @k
    public static final Parcelable.Creator<VerificationStatusDeeplink> CREATOR = new a();

    /* compiled from: VerificationStatusDeeplink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VerificationStatusDeeplink> {
        @Override // android.os.Parcelable.Creator
        public final VerificationStatusDeeplink createFromParcel(Parcel parcel) {
            parcel.readInt();
            return new VerificationStatusDeeplink();
        }

        @Override // android.os.Parcelable.Creator
        public final VerificationStatusDeeplink[] newArray(int i12) {
            return new VerificationStatusDeeplink[i12];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(1);
    }
}
