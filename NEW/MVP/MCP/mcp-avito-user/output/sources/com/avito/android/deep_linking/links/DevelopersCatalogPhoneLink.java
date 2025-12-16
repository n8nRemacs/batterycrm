package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: DevelopersCatalogPhoneLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/DevelopersCatalogPhoneLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class DevelopersCatalogPhoneLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<DevelopersCatalogPhoneLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f133241b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f133242c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f133243d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f133244e;

    /* compiled from: DevelopersCatalogPhoneLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DevelopersCatalogPhoneLink> {
        @Override // android.os.Parcelable.Creator
        public final DevelopersCatalogPhoneLink createFromParcel(Parcel parcel) {
            return new DevelopersCatalogPhoneLink(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DevelopersCatalogPhoneLink[] newArray(int i12) {
            return new DevelopersCatalogPhoneLink[i12];
        }
    }

    public DevelopersCatalogPhoneLink(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.l String str4) {
        this.f133241b = str;
        this.f133242c = str2;
        this.f133243d = str3;
        this.f133244e = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f133241b);
        parcel.writeString(this.f133242c);
        parcel.writeString(this.f133243d);
        parcel.writeString(this.f133244e);
    }
}
