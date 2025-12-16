package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: DevelopmentsCatalogLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/DevelopmentsCatalogLink;", "Lcom/avito/android/deep_linking/links/PublicDeeplink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class DevelopmentsCatalogLink extends PublicDeeplink {

    @Y61.k
    public static final Parcelable.Creator<DevelopmentsCatalogLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f133246b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f133247c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f133248d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f133249e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final DeepLink f133250f;

    /* compiled from: DevelopmentsCatalogLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DevelopmentsCatalogLink> {
        @Override // android.os.Parcelable.Creator
        public final DevelopmentsCatalogLink createFromParcel(Parcel parcel) {
            return new DevelopmentsCatalogLink(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(DevelopmentsCatalogLink.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final DevelopmentsCatalogLink[] newArray(int i12) {
            return new DevelopmentsCatalogLink[i12];
        }
    }

    public DevelopmentsCatalogLink(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l DeepLink deepLink) {
        this.f133246b = str;
        this.f133247c = str2;
        this.f133248d = str3;
        this.f133249e = str4;
        this.f133250f = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f133246b);
        parcel.writeString(this.f133247c);
        parcel.writeString(this.f133248d);
        parcel.writeString(this.f133249e);
        parcel.writeParcelable(this.f133250f, i12);
    }
}
