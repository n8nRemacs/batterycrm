package com.avito.android.comfortable_deal.deeplink;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.deep_linking.links.PublicDeeplink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: ComfortableDealDeeplink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/deeplink/ComfortableDealDeeplink;", "Lcom/avito/android/deep_linking/links/PublicDeeplink;", "_avito_comfortable-deal_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class ComfortableDealDeeplink extends PublicDeeplink {

    @Y61.k
    public static final Parcelable.Creator<ComfortableDealDeeplink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f121849b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f121850c;

    /* compiled from: ComfortableDealDeeplink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ComfortableDealDeeplink> {
        @Override // android.os.Parcelable.Creator
        public final ComfortableDealDeeplink createFromParcel(Parcel parcel) {
            return new ComfortableDealDeeplink(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ComfortableDealDeeplink[] newArray(int i12) {
            return new ComfortableDealDeeplink[i12];
        }
    }

    public ComfortableDealDeeplink(@Y61.l String str, @Y61.l String str2) {
        this.f121849b = str;
        this.f121850c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComfortableDealDeeplink)) {
            return false;
        }
        ComfortableDealDeeplink comfortableDealDeeplink = (ComfortableDealDeeplink) obj;
        return L.f(this.f121849b, comfortableDealDeeplink.f121849b) && L.f(this.f121850c, comfortableDealDeeplink.f121850c);
    }

    public final int hashCode() {
        String str = this.f121849b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f121850c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ComfortableDealDeeplink(itemId=");
        sb2.append(this.f121849b);
        sb2.append(", source=");
        return C22026a.c(sb2, this.f121850c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f121849b);
        parcel.writeString(this.f121850c);
    }
}
