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

/* compiled from: AutotekaUnifiedButtonLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/deeplinks/AutotekaUnifiedButtonLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_autoteka_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes11.dex */
public final /* data */ class AutotekaUnifiedButtonLink extends DeepLink {

    @k
    public static final Parcelable.Creator<AutotekaUnifiedButtonLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final UnifiedButtonLinkDetails f96238b;

    /* compiled from: AutotekaUnifiedButtonLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AutotekaUnifiedButtonLink> {
        @Override // android.os.Parcelable.Creator
        public final AutotekaUnifiedButtonLink createFromParcel(Parcel parcel) {
            return new AutotekaUnifiedButtonLink(UnifiedButtonLinkDetails.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AutotekaUnifiedButtonLink[] newArray(int i12) {
            return new AutotekaUnifiedButtonLink[i12];
        }
    }

    public AutotekaUnifiedButtonLink(@k UnifiedButtonLinkDetails unifiedButtonLinkDetails) {
        this.f96238b = unifiedButtonLinkDetails;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AutotekaUnifiedButtonLink) && L.f(this.f96238b, ((AutotekaUnifiedButtonLink) obj).f96238b);
    }

    public final int hashCode() {
        return this.f96238b.hashCode();
    }

    @k
    public final String toString() {
        return "AutotekaUnifiedButtonLink(details=" + this.f96238b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.f96238b.writeToParcel(parcel, i12);
    }
}
