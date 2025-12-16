package com.avito.android.travel_onboarding.navigation;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: TravelOnboardingDeeplink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/travel_onboarding/navigation/TravelOnboardingDeeplink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_travel-onboarding_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes4.dex */
public final /* data */ class TravelOnboardingDeeplink extends DeepLink {

    @k
    public static final Parcelable.Creator<TravelOnboardingDeeplink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f302328b;

    /* compiled from: TravelOnboardingDeeplink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TravelOnboardingDeeplink> {
        @Override // android.os.Parcelable.Creator
        public final TravelOnboardingDeeplink createFromParcel(Parcel parcel) {
            return new TravelOnboardingDeeplink(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TravelOnboardingDeeplink[] newArray(int i12) {
            return new TravelOnboardingDeeplink[i12];
        }
    }

    public TravelOnboardingDeeplink(@k String str) {
        this.f302328b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TravelOnboardingDeeplink) && L.f(this.f302328b, ((TravelOnboardingDeeplink) obj).f302328b);
    }

    public final int hashCode() {
        return this.f302328b.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("TravelOnboardingDeeplink(dialogId="), this.f302328b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f302328b);
    }
}
