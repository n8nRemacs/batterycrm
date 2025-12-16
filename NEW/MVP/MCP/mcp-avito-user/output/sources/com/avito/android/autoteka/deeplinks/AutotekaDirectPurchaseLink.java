package com.avito.android.autoteka.deeplinks;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: AutotekaDirectPurchaseLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/deeplinks/AutotekaDirectPurchaseLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_autoteka_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes11.dex */
public final /* data */ class AutotekaDirectPurchaseLink extends DeepLink {

    @k
    public static final Parcelable.Creator<AutotekaDirectPurchaseLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final DirectPurchaseDetails f96219b;

    /* compiled from: AutotekaDirectPurchaseLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AutotekaDirectPurchaseLink> {
        @Override // android.os.Parcelable.Creator
        public final AutotekaDirectPurchaseLink createFromParcel(Parcel parcel) {
            return new AutotekaDirectPurchaseLink(DirectPurchaseDetails.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AutotekaDirectPurchaseLink[] newArray(int i12) {
            return new AutotekaDirectPurchaseLink[i12];
        }
    }

    public AutotekaDirectPurchaseLink(@k DirectPurchaseDetails directPurchaseDetails) {
        this.f96219b = directPurchaseDetails;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AutotekaDirectPurchaseLink) && L.f(this.f96219b, ((AutotekaDirectPurchaseLink) obj).f96219b);
    }

    public final int hashCode() {
        return this.f96219b.hashCode();
    }

    @k
    public final String toString() {
        return "AutotekaDirectPurchaseLink(details=" + this.f96219b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.f96219b.writeToParcel(parcel, i12);
    }
}
