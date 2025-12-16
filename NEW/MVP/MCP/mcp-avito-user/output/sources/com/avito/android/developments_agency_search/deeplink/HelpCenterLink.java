package com.avito.android.developments_agency_search.deeplink;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: HelpCenterLink.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/deeplink/HelpCenterLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes13.dex */
public final /* data */ class HelpCenterLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<HelpCenterLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f136381b;

    /* compiled from: HelpCenterLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HelpCenterLink> {
        @Override // android.os.Parcelable.Creator
        public final HelpCenterLink createFromParcel(Parcel parcel) {
            return new HelpCenterLink(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final HelpCenterLink[] newArray(int i12) {
            return new HelpCenterLink[i12];
        }
    }

    public HelpCenterLink(@Y61.l String str) {
        this.f136381b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HelpCenterLink) && kotlin.jvm.internal.L.f(this.f136381b, ((HelpCenterLink) obj).f136381b);
    }

    public final int hashCode() {
        String str = this.f136381b;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Y61.k
    public final String toString() {
        return C22026a.c(new StringBuilder("HelpCenterLink(locationId="), this.f136381b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f136381b);
    }
}
