package com.avito.android.autoteka.deeplinks;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.deep_linking.links.PublicDeeplink;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: AutotekaLandingLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/deeplinks/AutotekaLandingLink;", "Lcom/avito/android/deep_linking/links/PublicDeeplink;", "_avito_autoteka_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes11.dex */
public final class AutotekaLandingLink extends PublicDeeplink {

    @k
    public static final Parcelable.Creator<AutotekaLandingLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final LandingDetails f96220b;

    /* compiled from: AutotekaLandingLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AutotekaLandingLink> {
        @Override // android.os.Parcelable.Creator
        public final AutotekaLandingLink createFromParcel(Parcel parcel) {
            return new AutotekaLandingLink(LandingDetails.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AutotekaLandingLink[] newArray(int i12) {
            return new AutotekaLandingLink[i12];
        }
    }

    public AutotekaLandingLink(@k LandingDetails landingDetails) {
        this.f96220b = landingDetails;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.f96220b.writeToParcel(parcel, i12);
    }
}
