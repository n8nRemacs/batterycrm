package com.avito.android.deep_linking.links;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: CreditPartnerLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/CreditPartnerLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class CreditPartnerLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<CreditPartnerLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f133160b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f133161c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f133162d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Uri f133163e;

    /* compiled from: CreditPartnerLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CreditPartnerLink> {
        @Override // android.os.Parcelable.Creator
        public final CreditPartnerLink createFromParcel(Parcel parcel) {
            return new CreditPartnerLink(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CreditPartnerLink[] newArray(int i12) {
            return new CreditPartnerLink[i12];
        }
    }

    public CreditPartnerLink(@Y61.l String str, @Y61.k String str2, @Y61.l String str3) {
        this.f133160b = str;
        this.f133161c = str2;
        this.f133162d = str3;
        this.f133163e = Uri.parse(str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f133160b);
        parcel.writeString(this.f133161c);
        parcel.writeString(this.f133162d);
    }
}
