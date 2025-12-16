package com.avito.android.developments_agency_search.deeplink;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: MortgageProApplicationLink.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/deeplink/MortgageProApplicationLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes13.dex */
public final class MortgageProApplicationLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<MortgageProApplicationLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f136383b;

    /* compiled from: MortgageProApplicationLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MortgageProApplicationLink> {
        @Override // android.os.Parcelable.Creator
        public final MortgageProApplicationLink createFromParcel(Parcel parcel) {
            return new MortgageProApplicationLink(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MortgageProApplicationLink[] newArray(int i12) {
            return new MortgageProApplicationLink[i12];
        }
    }

    public MortgageProApplicationLink(@Y61.l String str) {
        this.f136383b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f136383b);
    }
}
